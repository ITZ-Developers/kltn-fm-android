package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPasswordForgetBindingImpl extends ActivityPasswordForgetBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 4);
        sViewsWithIds.put(R.id.tv_subtitle, 5);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback182;
    @Nullable
    private final android.view.View.OnClickListener mCallback183;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.email.get()
            //         is vm.email.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editUsername);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.password.forget.ForgetPasswordViewModel vm = mVm;
            // vm.email.get()
            java.lang.String vmEmailGet = null;
            // vm.email != null
            boolean vmEmailJavaLangObjectNull = false;
            // vm.email
            androidx.databinding.ObservableField<java.lang.String> vmEmail = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEmail = vm.email;

                vmEmailJavaLangObjectNull = (vmEmail) != (null);
                if (vmEmailJavaLangObjectNull) {




                    vmEmail.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityPasswordForgetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityPasswordForgetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.btnConfirm.setTag(null);
        this.editUsername.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback182 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback183 = new com.finance.generated.callback.OnClickListener(this, 2);
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
        if (BR.a == variableId) {
            setA((com.finance.ui.password.forget.ForgetPasswordActivity) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.finance.ui.password.forget.ForgetPasswordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setA(@Nullable com.finance.ui.password.forget.ForgetPasswordActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }
    public void setVm(@Nullable com.finance.ui.password.forget.ForgetPasswordViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmEmail((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmEmail(androidx.databinding.ObservableField<java.lang.String> VmEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.finance.ui.password.forget.ForgetPasswordActivity a = mA;
        com.finance.ui.password.forget.ForgetPasswordViewModel vm = mVm;
        java.lang.String vmEmailGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmEmail = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (vm != null) {
                    // read vm.email
                    vmEmail = vm.email;
                }
                updateRegistration(0, vmEmail);


                if (vmEmail != null) {
                    // read vm.email.get()
                    vmEmailGet = vmEmail.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnConfirm.setOnClickListener(mCallback183);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editUsernameandroidTextAttrChanged);
            this.mboundView1.setOnClickListener(mCallback182);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editUsername, vmEmailGet);
        }
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
                com.finance.ui.password.forget.ForgetPasswordActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.password.forget.ForgetPasswordViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.forgetPassword();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.email
        flag 1 (0x2L): a
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}