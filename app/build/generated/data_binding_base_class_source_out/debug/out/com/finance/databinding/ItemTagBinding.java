// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.finance.R;
import com.finance.data.model.api.response.tag.TagResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemTagBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgDelete;

  @NonNull
  public final ImageView imgDetail;

  @NonNull
  public final ImageView imgTag;

  @NonNull
  public final FrameLayout layoutDelete;

  @NonNull
  public final RelativeLayout layoutMain;

  @NonNull
  public final SwipeRevealLayout swipeRevealLayout;

  @Bindable
  protected TagResponse mIvm;

  @Bindable
  protected Boolean mPermissionDelete;

  @Bindable
  protected String mSecretKey;

  protected ItemTagBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgDelete, ImageView imgDetail, ImageView imgTag, FrameLayout layoutDelete,
      RelativeLayout layoutMain, SwipeRevealLayout swipeRevealLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgDelete = imgDelete;
    this.imgDetail = imgDetail;
    this.imgTag = imgTag;
    this.layoutDelete = layoutDelete;
    this.layoutMain = layoutMain;
    this.swipeRevealLayout = swipeRevealLayout;
  }

  public abstract void setIvm(@Nullable TagResponse ivm);

  @Nullable
  public TagResponse getIvm() {
    return mIvm;
  }

  public abstract void setPermissionDelete(@Nullable Boolean permissionDelete);

  @Nullable
  public Boolean getPermissionDelete() {
    return mPermissionDelete;
  }

  public abstract void setSecretKey(@Nullable String secretKey);

  @Nullable
  public String getSecretKey() {
    return mSecretKey;
  }

  @NonNull
  public static ItemTagBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTagBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTagBinding>inflateInternal(inflater, R.layout.item_tag, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTagBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTagBinding>inflateInternal(inflater, R.layout.item_tag, null, false, component);
  }

  public static ItemTagBinding bind(@NonNull View view) {
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
  public static ItemTagBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTagBinding)bind(component, view, R.layout.item_tag);
  }
}
