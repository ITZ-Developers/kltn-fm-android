package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemServiceBindingImpl extends ItemServiceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_pay, 7);
        sViewsWithIds.put(R.id.layout_calendar, 8);
        sViewsWithIds.put(R.id.img_calendar, 9);
        sViewsWithIds.put(R.id.img_delete, 10);
        sViewsWithIds.put(R.id.layoutService, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemServiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemServiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.FrameLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.layoutDelete.setTag(null);
        this.layoutPay.setTag(null);
        this.swipeRevealLayout.setTag(null);
        this.tvDayToExpiration.setTag(null);
        this.tvMoney.setTag(null);
        this.tvName.setTag(null);
        this.tvTitleDayToExpiration.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.secretKey == variableId) {
            setSecretKey((java.lang.String) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.service.ServiceResponse) variable);
        }
        else if (BR.permissionDelete == variableId) {
            setPermissionDelete((java.lang.Boolean) variable);
        }
        else if (BR.permissionResolve == variableId) {
            setPermissionResolve((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecretKey(@Nullable java.lang.String SecretKey) {
        this.mSecretKey = SecretKey;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.secretKey);
        super.requestRebind();
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.service.ServiceResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ivm);
        super.requestRebind();
    }
    public void setPermissionDelete(@Nullable java.lang.Boolean PermissionDelete) {
        this.mPermissionDelete = PermissionDelete;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.permissionDelete);
        super.requestRebind();
    }
    public void setPermissionResolve(@Nullable java.lang.Boolean PermissionResolve) {
        this.mPermissionResolve = PermissionResolve;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.permissionResolve);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int ivmKindInt1TvMoneyAndroidColorBlackFullTvMoneyAndroidColorRedOrange = 0;
        int androidxDatabindingViewDataBindingSafeUnboxIvmIsPaid = 0;
        int ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxIvmKind = 0;
        java.lang.String secretKey = mSecretKey;
        boolean ivmKindInt1 = false;
        int permissionResolveIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE = 0;
        boolean ivmDaysToExpirationJavaLangObjectNull = false;
        boolean ivmDaysToExpirationInt0 = false;
        boolean permissionResolveIvmIsPaidInt1BooleanFalse = false;
        java.lang.String numberUtilsCustomMoneyMyTranDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind = null;
        java.lang.String ivmMoney = null;
        boolean ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalse = false;
        com.finance.data.model.api.response.service.ServiceResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        java.lang.Long ivmDaysToExpiration = null;
        java.lang.String aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = null;
        java.lang.Integer ivmKind = null;
        double doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = 0.0;
        int ivmDaysToExpirationInt3TvDayToExpirationAndroidColorRedTextTvDayToExpirationAndroidColorColorTheme = 0;
        java.lang.String ivmName = null;
        java.lang.Integer ivmIsPaid = null;
        boolean ivmDaysToExpirationInt3 = false;
        int ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidColorBlackFullTvTitleDayToExpirationAndroidColorColorTheme = 0;
        java.lang.String stringValueOfIvmDaysToExpiration = null;
        boolean ivmIsPaidInt1 = false;
        java.lang.Boolean permissionResolve = mPermissionResolve;
        int permissionDeleteViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionResolve = false;
        java.lang.String ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidStringDayToExpirationTvTitleDayToExpirationAndroidStringIsPaid = null;
        boolean ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse = false;
        java.lang.String javaLangStringStringValueOfIvmDaysToExpiration = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;
        java.lang.String javaLangStringStringValueOfIvmDaysToExpirationJavaLangStringNgY = null;
        long androidxDatabindingViewDataBindingSafeUnboxIvmDaysToExpiration = 0;

        if ((dirtyFlags & 0x13L) != 0) {



                if (ivm != null) {
                    // read ivm.money
                    ivmMoney = ivm.getMoney();
                    // read ivm.kind
                    ivmKind = ivm.getKind();
                }


                // read AESUtils.decrypt(secretKey, ivm.money, false)
                aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmMoney, false);


                // read Double.parseDouble(AESUtils.decrypt(secretKey, ivm.money, false))
                doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = java.lang.Double.parseDouble(aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse);


                // read NumberUtils.custom_money_my_tran(Double.parseDouble(AESUtils.decrypt(secretKey, ivm.money, false)), ivm.kind)
                numberUtilsCustomMoneyMyTranDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind = com.finance.utils.NumberUtils.custom_money_my_tran(doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse, ivmKind);
            if ((dirtyFlags & 0x12L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind)
                    androidxDatabindingViewDataBindingSafeUnboxIvmKind = androidx.databinding.ViewDataBinding.safeUnbox(ivmKind);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1
                    ivmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmKind) == (1);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmKindInt1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:color/black_full : @android:color/red_orange
                    ivmKindInt1TvMoneyAndroidColorBlackFullTvMoneyAndroidColorRedOrange = ((ivmKindInt1) ? (getColorFromResource(tvMoney, R.color.black_full)) : (getColorFromResource(tvMoney, R.color.red_orange)));
            }
            if ((dirtyFlags & 0x12L) != 0) {

                    if (ivm != null) {
                        // read ivm.daysToExpiration
                        ivmDaysToExpiration = ivm.getDaysToExpiration();
                        // read ivm.name
                        ivmName = ivm.getName();
                    }


                    // read ivm.daysToExpiration != null
                    ivmDaysToExpirationJavaLangObjectNull = (ivmDaysToExpiration) != (null);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration)
                    androidxDatabindingViewDataBindingSafeUnboxIvmDaysToExpiration = androidx.databinding.ViewDataBinding.safeUnbox(ivmDaysToExpiration);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmDaysToExpirationJavaLangObjectNull) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) <= 3
                    ivmDaysToExpirationInt3 = (androidxDatabindingViewDataBindingSafeUnboxIvmDaysToExpiration) <= (3);
                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration))
                    stringValueOfIvmDaysToExpiration = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxIvmDaysToExpiration);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmDaysToExpirationInt3) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) <= 3 ? @android:color/red_text : @android:color/color_theme
                    ivmDaysToExpirationInt3TvDayToExpirationAndroidColorRedTextTvDayToExpirationAndroidColorColorTheme = ((ivmDaysToExpirationInt3) ? (getColorFromResource(tvDayToExpiration, R.color.red_text)) : (getColorFromResource(tvDayToExpiration, R.color.color_theme)));
                    // read (" ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration)))
                    javaLangStringStringValueOfIvmDaysToExpiration = (" ") + (stringValueOfIvmDaysToExpiration);


                    // read ((" ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration)))) + (" ngày")
                    javaLangStringStringValueOfIvmDaysToExpirationJavaLangStringNgY = (javaLangStringStringValueOfIvmDaysToExpiration) + (" ngày");
            }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete)
                androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete);
            if((dirtyFlags & 0x14L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
                permissionDeleteViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve)
                androidxDatabindingViewDataBindingSafeUnboxPermissionResolve = androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve);
            if((dirtyFlags & 0x1aL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionResolve) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0
                ivmDaysToExpirationInt0 = (androidxDatabindingViewDataBindingSafeUnboxIvmDaysToExpiration) >= (0);
        }
        if ((dirtyFlags & 0x1000L) != 0) {



                if (ivm != null) {
                    // read ivm.isPaid
                    ivmIsPaid = ivm.getIsPaid();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid)
                androidxDatabindingViewDataBindingSafeUnboxIvmIsPaid = androidx.databinding.ViewDataBinding.safeUnbox(ivmIsPaid);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1
                ivmIsPaidInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmIsPaid) != (1);
        }

        if ((dirtyFlags & 0x1aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
                permissionResolveIvmIsPaidInt1BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxPermissionResolve) ? (ivmIsPaidInt1) : (false));
            if((dirtyFlags & 0x1aL) != 0) {
                if(permissionResolveIvmIsPaidInt1BooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
                permissionResolveIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE = ((permissionResolveIvmIsPaidInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x12L) != 0) {

                // read ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false
                ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalse = ((ivmDaysToExpirationJavaLangObjectNull) ? (ivmDaysToExpirationInt0) : (false));
            if((dirtyFlags & 0x12L) != 0) {
                if(ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000L) != 0) {

                if (ivm != null) {
                    // read ivm.isPaid
                    ivmIsPaid = ivm.getIsPaid();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid)
                androidxDatabindingViewDataBindingSafeUnboxIvmIsPaid = androidx.databinding.ViewDataBinding.safeUnbox(ivmIsPaid);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1
                ivmIsPaidInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmIsPaid) != (1);
        }

        if ((dirtyFlags & 0x12L) != 0) {

                // read ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
                ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse = ((ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalse) ? (ivmIsPaidInt1) : (false));
            if((dirtyFlags & 0x12L) != 0) {
                if(ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x200000L;
                }
            }


                // read ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
                ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE = ((ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:color/black_full : @android:color/color_theme
                ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidColorBlackFullTvTitleDayToExpirationAndroidColorColorTheme = ((ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse) ? (getColorFromResource(tvTitleDayToExpiration, R.color.black_full)) : (getColorFromResource(tvTitleDayToExpiration, R.color.color_theme)));
                // read ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:string/day_to_expiration : @android:string/is_paid
                ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidStringDayToExpirationTvTitleDayToExpirationAndroidStringIsPaid = ((ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalse) ? (tvTitleDayToExpiration.getResources().getString(R.string.day_to_expiration)) : (tvTitleDayToExpiration.getResources().getString(R.string.is_paid)));
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.layoutPay.setVisibility(permissionResolveIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.tvDayToExpiration.setTextColor(ivmDaysToExpirationInt3TvDayToExpirationAndroidColorRedTextTvDayToExpirationAndroidColorColorTheme);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDayToExpiration, javaLangStringStringValueOfIvmDaysToExpirationJavaLangStringNgY);
            this.tvDayToExpiration.setVisibility(ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseViewVISIBLEViewGONE);
            this.tvMoney.setTextColor(ivmKindInt1TvMoneyAndroidColorBlackFullTvMoneyAndroidColorRedOrange);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, ivmName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitleDayToExpiration, ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidStringDayToExpirationTvTitleDayToExpirationAndroidStringIsPaid);
            this.tvTitleDayToExpiration.setTextColor(ivmDaysToExpirationJavaLangObjectNullIvmDaysToExpirationInt0BooleanFalseIvmIsPaidInt1BooleanFalseTvTitleDayToExpirationAndroidColorBlackFullTvTitleDayToExpirationAndroidColorColorTheme);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMoney, numberUtilsCustomMoneyMyTranDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): ivm
        flag 2 (0x3L): permissionDelete
        flag 3 (0x4L): permissionResolve
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:color/black_full : @android:color/red_orange
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.kind) == 1 ? @android:color/black_full : @android:color/red_orange
        flag 7 (0x8L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(permissionResolve) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
        flag 13 (0xeL): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false
        flag 14 (0xfL): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) <= 3 ? @android:color/red_text : @android:color/color_theme
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) <= 3 ? @android:color/red_text : @android:color/color_theme
        flag 17 (0x12L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:color/black_full : @android:color/color_theme
        flag 18 (0x13L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:color/black_full : @android:color/color_theme
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:string/day_to_expiration : @android:string/is_paid
        flag 22 (0x17L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false ? @android:string/day_to_expiration : @android:string/is_paid
        flag 23 (0x18L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
        flag 24 (0x19L): ivm.daysToExpiration != null ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.daysToExpiration) >= 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.isPaid) != 1 : false
    flag mapping end*/
    //end
}