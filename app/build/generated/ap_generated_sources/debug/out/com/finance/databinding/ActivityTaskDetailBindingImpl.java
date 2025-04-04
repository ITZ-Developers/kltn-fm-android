package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTaskDetailBindingImpl extends ActivityTaskDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {10},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_sub_task, 11);
        sViewsWithIds.put(R.id.tv_title_subtask, 12);
        sViewsWithIds.put(R.id.ic_detail, 13);
        sViewsWithIds.put(R.id.img_document, 14);
        sViewsWithIds.put(R.id.tv_title_document, 15);
        sViewsWithIds.put(R.id.ic_detail_document, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTaskDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityTaskDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[8]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (kr.co.prnd.readmore.ReadMoreTextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.layoutDocument.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.RelativeLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.tvTitleMoney.setTag(null);
        this.tvTransactionNote.setTag(null);
        this.tvTransactionState.setTag(null);
        setRootTag(root);
        // listeners
        mCallback91 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback92 = new com.finance.generated.callback.OnClickListener(this, 2);
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
            setVm((com.finance.ui.task.detail.TaskDetailViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.task.detail.TaskDetailActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.task.detail.TaskDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.task.detail.TaskDetailActivity A) {
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
                return onChangeVmTotalDocuments((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeVmTask((androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse>) object, fieldId);
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
    private boolean onChangeVmTotalDocuments(androidx.databinding.ObservableField<java.lang.Integer> VmTotalDocuments, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTask(androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse> VmTask, int fieldId) {
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
        java.lang.String javaLangStringStringValueOfVmTaskTotalChildrenJavaLangString = null;
        java.lang.Integer vmTotalDocumentsGet = null;
        com.finance.ui.task.detail.TaskDetailViewModel vm = mVm;
        android.graphics.drawable.Drawable vmTaskStateInt1TvTransactionStateAndroidDrawableBgTaskProcessingTvTransactionStateAndroidDrawableBgTaskDone = null;
        com.finance.data.model.api.response.task.TaskResponse vmTaskGet = null;
        java.lang.String javaLangStringStringValueOfVmTaskTotalChildren = null;
        com.finance.ui.task.detail.TaskDetailActivity a = mA;
        java.lang.String vmTaskStateInt1TvTransactionStateAndroidStringPendingTvTransactionStateAndroidStringDone = null;
        java.lang.String aDecryptVmTaskProjectOrganizationName = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet = 0;
        java.lang.String aDecryptVmTaskProjectName = null;
        java.lang.String aDecryptVmTaskNote = null;
        java.lang.String vmTaskNote = null;
        java.lang.Integer vmTaskTotalChildren = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalDocuments = null;
        java.lang.String vmTaskName = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmTaskTotalChildren = 0;
        java.lang.String vmTaskProjectName = null;
        int vmTotalDocumentsInt0ViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfVmTotalDocuments = null;
        java.lang.String aDecryptVmTaskName = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmTaskState = 0;
        com.finance.data.model.api.response.organization.OrganizationResponse vmTaskProjectOrganization = null;
        boolean vmTaskStateInt1 = false;
        boolean vmTotalDocumentsInt0 = false;
        java.lang.Integer vmTaskState = null;
        java.lang.String vmTaskProjectOrganizationName = null;
        java.lang.String stringValueOfVmTaskTotalChildren = null;
        com.finance.data.model.api.response.project.ProjectResponse vmTaskProject = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.task.TaskResponse> vmTask = null;

        if ((dirtyFlags & 0x3eL) != 0) {


            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.totalDocuments
                        vmTotalDocuments = vm.totalDocuments;
                    }
                    updateRegistration(1, vmTotalDocuments);


                    if (vmTotalDocuments != null) {
                        // read vm.totalDocuments.get()
                        vmTotalDocumentsGet = vmTotalDocuments.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet = androidx.databinding.ViewDataBinding.safeUnbox(vmTotalDocumentsGet);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()))
                    stringValueOfVmTotalDocuments = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0
                    vmTotalDocumentsInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet) > (0);
                if((dirtyFlags & 0x2aL) != 0) {
                    if(vmTotalDocumentsInt0) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
                    vmTotalDocumentsInt0ViewVISIBLEViewGONE = ((vmTotalDocumentsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3cL) != 0) {

                    if (vm != null) {
                        // read vm.task
                        vmTask = vm.task;
                    }
                    updateRegistration(2, vmTask);


                    if (vmTask != null) {
                        // read vm.task.get()
                        vmTaskGet = vmTask.get();
                    }


                    if (vmTaskGet != null) {
                        // read vm.task.get().note
                        vmTaskNote = vmTaskGet.getNote();
                        // read vm.task.get().name
                        vmTaskName = vmTaskGet.getName();
                        // read vm.task.get().project
                        vmTaskProject = vmTaskGet.getProject();
                    }


                    if (vmTaskProject != null) {
                        // read vm.task.get().project.name
                        vmTaskProjectName = vmTaskProject.getName();
                        // read vm.task.get().project.organization
                        vmTaskProjectOrganization = vmTaskProject.getOrganization();
                    }


                    if (vmTaskProjectOrganization != null) {
                        // read vm.task.get().project.organization.name
                        vmTaskProjectOrganizationName = vmTaskProjectOrganization.getName();
                    }
                if ((dirtyFlags & 0x2cL) != 0) {

                        if (vmTaskGet != null) {
                            // read vm.task.get().totalChildren
                            vmTaskTotalChildren = vmTaskGet.getTotalChildren();
                            // read vm.task.get().state
                            vmTaskState = vmTaskGet.getState();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().totalChildren)
                        androidxDatabindingViewDataBindingSafeUnboxVmTaskTotalChildren = androidx.databinding.ViewDataBinding.safeUnbox(vmTaskTotalChildren);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state)
                        androidxDatabindingViewDataBindingSafeUnboxVmTaskState = androidx.databinding.ViewDataBinding.safeUnbox(vmTaskState);


                        // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().totalChildren))
                        stringValueOfVmTaskTotalChildren = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxVmTaskTotalChildren);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1
                        vmTaskStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmTaskState) == (1);
                    if((dirtyFlags & 0x2cL) != 0) {
                        if(vmTaskStateInt1) {
                                dirtyFlags |= 0x80L;
                                dirtyFlags |= 0x200L;
                        }
                        else {
                                dirtyFlags |= 0x40L;
                                dirtyFlags |= 0x100L;
                        }
                    }


                        // read ("(") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().totalChildren)))
                        javaLangStringStringValueOfVmTaskTotalChildren = ("(") + (stringValueOfVmTaskTotalChildren);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:drawable/bg_task_processing : @android:drawable/bg_task_done
                        vmTaskStateInt1TvTransactionStateAndroidDrawableBgTaskProcessingTvTransactionStateAndroidDrawableBgTaskDone = ((vmTaskStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvTransactionState.getContext(), R.drawable.bg_task_processing)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvTransactionState.getContext(), R.drawable.bg_task_done)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:string/pending : @android:string/done
                        vmTaskStateInt1TvTransactionStateAndroidStringPendingTvTransactionStateAndroidStringDone = ((vmTaskStateInt1) ? (tvTransactionState.getResources().getString(R.string.pending)) : (tvTransactionState.getResources().getString(R.string.done)));


                        // read (("(") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().totalChildren)))) + (")")
                        javaLangStringStringValueOfVmTaskTotalChildrenJavaLangString = (javaLangStringStringValueOfVmTaskTotalChildren) + (")");
                }
            }
        }
        if ((dirtyFlags & 0x3cL) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.task.get().project.organization.name)
                    aDecryptVmTaskProjectOrganizationName = a.decrypt(vmTaskProjectOrganizationName);
                    // read a.decrypt(vm.task.get().project.name)
                    aDecryptVmTaskProjectName = a.decrypt(vmTaskProjectName);
                    // read a.decrypt(vm.task.get().note)
                    aDecryptVmTaskNote = a.decrypt(vmTaskNote);
                    // read a.decrypt(vm.task.get().name)
                    aDecryptVmTaskName = a.decrypt(vmTaskName);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.layoutDocument.setOnClickListener(mCallback92);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.detail_task));
            this.mboundView6.setOnClickListener(mCallback91);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.layoutDocument.setVisibility(vmTotalDocumentsInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, stringValueOfVmTotalDocuments);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x3cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, aDecryptVmTaskProjectName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, aDecryptVmTaskProjectOrganizationName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitleMoney, aDecryptVmTaskName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionNote, aDecryptVmTaskNote);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, javaLangStringStringValueOfVmTaskTotalChildrenJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionState, vmTaskStateInt1TvTransactionStateAndroidStringPendingTvTransactionStateAndroidStringDone);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvTransactionState, vmTaskStateInt1TvTransactionStateAndroidDrawableBgTaskProcessingTvTransactionStateAndroidDrawableBgTaskDone);
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
                com.finance.ui.task.detail.TaskDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToSubTask();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.task.detail.TaskDetailActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToDocument();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.totalDocuments
        flag 2 (0x3L): vm.task
        flag 3 (0x4L): vm
        flag 4 (0x5L): a
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:drawable/bg_task_processing : @android:drawable/bg_task_done
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:drawable/bg_task_processing : @android:drawable/bg_task_done
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:string/pending : @android:string/done
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.task.get().state) == 1 ? @android:string/pending : @android:string/done
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}