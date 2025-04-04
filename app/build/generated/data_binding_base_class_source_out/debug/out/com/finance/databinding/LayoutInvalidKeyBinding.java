// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.finance.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutInvalidKeyBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgEmpty;

  @NonNull
  public final ConstraintLayout layoutMain;

  @NonNull
  public final TextView textEmpty;

  @Bindable
  protected String mDes;

  protected LayoutInvalidKeyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgEmpty, ConstraintLayout layoutMain, TextView textEmpty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgEmpty = imgEmpty;
    this.layoutMain = layoutMain;
    this.textEmpty = textEmpty;
  }

  public abstract void setDes(@Nullable String des);

  @Nullable
  public String getDes() {
    return mDes;
  }

  @NonNull
  public static LayoutInvalidKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_invalid_key, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutInvalidKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutInvalidKeyBinding>inflateInternal(inflater, R.layout.layout_invalid_key, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutInvalidKeyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_invalid_key, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutInvalidKeyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutInvalidKeyBinding>inflateInternal(inflater, R.layout.layout_invalid_key, null, false, component);
  }

  public static LayoutInvalidKeyBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutInvalidKeyBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutInvalidKeyBinding)bind(component, view, R.layout.layout_invalid_key);
  }
}
