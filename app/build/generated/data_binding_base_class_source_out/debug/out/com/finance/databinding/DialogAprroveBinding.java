// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.finance.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogAprroveBinding extends ViewDataBinding {
  @NonNull
  public final Button btnApprove;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final TextView title;

  protected DialogAprroveBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnApprove, Button btnCancel, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnApprove = btnApprove;
    this.btnCancel = btnCancel;
    this.title = title;
  }

  @NonNull
  public static DialogAprroveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_aprrove, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogAprroveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogAprroveBinding>inflateInternal(inflater, R.layout.dialog_aprrove, root, attachToRoot, component);
  }

  @NonNull
  public static DialogAprroveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_aprrove, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogAprroveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogAprroveBinding>inflateInternal(inflater, R.layout.dialog_aprrove, null, false, component);
  }

  public static DialogAprroveBinding bind(@NonNull View view) {
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
  public static DialogAprroveBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogAprroveBinding)bind(component, view, R.layout.dialog_aprrove);
  }
}
