package com.c.belajarmatematika.matematika;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.activities.MainActivity;
import com.c.belajarmatematika.activities.SignInActivity;
import com.c.belajarmatematika.databinding.ActivityMenuBinding;
import com.c.belajarmatematika.utilities.Constants;
import com.c.belajarmatematika.utilities.PreferenceManager;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.HashMap;

public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;
    private PreferenceManager preferenceManager;
    private FirebaseFirestore database;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferenceManager = new PreferenceManager(getApplicationContext());
        getToken();
        setListeners();

        mp = MediaPlayer.create(getBaseContext(),R.raw.sound1);
        mp.setVolume(1,1);
        mp.setLooping(true);
        mp.start();

    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            mp.setVolume(0,0);
        }
        else {
            mp.setVolume(1,1);
        }
    }


    private void setListeners() {
        binding.imageSignOut.setOnClickListener(v -> signOut());

        binding.imageChat.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            mp.stop();
        });


        binding.buttonMateri.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MateriActivity.class));
            mp.stop();
        });

        binding.buttonKuis.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), KuisActivity.class));
            mp.stop();
        });

    }

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void getToken() {
        FirebaseMessaging.getInstance().getToken().addOnSuccessListener(this::updateToken);
    }

    private void updateToken(String token) {
        preferenceManager.putString(Constants.KEY_FCM_TOKEN, token);
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        DocumentReference documentReference =
                database.collection(Constants.KEY_COLLECTION_USER).document(
                        preferenceManager.getString(Constants.KEY_USER_ID)
                );
        documentReference.update(Constants.KEY_FCM_TOKEN, token)
                .addOnFailureListener(e -> showToast("Unable to update token"));
    }

    private void signOut() {
        showToast("Signing Out...");
        FirebaseFirestore database = FirebaseFirestore.getInstance();
        DocumentReference documentReference =
                database.collection(Constants.KEY_COLLECTION_USER).document(
                        preferenceManager.getString(Constants.KEY_USER_ID)
                );
        HashMap<String, Object > updates = new HashMap<>();
        updates.put(Constants.KEY_FCM_TOKEN, FieldValue.delete());
        documentReference.update(updates)
                .addOnSuccessListener(unused -> {
                    preferenceManager.clear();
                    startActivity(new Intent(getApplicationContext(), SignInActivity.class));
                    finish();
                })
                .addOnFailureListener(e -> showToast("Unable to sign out"));
    }


}