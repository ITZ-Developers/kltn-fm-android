package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOrganizationDetailBindingImpl extends ActivityOrganizationDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {8},
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
    private final android.widget.FrameLayout mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback205;
    @Nullable
    private final android.view.View.OnClickListener mCallback211;
    @Nullable
    private final android.view.View.OnClickListener mCallback209;
    @Nullable
    private final android.view.View.OnClickListener mCallback207;
    @Nullable
    private final android.view.View.OnClickListener mCallback206;
    @Nullable
    private final android.view.View.OnClickListener mCallback210;
    @Nullable
    private final android.view.View.OnClickListener mCallback208;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOrganizationDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityOrganizationDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[8]
            );
        this.btnEPUpdate.setTag(null);
        this.editOrganizationName.setTag(null);
        this.imgLogo.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.FrameLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback205 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback211 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback209 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback207 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback206 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback210 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback208 = new com.finance.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setVm((com.finance.ui.organization.detail.OrganizationDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.organization.detail.OrganizationDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.organization.detail.OrganizationDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.organization.detail.OrganizationDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
                return onChangeVmIsCreate((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
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
    private boolean onChangeVmIsCreate(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmName(androidx.databinding.ObservableField<java.lang.String> VmName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String vmIsCreateAndroidStringAddNewOrganizationAndroidStringDetailOrganization = null;
        com.finance.ui.organization.detail.OrganizationDetailViewModel vm = mVm;
        java.lang.Boolean vmIsCreateGet = null;
        com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE = null;
        int aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATEViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreate = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE = false;
        java.lang.String vmNameGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmName = null;

        if ((dirtyFlags & 0x2eL) != 0) {


            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.isCreate
                        vmIsCreate = vm.isCreate;
                    }
                    updateRegistration(1, vmIsCreate);


                    if (vmIsCreate != null) {
                        // read vm.isCreate.get()
                        vmIsCreateGet = vmIsCreate.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreateGet);
                if((dirtyFlags & 0x2aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_organization : @android:string/detail_organization
                    vmIsCreateAndroidStringAddNewOrganizationAndroidStringDetailOrganization = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (getRoot().getResources().getString(R.string.add_new_organization)) : (getRoot().getResources().getString(R.string.detail_organization)));
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (vm != null) {
                        // read vm.name
                        vmName = vm.name;
                    }
                    updateRegistration(2, vmName);


                    if (vmName != null) {
                        // read vm.name.get()
                        vmNameGet = vmName.get();
                    }
            }
        }
        if ((dirtyFlags & 0x30L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_ORGANIZATION_UPDATE)
                    aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_ORGANIZATION_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_ORGANIZATION_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE);
            if((dirtyFlags & 0x30L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_ORGANIZATION_UPDATE)) ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATEViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(aCheckPermissionConstantsPERMISSIONORGANIZATIONUPDATEViewVISIBLEViewGONE);
            this.editOrganizationName.setFocusable(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONORGANIZATIONUPDATE);
            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback211);
            this.imgLogo.setOnClickListener(mCallback208);
            this.mboundView0.setOnClickListener(mCallback205);
            this.mboundView1.setOnClickListener(mCallback206);
            this.mboundView2.setOnClickListener(mCallback207);
            this.mboundView4.setOnClickListener(mCallback209);
            this.mboundView5.setOnClickListener(mCallback210);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editOrganizationName, vmNameGet);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.layoutHeader.setTitle(vmIsCreateAndroidStringAddNewOrganizationAndroidStringDetailOrganization);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.doDone();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.organization.detail.OrganizationDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isCreate
        flag 2 (0x3L): vm.name
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_organization : @android:string/detail_organization
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_organization : @android:string/detail_organization
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_ORGANIZATION_UPDATE)) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_ORGANIZATION_UPDATE)) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}