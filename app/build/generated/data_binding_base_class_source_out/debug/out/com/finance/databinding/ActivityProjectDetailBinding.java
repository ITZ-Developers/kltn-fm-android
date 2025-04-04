// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.finance.R;
import com.finance.ui.project.detail.ProjectDetailActivity;
import com.finance.ui.project.detail.ProjectDetailViewModel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityProjectDetailBinding extends ViewDataBinding {
  @NonNull
  public final Button btnEPUpdate;

  @NonNull
  public final AutoCompleteTextView cbbOrganization;

  @NonNull
  public final AutoCompleteTextView cbbTag;

  @NonNull
  public final EditText editProjectName;

  @NonNull
  public final EditText editProjectNote;

  @NonNull
  public final CircleImageView imgLogo;

  @NonNull
  public final ImageView layoutColor;

  @NonNull
  public final LayoutHeaderTitleBinding layoutHeader;

  @Bindable
  protected ProjectDetailViewModel mVm;

  @Bindable
  protected ProjectDetailActivity mA;

  protected ActivityProjectDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnEPUpdate, AutoCompleteTextView cbbOrganization, AutoCompleteTextView cbbTag,
      EditText editProjectName, EditText editProjectNote, CircleImageView imgLogo,
      ImageView layoutColor, LayoutHeaderTitleBinding layoutHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnEPUpdate = btnEPUpdate;
    this.cbbOrganization = cbbOrganization;
    this.cbbTag = cbbTag;
    this.editProjectName = editProjectName;
    this.editProjectNote = editProjectNote;
    this.imgLogo = imgLogo;
    this.layoutColor = layoutColor;
    this.layoutHeader = layoutHeader;
  }

  public abstract void setVm(@Nullable ProjectDetailViewModel vm);

  @Nullable
  public ProjectDetailViewModel getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable ProjectDetailActivity a);

  @Nullable
  public ProjectDetailActivity getA() {
    return mA;
  }

  @NonNull
  public static ActivityProjectDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_project_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProjectDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityProjectDetailBinding>inflateInternal(inflater, R.layout.activity_project_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityProjectDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_project_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityProjectDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityProjectDetailBinding>inflateInternal(inflater, R.layout.activity_project_detail, null, false, component);
  }

  public static ActivityProjectDetailBinding bind(@NonNull View view) {
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
  public static ActivityProjectDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityProjectDetailBinding)bind(component, view, R.layout.activity_project_detail);
  }
}
