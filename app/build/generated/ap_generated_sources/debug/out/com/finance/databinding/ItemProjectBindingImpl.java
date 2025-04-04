package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProjectBindingImpl extends ItemProjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.swipeRevealLayout, 7);
        sViewsWithIds.put(R.id.img_update, 8);
        sViewsWithIds.put(R.id.img_delete, 9);
        sViewsWithIds.put(R.id.layout_main, 10);
        sViewsWithIds.put(R.id.cardView, 11);
        sViewsWithIds.put(R.id.img_logo, 12);
        sViewsWithIds.put(R.id.img_detail, 13);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ItemProjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[1]
            , (com.chauthai.swipereveallayout.SwipeRevealLayout) bindings[7]
            );
        this.layoutDelete.setTag(null);
        this.layoutUpdate.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
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
        else if (BR.permissionUpdate == variableId) {
            setPermissionUpdate((java.lang.Boolean) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.project.ProjectResponse) variable);
        }
        else if (BR.permissionDelete == variableId) {
            setPermissionDelete((java.lang.Boolean) variable);
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
    public void setPermissionUpdate(@Nullable java.lang.Boolean PermissionUpdate) {
        this.mPermissionUpdate = PermissionUpdate;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.permissionUpdate);
        super.requestRebind();
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.project.ProjectResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.ivm);
        super.requestRebind();
    }
    public void setPermissionDelete(@Nullable java.lang.Boolean PermissionDelete) {
        this.mPermissionDelete = PermissionDelete;
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
        boolean ivmTotalTasksInt0 = false;
        java.lang.String ivmName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxPermissionUpdate = false;
        java.lang.String secretKey = mSecretKey;
        com.finance.data.model.api.response.organization.OrganizationResponse ivmOrganization = null;
        java.lang.String stringValueOfIvmTotalTasks = null;
        java.lang.String ivmOrganizationName = null;
        java.lang.Boolean permissionUpdate = mPermissionUpdate;
        int androidxDatabindingViewDataBindingSafeUnboxIvmTotalTasks = 0;
        java.lang.String aESUtilsDecryptSecretKeyIvmOrganizationNameBooleanFalse = null;
        java.lang.Integer ivmTotalTasks = null;
        int ivmTotalTasksInt0ViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.project.ProjectResponse ivm = mIvm;
        int permissionUpdateViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x15L) != 0) {


            if ((dirtyFlags & 0x14L) != 0) {

                    if (ivm != null) {
                        // read ivm.name
                        ivmName = ivm.getName();
                        // read ivm.totalTasks
                        ivmTotalTasks = ivm.getTotalTasks();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks)
                    androidxDatabindingViewDataBindingSafeUnboxIvmTotalTasks = androidx.databinding.ViewDataBinding.safeUnbox(ivmTotalTasks);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks) > 0
                    ivmTotalTasksInt0 = (androidxDatabindingViewDataBindingSafeUnboxIvmTotalTasks) > (0);
                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks))
                    stringValueOfIvmTotalTasks = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxIvmTotalTasks);
                if((dirtyFlags & 0x14L) != 0) {
                    if(ivmTotalTasksInt0) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks) > 0 ? View.VISIBLE : View.GONE
                    ivmTotalTasksInt0ViewVISIBLEViewGONE = ((ivmTotalTasksInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (ivm != null) {
                    // read ivm.organization
                    ivmOrganization = ivm.getOrganization();
                }


                if (ivmOrganization != null) {
                    // read ivm.organization.name
                    ivmOrganizationName = ivmOrganization.getName();
                }


                // read AESUtils.decrypt(secretKey, ivm.organization.name, false)
                aESUtilsDecryptSecretKeyIvmOrganizationNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmOrganizationName, false);
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionUpdate)
                androidxDatabindingViewDataBindingSafeUnboxPermissionUpdate = androidx.databinding.ViewDataBinding.safeUnbox(permissionUpdate);
            if((dirtyFlags & 0x12L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPermissionUpdate) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(permissionUpdate) ? View.VISIBLE : View.GONE
                permissionUpdateViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxPermissionUpdate) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.layoutDelete.setVisibility(permissionUpdateViewVISIBLEViewGONE);
            this.layoutUpdate.setVisibility(permissionUpdateViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, ivmName);
            this.mboundView5.setVisibility(ivmTotalTasksInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, stringValueOfIvmTotalTasks);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, aESUtilsDecryptSecretKeyIvmOrganizationNameBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): secretKey
        flag 1 (0x2L): permissionUpdate
        flag 2 (0x3L): ivm
        flag 3 (0x4L): permissionDelete
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks) > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(ivm.totalTasks) > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(permissionUpdate) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(permissionUpdate) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}