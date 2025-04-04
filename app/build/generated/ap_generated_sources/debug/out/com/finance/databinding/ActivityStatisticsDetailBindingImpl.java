package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityStatisticsDetailBindingImpl extends ActivityStatisticsDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title", "layout_empty_data"},
            new int[] {6, 7},
            new int[] {com.finance.R.layout.layout_header_title,
                com.finance.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_total, 8);
        sViewsWithIds.put(R.id.img_total_income, 9);
        sViewsWithIds.put(R.id.img_total_expenditure, 10);
        sViewsWithIds.put(R.id.layout_filter, 11);
        sViewsWithIds.put(R.id.rcv_transaction, 12);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback180;
    @Nullable
    private final android.view.View.OnClickListener mCallback181;
    @Nullable
    private final android.view.View.OnClickListener mCallback179;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityStatisticsDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityStatisticsDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[0]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[7]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.layoutMain.setTag(null);
        setContainedBinding(this.layoutNoData);
        setContainedBinding(this.layoutTitle);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvTotalExpenditure.setTag(null);
        this.tvTotalIncome.setTag(null);
        setRootTag(root);
        // listeners
        mCallback180 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback181 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback179 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        layoutTitle.invalidateAll();
        layoutNoData.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutTitle.hasPendingBindings()) {
            return true;
        }
        if (layoutNoData.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.fragment.statistics.detail.StatisticsDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.statistics.detail.StaticsDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.statistics.detail.StatisticsDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.statistics.detail.StaticsDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutTitle.setLifecycleOwner(lifecycleOwner);
        layoutNoData.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmTotalElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeLayoutTitle((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 2 :
                return onChangeVmTotalIncome((androidx.databinding.ObservableField<java.lang.Double>) object, fieldId);
            case 3 :
                return onChangeVmTotalExpenditure((androidx.databinding.ObservableField<java.lang.Double>) object, fieldId);
            case 4 :
                return onChangeVmKind((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeLayoutNoData((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmTotalElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutTitle(com.finance.databinding.LayoutHeaderTitleBinding LayoutTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalIncome(androidx.databinding.ObservableField<java.lang.Double> VmTotalIncome, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalExpenditure(androidx.databinding.ObservableField<java.lang.Double> VmTotalExpenditure, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmKind(androidx.databinding.ObservableField<java.lang.Integer> VmKind, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNoData(com.finance.databinding.LayoutEmptyDataBinding LayoutNoData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
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
        java.lang.String numberUtilsCustomMoneyVmTotalExpenditure = null;
        boolean vmKindInt2 = false;
        java.lang.Double vmTotalIncomeGet = null;
        android.graphics.drawable.Drawable vmKindInt0MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank = null;
        com.finance.ui.fragment.statistics.detail.StatisticsDetailViewModel vm = mVm;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        java.lang.Double vmTotalExpenditureGet = null;
        com.finance.ui.fragment.statistics.detail.StaticsDetailActivity a = mA;
        java.lang.Integer vmTotalElementsGet = null;
        androidx.databinding.ObservableField<java.lang.Double> vmTotalIncome = null;
        java.lang.String charNumberUtilsCustomMoneyVmTotalExpenditure = null;
        java.lang.String numberUtilsCustomMoneyVmTotalIncome = null;
        android.graphics.drawable.Drawable vmKindInt2MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = null;
        androidx.databinding.ObservableField<java.lang.Double> vmTotalExpenditure = null;
        boolean vmKindInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        android.graphics.drawable.Drawable vmKindInt1MboundView3AndroidDrawableBgWhiteCornerMboundView3AndroidDrawableBgBlank = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmKind = null;
        int vmTotalElementsInt0ViewVISIBLEViewGONE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxVmKindGet = 0;
        boolean vmKindInt1 = false;
        java.lang.String charNumberUtilsCustomMoneyVmTotalIncome = null;
        boolean vmTotalElementsInt0 = false;
        java.lang.Integer vmKindGet = null;

        if ((dirtyFlags & 0x15dL) != 0) {


            if ((dirtyFlags & 0x141L) != 0) {

                    if (vm != null) {
                        // read vm.totalElements
                        vmTotalElements = vm.totalElements;
                    }
                    updateRegistration(0, vmTotalElements);


                    if (vmTotalElements != null) {
                        // read vm.totalElements.get()
                        vmTotalElementsGet = vmTotalElements.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementsGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0
                    vmTotalElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet) == (0);
                if((dirtyFlags & 0x141L) != 0) {
                    if(vmTotalElementsInt0) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
                    vmTotalElementsInt0ViewVISIBLEViewGONE = ((vmTotalElementsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.totalIncome
                        vmTotalIncome = vm.totalIncome;
                    }
                    updateRegistration(2, vmTotalIncome);


                    if (vmTotalIncome != null) {
                        // read vm.totalIncome.get()
                        vmTotalIncomeGet = vmTotalIncome.get();
                    }


                    // read NumberUtils.custom_money(vm.totalIncome.get())
                    numberUtilsCustomMoneyVmTotalIncome = com.finance.utils.NumberUtils.custom_money(vmTotalIncomeGet);


                    // read (' ') + (NumberUtils.custom_money(vm.totalIncome.get()))
                    charNumberUtilsCustomMoneyVmTotalIncome = (' ') + (numberUtilsCustomMoneyVmTotalIncome);
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (vm != null) {
                        // read vm.totalExpenditure
                        vmTotalExpenditure = vm.totalExpenditure;
                    }
                    updateRegistration(3, vmTotalExpenditure);


                    if (vmTotalExpenditure != null) {
                        // read vm.totalExpenditure.get()
                        vmTotalExpenditureGet = vmTotalExpenditure.get();
                    }


                    // read NumberUtils.custom_money(vm.totalExpenditure.get())
                    numberUtilsCustomMoneyVmTotalExpenditure = com.finance.utils.NumberUtils.custom_money(vmTotalExpenditureGet);


                    // read (' ') + (NumberUtils.custom_money(vm.totalExpenditure.get()))
                    charNumberUtilsCustomMoneyVmTotalExpenditure = (' ') + (numberUtilsCustomMoneyVmTotalExpenditure);
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.kind
                        vmKind = vm.kind;
                    }
                    updateRegistration(4, vmKind);


                    if (vmKind != null) {
                        // read vm.kind.get()
                        vmKindGet = vmKind.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmKindGet = androidx.databinding.ViewDataBinding.safeUnbox(vmKindGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2
                    vmKindInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (2);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0
                    vmKindInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (0);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1
                    vmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (1);
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmKindInt2) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmKindInt0) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmKindInt1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt2MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank = ((vmKindInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt0MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank = ((vmKindInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt1MboundView3AndroidDrawableBgWhiteCornerMboundView3AndroidDrawableBgBlank = ((vmKindInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.bg_blank)));
            }
        }
        if ((dirtyFlags & 0x180L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmTotalElementsInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.layoutNoData.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutTitle.setTitle(getRoot().getResources().getString(R.string.transaction_in_month));
            this.mboundView3.setOnClickListener(mCallback179);
            this.mboundView4.setOnClickListener(mCallback180);
            this.mboundView5.setOnClickListener(mCallback181);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.layoutTitle.setA(a);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView3, vmKindInt1MboundView3AndroidDrawableBgWhiteCornerMboundView3AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, vmKindInt2MboundView4AndroidDrawableBgWhiteCornerMboundView4AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView5, vmKindInt0MboundView5AndroidDrawableBgWhiteCornerMboundView5AndroidDrawableBgBlank);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalExpenditure, charNumberUtilsCustomMoneyVmTotalExpenditure);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalIncome, charNumberUtilsCustomMoneyVmTotalIncome);
        }
        executeBindingsOn(layoutTitle);
        executeBindingsOn(layoutNoData);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.statistics.detail.StaticsDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.getTransByKind(2);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.statistics.detail.StaticsDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.getAllTrans();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.statistics.detail.StaticsDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.getTransByKind(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.totalElements
        flag 1 (0x2L): layoutTitle
        flag 2 (0x3L): vm.totalIncome
        flag 3 (0x4L): vm.totalExpenditure
        flag 4 (0x5L): vm.kind
        flag 5 (0x6L): layoutNoData
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}