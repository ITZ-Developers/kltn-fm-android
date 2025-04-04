// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.finance.R;
import com.finance.ui.debit.DebitActivity;
import com.finance.ui.debit.DebitViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDebitBinding extends ViewDataBinding {
  @NonNull
  public final EditText edtSearch;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final ImageView imgDebit;

  @NonNull
  public final ImageView imgSearch;

  @NonNull
  public final LinearLayout layoutBack;

  @NonNull
  public final RelativeLayout layoutMain;

  @NonNull
  public final FrameLayout layoutSearch;

  @NonNull
  public final RelativeLayout layoutTitle;

  @NonNull
  public final RelativeLayout layoutTotal;

  @NonNull
  public final RecyclerView rcvDebits;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvTotal;

  @Bindable
  protected DebitViewModel mVm;

  @Bindable
  protected DebitActivity mA;

  protected ActivityDebitBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText edtSearch, ImageView imgBack, ImageView imgDebit, ImageView imgSearch,
      LinearLayout layoutBack, RelativeLayout layoutMain, FrameLayout layoutSearch,
      RelativeLayout layoutTitle, RelativeLayout layoutTotal, RecyclerView rcvDebits,
      SwipeRefreshLayout swipeLayout, TextView tvTitle, TextView tvTotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edtSearch = edtSearch;
    this.imgBack = imgBack;
    this.imgDebit = imgDebit;
    this.imgSearch = imgSearch;
    this.layoutBack = layoutBack;
    this.layoutMain = layoutMain;
    this.layoutSearch = layoutSearch;
    this.layoutTitle = layoutTitle;
    this.layoutTotal = layoutTotal;
    this.rcvDebits = rcvDebits;
    this.swipeLayout = swipeLayout;
    this.tvTitle = tvTitle;
    this.tvTotal = tvTotal;
  }

  public abstract void setVm(@Nullable DebitViewModel vm);

  @Nullable
  public DebitViewModel getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable DebitActivity a);

  @Nullable
  public DebitActivity getA() {
    return mA;
  }

  @NonNull
  public static ActivityDebitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_debit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDebitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDebitBinding>inflateInternal(inflater, R.layout.activity_debit, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDebitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_debit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDebitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDebitBinding>inflateInternal(inflater, R.layout.activity_debit, null, false, component);
  }

  public static ActivityDebitBinding bind(@NonNull View view) {
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
  public static ActivityDebitBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDebitBinding)bind(component, view, R.layout.activity_debit);
  }
}
