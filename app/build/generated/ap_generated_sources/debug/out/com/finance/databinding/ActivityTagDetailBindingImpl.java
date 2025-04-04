package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTagDetailBindingImpl extends ActivityTagDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {13},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_color, 14);
        sViewsWithIds.put(R.id.layout_background, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editProjectNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.tag.get().name
            //         is vm.tag.get().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editProjectName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.tag != null
            boolean vmTagJavaLangObjectNull = false;
            // vm
            com.finance.ui.tag.detail.TagDetailViewModel vm = mVm;
            // vm.tag.get()
            com.finance.data.model.api.response.tag.TagResponse vmTagGet = null;
            // vm.tag.get() != null
            boolean vmTagGetJavaLangObjectNull = false;
            // vm.tag
            androidx.databinding.ObservableField<com.finance.data.model.api.response.tag.TagResponse> vmTag = null;
            // vm.tag.get().name
            java.lang.String vmTagName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTag = vm.tag;

                vmTagJavaLangObjectNull = (vmTag) != (null);
                if (vmTagJavaLangObjectNull) {


                    vmTagGet = vmTag.get();

                    vmTagGetJavaLangObjectNull = (vmTagGet) != (null);
                    if (vmTagGetJavaLangObjectNull) {




                        vmTagGet.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTagDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityTagDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[12]
            , (android.widget.AutoCompleteTextView) bindings[5]
            , (android.widget.EditText) bindings[7]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[14]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[13]
            );
        this.btnEPUpdate.setTag(null);
        this.cbbTagKind.setTag(null);
        this.editProjectName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (androidx.cardview.widget.CardView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback2 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback3 = new com.finance.generated.callback.OnClickListener(this, 3);
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
            setVm((com.finance.ui.tag.detail.TagDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.tag.detail.TagDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.tag.detail.TagDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.tag.detail.TagDetailActivity A) {
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
                return onChangeVmTag((androidx.databinding.ObservableField<com.finance.data.model.api.response.tag.TagResponse>) object, fieldId);
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
    private boolean onChangeVmTag(androidx.databinding.ObservableField<com.finance.data.model.api.response.tag.TagResponse> VmTag, int fieldId) {
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
        boolean vmIsCreateBooleanTrueBooleanFalse = false;
        com.finance.data.model.api.response.tag.TagResponse vmTagGet = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONPROJECTUPDATE = null;
        com.finance.ui.tag.detail.TagDetailViewModel vm = mVm;
        android.graphics.drawable.Drawable vmIsCreateCbbTagKindAndroidDrawableBgCbbEnableCbbTagKindAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean vmIsCreateGet = null;
        com.finance.ui.tag.detail.TagDetailActivity a = mA;
        int aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE = 0;
        java.lang.String vmIsCreateAndroidStringAddNewProjectAndroidStringDetailProject = null;
        java.lang.String vmTagName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE = false;
        java.lang.String vmIsCreateBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreate = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.tag.TagResponse> vmTag = null;

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
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
                    vmIsCreateBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsCreateCbbTagKindAndroidDrawableBgCbbEnableCbbTagKindAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTagKind.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTagKind.getContext(), R.drawable.bg_cbb_disable)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_project : @android:string/detail_project
                    vmIsCreateAndroidStringAddNewProjectAndroidStringDetailProject = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (getRoot().getResources().getString(R.string.add_new_project)) : (getRoot().getResources().getString(R.string.detail_project)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/create : @android:string/save
                    vmIsCreateBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreateGet) ? (btnEPUpdate.getResources().getString(R.string.create)) : (btnEPUpdate.getResources().getString(R.string.save)));
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (vm != null) {
                        // read vm.tag
                        vmTag = vm.tag;
                    }
                    updateRegistration(2, vmTag);


                    if (vmTag != null) {
                        // read vm.tag.get()
                        vmTagGet = vmTag.get();
                    }


                    if (vmTagGet != null) {
                        // read vm.tag.get().name
                        vmTagName = vmTagGet.getName();
                    }
            }
        }
        if ((dirtyFlags & 0x30L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)
                    aCheckPermissionConstantsPERMISSIONPROJECTUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_PROJECT_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONPROJECTUPDATE);
            if((dirtyFlags & 0x30L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
                aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(aCheckPermissionConstantsPERMISSIONPROJECTUPDATEViewVISIBLEViewGONE);
            this.editProjectName.setEnabled(androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONPROJECTUPDATE);
            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editProjectName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editProjectNameandroidTextAttrChanged);
            this.mboundView0.setOnClickListener(mCallback1);
            this.mboundView1.setOnClickListener(mCallback2);
            this.mboundView10.setOnClickListener(mCallback5);
            this.mboundView11.setOnClickListener(mCallback6);
            this.mboundView2.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, (" ") + (mboundView3.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, (" ") + (mboundView6.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, (" ") + (mboundView8.getResources().getString(R.string.asterisk)));
            this.mboundView9.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnEPUpdate, vmIsCreateBtnEPUpdateAndroidStringCreateBtnEPUpdateAndroidStringSave);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTagKind, vmIsCreateCbbTagKindAndroidDrawableBgCbbEnableCbbTagKindAndroidDrawableBgCbbDisable);
            this.layoutHeader.setTitle(vmIsCreateAndroidStringAddNewProjectAndroidStringDetailProject);
            this.mboundView4.setEnabled(vmIsCreateBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editProjectName, vmTagName);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.openColorPicker();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



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
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.openColorPicker();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.openColorPicker();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.doDone();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.tag.detail.TagDetailActivity a = mA;



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
        flag 1 (0x2L): vm.isCreate
        flag 2 (0x3L): vm.tag
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? true : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_PROJECT_UPDATE)) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_project : @android:string/detail_project
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/add_new_project : @android:string/detail_project
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/create : @android:string/save
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreate.get()) ? @android:string/create : @android:string/save
    flag mapping end*/
    //end
}