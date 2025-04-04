package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTaskCreateUpdateBindingImpl extends ActivityTaskCreateUpdateBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {9},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cbb_state, 10);
        sViewsWithIds.put(R.id.tv_title_document, 11);
        sViewsWithIds.put(R.id.rcv_documents, 12);
        sViewsWithIds.put(R.id.img_upload_file, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final android.widget.FrameLayout mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTaskCreateUpdateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityTaskCreateUpdateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[8]
            , (android.widget.AutoCompleteTextView) bindings[4]
            , (android.widget.AutoCompleteTextView) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[13]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[9]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[11]
            );
        this.btnCreate.setTag(null);
        this.cbbProject.setTag(null);
        this.editTaskContent.setTag(null);
        this.editTaskName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView1 = (android.widget.ScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView7 = (android.widget.FrameLayout) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback94 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback95 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback96 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback98 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback97 = new com.finance.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setVm((com.finance.ui.task.create_or_update.TaskCreateUpdateViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.task.create_or_update.TaskCreateUpdateActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.task.create_or_update.TaskCreateUpdateViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.task.create_or_update.TaskCreateUpdateActivity A) {
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
        layoutHeader.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 1 :
                return onChangeVmTaskResponse((androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse>) object, fieldId);
            case 2 :
                return onChangeVmIsCreated((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmIsHaveProject((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeVmIsSubTask((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeVmFromProject((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmTaskResponse(androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse> VmTaskResponse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsCreated(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveProject(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveProject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSubTask(androidx.databinding.ObservableField<java.lang.Boolean> VmIsSubTask, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFromProject(androidx.databinding.ObservableField<java.lang.Boolean> VmFromProject, int fieldId) {
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
        java.lang.Boolean vmFromProjectGet = null;
        boolean vmIsSubTask = false;
        java.lang.String aDecryptVmTaskResponseName = null;
        com.finance.ui.task.create_or_update.TaskCreateUpdateViewModel vm = mVm;
        java.lang.Boolean vmIsSubTaskGet = null;
        java.lang.String vmTaskResponseName = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse> vmTaskResponse = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreated = null;
        com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;
        java.lang.Boolean vmIsCreatedGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveProject = null;
        boolean vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = false;
        java.lang.Boolean vmIsHaveProjectGet = null;
        java.lang.String aDecryptVmTaskResponseNote = null;
        boolean vmIsHaveProjectVmIsSubTaskBooleanFalse = false;
        boolean vmFromProject = false;
        com.finance.data.model.api.response.task.TaskResponse vmTaskResponseGet = null;
        boolean vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseBooleanTrueBooleanFalse = false;
        java.lang.String vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringUpdate = null;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsSubTask1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveProjectGet = false;
        android.graphics.drawable.Drawable vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseCbbProjectAndroidDrawableBgCbbEnableCbbProjectAndroidDrawableBgCbbDisable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsSubTaskGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> VmFromProject1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmFromProjectGet = false;
        java.lang.String vmIsCreatedAndroidStringCreateNewTaskAndroidStringUpdateTask = null;
        java.lang.String vmTaskResponseNote = null;

        if ((dirtyFlags & 0x1feL) != 0) {


            if ((dirtyFlags & 0x1c2L) != 0) {

                    if (vm != null) {
                        // read vm.taskResponse
                        vmTaskResponse = vm.taskResponse;
                    }
                    updateRegistration(1, vmTaskResponse);


                    if (vmTaskResponse != null) {
                        // read vm.taskResponse.get()
                        vmTaskResponseGet = vmTaskResponse.get();
                    }


                    if (vmTaskResponseGet != null) {
                        // read vm.taskResponse.get().name
                        vmTaskResponseName = vmTaskResponseGet.getName();
                        // read vm.taskResponse.get().note
                        vmTaskResponseNote = vmTaskResponseGet.getNote();
                    }
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.isCreated
                        vmIsCreated = vm.isCreated;
                    }
                    updateRegistration(2, vmIsCreated);


                    if (vmIsCreated != null) {
                        // read vm.isCreated.get()
                        vmIsCreatedGet = vmIsCreated.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreatedGet);
                if((dirtyFlags & 0x144L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/update
                    vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringUpdate = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (btnCreate.getResources().getString(R.string.create)) : (btnCreate.getResources().getString(R.string.update)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_task : @android:string/update_task
                    vmIsCreatedAndroidStringCreateNewTaskAndroidStringUpdateTask = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (getRoot().getResources().getString(R.string.create_new_task)) : (getRoot().getResources().getString(R.string.update_task)));
            }
            if ((dirtyFlags & 0x178L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveProject
                        vmIsHaveProject = vm.isHaveProject;
                    }
                    updateRegistration(3, vmIsHaveProject);


                    if (vmIsHaveProject != null) {
                        // read vm.isHaveProject.get()
                        vmIsHaveProjectGet = vmIsHaveProject.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveProjectGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveProjectGet);
                if((dirtyFlags & 0x178L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveProjectGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x1c2L) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.taskResponse.get().name)
                    aDecryptVmTaskResponseName = a.decrypt(vmTaskResponseName);
                    // read a.decrypt(vm.taskResponse.get().note)
                    aDecryptVmTaskResponseNote = a.decrypt(vmTaskResponseNote);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x1000L) != 0) {

                if (vm != null) {
                    // read vm.isSubTask
                    VmIsSubTask1 = vm.isSubTask;
                }
                updateRegistration(4, VmIsSubTask1);


                if (VmIsSubTask1 != null) {
                    // read vm.isSubTask.get()
                    vmIsSubTaskGet = VmIsSubTask1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get())
                androidxDatabindingViewDataBindingSafeUnboxVmIsSubTaskGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsSubTaskGet);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get())
                vmIsSubTask = !androidxDatabindingViewDataBindingSafeUnboxVmIsSubTaskGet;
        }

        if ((dirtyFlags & 0x178L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false
                vmIsHaveProjectVmIsSubTaskBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveProjectGet) ? (vmIsSubTask) : (false));
            if((dirtyFlags & 0x178L) != 0) {
                if(vmIsHaveProjectVmIsSubTaskBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (vm != null) {
                    // read vm.fromProject
                    VmFromProject1 = vm.fromProject;
                }
                updateRegistration(5, VmFromProject1);


                if (VmFromProject1 != null) {
                    // read vm.fromProject.get()
                    vmFromProjectGet = VmFromProject1.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get())
                androidxDatabindingViewDataBindingSafeUnboxVmFromProjectGet = androidx.databinding.ViewDataBinding.safeUnbox(vmFromProjectGet);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get())
                vmFromProject = !androidxDatabindingViewDataBindingSafeUnboxVmFromProjectGet;
        }

        if ((dirtyFlags & 0x178L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false
                vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalse = ((vmIsHaveProjectVmIsSubTaskBooleanFalse) ? (vmFromProject) : (false));
            if((dirtyFlags & 0x178L) != 0) {
                if(vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalse) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? true : false
                vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseBooleanTrueBooleanFalse = ((vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalse) ? (true) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseCbbProjectAndroidDrawableBgCbbEnableCbbProjectAndroidDrawableBgCbbDisable = ((vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbProject.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbProject.getContext(), R.drawable.bg_cbb_disable)));
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnCreate.setOnClickListener(mCallback98);
            this.layoutMain.setOnClickListener(mCallback94);
            this.mboundView1.setOnClickListener(mCallback95);
            this.mboundView2.setOnClickListener(mCallback96);
            this.mboundView7.setOnClickListener(mCallback97);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnCreate, vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringUpdate);
            this.layoutHeader.setTitle(vmIsCreatedAndroidStringCreateNewTaskAndroidStringUpdateTask);
        }
        if ((dirtyFlags & 0x178L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbProject, vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseCbbProjectAndroidDrawableBgCbbEnableCbbProjectAndroidDrawableBgCbbDisable);
            this.mboundView3.setEnabled(vmIsHaveProjectVmIsSubTaskBooleanFalseVmFromProjectBooleanFalseBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x1c2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTaskContent, aDecryptVmTaskResponseNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTaskName, aDecryptVmTaskResponseName);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
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
                com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;



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
                com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;



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
                com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdateTask();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.create_or_update.TaskCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseFile();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.taskResponse
        flag 2 (0x3L): vm.isCreated
        flag 3 (0x4L): vm.isHaveProject
        flag 4 (0x5L): vm.isSubTask
        flag 5 (0x6L): vm.fromProject
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? true : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? true : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/update
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/update
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveProject.get()) ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.isSubTask.get()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(vm.fromProject.get()) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_task : @android:string/update_task
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_task : @android:string/update_task
    flag mapping end*/
    //end
}