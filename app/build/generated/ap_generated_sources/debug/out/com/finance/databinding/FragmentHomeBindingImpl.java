package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_data", "layout_invalid_key", "layout_invalid_key"},
            new int[] {16, 17, 18},
            new int[] {com.finance.R.layout.layout_empty_data,
                com.finance.R.layout.layout_invalid_key,
                com.finance.R.layout.layout_invalid_key});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_main, 19);
        sViewsWithIds.put(R.id.layout_title, 20);
        sViewsWithIds.put(R.id.img_back, 21);
        sViewsWithIds.put(R.id.edt_search, 22);
        sViewsWithIds.put(R.id.img_search, 23);
        sViewsWithIds.put(R.id.img_total_income, 24);
        sViewsWithIds.put(R.id.img_total_expenditure, 25);
        sViewsWithIds.put(R.id.layout_filter, 26);
        sViewsWithIds.put(R.id.rcv_transaction, 27);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback110;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback111;
    @Nullable
    private final android.view.View.OnClickListener mCallback104;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[15]
            , (android.widget.EditText) bindings[22]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[26]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[17]
            , (android.widget.RelativeLayout) bindings[19]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[16]
            , (com.finance.databinding.LayoutInvalidKeyBinding) bindings[18]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[27]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            );
        this.btnAdd.setTag(null);
        this.layoutBack.setTag(null);
        setContainedBinding(this.layoutInvalidKey);
        setContainedBinding(this.layoutNoData);
        setContainedBinding(this.layoutNotPermission);
        this.layoutSearch.setTag(null);
        this.layoutTotal.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvTitle.setTag(null);
        this.tvTotalExpenditure.setTag(null);
        this.tvTotalIncome.setTag(null);
        setRootTag(root);
        // listeners
        mCallback108 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback109 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback106 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback110 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback107 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback111 = new com.finance.generated.callback.OnClickListener(this, 8);
        mCallback104 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback105 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
        }
        layoutNoData.invalidateAll();
        layoutInvalidKey.invalidateAll();
        layoutNotPermission.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutNoData.hasPendingBindings()) {
            return true;
        }
        if (layoutInvalidKey.hasPendingBindings()) {
            return true;
        }
        if (layoutNotPermission.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.fragment.home.HomeFragmentViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.fragment.home.HomeFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.fragment.home.HomeFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.fragment.home.HomeFragment A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutNoData.setLifecycleOwner(lifecycleOwner);
        layoutInvalidKey.setLifecycleOwner(lifecycleOwner);
        layoutNotPermission.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmIsSearchEmpty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmTotalExpenditure((androidx.databinding.ObservableField<java.lang.Double>) object, fieldId);
            case 3 :
                return onChangeLayoutInvalidKey((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
            case 4 :
                return onChangeVmKind((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeVmIsSearch((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeLayoutNoData((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
            case 7 :
                return onChangeVmTotalElements((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeVmTotalIncome((androidx.databinding.ObservableField<java.lang.Double>) object, fieldId);
            case 9 :
                return onChangeLayoutNotPermission((com.finance.databinding.LayoutInvalidKeyBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsValidKey(androidx.databinding.ObservableField<java.lang.Boolean> VmIsValidKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearchEmpty(androidx.databinding.ObservableField<java.lang.String> VmIsSearchEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalExpenditure(androidx.databinding.ObservableField<java.lang.Double> VmTotalExpenditure, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutInvalidKey(com.finance.databinding.LayoutInvalidKeyBinding LayoutInvalidKey, int fieldId) {
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
    private boolean onChangeVmIsSearch(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNoData(com.finance.databinding.LayoutEmptyDataBinding LayoutNoData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalElements(androidx.databinding.ObservableField<java.lang.Integer> VmTotalElements, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalIncome(androidx.databinding.ObservableField<java.lang.Double> VmTotalIncome, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNotPermission(com.finance.databinding.LayoutInvalidKeyBinding LayoutNotPermission, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        boolean vmIsSearch = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        java.lang.Double vmTotalIncomeGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        boolean VmIsValidKey1 = false;
        com.finance.ui.fragment.home.HomeFragmentViewModel vm = mVm;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = false;
        java.lang.Boolean vmIsSearchGet = null;
        java.lang.Double vmTotalExpenditureGet = null;
        com.finance.ui.fragment.home.HomeFragment a = mA;
        java.lang.Integer vmTotalElementsGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATE = null;
        android.graphics.drawable.Drawable vmKindInt2MboundView12AndroidDrawableBgWhiteCornerMboundView12AndroidDrawableBgBlank = null;
        boolean aCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = false;
        java.lang.String vmIsSearchEmptyGet = null;
        androidx.databinding.ObservableField<java.lang.Double> vmTotalExpenditure = null;
        boolean vmKindInt0 = false;
        int vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = 0;
        androidx.databinding.ObservableField<java.lang.Integer> vmKind = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATE = false;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        int vmIsValidKeyViewVISIBLEViewGONE = 0;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmIsSearchEmptyEmpty = false;
        android.graphics.drawable.Drawable vmKindInt0MboundView13AndroidDrawableBgWhiteCornerMboundView13AndroidDrawableBgBlank = null;
        boolean vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmKindInt2 = false;
        boolean VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse1 = false;
        int vmIsSearchViewVISIBLEViewGONE = 0;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST = false;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalElements = null;
        android.graphics.drawable.Drawable vmKindInt1MboundView11AndroidDrawableBgWhiteCornerMboundView11AndroidDrawableBgBlank = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableField<java.lang.Double> vmTotalIncome = null;
        java.lang.String numberUtilsCustomMoneyVmTotalIncome = null;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalseViewVISIBLEViewGONE = 0;
        int VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE1 = 0;
        int androidxDatabindingViewDataBindingSafeUnboxVmKindGet = 0;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean vmKindInt1 = false;
        boolean vmTotalElementsInt0 = false;
        java.lang.Boolean ACheckPermissionConstantsPERMISSIONTRANSACTIONLIST1 = null;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalse = false;
        java.lang.Integer vmKindGet = null;
        boolean vmIsValidKeyVmTotalElementsInt0BooleanFalse = false;

        if ((dirtyFlags & 0x1db7L) != 0) {


            if ((dirtyFlags & 0x1c81L) != 0) {

                    if (vm != null) {
                        // read vm.isValidKey
                        vmIsValidKey = vm.isValidKey;
                    }
                    updateRegistration(0, vmIsValidKey);


                    if (vmIsValidKey != null) {
                        // read vm.isValidKey.get()
                        vmIsValidKeyGet = vmIsValidKey.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
                if((dirtyFlags & 0x1c01L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                }
                if((dirtyFlags & 0x1c81L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000L;
                    }
                }

                if ((dirtyFlags & 0x1401L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                        VmIsValidKey1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet;
                    if((dirtyFlags & 0x1401L) != 0) {
                        if(VmIsValidKey1) {
                                dirtyFlags |= 0x100000L;
                        }
                        else {
                                dirtyFlags |= 0x80000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
                        vmIsValidKeyViewVISIBLEViewGONE = ((VmIsValidKey1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1402L) != 0) {

                    if (vm != null) {
                        // read vm.isSearchEmpty
                        vmIsSearchEmpty = vm.isSearchEmpty;
                    }
                    updateRegistration(1, vmIsSearchEmpty);


                    if (vmIsSearchEmpty != null) {
                        // read vm.isSearchEmpty.get()
                        vmIsSearchEmptyGet = vmIsSearchEmpty.get();
                    }


                    if (vmIsSearchEmptyGet != null) {
                        // read vm.isSearchEmpty.get().empty
                        vmIsSearchEmptyEmpty = vmIsSearchEmptyGet.isEmpty();
                    }
                if((dirtyFlags & 0x1402L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1404L) != 0) {

                    if (vm != null) {
                        // read vm.totalExpenditure
                        vmTotalExpenditure = vm.totalExpenditure;
                    }
                    updateRegistration(2, vmTotalExpenditure);


                    if (vmTotalExpenditure != null) {
                        // read vm.totalExpenditure.get()
                        vmTotalExpenditureGet = vmTotalExpenditure.get();
                    }


                    // read NumberUtils.custom_money(vm.totalExpenditure.get())
                    numberUtilsCustomMoneyVmTotalExpenditure = com.finance.utils.NumberUtils.custom_money(vmTotalExpenditureGet);
            }
            if ((dirtyFlags & 0x1410L) != 0) {

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


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0
                    vmKindInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (0);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2
                    vmKindInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (2);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1
                    vmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (1);
                if((dirtyFlags & 0x1410L) != 0) {
                    if(vmKindInt0) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
                if((dirtyFlags & 0x1410L) != 0) {
                    if(vmKindInt2) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x1410L) != 0) {
                    if(vmKindInt1) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt0MboundView13AndroidDrawableBgWhiteCornerMboundView13AndroidDrawableBgBlank = ((vmKindInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView13.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView13.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt2MboundView12AndroidDrawableBgWhiteCornerMboundView12AndroidDrawableBgBlank = ((vmKindInt2) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView12.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView12.getContext(), R.drawable.bg_blank)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
                    vmKindInt1MboundView11AndroidDrawableBgWhiteCornerMboundView11AndroidDrawableBgBlank = ((vmKindInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView11.getContext(), R.drawable.bg_white_corner)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView11.getContext(), R.drawable.bg_blank)));
            }
            if ((dirtyFlags & 0x1c21L) != 0) {

                    if (vm != null) {
                        // read vm.isSearch
                        VmIsSearch1 = vm.isSearch;
                    }
                    updateRegistration(5, VmIsSearch1);


                    if (VmIsSearch1 != null) {
                        // read vm.isSearch.get()
                        vmIsSearchGet = VmIsSearch1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSearchGet);
                if((dirtyFlags & 0x1420L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    vmIsSearch = !androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet;
                if((dirtyFlags & 0x1c21L) != 0) {
                    if(vmIsSearch) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if ((dirtyFlags & 0x1420L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
                        vmIsSearchViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
                        vmIsSearchViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x1500L) != 0) {

                    if (vm != null) {
                        // read vm.totalIncome
                        vmTotalIncome = vm.totalIncome;
                    }
                    updateRegistration(8, vmTotalIncome);


                    if (vmTotalIncome != null) {
                        // read vm.totalIncome.get()
                        vmTotalIncomeGet = vmTotalIncome.get();
                    }


                    // read NumberUtils.custom_money(vm.totalIncome.get())
                    numberUtilsCustomMoneyVmTotalIncome = com.finance.utils.NumberUtils.custom_money(vmTotalIncomeGet);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000000L) != 0) {

                if (vm != null) {
                    // read vm.isValidKey
                    vmIsValidKey = vm.isValidKey;
                }
                updateRegistration(0, vmIsValidKey);


                if (vmIsValidKey != null) {
                    // read vm.isValidKey.get()
                    vmIsValidKeyGet = vmIsValidKey.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsValidKeyGet);
            if((dirtyFlags & 0x1c01L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x40000000L;
                        dirtyFlags |= 0x1000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x800000000000L;
                }
            }
            if((dirtyFlags & 0x1c81L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x1c21L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x1c21L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000440004000L) != 0) {


            if ((dirtyFlags & 0x1000000000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)
                        aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_CREATE);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATE);
            }
            if ((dirtyFlags & 0x440004000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)
                        ACheckPermissionConstantsPERMISSIONTRANSACTIONLIST1 = a.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_LIST);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(ACheckPermissionConstantsPERMISSIONTRANSACTIONLIST1);

                if ((dirtyFlags & 0x4000L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST))
                        aCheckPermissionConstantsPERMISSIONTRANSACTIONLIST = !androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST;
                }
            }
        }
        if ((dirtyFlags & 0x4000000000000L) != 0) {

                if (vm != null) {
                    // read vm.totalElements
                    vmTotalElements = vm.totalElements;
                }
                updateRegistration(7, vmTotalElements);


                if (vmTotalElements != null) {
                    // read vm.totalElements.get()
                    vmTotalElementsGet = vmTotalElements.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get())
                androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalElementsGet);


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0
                vmTotalElementsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalElementsGet) == (0);
        }

        if ((dirtyFlags & 0x1c01L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (aCheckPermissionConstantsPERMISSIONTRANSACTIONLIST) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
                VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATE) : (false));
            if((dirtyFlags & 0x1c01L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) {
                        dirtyFlags |= 0x400000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000L;
                }
            }
            if((dirtyFlags & 0x1c01L) != 0) {
                if(VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse1) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
            if((dirtyFlags & 0x1c01L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalse) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
                VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE1 = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = ((VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1c21L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST) : (false));
            if((dirtyFlags & 0x1c21L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1c81L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
                vmIsValidKeyVmTotalElementsInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (vmTotalElementsInt0) : (false));
            if((dirtyFlags & 0x1c81L) != 0) {
                if(vmIsValidKeyVmTotalElementsInt0BooleanFalse) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)
                    ACheckPermissionConstantsPERMISSIONTRANSACTIONLIST1 = a.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_LIST);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST = androidx.databinding.ViewDataBinding.safeUnbox(ACheckPermissionConstantsPERMISSIONTRANSACTIONLIST1);
        }

        if ((dirtyFlags & 0x1c81L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
                vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse = ((vmIsValidKeyVmTotalElementsInt0BooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONLIST) : (false));
            if((dirtyFlags & 0x1c81L) != 0) {
                if(vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1c01L) != 0) {
            // api target 1

            this.btnAdd.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEBooleanFalseViewVISIBLEViewGONE);
            this.layoutNotPermission.getRoot().setVisibility(VmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE1);
            this.swipeLayout.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.btnAdd.setOnClickListener(mCallback111);
            this.layoutBack.setOnClickListener(mCallback104);
            this.layoutInvalidKey.setDes(getRoot().getResources().getString(R.string.invalid_key));
            this.layoutNoData.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.layoutNotPermission.setDes(getRoot().getResources().getString(R.string.not_permission));
            this.mboundView11.setOnClickListener(mCallback108);
            this.mboundView12.setOnClickListener(mCallback109);
            this.mboundView13.setOnClickListener(mCallback110);
            this.mboundView4.setOnClickListener(mCallback105);
            this.mboundView5.setOnClickListener(mCallback106);
            this.mboundView6.setOnClickListener(mCallback107);
        }
        if ((dirtyFlags & 0x1401L) != 0) {
            // api target 1

            this.layoutInvalidKey.getRoot().setVisibility(vmIsValidKeyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1c81L) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmIsValidKeyVmTotalElementsInt0BooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1420L) != 0) {
            // api target 1

            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.layoutTotal.setVisibility(vmIsSearchViewGONEViewVISIBLE);
            this.mboundView10.setVisibility(vmIsSearchViewGONEViewVISIBLE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1410L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView11, vmKindInt1MboundView11AndroidDrawableBgWhiteCornerMboundView11AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView12, vmKindInt2MboundView12AndroidDrawableBgWhiteCornerMboundView12AndroidDrawableBgBlank);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView13, vmKindInt0MboundView13AndroidDrawableBgWhiteCornerMboundView13AndroidDrawableBgBlank);
        }
        if ((dirtyFlags & 0x1402L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1c21L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONTRANSACTIONLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1404L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalExpenditure, numberUtilsCustomMoneyVmTotalExpenditure);
        }
        if ((dirtyFlags & 0x1500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalIncome, numberUtilsCustomMoneyVmTotalIncome);
        }
        executeBindingsOn(layoutNoData);
        executeBindingsOn(layoutInvalidKey);
        executeBindingsOn(layoutNotPermission);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    a.getTransByKind(1);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



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
                com.finance.ui.fragment.home.HomeFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.getAllTrans();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.home.HomeFragmentViewModel vm = mVm;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();


                    aJavaLangObjectNull = (a) != (null);
                    if (aJavaLangObjectNull) {


                        a.showKeyBoard2();
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.addNewTransaction();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm
                com.finance.ui.fragment.home.HomeFragmentViewModel vm = mVm;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();


                    aJavaLangObjectNull = (a) != (null);
                    if (aJavaLangObjectNull) {


                        a.hideKeyboard();




                        a.deleteEditSearch();
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.fragment.home.HomeFragment a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isValidKey
        flag 1 (0x2L): vm.isSearchEmpty
        flag 2 (0x3L): vm.totalExpenditure
        flag 3 (0x4L): layoutInvalidKey
        flag 4 (0x5L): vm.kind
        flag 5 (0x6L): vm.isSearch
        flag 6 (0x7L): layoutNoData
        flag 7 (0x8L): vm.totalElements
        flag 8 (0x9L): vm.totalIncome
        flag 9 (0xaL): layoutNotPermission
        flag 10 (0xbL): vm
        flag 11 (0xcL): a
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 0 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 34 (0x23L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? @android:drawable/bg_white_corner : @android:drawable/bg_blank
        flag 37 (0x26L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 38 (0x27L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 39 (0x28L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 40 (0x29L): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_LIST)) : false ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE)) : false
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.totalElements.get()) == 0 : false
    flag mapping end*/
    //end
}