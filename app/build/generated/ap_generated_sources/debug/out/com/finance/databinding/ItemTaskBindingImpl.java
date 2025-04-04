package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTaskBindingImpl extends ItemTaskBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_change_state, 7);
        sViewsWithIds.put(R.id.img_delete, 8);
        sViewsWithIds.put(R.id.layout_item, 9);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTaskBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ItemTaskBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.FrameLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.layoutChangeState.setTag(null);
        this.layoutDelete.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.swipeLayout.setTag(null);
        this.tvName.setTag(null);
        this.tvOrganization.setTag(null);
        this.tvProject.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.secretKey == variableId) {
            setSecretKey((java.lang.String) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.task.TaskResponse) variable);
        }
        else if (BR.permissionDelete == variableId) {
            setPermissionDelete((java.lang.Boolean) variable);
        }
        else if (BR.permissionChangeState == variableId) {
            setPermissionChangeState((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecretKey(@Nullable java.lang.String SecretKey) {
        this.mSecretKey = SecretKey;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.secretKey);
        super.requestRebind();
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.task.TaskResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ivm);
        super.requestRebind();
    }
    public void setPermissionDelete(@Nullable java.lang.Boolean PermissionDelete) {
        this.mPermissionDelete = PermissionDelete;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.permissionDelete);
        super.requestRebind();
    }
    public void setPermissionChangeState(@Nullable java.lang.Boolean PermissionChangeState) {
        this.mPermissionChangeState = PermissionChangeState;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.permissionChangeState);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String aESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse = null;
        java.lang.String secretKey = mSecretKey;
        java.lang.String aESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse = null;
        boolean ivmStateInt1 = false;
        java.lang.String ivmProjectNameJavaLangObjectNullTvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalseTvProjectAndroidStringNotPartOfAnyProject = null;
        boolean ivmProjectOrganizationJavaLangObjectNull = false;
        boolean ivmProjectNameJavaLangObjectNull = false;
        boolean permissionChangeStateIvmStateInt1BooleanFalse = false;
        java.lang.String ivmProjectOrganizationJavaLangObjectNullTvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalseTvOrganizationAndroidStringNotPartOfAnyOrganization = null;
        int androidxDatabindingViewDataBindingSafeUnboxIvmState = 0;
        java.lang.String ivmProjectName = null;
        com.finance.data.model.api.response.task.TaskResponse ivm = mIvm;
        java.lang.Boolean permissionDelete = mPermissionDelete;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState = false;
        com.finance.data.model.api.response.project.ProjectResponse ivmProject = null;
        java.lang.String ivmName = null;
        com.finance.data.model.api.response.organization.OrganizationResponse ivmProjectOrganization = null;
        java.lang.String tvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse = null;
        java.lang.String tvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse = null;
        java.lang.String ivmProjectOrganizationName = null;
        android.graphics.drawable.Drawable ivmStateInt1MboundView6AndroidDrawableIcProcessingMboundView6AndroidDrawableIcCompleted = null;
        java.lang.Integer ivmState = null;
        int permissionDeleteViewVISIBLEViewGONE = 0;
        java.lang.Boolean permissionChangeState = mPermissionChangeState;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = false;
        int permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x13L) != 0) {



                if (ivm != null) {
                    // read ivm.project
                    ivmProject = ivm.getProject();
                }


                if (ivmProject != null) {
                    // read ivm.project.name
                    ivmProjectName = ivmProject.getName();
                    // read ivm.project.organization
                    ivmProjectOrganization = ivmProject.getOrganization();
                }


                // read ivm.project.name != null
                ivmProjectNameJavaLangObjectNull = (ivmProjectName) != (null);
                // read ivm.project.organization != null
                ivmProjectOrganizationJavaLangObjectNull = (ivmProjectOrganization) != (null);
            if((dirtyFlags & 0x13L) != 0) {
                if(ivmProjectNameJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x13L) != 0) {
                if(ivmProjectOrganizationJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if ((dirtyFlags & 0x12L) != 0) {

                    if (ivm != null) {
                        // read ivm.name
                        ivmName = ivm.getName();
                        // read ivm.state
                        ivmState = ivm.getState();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                    androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                    ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
                if((dirtyFlags & 0x12L) != 0) {
                    if(ivmStateInt1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
                    ivmStateInt1MboundView6AndroidDrawableIcProcessingMboundView6AndroidDrawableIcCompleted = ((ivmStateInt1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.ic_processing)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.ic_completed)));
            }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete)
                androidxDatabindingViewDataBindingSafeUnboxPermissionDelete = androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete);
            if((dirtyFlags & 0x14L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
                permissionDeleteViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPermissionDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState)
                androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState = androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState);
            if((dirtyFlags & 0x1aL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x440L) != 0) {


            if ((dirtyFlags & 0x40L) != 0) {

                    // read AESUtils.decrypt(secretKey, ivm.project.name, false)
                    aESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmProjectName, false);


                    // read ((@android:string/project) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.name, false))
                    tvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse = ((tvProject.getResources().getString(R.string.project)) + (" ")) + (aESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse);
            }
        }
        if ((dirtyFlags & 0x100L) != 0) {



                if (ivm != null) {
                    // read ivm.state
                    ivmState = ivm.getState();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state)
                androidxDatabindingViewDataBindingSafeUnboxIvmState = androidx.databinding.ViewDataBinding.safeUnbox(ivmState);


                // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1
                ivmStateInt1 = (androidxDatabindingViewDataBindingSafeUnboxIvmState) == (1);
            if((dirtyFlags & 0x12L) != 0) {
                if(ivmStateInt1) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                if (ivmProjectOrganization != null) {
                    // read ivm.project.organization.name
                    ivmProjectOrganizationName = ivmProjectOrganization.getName();
                }


                // read AESUtils.decrypt(secretKey, ivm.project.organization.name, false)
                aESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmProjectOrganizationName, false);


                // read ((@android:string/organization) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.organization.name, false))
                tvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse = ((tvOrganization.getResources().getString(R.string.organization)) + (" ")) + (aESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse);
        }

        if ((dirtyFlags & 0x13L) != 0) {

                // read ivm.project.name != null ? ((@android:string/project) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.name, false)) : @android:string/not_part_of_any_project
                ivmProjectNameJavaLangObjectNullTvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalseTvProjectAndroidStringNotPartOfAnyProject = ((ivmProjectNameJavaLangObjectNull) ? (tvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalse) : (tvProject.getResources().getString(R.string.not_part_of_any_project)));
                // read ivm.project.organization != null ? ((@android:string/organization) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.organization.name, false)) : @android:string/not_part_of_any_organization
                ivmProjectOrganizationJavaLangObjectNullTvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalseTvOrganizationAndroidStringNotPartOfAnyOrganization = ((ivmProjectOrganizationJavaLangObjectNull) ? (tvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalse) : (tvOrganization.getResources().getString(R.string.not_part_of_any_organization)));
        }
        if ((dirtyFlags & 0x1aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
                permissionChangeStateIvmStateInt1BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxPermissionChangeState) ? (ivmStateInt1) : (false));
            if((dirtyFlags & 0x1aL) != 0) {
                if(permissionChangeStateIvmStateInt1BooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
                permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE = ((permissionChangeStateIvmStateInt1BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.layoutChangeState.setVisibility(permissionChangeStateIvmStateInt1BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionDeleteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView6, ivmStateInt1MboundView6AndroidDrawableIcProcessingMboundView6AndroidDrawableIcCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, ivmName);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrganization, ivmProjectOrganizationJavaLangObjectNullTvOrganizationAndroidStringOrganizationJavaLangStringAESUtilsDecryptSecretKeyIvmProjectOrganizationNameBooleanFalseTvOrganizationAndroidStringNotPartOfAnyOrganization);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProject, ivmProjectNameJavaLangObjectNullTvProjectAndroidStringProjectJavaLangStringAESUtilsDecryptSecretKeyIvmProjectNameBooleanFalseTvProjectAndroidStringNotPartOfAnyProject);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): ivm
        flag 2 (0x3L): permissionDelete
        flag 3 (0x4L): permissionChangeState
        flag 4 (0x5L): null
        flag 5 (0x6L): ivm.project.name != null ? ((@android:string/project) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.name, false)) : @android:string/not_part_of_any_project
        flag 6 (0x7L): ivm.project.name != null ? ((@android:string/project) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.name, false)) : @android:string/not_part_of_any_project
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false
        flag 9 (0xaL): ivm.project.organization != null ? ((@android:string/organization) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.organization.name, false)) : @android:string/not_part_of_any_organization
        flag 10 (0xbL): ivm.project.organization != null ? ((@android:string/organization) + (" ")) + (AESUtils.decrypt(secretKey, ivm.project.organization.name, false)) : @android:string/not_part_of_any_organization
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 ? @android:drawable/ic_processing : @android:drawable/ic_completed
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(permissionDelete) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(permissionChangeState) ? androidx.databinding.ViewDataBinding.safeUnbox(ivm.state) == 1 : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}