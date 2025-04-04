package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKeyGroupDetailsBindingImpl extends ActivityKeyGroupDetailsBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {6},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layoutButton, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback203;
    @Nullable
    private final android.view.View.OnClickListener mCallback201;
    @Nullable
    private final android.view.View.OnClickListener mCallback204;
    @Nullable
    private final android.view.View.OnClickListener mCallback202;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editGroupServiceDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description.get()
            //         is vm.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editGroupServiceDescription);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.description.get()
            java.lang.String vmDescriptionGet = null;
            // vm
            com.finance.ui.key.group.details.KeyGroupDetailsViewModel vm = mVm;
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
    private androidx.databinding.InverseBindingListener editGroupServiceNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.name.get()
            //         is vm.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editGroupServiceName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.key.group.details.KeyGroupDetailsViewModel vm = mVm;
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

    public ActivityKeyGroupDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityKeyGroupDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.LinearLayout) bindings[7]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[6]
            );
        this.btnEPUpdate.setTag(null);
        this.editGroupServiceDescription.setTag(null);
        this.editGroupServiceName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback203 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback201 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback204 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback202 = new com.finance.generated.callback.OnClickListener(this, 2);
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
            setVm((com.finance.ui.key.group.details.KeyGroupDetailsViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.key.group.details.KeyGroupDetailsActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.key.group.details.KeyGroupDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.key.group.details.KeyGroupDetailsActivity A) {
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
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        java.lang.String vmDescriptionGet = null;
        com.finance.ui.key.group.details.KeyGroupDetailsViewModel vm = mVm;
        java.lang.Boolean vmIsCreateGet = null;
        boolean vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = false;
        com.finance.ui.key.group.details.KeyGroupDetailsActivity a = mA;
        int vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = 0;
        java.lang.String vmIsCreateAndroidStringAddNewKeyGroupAndroidStringKeyGroupDetails = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreate = null;
        java.lang.String vmNameGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmName = null;
        int vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEViewVISIBLEViewGONE = 0;

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
                if((dirtyFlags & 0x74L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x54L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }

                if ((dirtyFlags & 0x54L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_key_group : @android:string/key_group_details
                        vmIsCreateAndroidStringAddNewKeyGroupAndroidStringKeyGroupDetails = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (getRoot().getResources().getString(R.string.add_new_key_group)) : (getRoot().getResources().getString(R.string.key_group_details)));
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
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)
                    aCheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_GROUP_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE);
        }

        if ((dirtyFlags & 0x74L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE))
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE));
            if((dirtyFlags & 0x74L) != 0) {
                if(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE) {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = ((vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE) ? (android.text.InputType.TYPE_CLASS_TEXT) : (android.text.InputType.TYPE_NULL));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? View.VISIBLE : View.GONE
                vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEViewVISIBLEViewGONE = ((vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x74L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEViewVISIBLEViewGONE);
            this.editGroupServiceDescription.setFocusableInTouchMode(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATE);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.editGroupServiceName.setInputType(vmIsCreateBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOGROUPUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
            }
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback204);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editGroupServiceDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editGroupServiceDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editGroupServiceName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editGroupServiceNameandroidTextAttrChanged);
            this.mboundView0.setOnClickListener(mCallback201);
            this.mboundView1.setOnClickListener(mCallback202);
            this.mboundView2.setOnClickListener(mCallback203);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editGroupServiceDescription, vmDescriptionGet);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editGroupServiceName, vmNameGet);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.layoutHeader.setTitle(vmIsCreateAndroidStringAddNewKeyGroupAndroidStringKeyGroupDetails);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        executeBindingsOn(layoutHeader);
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
                com.finance.ui.key.group.details.KeyGroupDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.group.details.KeyGroupDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.group.details.KeyGroupDetailsViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.doDone();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.group.details.KeyGroupDetailsActivity a = mA;



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
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE))
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE))
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_key_group : @android:string/key_group_details
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_key_group : @android:string/key_group_details
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_GROUP_UPDATE)) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}