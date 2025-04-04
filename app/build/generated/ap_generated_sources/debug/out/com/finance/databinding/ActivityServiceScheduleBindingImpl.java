package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityServiceScheduleBindingImpl extends ActivityServiceScheduleBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {5},
            new int[] {com.finance.R.layout.layout_header_title});
        sIncludes.setIncludes(2, 
            new String[] {"layout_empty_data"},
            new int[] {6},
            new int[] {com.finance.R.layout.layout_empty_data});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edit_name_service_schedule, 7);
        sViewsWithIds.put(R.id.rcv_service_schedules, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.Button mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback128;
    @Nullable
    private final android.view.View.OnClickListener mCallback126;
    @Nullable
    private final android.view.View.OnClickListener mCallback130;
    @Nullable
    private final android.view.View.OnClickListener mCallback129;
    @Nullable
    private final android.view.View.OnClickListener mCallback127;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityServiceScheduleBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityServiceScheduleBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[7]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[5]
            , (com.finance.databinding.LayoutEmptyDataBinding) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            );
        this.btnCreateServiceSchedule.setTag(null);
        setContainedBinding(this.layoutHeader);
        setContainedBinding(this.layoutNoData);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback128 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback126 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback130 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback129 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback127 = new com.finance.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        layoutHeader.invalidateAll();
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
        if (layoutHeader.hasPendingBindings()) {
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
            setVm((com.finance.ui.service.schedule.ServiceScheduleViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.service.schedule.ServiceScheduleActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.service.schedule.ServiceScheduleViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.service.schedule.ServiceScheduleActivity A) {
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
        layoutNoData.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmIsHaveServiceSchedule((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmIsUpdate((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeLayoutNoData((com.finance.databinding.LayoutEmptyDataBinding) object, fieldId);
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
    private boolean onChangeVmIsHaveServiceSchedule(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveServiceSchedule, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsUpdate(androidx.databinding.ObservableField<java.lang.Boolean> VmIsUpdate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutNoData(com.finance.databinding.LayoutEmptyDataBinding LayoutNoData, int fieldId) {
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
        java.lang.Boolean vmIsUpdateGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveServiceSchedule = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsUpdateGet = false;
        com.finance.ui.service.schedule.ServiceScheduleViewModel vm = mVm;
        java.lang.String vmIsUpdateBtnCreateServiceScheduleAndroidStringSaveBtnCreateServiceScheduleAndroidStringCreate = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsUpdate = null;
        com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;
        boolean vmIsHaveServiceScheduleBooleanTrueBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet = false;
        java.lang.Boolean vmIsHaveServiceScheduleGet = null;
        int vmIsHaveServiceScheduleViewVISIBLEViewGONE = 0;
        boolean VmIsHaveServiceSchedule1 = false;
        android.graphics.drawable.Drawable vmIsHaveServiceScheduleMboundView4AndroidDrawableBtnCustomEnableMboundView4AndroidDrawableBtnCustomDisable = null;

        if ((dirtyFlags & 0x56L) != 0) {


            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveServiceSchedule
                        vmIsHaveServiceSchedule = vm.isHaveServiceSchedule;
                    }
                    updateRegistration(1, vmIsHaveServiceSchedule);


                    if (vmIsHaveServiceSchedule != null) {
                        // read vm.isHaveServiceSchedule.get()
                        vmIsHaveServiceScheduleGet = vmIsHaveServiceSchedule.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveServiceScheduleGet);
                if((dirtyFlags & 0x52L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? true : false
                    vmIsHaveServiceScheduleBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet) ? (true) : (false));
                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get())
                    VmIsHaveServiceSchedule1 = !androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? @android:drawable/btn_custom_enable : @android:drawable/btn_custom_disable
                    vmIsHaveServiceScheduleMboundView4AndroidDrawableBtnCustomEnableMboundView4AndroidDrawableBtnCustomDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveServiceScheduleGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.btn_custom_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.btn_custom_disable)));
                if((dirtyFlags & 0x52L) != 0) {
                    if(VmIsHaveServiceSchedule1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? View.VISIBLE : View.GONE
                    vmIsHaveServiceScheduleViewVISIBLEViewGONE = ((VmIsHaveServiceSchedule1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (vm != null) {
                        // read vm.isUpdate
                        vmIsUpdate = vm.isUpdate;
                    }
                    updateRegistration(2, vmIsUpdate);


                    if (vmIsUpdate != null) {
                        // read vm.isUpdate.get()
                        vmIsUpdateGet = vmIsUpdate.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isUpdate.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsUpdateGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsUpdateGet);
                if((dirtyFlags & 0x54L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsUpdateGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isUpdate.get()) ? @android:string/save : @android:string/create
                    vmIsUpdateBtnCreateServiceScheduleAndroidStringSaveBtnCreateServiceScheduleAndroidStringCreate = ((androidxDatabindingViewDataBindingSafeUnboxVmIsUpdateGet) ? (btnCreateServiceSchedule.getResources().getString(R.string.save)) : (btnCreateServiceSchedule.getResources().getString(R.string.create)));
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnCreateServiceSchedule, vmIsUpdateBtnCreateServiceScheduleAndroidStringSaveBtnCreateServiceScheduleAndroidStringCreate);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnCreateServiceSchedule.setOnClickListener(mCallback129);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.service_schedule));
            this.layoutNoData.setDes(getRoot().getResources().getString(R.string.data_empty));
            this.mboundView0.setOnClickListener(mCallback126);
            this.mboundView1.setOnClickListener(mCallback127);
            this.mboundView2.setOnClickListener(mCallback128);
            this.mboundView4.setOnClickListener(mCallback130);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.layoutNoData.getRoot().setVisibility(vmIsHaveServiceScheduleViewVISIBLEViewGONE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView4, vmIsHaveServiceScheduleMboundView4AndroidDrawableBtnCustomEnableMboundView4AndroidDrawableBtnCustomDisable);
            this.mboundView4.setEnabled(vmIsHaveServiceScheduleBooleanTrueBooleanFalse);
        }
        executeBindingsOn(layoutHeader);
        executeBindingsOn(layoutNoData);
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
                com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;



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
                com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;



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
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // a
                com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;
                // vm
                com.finance.ui.service.schedule.ServiceScheduleViewModel vm = mVm;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();


                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vm.updateServiceSchedule();
                    }
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
                com.finance.ui.service.schedule.ServiceScheduleViewModel vm = mVm;
                // a
                com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;
                // vm.isUpdate.get()
                java.lang.Boolean vmIsUpdateGet = null;
                // vm.isUpdate != null
                boolean vmIsUpdateJavaLangObjectNull = false;
                // vm.isUpdate
                androidx.databinding.ObservableField<java.lang.Boolean> vmIsUpdate = null;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vmIsUpdate = vm.isUpdate;

                    vmIsUpdateJavaLangObjectNull = (vmIsUpdate) != (null);
                    if (vmIsUpdateJavaLangObjectNull) {


                        vmIsUpdateGet = vmIsUpdate.get();
                        if (vmIsUpdateGet) {



                            aJavaLangObjectNull = (a) != (null);
                            if (aJavaLangObjectNull) {


                                a.updateServiceSchedule();
                            }
                        }
                        else {



                            aJavaLangObjectNull = (a) != (null);
                            if (aJavaLangObjectNull) {


                                a.addServiceSchedule();
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.service.schedule.ServiceScheduleActivity a = mA;



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
        flag 1 (0x2L): vm.isHaveServiceSchedule
        flag 2 (0x3L): vm.isUpdate
        flag 3 (0x4L): layoutNoData
        flag 4 (0x5L): vm
        flag 5 (0x6L): a
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isUpdate.get()) ? @android:string/save : @android:string/create
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isUpdate.get()) ? @android:string/save : @android:string/create
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? true : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? true : false
        flag 11 (0xcL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? @android:drawable/btn_custom_enable : @android:drawable/btn_custom_disable
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveServiceSchedule.get()) ? @android:drawable/btn_custom_enable : @android:drawable/btn_custom_disable
    flag mapping end*/
    //end
}