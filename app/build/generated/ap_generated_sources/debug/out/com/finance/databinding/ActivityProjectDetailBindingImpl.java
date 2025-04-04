package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProjectDetailBindingImpl extends ActivityProjectDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {13},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_color, 14);
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
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback168;
    @Nullable
    private final android.view.View.OnClickListener mCallback172;
    @Nullable
    private final android.view.View.OnClickListener mCallback169;
    @Nullable
    private final android.view.View.OnClickListener mCallback166;
    @Nullable
    private final android.view.View.OnClickListener mCallback170;
    @Nullable
    private final android.view.View.OnClickListener mCallback167;
    @Nullable
    private final android.view.View.OnClickListener mCallback171;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editProjectNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.project.get().name
            //         is vm.project.get().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editProjectName);
            // localize variables for thread safety
            // vm.project.get().name
            java.lang.String vmProjectName = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.project.detail.ProjectDetailViewModel vm = mVm;
            // vm.project.get()
            com.finance.data.model.api.response.project.ProjectResponse vmProjectGet = null;
            // vm.project
            androidx.databinding.ObservableField<com.finance.data.model.api.response.project.ProjectResponse> vmProject = null;
            // vm.project.get() != null
            boolean vmProjectGetJavaLangObjectNull = false;
            // vm.project != null
            boolean vmProjectJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProject = vm.project;

                vmProjectJavaLangObjectNull = (vmProject) != (null);
                if (vmProjectJavaLangObjectNull) {


                    vmProjectGet = vmProject.get();

                    vmProjectGetJavaLangObjectNull = (vmProjectGet) != (null);
                    if (vmProjectGetJavaLangObjectNull) {




                        vmProjectGet.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editProjectNoteandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.project.get().note
            //         is vm.project.get().setNote((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editProjectNote);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.project.detail.ProjectDetailViewModel vm = mVm;
            // vm.project.get().note
            java.lang.String vmProjectNote = null;
            // vm.project.get()
            com.finance.data.model.api.response.project.ProjectResponse vmProjectGet = null;
            // vm.project
            androidx.databinding.ObservableField<com.finance.data.model.api.response.project.ProjectResponse> vmProject = null;
            // vm.project.get() != null
            boolean vmProjectGetJavaLangObjectNull = false;
            // vm.project != null
            boolean vmProjectJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmProject = vm.project;

                vmProjectJavaLangObjectNull = (vmProject) != (null);
                if (vmProjectJavaLangObjectNull) {


                    vmProjectGet = vmProject.get();

                    vmProjectGetJavaLangObjectNull = (vmProjectGet) != (null);
                    if (vmProjectGetJavaLangObjectNull) {




                        vmProjectGet.setNote(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityProjectDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityProjectDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.Button) bindings[12]
            , (android.widget.AutoCompleteTextView) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[8]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[11]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.widget.ImageView) bindings[14]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[13]
            );
        this.btnEPUpdate.setTag(null);
        this.cbbOrganization.setTag(null);
        this.cbbTag.setTag(null);
        this.editProjectName.setTag(null);
        this.editProjectNote.setTag(null);
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
        this.mboundView7 = (com.google.android.material.textfield.TextInputLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback168 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback172 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback169 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback166 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback170 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback167 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback171 = new com.finance.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setVm((com.finance.ui.project.detail.ProjectDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.project.detail.ProjectDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.project.detail.ProjectDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.project.detail.ProjectDetailActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
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
                return onChangeVmIsCreated((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmIsHaveOrganization((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmProject((androidx.databinding.ObservableField<com.finance.data.model.api.response.project.ProjectResponse>) object, fieldId);
            case 4 :
                return onChangeVmIsHaveTag((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmIsCreated(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveOrganization(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveOrganization, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProject(androidx.databinding.ObservableField<com.finance.data.model.api.response.project.ProjectResponse> VmProject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveTag(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveTag, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        com.finance.data.model.api.response.project.ProjectResponse vmProjectGet = null;
        android.graphics.drawable.Drawable vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONSERVICEUPDATE = null;
        boolean vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE = false;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONPROJECTUPDATE = null;
        java.lang.Boolean vmIsHaveTagGet = null;
        com.finance.ui.project.detail.ProjectDetailViewModel vm = mVm;
        java.lang.String vmProjectNote = null;
        boolean vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse = false;
        boolean vmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreated = null;
        com.finance.ui.project.detail.ProjectDetailActivity a = mA;
        java.lang.Boolean vmIsCreatedGet = null;
        int aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = false;
        java.lang.String vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = null;
        java.lang.Boolean vmIsHaveOrganizationGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet = false;
        android.graphics.drawable.Drawable vmIsHaveOrganizationCbbOrganizationAndroidDrawableBgCbbEnableCbbOrganizationAndroidDrawableBgCbbDisable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = false;
        boolean vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveOrganization = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.project.ProjectResponse> vmProject = null;
        boolean vmIsHaveTagBooleanTrueBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE = false;
        boolean vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalseBooleanTrueBooleanFalse = false;
        java.lang.String vmProjectName = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveTag = null;
        java.lang.String vmIsCreatedAndroidStringAddNewProjectAndroidStringDetailProject = null;

        if ((dirtyFlags & 0xfeL) != 0) {


            if ((dirtyFlags & 0xe6L) != 0) {

                    if (vm != null) {
                        // read vm.isCreated
                        vmIsCreated = vm.isCreated;
                    }
                    updateRegistration(1, vmIsCreated);


                    if (vmIsCreated != null) {
                        // read vm.isCreated.get()
                        vmIsCreatedGet = vmIsCreated.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreatedGet);
                if((dirtyFlags & 0xe2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xa2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x10000000L;
                    }
                }
                if((dirtyFlags & 0xe6L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }

                if ((dirtyFlags & 0xa2L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
                        vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (btnEPUpdate.getResources().getString(R.string.create)) : (btnEPUpdate.getResources().getString(R.string.save)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_project : @android:string/detail_project
                        vmIsCreatedAndroidStringAddNewProjectAndroidStringDetailProject = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (getRoot().getResources().getString(R.string.add_new_project)) : (getRoot().getResources().getString(R.string.detail_project)));
                }
            }
            if ((dirtyFlags & 0xa4L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveOrganization
                        vmIsHaveOrganization = vm.isHaveOrganization;
                    }
                    updateRegistration(2, vmIsHaveOrganization);


                    if (vmIsHaveOrganization != null) {
                        // read vm.isHaveOrganization.get()
                        vmIsHaveOrganizationGet = vmIsHaveOrganization.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveOrganizationGet);
                if((dirtyFlags & 0x400000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0xa4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveOrganizationCbbOrganizationAndroidDrawableBgCbbEnableCbbOrganizationAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbOrganization.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbOrganization.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0xa8L) != 0) {

                    if (vm != null) {
                        // read vm.project
                        vmProject = vm.project;
                    }
                    updateRegistration(3, vmProject);


                    if (vmProject != null) {
                        // read vm.project.get()
                        vmProjectGet = vmProject.get();
                    }


                    if (vmProjectGet != null) {
                        // read vm.project.get().note
                        vmProjectNote = vmProjectGet.getNote();
                        // read vm.project.get().name
                        vmProjectName = vmProjectGet.getName();
                    }
            }
            if ((dirtyFlags & 0xb0L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveTag
                        vmIsHaveTag = vm.isHaveTag;
                    }
                    updateRegistration(4, vmIsHaveTag);


                    if (vmIsHaveTag != null) {
                        // read vm.isHaveTag.get()
                        vmIsHaveTagGet = vmIsHaveTag.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveTagGet);
                if((dirtyFlags & 0xb0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_disable)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
                    vmIsHaveTagBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (true) : (false));
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)
                    aCheckPermissionConstantsPERMISSIONPROJECTUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_PROJECT_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONPROJECTUPDATE);
            if((dirtyFlags & 0xc0L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)
                    aCheckPermissionConstantsPERMISSIONSERVICEUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_SERVICE_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONSERVICEUPDATE);
        }
        if ((dirtyFlags & 0x400000L) != 0) {

                if (vm != null) {
                    // read vm.isHaveOrganization
                    vmIsHaveOrganization = vm.isHaveOrganization;
                }
                updateRegistration(2, vmIsHaveOrganization);


                if (vmIsHaveOrganization != null) {
                    // read vm.isHaveOrganization.get()
                    vmIsHaveOrganizationGet = vmIsHaveOrganization.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveOrganizationGet);
            if((dirtyFlags & 0x400000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0xa4L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
        }

        if ((dirtyFlags & 0xe2L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONSERVICEUPDATE));
            if((dirtyFlags & 0xe2L) != 0) {
                if(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATE) ? (true) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)
                    aCheckPermissionConstantsPERMISSIONPROJECTUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_PROJECT_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONPROJECTUPDATE);
            if((dirtyFlags & 0xc0L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }

        if ((dirtyFlags & 0x400000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
                vmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveOrganizationGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) : (false));
        }

        if ((dirtyFlags & 0xe6L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
                vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (vmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse));
            if((dirtyFlags & 0xe6L) != 0) {
                if(vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false ? true : false
                vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalseBooleanTrueBooleanFalse = ((vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalse) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE);
            this.editProjectName.setEnabled(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE);
            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback172);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editProjectName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editProjectNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editProjectNote, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editProjectNoteandroidTextAttrChanged);
            this.imgLogo.setOnClickListener(mCallback169);
            this.mboundView0.setOnClickListener(mCallback166);
            this.mboundView1.setOnClickListener(mCallback167);
            this.mboundView2.setOnClickListener(mCallback168);
            this.mboundView4.setOnClickListener(mCallback170);
            this.mboundView5.setOnClickListener(mCallback171);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, (" ") + (mboundView9.getResources().getString(R.string.asterisk)));
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnEPUpdate, vmIsCreatedBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave);
            this.layoutHeader.setTitle(vmIsCreatedAndroidStringAddNewProjectAndroidStringDetailProject);
        }
        if ((dirtyFlags & 0xe6L) != 0) {
            // api target 1

            this.cbbOrganization.setEnabled(vmIsCreatedBooleanTrueVmIsHaveOrganizationACheckPermissionConstantsPERMISSIONPROJECTUPDATEBooleanFalseBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbOrganization, vmIsHaveOrganizationCbbOrganizationAndroidDrawableBgCbbEnableCbbOrganizationAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTag, vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable);
            this.mboundView7.setEnabled(vmIsHaveTagBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editProjectName, vmProjectName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editProjectNote, vmProjectNote);
        }
        if ((dirtyFlags & 0xe2L) != 0) {
            // api target 1

            this.editProjectNote.setFocusableInTouchMode(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONSERVICEUPDATEBooleanTrueBooleanFalse);
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
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



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
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdate();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseImage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



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
                com.finance.ui.project.detail.ProjectDetailActivity a = mA;



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
        flag 1 (0x2L): vm.isCreated
        flag 2 (0x3L): vm.isHaveOrganization
        flag 3 (0x4L): vm.project
        flag 4 (0x5L): vm.isHaveTag
        flag 5 (0x6L): vm
        flag 6 (0x7L): a
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE))
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_SERVICE_UPDATE)) ? true : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false ? true : false
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveOrganization.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) : false ? true : false
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_project : @android:string/detail_project
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_project : @android:string/detail_project
    flag mapping end*/
    //end
}