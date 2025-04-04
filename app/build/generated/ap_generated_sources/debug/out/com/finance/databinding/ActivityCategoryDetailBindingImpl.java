package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryDetailBindingImpl extends ActivityCategoryDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {9},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.EditText mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback164;
    @Nullable
    private final android.view.View.OnClickListener mCallback165;
    @Nullable
    private final android.view.View.OnClickListener mCallback163;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editCategoryNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.name.get()
            //         is vm.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editCategoryName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.category.details.CategoryDetailsViewModel vm = mVm;
            // vm.name != null
            boolean vmNameJavaLangObjectNull = false;
            // vm.name.get()
            java.lang.String vmNameGet = null;
            // vm.name
            androidx.databinding.ObservableField<java.lang.String> vmName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmName = vm.name;

                vmNameJavaLangObjectNull = (vmName) != (null);
                if (vmNameJavaLangObjectNull) {




                    vmName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description.get()
            //         is vm.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.description.get()
            java.lang.String vmDescriptionGet = null;
            // vm
            com.finance.ui.category.details.CategoryDetailsViewModel vm = mVm;
            // vm.description
            androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
            // vm.description != null
            boolean vmDescriptionJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription = vm.description;

                vmDescriptionJavaLangObjectNull = (vmDescription) != (null);
                if (vmDescriptionJavaLangObjectNull) {




                    vmDescription.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityCategoryDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[8]
            , (android.widget.AutoCompleteTextView) bindings[3]
            , (android.widget.EditText) bindings[5]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[9]
            );
        this.btnEPUpdate.setTag(null);
        this.cbbKind.setTag(null);
        this.editCategoryName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.EditText) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback164 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback165 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback163 = new com.finance.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        layoutHeader.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (layoutHeader.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.finance.ui.category.details.CategoryDetailsViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.category.details.CategoryDetailsActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.category.details.CategoryDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.category.details.CategoryDetailsActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        layoutHeader.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmIsCreate((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription(androidx.databinding.ObservableField<java.lang.String> VmDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsCreate(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmName(androidx.databinding.ObservableField<java.lang.String> VmName, int fieldId) {
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
        boolean vmIsCreateBooleanTrueBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE = false;
        java.lang.String vmIsCreateAndroidStringAddNewCategoryAndroidStringCategoryDetails = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        java.lang.String vmDescriptionGet = null;
        com.finance.ui.category.details.CategoryDetailsViewModel vm = mVm;
        boolean vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATE = false;
        int aCheckPermissionConstantsPERMISSIONCATEGORYUPDATEViewVISIBLEViewGONE = 0;
        java.lang.Boolean vmIsCreateGet = null;
        com.finance.ui.category.details.CategoryDetailsActivity a = mA;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONCATEGORYUPDATE = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreate = null;
        java.lang.String vmNameGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmName = null;
        int vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = 0;

        if ((dirtyFlags & 0x7eL) != 0) {


            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.description
                        vmDescription = vm.description;
                    }
                    updateRegistration(1, vmDescription);


                    if (vmDescription != null) {
                        // read vm.description.get()
                        vmDescriptionGet = vmDescription.get();
                    }
            }
            if ((dirtyFlags & 0x74L) != 0) {

                    if (vm != null) {
                        // read vm.isCreate
                        vmIsCreate = vm.isCreate;
                    }
                    updateRegistration(2, vmIsCreate);


                    if (vmIsCreate != null) {
                        // read vm.isCreate.get()
                        vmIsCreateGet = vmIsCreate.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreateGet);
                if((dirtyFlags & 0x54L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x74L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }

                if ((dirtyFlags & 0x54L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
                        vmIsCreateBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (true) : (false));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_category : @android:string/category_details
                        vmIsCreateAndroidStringAddNewCategoryAndroidStringCategoryDetails = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (getRoot().getResources().getString(R.string.add_new_category)) : (getRoot().getResources().getString(R.string.category_details)));
                }
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (vm != null) {
                        // read vm.name
                        vmName = vm.name;
                    }
                    updateRegistration(3, vmName);


                    if (vmName != null) {
                        // read vm.name.get()
                        vmNameGet = vmName.get();
                    }
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)
                    aCheckPermissionConstantsPERMISSIONCATEGORYUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_CATEGORY_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONCATEGORYUPDATE);
            if((dirtyFlags & 0x60L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONCATEGORYUPDATEViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x800L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)
                    aCheckPermissionConstantsPERMISSIONCATEGORYUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_CATEGORY_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONCATEGORYUPDATE);
            if((dirtyFlags & 0x60L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
        }

        if ((dirtyFlags & 0x74L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE))
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE));
            if((dirtyFlags & 0x74L) != 0) {
                if(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATE) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = ((vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATE) ? (android.text.InputType.TYPE_CLASS_TEXT) : (android.text.InputType.TYPE_NULL));
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(aCheckPermissionConstantsPERMISSIONCATEGORYUPDATEViewVISIBLEViewGONE);
            this.editCategoryName.setEnabled(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONCATEGORYUPDATE);
            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback165);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editCategoryName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editCategoryNameandroidTextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback163);
            this.mboundView2.setOnClickListener(mCallback164);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, (" ") + (mboundView4.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, (" ") + (mboundView6.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.cbbKind.setEnabled(vmIsCreateBooleanTrueBooleanFalse);
            this.layoutHeader.setTitle(vmIsCreateAndroidStringAddNewCategoryAndroidStringCategoryDetails);
        }
        if ((dirtyFlags & 0x74L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.editCategoryName.setInputType(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
            }
            // api target 1

            this.mboundView7.setEnabled(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONCATEGORYUPDATE);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editCategoryName, vmNameGet);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, vmDescriptionGet);
        }
        executeBindingsOn(layoutHeader);
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
                com.finance.ui.category.details.CategoryDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.category.details.CategoryDetailsViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.doDone();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.category.details.CategoryDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.description
        flag 2 (0x3L): vm.isCreate
        flag 3 (0x4L): vm.name
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_category : @android:string/category_details
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_category : @android:string/category_details
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE))
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE))
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_CATEGORY_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
    flag mapping end*/
    //end
}