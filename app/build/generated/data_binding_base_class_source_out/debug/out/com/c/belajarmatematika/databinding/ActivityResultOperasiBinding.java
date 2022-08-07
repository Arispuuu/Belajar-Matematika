// Generated by view binder compiler. Do not edit!
package com.c.belajarmatematika.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.c.belajarmatematika.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultOperasiBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton btulang;

  @NonNull
  public final TextView correctTextview;

  @NonNull
  public final ImageButton exit;

  @NonNull
  public final TextView percentTextview;

  @NonNull
  public final TextView skor;

  private ActivityResultOperasiBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton btulang, @NonNull TextView correctTextview, @NonNull ImageButton exit,
      @NonNull TextView percentTextview, @NonNull TextView skor) {
    this.rootView = rootView;
    this.btulang = btulang;
    this.correctTextview = correctTextview;
    this.exit = exit;
    this.percentTextview = percentTextview;
    this.skor = skor;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultOperasiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultOperasiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result_operasi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultOperasiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btulang;
      ImageButton btulang = ViewBindings.findChildViewById(rootView, id);
      if (btulang == null) {
        break missingId;
      }

      id = R.id.correct_textview;
      TextView correctTextview = ViewBindings.findChildViewById(rootView, id);
      if (correctTextview == null) {
        break missingId;
      }

      id = R.id.exit;
      ImageButton exit = ViewBindings.findChildViewById(rootView, id);
      if (exit == null) {
        break missingId;
      }

      id = R.id.percent_textview;
      TextView percentTextview = ViewBindings.findChildViewById(rootView, id);
      if (percentTextview == null) {
        break missingId;
      }

      id = R.id.skor;
      TextView skor = ViewBindings.findChildViewById(rootView, id);
      if (skor == null) {
        break missingId;
      }

      return new ActivityResultOperasiBinding((RelativeLayout) rootView, btulang, correctTextview,
          exit, percentTextview, skor);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
