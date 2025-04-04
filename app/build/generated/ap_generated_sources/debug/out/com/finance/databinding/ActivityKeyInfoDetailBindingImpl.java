package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKeyInfoDetailBindingImpl extends ActivityKeyInfoDetailBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(36);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {27},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dropdown_kind, 28);
        sViewsWithIds.put(R.id.dropdown_group, 29);
        sViewsWithIds.put(R.id.dropdown_organization, 30);
        sViewsWithIds.put(R.id.layout_color, 31);
        sViewsWithIds.put(R.id.layout_password, 32);
        sViewsWithIds.put(R.id.tv_title_document, 33);
        sViewsWithIds.put(R.id.rcv_documents, 34);
        sViewsWithIds.put(R.id.img_upload_file, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.EditText mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.ImageView mboundView14;
    @NonNull
    private final android.widget.EditText mboundView15;
    @NonNull
    private final android.widget.LinearLayout mboundView16;
    @NonNull
    private final android.widget.EditText mboundView17;
    @NonNull
    private final android.widget.EditText mboundView18;
    @NonNull
    private final android.widget.EditText mboundView19;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.EditText mboundView20;
    @NonNull
    private final android.widget.RelativeLayout mboundView22;
    @NonNull
    private final android.widget.EditText mboundView24;
    @NonNull
    private final android.widget.FrameLayout mboundView25;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback124;
    @Nullable
    private final android.view.View.OnClickListener mCallback125;
    @Nullable
    private final android.view.View.OnClickListener mCallback122;
    @Nullable
    private final android.view.View.OnClickListener mCallback123;
    @Nullable
    private final android.view.View.OnClickListener mCallback119;
    @Nullable
    private final android.view.View.OnClickListener mCallback120;
    @Nullable
    private final android.view.View.OnClickListener mCallback121;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serverKey.get().password
            //         is vm.serverKey.get().setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.serverKey.get().password
            java.lang.String vmServerKeyPassword = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.serverKey.get()
            com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
            // vm.serverKey != null
            boolean vmServerKeyJavaLangObjectNull = false;
            // vm.serverKey.get() != null
            boolean vmServerKeyGetJavaLangObjectNull = false;
            // vm.serverKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServerKey = vm.serverKey;

                vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                if (vmServerKeyJavaLangObjectNull) {


                    vmServerKeyGet = vmServerKey.get();

                    vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                    if (vmServerKeyGetJavaLangObjectNull) {




                        vmServerKeyGet.setPassword(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editPassword1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.ggKey.get().password
            //         is vm.ggKey.get().setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editPassword1);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.ggKey.get()
            com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.ggKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
            // vm.ggKey.get().password
            java.lang.String vmGgKeyPassword = null;
            // vm.ggKey.get() != null
            boolean vmGgKeyGetJavaLangObjectNull = false;
            // vm.ggKey != null
            boolean vmGgKeyJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmGgKey = vm.ggKey;

                vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                if (vmGgKeyJavaLangObjectNull) {


                    vmGgKeyGet = vmGgKey.get();

                    vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                    if (vmGgKeyGetJavaLangObjectNull) {




                        vmGgKeyGet.setPassword(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTransactionNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.name.get()
            //         is vm.name.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTransactionName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.name != null
            boolean vmNameJavaLangObjectNull = false;
            // vm.name.get()
            java.lang.String vmNameGet = null;
            // vm.name
            androidx.databinding.ObservableField<java.lang.String> vmName = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmName = vm.name;

                vmNameJavaLangObjectNull = (vmName) != (null);
                if (vmNameJavaLangObjectNull) {




                    vmName.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView11androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.ggKey.get().username
            //         is vm.ggKey.get().setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView11);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.ggKey.get()
            com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.ggKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
            // vm.ggKey.get() != null
            boolean vmGgKeyGetJavaLangObjectNull = false;
            // vm.ggKey != null
            boolean vmGgKeyJavaLangObjectNull = false;
            // vm.ggKey.get().username
            java.lang.String vmGgKeyUsername = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmGgKey = vm.ggKey;

                vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                if (vmGgKeyJavaLangObjectNull) {


                    vmGgKeyGet = vmGgKey.get();

                    vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                    if (vmGgKeyGetJavaLangObjectNull) {




                        vmGgKeyGet.setUsername(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView15androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.ggKey.get().phoneNumber
            //         is vm.ggKey.get().setPhoneNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView15);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.ggKey.get()
            com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.ggKey.get().phoneNumber
            java.lang.String vmGgKeyPhoneNumber = null;
            // vm.ggKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
            // vm.ggKey.get() != null
            boolean vmGgKeyGetJavaLangObjectNull = false;
            // vm.ggKey != null
            boolean vmGgKeyJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmGgKey = vm.ggKey;

                vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                if (vmGgKeyJavaLangObjectNull) {


                    vmGgKeyGet = vmGgKey.get();

                    vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                    if (vmGgKeyGetJavaLangObjectNull) {




                        vmGgKeyGet.setPhoneNumber(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView17androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serverKey.get().host
            //         is vm.serverKey.get().setHost((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView17);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.serverKey.get()
            com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
            // vm.serverKey.get().host
            java.lang.String vmServerKeyHost = null;
            // vm.serverKey != null
            boolean vmServerKeyJavaLangObjectNull = false;
            // vm.serverKey.get() != null
            boolean vmServerKeyGetJavaLangObjectNull = false;
            // vm.serverKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServerKey = vm.serverKey;

                vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                if (vmServerKeyJavaLangObjectNull) {


                    vmServerKeyGet = vmServerKey.get();

                    vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                    if (vmServerKeyGetJavaLangObjectNull) {




                        vmServerKeyGet.setHost(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView18androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serverKey.get().port
            //         is vm.serverKey.get().setPort((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView18);
            // localize variables for thread safety
            // vm.serverKey.get().port
            java.lang.String vmServerKeyPort = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.serverKey.get()
            com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
            // vm.serverKey != null
            boolean vmServerKeyJavaLangObjectNull = false;
            // vm.serverKey.get() != null
            boolean vmServerKeyGetJavaLangObjectNull = false;
            // vm.serverKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServerKey = vm.serverKey;

                vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                if (vmServerKeyJavaLangObjectNull) {


                    vmServerKeyGet = vmServerKey.get();

                    vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                    if (vmServerKeyGetJavaLangObjectNull) {




                        vmServerKeyGet.setPort(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView19androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serverKey.get().privateKey
            //         is vm.serverKey.get().setPrivateKey((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView19);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.serverKey.get().privateKey
            java.lang.String vmServerKeyPrivateKey = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.serverKey.get()
            com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
            // vm.serverKey != null
            boolean vmServerKeyJavaLangObjectNull = false;
            // vm.serverKey.get() != null
            boolean vmServerKeyGetJavaLangObjectNull = false;
            // vm.serverKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServerKey = vm.serverKey;

                vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                if (vmServerKeyJavaLangObjectNull) {


                    vmServerKeyGet = vmServerKey.get();

                    vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                    if (vmServerKeyGetJavaLangObjectNull) {




                        vmServerKeyGet.setPrivateKey(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView20androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.serverKey.get().username
            //         is vm.serverKey.get().setUsername((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView20);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.serverKey.get()
            com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
            // vm.serverKey != null
            boolean vmServerKeyJavaLangObjectNull = false;
            // vm.serverKey.get() != null
            boolean vmServerKeyGetJavaLangObjectNull = false;
            // vm.serverKey
            androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;
            // vm.serverKey.get().username
            java.lang.String vmServerKeyUsername = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmServerKey = vm.serverKey;

                vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                if (vmServerKeyJavaLangObjectNull) {


                    vmServerKeyGet = vmServerKey.get();

                    vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                    if (vmServerKeyGetJavaLangObjectNull) {




                        vmServerKeyGet.setUsername(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView24androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.description.get()
            //         is vm.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView24);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.description.get()
            java.lang.String vmDescriptionGet = null;
            // vm
            com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
            // vm.description
            androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
            // vm.description != null
            boolean vmDescriptionJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDescription = vm.description;

                vmDescriptionJavaLangObjectNull = (vmDescription) != (null);
                if (vmDescriptionJavaLangObjectNull) {




                    vmDescription.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityKeyInfoDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private ActivityKeyInfoDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.Button) bindings[26]
            , (android.widget.AutoCompleteTextView) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[29]
            , (android.widget.AutoCompleteTextView) bindings[28]
            , (android.widget.AutoCompleteTextView) bindings[30]
            , (android.widget.EditText) bindings[21]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[8]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[31]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[27]
            , (android.widget.FrameLayout) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[34]
            , (android.widget.TextView) bindings[33]
            );
        this.btnEPUpdate.setTag(null);
        this.cbbTag.setTag(null);
        this.editPassword.setTag(null);
        this.editPassword1.setTag(null);
        this.editTransactionName.setTag(null);
        this.imgShowOldPassword.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.core.widget.NestedScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.EditText) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.ImageView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.EditText) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.LinearLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.EditText) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.EditText) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.EditText) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.EditText) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.RelativeLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView24 = (android.widget.EditText) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView25 = (android.widget.FrameLayout) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback124 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback125 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback122 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback123 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback119 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback120 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback121 = new com.finance.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setVm((com.finance.ui.key.details.KeyDetailsViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.key.details.KeyDetailsActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.key.details.KeyDetailsViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.key.details.KeyDetailsActivity A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
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
                return onChangeVmIsCreated((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeVmDescription((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmKind((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeVmIsHaveTag((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 5 :
                return onChangeVmServerKey((androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey>) object, fieldId);
            case 6 :
                return onChangeVmGgKey((androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey>) object, fieldId);
            case 7 :
                return onChangeVmName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsCreated(androidx.databinding.ObservableField<java.lang.Boolean> VmIsCreated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDescription(androidx.databinding.ObservableField<java.lang.String> VmDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmKind(androidx.databinding.ObservableField<java.lang.Integer> VmKind, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveTag(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveTag, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLayoutHeader(com.finance.databinding.LayoutHeaderTitleBinding LayoutHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmServerKey(androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> VmServerKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmGgKey(androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> VmGgKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmName(androidx.databinding.ObservableField<java.lang.String> VmName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        android.graphics.drawable.Drawable vmIsShowPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff = null;
        java.lang.String vmDescriptionGet = null;
        com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreated = null;
        java.lang.String vmServerKeyPrivateKey = null;
        com.finance.ui.key.details.KeyDetailsActivity a = mA;
        java.lang.Boolean vmIsCreatedGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = false;
        java.lang.String vmServerKeyHost = null;
        java.lang.String vmGgKeyPhoneNumber = null;
        int vmKindInt2ViewVISIBLEViewGONE = 0;
        java.lang.String vmServerKeyPort = null;
        androidx.databinding.ObservableField<java.lang.String> vmDescription = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmKind = null;
        java.lang.String vmServerKeyPassword = null;
        boolean vmIsHaveTagBooleanTrueBooleanFalse = false;
        com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOUPDATE = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveTag = null;
        java.lang.String vmNameGet = null;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSPHONEInputTypeTYPENULL = 0;
        android.graphics.drawable.Drawable vmIsShowPasswordMboundView14AndroidDrawableIcEyeMboundView14AndroidDrawableIcEyeOff = null;
        boolean vmKindInt2 = false;
        android.graphics.drawable.Drawable vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = null;
        java.lang.String vmGgKeyPassword = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONKEYINFOUPDATE = null;
        java.lang.Boolean vmIsHaveTagGet = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = false;
        int vmKindInt1ViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmName = null;
        int vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsShowPassword = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        java.lang.String vmIsCreatedAndroidStringAddNewKeyAndroidStringUpdateKey = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmKindGet = 0;
        boolean vmKindInt1 = false;
        java.lang.String vmGgKeyUsername = null;
        java.lang.String vmServerKeyUsername = null;
        java.lang.Boolean vmIsShowPasswordGet = null;
        boolean vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE = false;
        java.lang.Integer vmKindGet = null;

        if ((dirtyFlags & 0xfefL) != 0) {


            if ((dirtyFlags & 0xe01L) != 0) {

                    if (vm != null) {
                        // read vm.isCreated
                        vmIsCreated = vm.isCreated;
                    }
                    updateRegistration(0, vmIsCreated);


                    if (vmIsCreated != null) {
                        // read vm.isCreated.get()
                        vmIsCreatedGet = vmIsCreated.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsCreatedGet);
                if((dirtyFlags & 0xa01L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0xe01L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }

                if ((dirtyFlags & 0xa01L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_key : @android:string/update_key
                        vmIsCreatedAndroidStringAddNewKeyAndroidStringUpdateKey = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (getRoot().getResources().getString(R.string.add_new_key)) : (getRoot().getResources().getString(R.string.update_key)));
                }
            }
            if ((dirtyFlags & 0xa02L) != 0) {

                    if (vm != null) {
                        // read vm.description
                        vmDescription = vm.description;
                    }
                    updateRegistration(1, vmDescription);


                    if (vmDescription != null) {
                        // read vm.description.get()
                        vmDescriptionGet = vmDescription.get();
                    }
            }
            if ((dirtyFlags & 0xa04L) != 0) {

                    if (vm != null) {
                        // read vm.kind
                        vmKind = vm.kind;
                    }
                    updateRegistration(2, vmKind);


                    if (vmKind != null) {
                        // read vm.kind.get()
                        vmKindGet = vmKind.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmKindGet = androidx.databinding.ViewDataBinding.safeUnbox(vmKindGet);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2
                    vmKindInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (2);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1
                    vmKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmKindGet) == (1);
                if((dirtyFlags & 0xa04L) != 0) {
                    if(vmKindInt2) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0xa04L) != 0) {
                    if(vmKindInt1) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? View.VISIBLE : View.GONE
                    vmKindInt2ViewVISIBLEViewGONE = ((vmKindInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? View.VISIBLE : View.GONE
                    vmKindInt1ViewVISIBLEViewGONE = ((vmKindInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xa08L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveTag
                        vmIsHaveTag = vm.isHaveTag;
                    }
                    updateRegistration(3, vmIsHaveTag);


                    if (vmIsHaveTag != null) {
                        // read vm.isHaveTag.get()
                        vmIsHaveTagGet = vmIsHaveTag.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveTagGet);
                if((dirtyFlags & 0xa08L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
                    vmIsHaveTagBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0xa20L) != 0) {

                    if (vm != null) {
                        // read vm.serverKey
                        vmServerKey = vm.serverKey;
                    }
                    updateRegistration(5, vmServerKey);


                    if (vmServerKey != null) {
                        // read vm.serverKey.get()
                        vmServerKeyGet = vmServerKey.get();
                    }


                    if (vmServerKeyGet != null) {
                        // read vm.serverKey.get().privateKey
                        vmServerKeyPrivateKey = vmServerKeyGet.getPrivateKey();
                        // read vm.serverKey.get().host
                        vmServerKeyHost = vmServerKeyGet.getHost();
                        // read vm.serverKey.get().port
                        vmServerKeyPort = vmServerKeyGet.getPort();
                        // read vm.serverKey.get().password
                        vmServerKeyPassword = vmServerKeyGet.getPassword();
                        // read vm.serverKey.get().username
                        vmServerKeyUsername = vmServerKeyGet.getUsername();
                    }
            }
            if ((dirtyFlags & 0xa40L) != 0) {

                    if (vm != null) {
                        // read vm.ggKey
                        vmGgKey = vm.ggKey;
                    }
                    updateRegistration(6, vmGgKey);


                    if (vmGgKey != null) {
                        // read vm.ggKey.get()
                        vmGgKeyGet = vmGgKey.get();
                    }


                    if (vmGgKeyGet != null) {
                        // read vm.ggKey.get().phoneNumber
                        vmGgKeyPhoneNumber = vmGgKeyGet.getPhoneNumber();
                        // read vm.ggKey.get().password
                        vmGgKeyPassword = vmGgKeyGet.getPassword();
                        // read vm.ggKey.get().username
                        vmGgKeyUsername = vmGgKeyGet.getUsername();
                    }
            }
            if ((dirtyFlags & 0xa80L) != 0) {

                    if (vm != null) {
                        // read vm.name
                        vmName = vm.name;
                    }
                    updateRegistration(7, vmName);


                    if (vmName != null) {
                        // read vm.name.get()
                        vmNameGet = vmName.get();
                    }
            }
            if ((dirtyFlags & 0xb00L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPassword
                        vmIsShowPassword = vm.isShowPassword;
                    }
                    updateRegistration(8, vmIsShowPassword);


                    if (vmIsShowPassword != null) {
                        // read vm.isShowPassword.get()
                        vmIsShowPasswordGet = vmIsShowPassword.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordGet);
                if((dirtyFlags & 0xb00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowOldPassword.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgShowOldPassword.getContext(), R.drawable.ic_eye_off)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
                    vmIsShowPasswordMboundView14AndroidDrawableIcEyeMboundView14AndroidDrawableIcEyeOff = ((androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView14.getContext(), R.drawable.ic_eye)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView14.getContext(), R.drawable.ic_eye_off)));
            }
        }
        if ((dirtyFlags & 0xc00L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x100000000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)
                    aCheckPermissionConstantsPERMISSIONKEYINFOUPDATE = a.checkPermission(com.finance.constant.Constants.PERMISSION_KEY_INFO_UPDATE);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOUPDATE = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONKEYINFOUPDATE);
        }

        if ((dirtyFlags & 0xe01L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE))
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONKEYINFOUPDATE));
            if((dirtyFlags & 0xe01L) != 0) {
                if(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE) {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x200000L;
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x100000L;
                        dirtyFlags |= 0x10000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? View.VISIBLE : View.GONE
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEViewVISIBLEViewGONE = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_PHONE : InputType.TYPE_NULL
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSPHONEInputTypeTYPENULL = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE) ? (android.text.InputType.TYPE_CLASS_PHONE) : (android.text.InputType.TYPE_NULL));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
                vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL = ((vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATE) ? (android.text.InputType.TYPE_CLASS_TEXT) : (android.text.InputType.TYPE_NULL));
        }
        // batch finished
        if ((dirtyFlags & 0xe01L) != 0) {
            // api target 1

            this.btnEPUpdate.setVisibility(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEViewVISIBLEViewGONE);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.editTransactionName.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
                this.mboundView11.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
                this.mboundView15.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSPHONEInputTypeTYPENULL);
                this.mboundView17.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
                this.mboundView18.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
                this.mboundView20.setInputType(vmIsCreatedBooleanTrueACheckPermissionConstantsPERMISSIONKEYINFOUPDATEInputTypeTYPECLASSTEXTInputTypeTYPENULL);
            }
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.btnEPUpdate.setOnClickListener(mCallback125);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editPassword1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editPassword1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTransactionName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTransactionNameandroidTextAttrChanged);
            this.mboundView0.setOnClickListener(mCallback119);
            this.mboundView1.setOnClickListener(mCallback120);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, (" ") + (mboundView10.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView11, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView11androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, (" ") + (mboundView12.getResources().getString(R.string.asterisk)));
            this.mboundView14.setOnClickListener(mCallback122);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView15, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView15androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView17, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView17androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView18, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView18androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView19, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView19androidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback121);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView20, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView20androidTextAttrChanged);
            this.mboundView22.setOnClickListener(mCallback123);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView24, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView24androidTextAttrChanged);
            this.mboundView25.setOnClickListener(mCallback124);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, (" ") + (mboundView3.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, (" ") + (mboundView4.getResources().getString(R.string.asterisk)));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, (" ") + (mboundView7.getResources().getString(R.string.asterisk)));
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTag, vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable);
            this.mboundView5.setEnabled(vmIsHaveTagBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword, vmServerKeyPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, vmServerKeyHost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, vmServerKeyPort);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, vmServerKeyPrivateKey);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, vmServerKeyUsername);
        }
        if ((dirtyFlags & 0xa40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editPassword1, vmGgKeyPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, vmGgKeyUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, vmGgKeyPhoneNumber);
        }
        if ((dirtyFlags & 0xa80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTransactionName, vmNameGet);
        }
        if ((dirtyFlags & 0xb00L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgShowOldPassword, vmIsShowPasswordImgShowOldPasswordAndroidDrawableIcEyeImgShowOldPasswordAndroidDrawableIcEyeOff);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView14, vmIsShowPasswordMboundView14AndroidDrawableIcEyeMboundView14AndroidDrawableIcEyeOff);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            this.layoutHeader.setTitle(vmIsCreatedAndroidStringAddNewKeyAndroidStringUpdateKey);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0xa04L) != 0) {
            // api target 1

            this.mboundView16.setVisibility(vmKindInt1ViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(vmKindInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa02L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView24, vmDescriptionGet);
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
                com.finance.ui.key.details.KeyDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseFile();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.details.KeyDetailsActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdate();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.details.KeyDetailsViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.showPassword();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.details.KeyDetailsActivity a = mA;



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
                com.finance.ui.key.details.KeyDetailsActivity a = mA;



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
                com.finance.ui.key.details.KeyDetailsActivity a = mA;



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
        flag 0 (0x1L): vm.isCreated
        flag 1 (0x2L): vm.description
        flag 2 (0x3L): vm.kind
        flag 3 (0x4L): vm.isHaveTag
        flag 4 (0x5L): layoutHeader
        flag 5 (0x6L): vm.serverKey
        flag 6 (0x7L): vm.ggKey
        flag 7 (0x8L): vm.name
        flag 8 (0x9L): vm.isShowPassword
        flag 9 (0xaL): vm
        flag 10 (0xbL): a
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 2 ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_PHONE : InputType.TYPE_NULL
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_PHONE : InputType.TYPE_NULL
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? @android:drawable/ic_eye : @android:drawable/ic_eye_off
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.kind.get()) == 1 ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE)) ? InputType.TYPE_CLASS_TEXT : InputType.TYPE_NULL
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_key : @android:string/update_key
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/add_new_key : @android:string/update_key
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE))
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_KEY_INFO_UPDATE))
    flag mapping end*/
    //end
}