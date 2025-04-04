// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.finance.R;
import com.finance.ui.fragment.statistics.StatisticsFragment;
import com.finance.ui.fragment.statistics.StatisticsFragmentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentStatisticsBinding extends ViewDataBinding {
  @NonNull
  public final LayoutEmptyDataBinding layoutEmpty;

  @NonNull
  public final LayoutInvalidKeyBinding layoutInvalidKey;

  @NonNull
  public final ConstraintLayout layoutMain;

  @NonNull
  public final RelativeLayout layoutTitle;

  @NonNull
  public final RecyclerView rcvStatistics;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected StatisticsFragmentViewModel mVm;

  @Bindable
  protected StatisticsFragment mA;

  protected FragmentStatisticsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LayoutEmptyDataBinding layoutEmpty, LayoutInvalidKeyBinding layoutInvalidKey,
      ConstraintLayout layoutMain, RelativeLayout layoutTitle, RecyclerView rcvStatistics,
      SwipeRefreshLayout swipeLayout, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.layoutEmpty = layoutEmpty;
    this.layoutInvalidKey = layoutInvalidKey;
    this.layoutMain = layoutMain;
    this.layoutTitle = layoutTitle;
    this.rcvStatistics = rcvStatistics;
    this.swipeLayout = swipeLayout;
    this.tvTitle = tvTitle;
  }

  public abstract void setVm(@Nullable StatisticsFragmentViewModel vm);

  @Nullable
  public StatisticsFragmentViewModel getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable StatisticsFragment a);

  @Nullable
  public StatisticsFragment getA() {
    return mA;
  }

  @NonNull
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_statistics, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStatisticsBinding>inflateInternal(inflater, R.layout.fragment_statistics, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_statistics, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStatisticsBinding>inflateInternal(inflater, R.layout.fragment_statistics, null, false, component);
  }

  public static FragmentStatisticsBinding bind(@NonNull View view) {
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
  public static FragmentStatisticsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentStatisticsBinding)bind(component, view, R.layout.fragment_statistics);
  }
}
