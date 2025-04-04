package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDebitBindingImpl extends ItemDebitBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_approve, 8);
        sViewsWithIds.put(R.id.img_delete, 9);
        sViewsWithIds.put(R.id.layout_item, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDebitBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ItemDebitBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.imgState.setTag(null);
        this.layoutApprove.setTag(null);
        this.layoutDelete.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvCategory.setTag(null);
        this.tvDate.setTag(null);
        this.tvMoney.setTag(null);
        this.tvName.setTag(null);
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
            setIvm((com.finance.data.model.api.response.debit.DebitResponse) variable);
        }
        else if (BR.permissionDelete == variableId) {
            setPermissionDelete((java.lang.Boolean) variable);
        }
        else if (BR.permissionApprove == variableId) {
            setPermissionApprove((java.lang.Boolean) variable);
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
    public void setIvm(@Nullable com.finance.data.model.api.response.debit.DebitResponse Ivm) {
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
    public void setPermissionApprove(@Nullable java.lang.Boolean PermissionApprove) {
        this.mPermissionApprove = PermissionApprove;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.permissionApprove);
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
        java.lang.String secretKey = mSecretKey;
        boolean permissionApproveIvmStateInt2BooleanFalse = false;
        java.lang.String dateUtilsConvertFromUTCToDefaultIvmTransactionDate = null;
        boolean permissionDeleteIvmStateInt2BooleanFalse = false;
        com.finance.data.model.api.response.transaction.Category ivmCategory = null;
        java.lang.String ivmTransactionDate = null;
        android.graphics.drawable.Drawable ivmStateInt2ImgStateAndroidDrawableIcAcceptImgStateAndroidDrawableIcPaid = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmState = 0;
        java.lang.String ivmMoney = null;
        java.lang.String ivmCategoryName = null;
        com.finance.data.model.api.response.debit.DebitResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        boolean ivmTransactionDateJavaLangObjectNull = false;
        java.lang.String ivmTransactionDateJavaLangObjectNullDateUtilsConvertFromUTCToDefaultIvmTransactionDateIvmTransactionDate = null;
        java.lang.String numberUtilsCustomMoneyDebitDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind = null;
        java.lang.String aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = null;
        java.lang.String aESUtilsDecryptSecretKeyIvmCategoryNameBooleanFalse = null;
        java.lang.Integer ivmKind = null;
        double doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = 0.0;
        java.lang.String ivmName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionApprove = false;
        int permissionDeleteIvmStateInt2BooleanFalseViewVISIBLEViewGONE = 0;
        int permissionApproveIvmStateInt2BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean permissionApprove = mPermissionApprove;
        java.lang.Integer ivmState = null;
        boolean ivmStateInt2 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;

        if ((dirtyFlags & 0x13L) != 0) {



                if (ivm != null) {
                    // read ivm.category
                    ivmCategory = ivm.getCategory();
                    // read ivm.money
                    ivmMoney = ivm.getMoney();
                    // read ivm.kind
                    ivmKind = ivm.getKind();
                }


                if (ivmCategory != null) {
                    // read ivm.category.name
                    ivmCategoryName = ivmCategory.getName();
                }
                // read AESUtils.decrypt(secretKey, ivm.money, false)
                aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmMoney, false);


                // read AESUtils.decrypt(secretKey, ivm.category.name, false)
                aESUtilsDecryptSecretKeyIvmCategoryNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmCategoryName, false);
                // read Double.parseDouble(AESUtils.decrypt(secretKey, ivm.money, false))
                doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse = java.lang.Double.parseDouble(aESUtilsDecryptSecretKeyIvmMoneyBooleanFalse);


                // read NumberUtils.custom_money_debit(Double.parseDouble(AESUtils.decrypt(secretKey, ivm.money, false)), ivm.kind)
                numberUtilsCustomMoneyDebitDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind = com.finance.utils.NumberUtils.custom_money_debit(doubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalse, ivmKind);
            if ((dirtyFlags & 0x12L) != 0) {

                    if (ivm != null) {
                        // read ivm.transactionDate
                        ivmTransactionDate = ivm.getTransactionDate();
                        // read ivm.name
                        ivmName = ivm.getName();
                        // read ivm.state
                        ivmState = ivm.getState();
                    }


                    // read ivm.transactionDate != null
                    ivmTransactionDateJavaLangObjectNull = (ivmTransactionDate) != (null);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                    androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmTransactionDateJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2
                    ivmStateInt2 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (2);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmStateInt2) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 ? @android:drawable/ic_accept : @android:drawable/ic_paid
                    ivmStateInt2ImgStateAndroidDrawableIcAcceptImgStateAndroidDrawableIcPaid = ((ivmStateInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_accept)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_paid)));
            }
        }
        if ((dirtyFlags & 0x16L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete)
                androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete);
            if((dirtyFlags & 0x16L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove)
                androidxDatabindingViewDataBindingSafeUnboxPermissionApprove = androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove);
            if((dirtyFlags & 0x1aL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionApprove) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                // read DateUtils.convertFromUTCToDefault(ivm.transactionDate)
                dateUtilsConvertFromUTCToDefaultIvmTransactionDate = com.finance.utils.DateUtils.convertFromUTCToDefault(ivmTransactionDate);
        }
        if ((dirtyFlags & 0x140L) != 0) {



                if (ivm != null) {
                    // read ivm.state
                    ivmState = ivm.getState();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2
                ivmStateInt2 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (2);
            if((dirtyFlags & 0x12L) != 0) {
                if(ivmStateInt2) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }

        if ((dirtyFlags & 0x1aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
                permissionApproveIvmStateInt2BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxPermissionApprove) ? (ivmStateInt2) : (false));
            if((dirtyFlags & 0x1aL) != 0) {
                if(permissionApproveIvmStateInt2BooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
                permissionApproveIvmStateInt2BooleanFalseViewVISIBLEViewGONE = ((permissionApproveIvmStateInt2BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x16L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
                permissionDeleteIvmStateInt2BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) ? (ivmStateInt2) : (false));
            if((dirtyFlags & 0x16L) != 0) {
                if(permissionDeleteIvmStateInt2BooleanFalse) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
                permissionDeleteIvmStateInt2BooleanFalseViewVISIBLEViewGONE = ((permissionDeleteIvmStateInt2BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x12L) != 0) {

                // read ivm.transactionDate != null ? DateUtils.convertFromUTCToDefault(ivm.transactionDate) : ivm.transactionDate
                ivmTransactionDateJavaLangObjectNullDateUtilsConvertFromUTCToDefaultIvmTransactionDateIvmTransactionDate = ((ivmTransactionDateJavaLangObjectNull) ? (dateUtilsConvertFromUTCToDefaultIvmTransactionDate) : (ivmTransactionDate));
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgState, ivmStateInt2ImgStateAndroidDrawableIcAcceptImgStateAndroidDrawableIcPaid);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, ivmTransactionDateJavaLangObjectNullDateUtilsConvertFromUTCToDefaultIvmTransactionDateIvmTransactionDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, ivmName);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.layoutApprove.setVisibility(permissionApproveIvmStateInt2BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteIvmStateInt2BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCategory, aESUtilsDecryptSecretKeyIvmCategoryNameBooleanFalse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMoney, numberUtilsCustomMoneyDebitDoubleParseDoubleAESUtilsDecryptSecretKeyIvmMoneyBooleanFalseIvmKind);
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
        flag 3 (0x4L): permissionApprove
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 ? @android:drawable/ic_accept : @android:drawable/ic_paid
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 ? @android:drawable/ic_accept : @android:drawable/ic_paid
        flag 11 (0xcL): ivm.transactionDate != null ? DateUtils.convertFromUTCToDefault(ivm.transactionDate) : ivm.transactionDate
        flag 12 (0xdL): ivm.transactionDate != null ? DateUtils.convertFromUTCToDefault(ivm.transactionDate) : ivm.transactionDate
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(permissionApprove) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 2 : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}