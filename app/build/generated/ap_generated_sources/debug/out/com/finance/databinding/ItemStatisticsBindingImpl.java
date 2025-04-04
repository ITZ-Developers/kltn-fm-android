package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemStatisticsBindingImpl extends ItemStatisticsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_recalculate, 6);
        sViewsWithIds.put(R.id.img_recalculate, 7);
        sViewsWithIds.put(R.id.layout_approve, 8);
        sViewsWithIds.put(R.id.img_approve, 9);
        sViewsWithIds.put(R.id.item_layout, 10);
        sViewsWithIds.put(R.id.layout_money, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStatisticsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemStatisticsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[6]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imgArrow.setTag(null);
        this.imgState.setTag(null);
        this.swipeRevealLayout.setTag(null);
        this.tvMoney.setTag(null);
        this.tvMoneyIncome.setTag(null);
        this.tvMonthYear.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setIvm((com.finance.data.model.api.response.statistics.StatisticsResponse) variable);
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
    public void setIvm(@Nullable com.finance.data.model.api.response.statistics.StatisticsResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ivm);
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
        double androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = 0.0;
        java.lang.String numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseInt2 = null;
        java.lang.String ivmName = null;
        java.lang.String numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseInt1 = null;
        java.lang.String secretKey = mSecretKey;
        java.lang.String aESUtilsDecryptSecretKeyIvmNameBooleanFalse = null;
        boolean ivmStateInt1 = false;
        java.lang.Double doubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = null;
        android.graphics.drawable.Drawable doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseImgArrowAndroidDrawableIcArrowUpImgArrowAndroidDrawableIcArrowDown = null;
        double androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = 0.0;
        java.lang.String aESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = null;
        java.lang.Integer ivmState = null;
        java.lang.String javaLangStringThNgAESUtilsDecryptSecretKeyIvmNameBooleanFalse = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmState = 0;
        java.lang.Double doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = null;
        java.lang.String ivmTotalExpenditure = null;
        java.lang.String ivmTotalIncome = null;
        com.finance.data.model.api.response.statistics.StatisticsResponse ivm = mIvm;
        boolean doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = false;
        android.graphics.drawable.Drawable ivmStateInt1ImgStateAndroidDrawableIcCreatedImgStateAndroidDrawableIcAccept = null;
        java.lang.String aESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ivm != null) {
                    // read ivm.name
                    ivmName = ivm.getName();
                    // read ivm.totalExpenditure
                    ivmTotalExpenditure = ivm.getTotalExpenditure();
                    // read ivm.totalIncome
                    ivmTotalIncome = ivm.getTotalIncome();
                }


                // read AESUtils.decrypt(secretKey, ivm.name, false)
                aESUtilsDecryptSecretKeyIvmNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmName, false);
                // read AESUtils.decrypt(secretKey, ivm.totalExpenditure, false)
                aESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmTotalExpenditure, false);
                // read AESUtils.decrypt(secretKey, ivm.totalIncome, false)
                aESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmTotalIncome, false);


                // read ("Tháng ") + (AESUtils.decrypt(secretKey, ivm.name, false))
                javaLangStringThNgAESUtilsDecryptSecretKeyIvmNameBooleanFalse = ("Tháng ") + (aESUtilsDecryptSecretKeyIvmNameBooleanFalse);
                // read Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false))
                doubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = java.lang.Double.valueOf(aESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse);
                // read Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false))
                doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = java.lang.Double.valueOf(aESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse);


                // read NumberUtils.custom_money_my_tran(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false)), 2)
                numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseInt2 = com.finance.utils.NumberUtils.custom_money_my_tran(doubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse, 2);
                // read androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false)))
                androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = androidx.databinding.ViewDataBinding.safeUnbox(doubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse);
                // read androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false)))
                androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse = androidx.databinding.ViewDataBinding.safeUnbox(doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse);
                // read NumberUtils.custom_money_my_tran(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false)), 1)
                numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseInt1 = com.finance.utils.NumberUtils.custom_money_my_tran(doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse, 1);


                // read androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false))) > androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false)))
                doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalse) > (androidxDatabindingViewDataBindingSafeUnboxDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse);
            if((dirtyFlags & 0x7L) != 0) {
                if(doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false))) > androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false))) ? @android:drawable/ic_arrow_up : @android:drawable/ic_arrow_down
                doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseImgArrowAndroidDrawableIcArrowUpImgArrowAndroidDrawableIcArrowDown = ((doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgArrow.getContext(), R.drawable.ic_arrow_up)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgArrow.getContext(), R.drawable.ic_arrow_down)));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (ivm != null) {
                        // read ivm.state
                        ivmState = ivm.getState();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                    androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                    ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
                if((dirtyFlags & 0x6L) != 0) {
                    if(ivmStateInt1) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_created : @android:drawable/ic_accept
                    ivmStateInt1ImgStateAndroidDrawableIcCreatedImgStateAndroidDrawableIcAccept = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_created)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgState.getContext(), R.drawable.ic_accept)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgArrow, doubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseImgArrowAndroidDrawableIcArrowUpImgArrowAndroidDrawableIcArrowDown);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMoney, numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalExpenditureBooleanFalseInt2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMoneyIncome, numberUtilsCustomMoneyMyTranDoubleValueOfAESUtilsDecryptSecretKeyIvmTotalIncomeBooleanFalseInt1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMonthYear, javaLangStringThNgAESUtilsDecryptSecretKeyIvmNameBooleanFalse);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgState, ivmStateInt1ImgStateAndroidDrawableIcCreatedImgStateAndroidDrawableIcAccept);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): ivm
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false))) > androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false))) ? @android:drawable/ic_arrow_up : @android:drawable/ic_arrow_down
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalIncome, false))) > androidx.databinding.ViewDataBinding.safeUnbox(Double.valueOf(AESUtils.decrypt(secretKey, ivm.totalExpenditure, false))) ? @android:drawable/ic_arrow_up : @android:drawable/ic_arrow_down
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_created : @android:drawable/ic_accept
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_created : @android:drawable/ic_accept
    flag mapping end*/
    //end
}