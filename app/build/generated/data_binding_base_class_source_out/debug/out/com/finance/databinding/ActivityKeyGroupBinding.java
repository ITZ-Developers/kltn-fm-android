// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.finance.R;
import com.finance.ui.key.group.KeyGroupActivity;
import com.finance.ui.key.group.KeyGroupViewModel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityKeyGroupBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView btnAdd;

  @NonNull
  public final LayoutEmptyDataBinding layoutEmpty;

  @NonNull
  public final LayoutHeaderTitleBinding layoutHeader;

  @NonNull
  public final LayoutInvalidKeyBinding layoutInvalidKey;

  @NonNull
  public final RelativeLayout layoutMain;

  @NonNull
  public final RecyclerView rcKeys;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  @Bindable
  protected KeyGroupViewModel mVm;

  @Bindable
  protected KeyGroupActivity mA;

  protected ActivityKeyGroupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView btnAdd, LayoutEmptyDataBinding layoutEmpty,
      LayoutHeaderTitleBinding layoutHeader, LayoutInvalidKeyBinding layoutInvalidKey,
      RelativeLayout layoutMain, RecyclerView rcKeys, SwipeRefreshLayout swipeLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAdd = btnAdd;
    this.layoutEmpty = layoutEmpty;
    this.layoutHeader = layoutHeader;
    this.layoutInvalidKey = layoutInvalidKey;
    this.layoutMain = layoutMain;
    this.rcKeys = rcKeys;
    this.swipeLayout = swipeLayout;
  }

  public abstract void setVm(@Nullable KeyGroupViewModel vm);

  @Nullable
  public KeyGroupViewModel getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable KeyGroupActivity a);

  @Nullable
  public KeyGroupActivity getA() {
    return mA;
  }

  @NonNull
  public static ActivityKeyGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_key_group, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityKeyGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityKeyGroupBinding>inflateInternal(inflater, R.layout.activity_key_group, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityKeyGroupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_key_group, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityKeyGroupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityKeyGroupBinding>inflateInternal(inflater, R.layout.activity_key_group, null, false, component);
  }

  public static ActivityKeyGroupBinding bind(@NonNull View view) {
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
  public static ActivityKeyGroupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityKeyGroupBinding)bind(component, view, R.layout.activity_key_group);
  }
}
