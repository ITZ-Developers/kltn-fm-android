package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrganizationSelectBindingImpl extends ItemOrganizationSelectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_main, 3);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOrganizationSelectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemOrganizationSelectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.ivmSelectedId == variableId) {
            setIvmSelectedId((java.lang.Long) variable);
        }
        else if (BR.secretKey == variableId) {
            setSecretKey((java.lang.String) variable);
        }
        else if (BR.ivm == variableId) {
            setIvm((com.finance.data.model.api.response.organization.OrganizationResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIvmSelectedId(@Nullable java.lang.Long IvmSelectedId) {
        this.mIvmSelectedId = IvmSelectedId;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ivmSelectedId);
        super.requestRebind();
    }
    public void setSecretKey(@Nullable java.lang.String SecretKey) {
        this.mSecretKey = SecretKey;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.secretKey);
        super.requestRebind();
    }
    public void setIvm(@Nullable com.finance.data.model.api.response.organization.OrganizationResponse Ivm) {
        this.mIvm = Ivm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.ivm);
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
        java.lang.Long ivmSelectedId = mIvmSelectedId;
        java.lang.String ivmName = null;
        java.lang.String ivmIdEqualsLong0LIvmNameAESUtilsDecryptSecretKeyIvmNameBooleanFalse = null;
        int ivmIdEqualsIvmSelectedIdViewVISIBLEViewGONE = 0;
        boolean ivmIdEqualsLong0L = false;
        java.lang.String secretKey = mSecretKey;
        java.lang.Long ivmId = null;
        java.lang.String aESUtilsDecryptSecretKeyIvmNameBooleanFalse = null;
        com.finance.data.model.api.response.organization.OrganizationResponse ivm = mIvm;
        boolean ivmIdEqualsIvmSelectedId = false;

        if ((dirtyFlags & 0xdL) != 0) {
        }
        if ((dirtyFlags & 0xfL) != 0) {



                if (ivm != null) {
                    // read ivm.id
                    ivmId = ivm.getId();
                }

            if ((dirtyFlags & 0xeL) != 0) {

                    if (ivmId != null) {
                        // read ivm.id.equals(0L)
                        ivmIdEqualsLong0L = ivmId.equals(0L);
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(ivmIdEqualsLong0L) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (ivmId != null) {
                        // read ivm.id.equals(ivmSelectedId)
                        ivmIdEqualsIvmSelectedId = ivmId.equals(ivmSelectedId);
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(ivmIdEqualsIvmSelectedId) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read ivm.id.equals(ivmSelectedId) ? View.VISIBLE : View.GONE
                    ivmIdEqualsIvmSelectedIdViewVISIBLEViewGONE = ((ivmIdEqualsIvmSelectedId) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x30L) != 0) {

                if (ivm != null) {
                    // read ivm.name
                    ivmName = ivm.getName();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {



                // read AESUtils.decrypt(secretKey, ivm.name, false)
                aESUtilsDecryptSecretKeyIvmNameBooleanFalse = com.finance.utils.AESUtils.decrypt(secretKey, ivmName, false);
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read ivm.id.equals(0L) ? ivm.name : AESUtils.decrypt(secretKey, ivm.name, false)
                ivmIdEqualsLong0LIvmNameAESUtilsDecryptSecretKeyIvmNameBooleanFalse = ((ivmIdEqualsLong0L) ? (ivmName) : (aESUtilsDecryptSecretKeyIvmNameBooleanFalse));
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(ivmIdEqualsIvmSelectedIdViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, ivmIdEqualsLong0LIvmNameAESUtilsDecryptSecretKeyIvmNameBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ivmSelectedId
        flag 1 (0x2L): secretKey
        flag 2 (0x3L): ivm
        flag 3 (0x4L): null
        flag 4 (0x5L): ivm.id.equals(0L) ? ivm.name : AESUtils.decrypt(secretKey, ivm.name, false)
        flag 5 (0x6L): ivm.id.equals(0L) ? ivm.name : AESUtils.decrypt(secretKey, ivm.name, false)
        flag 6 (0x7L): ivm.id.equals(ivmSelectedId) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): ivm.id.equals(ivmSelectedId) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}