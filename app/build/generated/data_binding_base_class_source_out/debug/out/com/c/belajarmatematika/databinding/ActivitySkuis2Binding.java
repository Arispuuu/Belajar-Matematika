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

public final class ActivitySkuis2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton mulai;

  @NonNull
  public final TextView tx;

  private ActivitySkuis2Binding(@NonNull RelativeLayout rootView, @NonNull ImageButton mulai,
      @NonNull TextView tx) {
    this.rootView = rootView;
    this.mulai = mulai;
    this.tx = tx;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySkuis2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySkuis2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_skuis2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySkuis2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mulai;
      ImageButton mulai = ViewBindings.findChildViewById(rootView, id);
      if (mulai == null) {
        break missingId;
      }

      id = R.id.tx;
      TextView tx = ViewBindings.findChildViewById(rootView, id);
      if (tx == null) {
        break missingId;
      }

      return new ActivitySkuis2Binding((RelativeLayout) rootView, mulai, tx);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
