// Generated by view binder compiler. Do not edit!
package com.c.belajarmatematika.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.c.belajarmatematika.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenuBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton buttonKuis;

  @NonNull
  public final ImageButton buttonMateri;

  @NonNull
  public final ImageButton imageChat;

  @NonNull
  public final ImageButton imageExit;

  @NonNull
  public final ImageButton imageSignOut;

  @NonNull
  public final ImageButton logo;

  private ActivityMenuBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton buttonKuis,
      @NonNull ImageButton buttonMateri, @NonNull ImageButton imageChat,
      @NonNull ImageButton imageExit, @NonNull ImageButton imageSignOut,
      @NonNull ImageButton logo) {
    this.rootView = rootView;
    this.buttonKuis = buttonKuis;
    this.buttonMateri = buttonMateri;
    this.imageChat = imageChat;
    this.imageExit = imageExit;
    this.imageSignOut = imageSignOut;
    this.logo = logo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonKuis;
      ImageButton buttonKuis = ViewBindings.findChildViewById(rootView, id);
      if (buttonKuis == null) {
        break missingId;
      }

      id = R.id.buttonMateri;
      ImageButton buttonMateri = ViewBindings.findChildViewById(rootView, id);
      if (buttonMateri == null) {
        break missingId;
      }

      id = R.id.imageChat;
      ImageButton imageChat = ViewBindings.findChildViewById(rootView, id);
      if (imageChat == null) {
        break missingId;
      }

      id = R.id.imageExit;
      ImageButton imageExit = ViewBindings.findChildViewById(rootView, id);
      if (imageExit == null) {
        break missingId;
      }

      id = R.id.imageSignOut;
      ImageButton imageSignOut = ViewBindings.findChildViewById(rootView, id);
      if (imageSignOut == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageButton logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      return new ActivityMenuBinding((RelativeLayout) rootView, buttonKuis, buttonMateri, imageChat,
          imageExit, imageSignOut, logo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
