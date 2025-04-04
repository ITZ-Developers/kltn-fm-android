// Generated by data binding compiler. Do not edit!
package com.finance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.finance.R;
import com.finance.ui.key.infor.KeyInfoActivity;
import com.finance.ui.key.infor.KeyInfoViewModel;
import java.lang.Deprecated;
import java.lang.Object;
import kr.co.prnd.readmore.ReadMoreTextView;

public abstract class ActivityKeyInfoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView colorTag;

  @NonNull
  public final ReadMoreTextView editGroupServiceDescription;

  @NonNull
  public final ImageView icDetailDocument;

  @NonNull
  public final LinearLayout imgCopyHost;

  @NonNull
  public final LinearLayout imgCopyPassword;

  @NonNull
  public final LinearLayout imgCopyPasswordServer;

  @NonNull
  public final LinearLayout imgCopyPhone;

  @NonNull
  public final LinearLayout imgCopyPort;

  @NonNull
  public final LinearLayout imgCopyPrivateKey;

  @NonNull
  public final LinearLayout imgCopyUsername;

  @NonNull
  public final LinearLayout imgCopyUsernameServer;

  @NonNull
  public final ImageView imgDocument;

  @NonNull
  public final RelativeLayout layoutDocument;

  @NonNull
  public final LayoutHeaderTitleBinding layoutHeader;

  @NonNull
  public final RelativeLayout layoutOrganization;

  @NonNull
  public final TextView tvKeyGroup;

  @NonNull
  public final TextView tvOrganization;

  @NonNull
  public final TextView tvTag;

  @NonNull
  public final TextView tvTitleDocument;

  @NonNull
  public final TextView tvTransactionDateCreated;

  @NonNull
  public final TextView tvTransactionName;

  @Bindable
  protected KeyInfoViewModel mVm;

  @Bindable
  protected KeyInfoActivity mA;

  protected ActivityKeyInfoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView colorTag, ReadMoreTextView editGroupServiceDescription, ImageView icDetailDocument,
      LinearLayout imgCopyHost, LinearLayout imgCopyPassword, LinearLayout imgCopyPasswordServer,
      LinearLayout imgCopyPhone, LinearLayout imgCopyPort, LinearLayout imgCopyPrivateKey,
      LinearLayout imgCopyUsername, LinearLayout imgCopyUsernameServer, ImageView imgDocument,
      RelativeLayout layoutDocument, LayoutHeaderTitleBinding layoutHeader,
      RelativeLayout layoutOrganization, TextView tvKeyGroup, TextView tvOrganization,
      TextView tvTag, TextView tvTitleDocument, TextView tvTransactionDateCreated,
      TextView tvTransactionName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.colorTag = colorTag;
    this.editGroupServiceDescription = editGroupServiceDescription;
    this.icDetailDocument = icDetailDocument;
    this.imgCopyHost = imgCopyHost;
    this.imgCopyPassword = imgCopyPassword;
    this.imgCopyPasswordServer = imgCopyPasswordServer;
    this.imgCopyPhone = imgCopyPhone;
    this.imgCopyPort = imgCopyPort;
    this.imgCopyPrivateKey = imgCopyPrivateKey;
    this.imgCopyUsername = imgCopyUsername;
    this.imgCopyUsernameServer = imgCopyUsernameServer;
    this.imgDocument = imgDocument;
    this.layoutDocument = layoutDocument;
    this.layoutHeader = layoutHeader;
    this.layoutOrganization = layoutOrganization;
    this.tvKeyGroup = tvKeyGroup;
    this.tvOrganization = tvOrganization;
    this.tvTag = tvTag;
    this.tvTitleDocument = tvTitleDocument;
    this.tvTransactionDateCreated = tvTransactionDateCreated;
    this.tvTransactionName = tvTransactionName;
  }

  public abstract void setVm(@Nullable KeyInfoViewModel vm);

  @Nullable
  public KeyInfoViewModel getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable KeyInfoActivity a);

  @Nullable
  public KeyInfoActivity getA() {
    return mA;
  }

  @NonNull
  public static ActivityKeyInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_key_info, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityKeyInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityKeyInfoBinding>inflateInternal(inflater, R.layout.activity_key_info, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityKeyInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_key_info, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityKeyInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityKeyInfoBinding>inflateInternal(inflater, R.layout.activity_key_info, null, false, component);
  }

  public static ActivityKeyInfoBinding bind(@NonNull View view) {
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
  public static ActivityKeyInfoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityKeyInfoBinding)bind(component, view, R.layout.activity_key_info);
  }
}
