package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDebitBindingImpl extends ActivityDebitBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_title, 10);
        sViewsWithIds.put(R.id.img_back, 11);
        sViewsWithIds.put(R.id.edt_search, 12);
        sViewsWithIds.put(R.id.img_search, 13);
        sViewsWithIds.put(R.id.img_debit, 14);
        sViewsWithIds.put(R.id.rcv_debits, 15);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback176;
    @Nullable
    private final android.view.View.OnClickListener mCallback177;
    @Nullable
    private final android.view.View.OnClickListener mCallback174;
    @Nullable
    private final android.view.View.OnClickListener mCallback175;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDebitBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityDebitBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            );
        this.layoutBack.setTag(null);
        this.layoutMain.setTag(null);
        this.layoutSearch.setTag(null);
        this.layoutTotal.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvTitle.setTag(null);
        this.tvTotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback176 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback177 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback174 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback175 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.vm == variableId) {
            setVm((com.finance.ui.debit.DebitViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.debit.DebitActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.debit.DebitViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.debit.DebitActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIsValidKey((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmIsSearchEmpty((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmTotalDebit((androidx.databinding.ObservableField<java.lang.Double>) object, fieldId);
            case 3 :
                return onChangeVmIsSearch((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmTotalDebit(androidx.databinding.ObservableField<java.lang.Double> VmTotalDebit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSearch(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITLIST = false;
        int vmIsSearchViewVISIBLEViewGONE = 0;
        boolean vmIsSearch = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsValidKey = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONDEBITLIST = null;
        com.finance.ui.debit.DebitViewModel vm = mVm;
        int vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsSearchGet = null;
        com.finance.ui.debit.DebitActivity a = mA;
        boolean vmIsSearchVmIsValidKeyBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> vmIsSearchEmpty = null;
        java.lang.Double vmTotalDebitGet = null;
        int vmIsSearchEmptyEmptyViewGONEViewVISIBLE = 0;
        java.lang.String vmIsSearchEmptyGet = null;
        int vmIsSearchVmIsValidKeyBooleanFalseViewVISIBLEViewGONE = 0;
        int vmIsSearchViewGONEViewVISIBLE = 0;
        boolean vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse = false;
        java.lang.String numberUtilsCustomMoneyDebitVmTotalDebit = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = false;
        androidx.databinding.ObservableField<java.lang.Double> vmTotalDebit = null;
        int vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSearch1 = null;
        java.lang.Boolean vmIsValidKeyGet = null;
        boolean vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse = false;
        boolean vmIsSearchEmptyEmpty = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x71L) != 0) {

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
                if((dirtyFlags & 0x71L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
            }
            if ((dirtyFlags & 0x52L) != 0) {

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
                if((dirtyFlags & 0x52L) != 0) {
                    if(vmIsSearchEmptyEmpty) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
                    vmIsSearchEmptyEmptyViewGONEViewVISIBLE = ((vmIsSearchEmptyEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (vm != null) {
                        // read vm.totalDebit
                        vmTotalDebit = vm.totalDebit;
                    }
                    updateRegistration(2, vmTotalDebit);


                    if (vmTotalDebit != null) {
                        // read vm.totalDebit.get()
                        vmTotalDebitGet = vmTotalDebit.get();
                    }


                    // read NumberUtils.custom_money_debit(vm.totalDebit.get())
                    numberUtilsCustomMoneyDebitVmTotalDebit = com.finance.utils.NumberUtils.custom_money_debit(vmTotalDebitGet);
            }
            if ((dirtyFlags & 0x79L) != 0) {

                    if (vm != null) {
                        // read vm.isSearch
                        VmIsSearch1 = vm.isSearch;
                    }
                    updateRegistration(3, VmIsSearch1);


                    if (VmIsSearch1 != null) {
                        // read vm.isSearch.get()
                        vmIsSearchGet = VmIsSearch1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSearchGet);
                if((dirtyFlags & 0x58L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x20000L;
                    }
                }

                if ((dirtyFlags & 0x58L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
                        vmIsSearchViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
                        vmIsSearchViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get())
                    vmIsSearch = !androidxDatabindingViewDataBindingSafeUnboxVmIsSearchGet;
                if((dirtyFlags & 0x79L) != 0) {
                    if(vmIsSearch) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

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
            if((dirtyFlags & 0x71L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }

        if ((dirtyFlags & 0x79L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
                vmIsSearchVmIsValidKeyBooleanFalse = ((vmIsSearch) ? (androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) : (false));
            if((dirtyFlags & 0x59L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x79L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }

            if ((dirtyFlags & 0x59L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
                    vmIsSearchVmIsValidKeyBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1100000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_DEBIT_LIST)
                    aCheckPermissionConstantsPERMISSIONDEBITLIST = a.checkPermission(com.finance.constant.Constants.PERMISSION_DEBIT_LIST);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITLIST = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONDEBITLIST);
        }

        if ((dirtyFlags & 0x71L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
                vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsValidKeyGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITLIST) : (false));
            if((dirtyFlags & 0x71L) != 0) {
                if(vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x79L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse = ((vmIsSearchVmIsValidKeyBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITLIST) : (false));
            if((dirtyFlags & 0x79L) != 0) {
                if(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
                vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE = ((vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.layoutBack.setOnClickListener(mCallback174);
            this.mboundView4.setOnClickListener(mCallback175);
            this.mboundView5.setOnClickListener(mCallback176);
            this.mboundView6.setOnClickListener(mCallback177);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            this.layoutSearch.setVisibility(vmIsSearchViewVISIBLEViewGONE);
            this.tvTitle.setVisibility(vmIsSearchViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x59L) != 0) {
            // api target 1

            this.layoutTotal.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(vmIsSearchEmptyEmptyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x79L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(vmIsSearchVmIsValidKeyBooleanFalseACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x71L) != 0) {
            // api target 1

            this.swipeLayout.setVisibility(vmIsValidKeyACheckPermissionConstantsPERMISSIONDEBITLISTBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotal, numberUtilsCustomMoneyDebitVmTotalDebit);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.DebitActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.deleteEditSearch();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.debit.DebitViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.isShowSearch();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.DebitActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.onBackPressed();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.DebitActivity a = mA;



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
        flag 2 (0x3L): vm.totalDebit
        flag 3 (0x4L): vm.isSearch
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false
        flag 13 (0xeL): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 14 (0xfL): vm.isSearchEmpty.get().empty ? View.GONE : View.VISIBLE
        flag 15 (0x10L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
        flag 24 (0x19L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSearch.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(vm.isValidKey.get()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_LIST)) : false
    flag mapping end*/
    //end
}