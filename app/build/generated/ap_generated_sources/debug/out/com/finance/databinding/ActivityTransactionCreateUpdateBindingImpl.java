package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTransactionCreateUpdateBindingImpl extends ActivityTransactionCreateUpdateBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(33);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {24},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cbb_transaction_kind, 25);
        sViewsWithIds.put(R.id.text_input_category, 26);
        sViewsWithIds.put(R.id.text_input_group_transaction, 27);
        sViewsWithIds.put(R.id.layout_color, 28);
        sViewsWithIds.put(R.id.edit_transaction_money, 29);
        sViewsWithIds.put(R.id.tv_title_document, 30);
        sViewsWithIds.put(R.id.rcv_documents, 31);
        sViewsWithIds.put(R.id.img_upload_file, 32);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.ImageView mboundView17;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView20;
    @NonNull
    private final android.widget.FrameLayout mboundView22;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener cbCreateDebitandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.createDebit.get()
            //         is vm.createDebit.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = cbCreateDebit.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel vm = mVm;
            // vm.createDebit
            androidx.databinding.ObservableField<java.lang.Boolean> vmCreateDebit = null;
            // vm.createDebit.get()
            java.lang.Boolean vmCreateDebitGet = null;
            // vm.createDebit != null
            boolean vmCreateDebitJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmCreateDebit = vm.createDebit;

                vmCreateDebitJavaLangObjectNull = (vmCreateDebit) != (null);
                if (vmCreateDebitJavaLangObjectNull) {




                    vmCreateDebit.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTransactionContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.transactionRequest.get().note
            //         is vm.transactionRequest.get().setNote((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTransactionContent);
            // localize variables for thread safety
            // vm.transactionRequest.get().note
            java.lang.String vmTransactionRequestNote = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel vm = mVm;
            // vm.transactionRequest.get() != null
            boolean vmTransactionRequestGetJavaLangObjectNull = false;
            // vm.transactionRequest
            androidx.databinding.ObservableField<com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest> vmTransactionRequest = null;
            // vm.transactionRequest.get()
            com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest vmTransactionRequestGet = null;
            // vm.transactionRequest != null
            boolean vmTransactionRequestJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTransactionRequest = vm.transactionRequest;

                vmTransactionRequestJavaLangObjectNull = (vmTransactionRequest) != (null);
                if (vmTransactionRequestJavaLangObjectNull) {


                    vmTransactionRequestGet = vmTransactionRequest.get();

                    vmTransactionRequestGetJavaLangObjectNull = (vmTransactionRequestGet) != (null);
                    if (vmTransactionRequestGetJavaLangObjectNull) {




                        vmTransactionRequestGet.setNote(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTransactionNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.transactionRequest.get().name
            //         is vm.transactionRequest.get().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTransactionName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel vm = mVm;
            // vm.transactionRequest.get().name
            java.lang.String vmTransactionRequestName = null;
            // vm.transactionRequest.get() != null
            boolean vmTransactionRequestGetJavaLangObjectNull = false;
            // vm.transactionRequest
            androidx.databinding.ObservableField<com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest> vmTransactionRequest = null;
            // vm.transactionRequest.get()
            com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest vmTransactionRequestGet = null;
            // vm.transactionRequest != null
            boolean vmTransactionRequestJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmTransactionRequest = vm.transactionRequest;

                vmTransactionRequestJavaLangObjectNull = (vmTransactionRequest) != (null);
                if (vmTransactionRequestJavaLangObjectNull) {


                    vmTransactionRequestGet = vmTransactionRequest.get();

                    vmTransactionRequestGetJavaLangObjectNull = (vmTransactionRequestGet) != (null);
                    if (vmTransactionRequestGetJavaLangObjectNull) {




                        vmTransactionRequestGet.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTransactionCreateUpdateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityTransactionCreateUpdateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.Button) bindings[23]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.AutoCompleteTextView) bindings[12]
            , (android.widget.AutoCompleteTextView) bindings[14]
            , (android.widget.AutoCompleteTextView) bindings[10]
            , (android.widget.AutoCompleteTextView) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[8]
            , (android.widget.AutoCompleteTextView) bindings[25]
            , (android.widget.EditText) bindings[21]
            , (android.widget.EditText) bindings[29]
            , (android.widget.EditText) bindings[19]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[28]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[24]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.EditText) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[31]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (com.google.android.material.textfield.TextInputLayout) bindings[27]
            , (android.widget.TextView) bindings[30]
            );
        this.btnCreate.setTag(null);
        this.cbCreateDebit.setTag(null);
        this.cbbAddedBy.setTag(null);
        this.cbbApproveBy.setTag(null);
        this.cbbTag.setTag(null);
        this.cbbTransactionCategory.setTag(null);
        this.cbbTransactionGroup.setTag(null);
        this.editTransactionContent.setTag(null);
        this.editTransactionName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView1 = (android.widget.ScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.google.android.material.textfield.TextInputLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (com.google.android.material.textfield.TextInputLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.widget.ImageView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.FrameLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (com.google.android.material.textfield.TextInputLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.pickTransactionDate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback16 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback13 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback14 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback19 = new com.finance.generated.callback.OnClickListener(this, 8);
        mCallback12 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback17 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback18 = new com.finance.generated.callback.OnClickListener(this, 7);
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
            setVm((com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity A) {
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
                return onChangeVmIsHaveCategory((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmIsHaveTag((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmTransactionRequest((androidx.databinding.ObservableField<com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest>) object, fieldId);
            case 4 :
                return onChangeLayoutHeader((com.finance.databinding.LayoutHeaderTitleBinding) object, fieldId);
            case 5 :
                return onChangeVmIsHaveAccount((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeVmExpenditureKind((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeVmCreateDebit((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeVmIsHaveGroupTransaction((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmIsHaveCategory(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveTag(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveTag, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTransactionRequest(androidx.databinding.ObservableField<com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest> VmTransactionRequest, int fieldId) {
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
    private boolean onChangeVmIsHaveAccount(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveAccount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmExpenditureKind(androidx.databinding.ObservableField<java.lang.Boolean> VmExpenditureKind, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCreateDebit(androidx.databinding.ObservableField<java.lang.Boolean> VmCreateDebit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveGroupTransaction(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveGroupTransaction, int fieldId) {
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
        com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel vm = mVm;
        boolean vmIsHaveCategoryBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsCreated = null;
        com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;
        java.lang.Boolean vmIsCreatedGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet = false;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalse = false;
        android.graphics.drawable.Drawable vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable = null;
        boolean vmIsHaveGroupTransactionBooleanTrueBooleanFalse = false;
        java.lang.Boolean vmIsHaveAccountGet = null;
        boolean vmIsHaveTagBooleanTrueBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION = false;
        java.lang.String vmIsCreatedAndroidStringCreateNewTransactionAndroidStringUpdateTransaction = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmCreateDebitGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveCategory = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveTag = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest> vmTransactionRequest = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveAccount = null;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalse = false;
        java.lang.String vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringSave = null;
        android.graphics.drawable.Drawable vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = null;
        android.graphics.drawable.Drawable vmIsHaveCategoryCbbTransactionCategoryAndroidDrawableBgCbbEnableCbbTransactionCategoryAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean vmIsHaveTagGet = null;
        java.lang.String vmTransactionRequestNote = null;
        java.lang.Boolean vmIsHaveGroupTransactionGet = null;
        com.finance.data.model.api.request.transaction.TransactionCreateUpdateRequest vmTransactionRequestGet = null;
        java.lang.Boolean vmIsHaveCategoryGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = false;
        java.lang.String vmTransactionRequestName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION = false;
        java.lang.Boolean vmCreateDebitGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmExpenditureKind = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmCreateDebit = null;
        int vmExpenditureKindViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveGroupTransaction = null;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = false;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = false;
        java.lang.Boolean vmExpenditureKindGet = null;
        android.graphics.drawable.Drawable vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseCbbApproveByAndroidDrawableBgCbbEnableCbbApproveByAndroidDrawableBgCbbDisable = null;
        android.graphics.drawable.Drawable vmIsHaveGroupTransactionCbbTransactionGroupAndroidDrawableBgCbbEnableCbbTransactionGroupAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmExpenditureKindGet = false;

        if ((dirtyFlags & 0xfefL) != 0) {


            if ((dirtyFlags & 0xa01L) != 0) {

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
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_transaction : @android:string/update_transaction
                    vmIsCreatedAndroidStringCreateNewTransactionAndroidStringUpdateTransaction = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (getRoot().getResources().getString(R.string.create_new_transaction)) : (getRoot().getResources().getString(R.string.update_transaction)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
                    vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringSave = ((androidxDatabindingViewDataBindingSafeUnboxVmIsCreatedGet) ? (btnCreate.getResources().getString(R.string.create)) : (btnCreate.getResources().getString(R.string.save)));
            }
            if ((dirtyFlags & 0xa02L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveCategory
                        vmIsHaveCategory = vm.isHaveCategory;
                    }
                    updateRegistration(1, vmIsHaveCategory);


                    if (vmIsHaveCategory != null) {
                        // read vm.isHaveCategory.get()
                        vmIsHaveCategoryGet = vmIsHaveCategory.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveCategoryGet);
                if((dirtyFlags & 0xa02L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
                    vmIsHaveCategoryBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveCategoryCbbTransactionCategoryAndroidDrawableBgCbbEnableCbbTransactionCategoryAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTransactionCategory.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTransactionCategory.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0xa04L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveTag
                        vmIsHaveTag = vm.isHaveTag;
                    }
                    updateRegistration(2, vmIsHaveTag);


                    if (vmIsHaveTag != null) {
                        // read vm.isHaveTag.get()
                        vmIsHaveTagGet = vmIsHaveTag.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveTagGet);
                if((dirtyFlags & 0xa04L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
                    vmIsHaveTagBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0xa08L) != 0) {

                    if (vm != null) {
                        // read vm.transactionRequest
                        vmTransactionRequest = vm.transactionRequest;
                    }
                    updateRegistration(3, vmTransactionRequest);


                    if (vmTransactionRequest != null) {
                        // read vm.transactionRequest.get()
                        vmTransactionRequestGet = vmTransactionRequest.get();
                    }


                    if (vmTransactionRequestGet != null) {
                        // read vm.transactionRequest.get().note
                        vmTransactionRequestNote = vmTransactionRequestGet.getNote();
                        // read vm.transactionRequest.get().name
                        vmTransactionRequestName = vmTransactionRequestGet.getName();
                    }
            }
            if ((dirtyFlags & 0xe20L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveAccount
                        vmIsHaveAccount = vm.isHaveAccount;
                    }
                    updateRegistration(5, vmIsHaveAccount);


                    if (vmIsHaveAccount != null) {
                        // read vm.isHaveAccount.get()
                        vmIsHaveAccountGet = vmIsHaveAccount.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveAccountGet);
                if((dirtyFlags & 0xe20L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xa40L) != 0) {

                    if (vm != null) {
                        // read vm.expenditureKind
                        vmExpenditureKind = vm.expenditureKind;
                    }
                    updateRegistration(6, vmExpenditureKind);


                    if (vmExpenditureKind != null) {
                        // read vm.expenditureKind.get()
                        vmExpenditureKindGet = vmExpenditureKind.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.expenditureKind.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmExpenditureKindGet = androidx.databinding.ViewDataBinding.safeUnbox(vmExpenditureKindGet);
                if((dirtyFlags & 0xa40L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmExpenditureKindGet) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.expenditureKind.get()) ? View.VISIBLE : View.GONE
                    vmExpenditureKindViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxVmExpenditureKindGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xa80L) != 0) {

                    if (vm != null) {
                        // read vm.createDebit
                        vmCreateDebit = vm.createDebit;
                    }
                    updateRegistration(7, vmCreateDebit);


                    if (vmCreateDebit != null) {
                        // read vm.createDebit.get()
                        vmCreateDebitGet = vmCreateDebit.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.createDebit.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmCreateDebitGet = androidx.databinding.ViewDataBinding.safeUnbox(vmCreateDebitGet);
            }
            if ((dirtyFlags & 0xb00L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveGroupTransaction
                        vmIsHaveGroupTransaction = vm.isHaveGroupTransaction;
                    }
                    updateRegistration(8, vmIsHaveGroupTransaction);


                    if (vmIsHaveGroupTransaction != null) {
                        // read vm.isHaveGroupTransaction.get()
                        vmIsHaveGroupTransactionGet = vmIsHaveGroupTransaction.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveGroupTransactionGet);
                if((dirtyFlags & 0xb00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
                    vmIsHaveGroupTransactionBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveGroupTransactionCbbTransactionGroupAndroidDrawableBgCbbEnableCbbTransactionGroupAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTransactionGroup.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTransactionGroup.getContext(), R.drawable.bg_cbb_disable)));
            }
        }
        if ((dirtyFlags & 0xc00L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x2008000L) != 0) {


            if ((dirtyFlags & 0x2000000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)
                        aCheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION = a.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION);
            }
            if ((dirtyFlags & 0x8000L) != 0) {

                    if (a != null) {
                        // read a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)
                        aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION = a.checkPermission(com.finance.constant.Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION);
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION))
                    androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION);
            }
        }

        if ((dirtyFlags & 0xe20L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATION) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATION) : (false));
            if((dirtyFlags & 0xe20L) != 0) {
                if(vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalse) {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x1000000000L;
                }
            }
            if((dirtyFlags & 0xe20L) != 0) {
                if(vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalse) {
                        dirtyFlags |= 0x800000000L;
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                        dirtyFlags |= 0x4000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbAddedBy.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbAddedBy.getContext(), R.drawable.bg_cbb_disable)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? true : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalse) ? (true) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalse) ? (true) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseCbbApproveByAndroidDrawableBgCbbEnableCbbApproveByAndroidDrawableBgCbbDisable = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbApproveBy.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbApproveBy.getContext(), R.drawable.bg_cbb_disable)));
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.btnCreate.setOnClickListener(mCallback19);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.cbCreateDebit, (android.widget.CompoundButton.OnCheckedChangeListener)null, cbCreateDebitandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTransactionContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTransactionContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTransactionName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTransactionNameandroidTextAttrChanged);
            this.layoutMain.setOnClickListener(mCallback12);
            this.mboundView1.setOnClickListener(mCallback13);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, (" ") + (mboundView15.getResources().getString(R.string.asterisk)));
            this.mboundView17.setOnClickListener(mCallback17);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, (" ") + (mboundView18.getResources().getString(R.string.asterisk)));
            this.mboundView2.setOnClickListener(mCallback14);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, (" ") + (mboundView20.getResources().getString(R.string.asterisk)));
            this.mboundView22.setOnClickListener(mCallback18);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, (" ") + (mboundView3.getResources().getString(R.string.asterisk)));
            this.mboundView4.setOnClickListener(mCallback15);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, (" ") + (mboundView7.getResources().getString(R.string.asterisk)));
            this.pickTransactionDate.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnCreate, vmIsCreatedBtnCreateAndroidStringCreateBtnCreateAndroidStringSave);
            this.layoutHeader.setTitle(vmIsCreatedAndroidStringCreateNewTransactionAndroidStringUpdateTransaction);
        }
        if ((dirtyFlags & 0xa80L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cbCreateDebit, androidxDatabindingViewDataBindingSafeUnboxVmCreateDebitGet);
        }
        if ((dirtyFlags & 0xe20L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbAddedBy, vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbApproveBy, vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseCbbApproveByAndroidDrawableBgCbbEnableCbbApproveByAndroidDrawableBgCbbDisable);
            this.mboundView11.setEnabled(vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONCREATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse);
            this.mboundView13.setEnabled(vmIsHaveAccountACheckPermissionConstantsPERMISSIONTRANSACTIONUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa04L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTag, vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable);
            this.mboundView9.setEnabled(vmIsHaveTagBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0xa02L) != 0) {
            // api target 1

            this.cbbTransactionCategory.setEnabled(vmIsHaveCategoryBooleanTrueBooleanFalse);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTransactionCategory, vmIsHaveCategoryCbbTransactionCategoryAndroidDrawableBgCbbEnableCbbTransactionCategoryAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0xb00L) != 0) {
            // api target 1

            this.cbbTransactionGroup.setEnabled(vmIsHaveGroupTransactionBooleanTrueBooleanFalse);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTransactionGroup, vmIsHaveGroupTransactionCbbTransactionGroupAndroidDrawableBgCbbEnableCbbTransactionGroupAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTransactionContent, vmTransactionRequestNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTransactionName, vmTransactionRequestName);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0xa40L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(vmExpenditureKindViewVISIBLEViewGONE);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.setIsCreateDebit();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickTransactionDate();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



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
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.createOrUpdateTransaction();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



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
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickTransactionDate();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.transaction.create_or_update.TransactionCreateUpdateActivity a = mA;



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
        flag 0 (0x1L): vm.isCreated
        flag 1 (0x2L): vm.isHaveCategory
        flag 2 (0x3L): vm.isHaveTag
        flag 3 (0x4L): vm.transactionRequest
        flag 4 (0x5L): layoutHeader
        flag 5 (0x6L): vm.isHaveAccount
        flag 6 (0x7L): vm.expenditureKind
        flag 7 (0x8L): vm.createDebit
        flag 8 (0x9L): vm.isHaveGroupTransaction
        flag 9 (0xaL): vm
        flag 10 (0xbL): a
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_transaction : @android:string/update_transaction
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create_new_transaction : @android:string/update_transaction
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isCreated.get()) ? @android:string/create : @android:string/save
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(vm.expenditureKind.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(vm.expenditureKind.get()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_CREATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_TRANSACTION_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
    flag mapping end*/
    //end
}