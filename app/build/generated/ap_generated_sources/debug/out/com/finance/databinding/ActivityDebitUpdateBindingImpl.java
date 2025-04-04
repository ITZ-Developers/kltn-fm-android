package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDebitUpdateBindingImpl extends ActivityDebitUpdateBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(25);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {16},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cbb_debit_kind, 17);
        sViewsWithIds.put(R.id.text_input_category, 18);
        sViewsWithIds.put(R.id.text_input_group_transaction, 19);
        sViewsWithIds.put(R.id.layout_color, 20);
        sViewsWithIds.put(R.id.edit_debit_money, 21);
        sViewsWithIds.put(R.id.tv_title_document, 22);
        sViewsWithIds.put(R.id.rcv_documents, 23);
        sViewsWithIds.put(R.id.img_upload_file, 24);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.FrameLayout mboundView14;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    @Nullable
    private final android.view.View.OnClickListener mCallback112;
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback118;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.view.View.OnClickListener mCallback115;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDebitUpdateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityDebitUpdateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[15]
            , (android.widget.AutoCompleteTextView) bindings[9]
            , (android.widget.AutoCompleteTextView) bindings[3]
            , (android.widget.AutoCompleteTextView) bindings[5]
            , (android.widget.AutoCompleteTextView) bindings[17]
            , (android.widget.AutoCompleteTextView) bindings[7]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[21]
            , (android.widget.EditText) bindings[12]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[20]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[16]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.EditText) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (android.widget.TextView) bindings[22]
            );
        this.btnUpdate.setTag(null);
        this.cbbAddedBy.setTag(null);
        this.cbbDebitCategory.setTag(null);
        this.cbbDebitGroup.setTag(null);
        this.cbbTag.setTag(null);
        this.editDebitContent.setTag(null);
        this.editDebitName.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.layoutMain.setTag(null);
        this.mboundView1 = (android.widget.ScrollView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView14 = (android.widget.FrameLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.pickDebitDate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback116 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback112 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback117 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback113 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback118 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback114 = new com.finance.generated.callback.OnClickListener(this, 3);
        mCallback115 = new com.finance.generated.callback.OnClickListener(this, 4);
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
            setVm((com.finance.ui.debit.update.DebitUpdateViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.debit.update.DebitUpdateActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.debit.update.DebitUpdateViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.debit.update.DebitUpdateActivity A) {
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
                return onChangeVmIsHaveAccount((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmIsHaveGroupTransaction((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmDebitRequest((androidx.databinding.ObservableField<com.finance.data.model.api.request.debit.DebitUpdateRequest>) object, fieldId);
            case 4 :
                return onChangeVmIsHaveCategory((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeVmIsHaveTag((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmIsHaveAccount(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveAccount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveGroupTransaction(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveGroupTransaction, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDebitRequest(androidx.databinding.ObservableField<com.finance.data.model.api.request.debit.DebitUpdateRequest> VmDebitRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveCategory(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveCategory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsHaveTag(androidx.databinding.ObservableField<java.lang.Boolean> VmIsHaveTag, int fieldId) {
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
        android.graphics.drawable.Drawable vmIsHaveCategoryCbbDebitCategoryAndroidDrawableBgCbbEnableCbbDebitCategoryAndroidDrawableBgCbbDisable = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveAccount = null;
        android.graphics.drawable.Drawable vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = null;
        java.lang.Boolean vmIsHaveTagGet = null;
        com.finance.ui.debit.update.DebitUpdateViewModel vm = mVm;
        java.lang.String aDecryptVmDebitRequestNote = null;
        java.lang.Boolean vmIsHaveGroupTransactionGet = null;
        boolean vmIsHaveCategoryBooleanTrueBooleanFalse = false;
        java.lang.Boolean aCheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION = null;
        java.lang.Boolean vmIsHaveCategoryGet = null;
        com.finance.ui.debit.update.DebitUpdateActivity a = mA;
        android.graphics.drawable.Drawable vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable = null;
        com.finance.data.model.api.request.debit.DebitUpdateRequest vmDebitRequestGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION = false;
        java.lang.String vmDebitRequestNote = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet = false;
        java.lang.String vmDebitRequestName = null;
        java.lang.String aDecryptVmDebitRequestName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet = false;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = false;
        boolean vmIsHaveGroupTransactionBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveGroupTransaction = null;
        java.lang.Boolean vmIsHaveAccountGet = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.request.debit.DebitUpdateRequest> vmDebitRequest = null;
        boolean vmIsHaveTagBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveCategory = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmIsHaveTag = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet = false;
        android.graphics.drawable.Drawable vmIsHaveGroupTransactionCbbDebitGroupAndroidDrawableBgCbbEnableCbbDebitGroupAndroidDrawableBgCbbDisable = null;
        boolean vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalse = false;

        if ((dirtyFlags & 0x1feL) != 0) {


            if ((dirtyFlags & 0x1c2L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveAccount
                        vmIsHaveAccount = vm.isHaveAccount;
                    }
                    updateRegistration(1, vmIsHaveAccount);


                    if (vmIsHaveAccount != null) {
                        // read vm.isHaveAccount.get()
                        vmIsHaveAccountGet = vmIsHaveAccount.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveAccountGet);
                if((dirtyFlags & 0x1c2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveGroupTransaction
                        vmIsHaveGroupTransaction = vm.isHaveGroupTransaction;
                    }
                    updateRegistration(2, vmIsHaveGroupTransaction);


                    if (vmIsHaveGroupTransaction != null) {
                        // read vm.isHaveGroupTransaction.get()
                        vmIsHaveGroupTransactionGet = vmIsHaveGroupTransaction.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveGroupTransactionGet);
                if((dirtyFlags & 0x144L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
                    vmIsHaveGroupTransactionBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveGroupTransactionCbbDebitGroupAndroidDrawableBgCbbEnableCbbDebitGroupAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveGroupTransactionGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbDebitGroup.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbDebitGroup.getContext(), R.drawable.bg_cbb_disable)));
            }
            if ((dirtyFlags & 0x1c8L) != 0) {

                    if (vm != null) {
                        // read vm.debitRequest
                        vmDebitRequest = vm.debitRequest;
                    }
                    updateRegistration(3, vmDebitRequest);


                    if (vmDebitRequest != null) {
                        // read vm.debitRequest.get()
                        vmDebitRequestGet = vmDebitRequest.get();
                    }


                    if (vmDebitRequestGet != null) {
                        // read vm.debitRequest.get().note
                        vmDebitRequestNote = vmDebitRequestGet.getNote();
                        // read vm.debitRequest.get().name
                        vmDebitRequestName = vmDebitRequestGet.getName();
                    }
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveCategory
                        vmIsHaveCategory = vm.isHaveCategory;
                    }
                    updateRegistration(4, vmIsHaveCategory);


                    if (vmIsHaveCategory != null) {
                        // read vm.isHaveCategory.get()
                        vmIsHaveCategoryGet = vmIsHaveCategory.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveCategoryGet);
                if((dirtyFlags & 0x150L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveCategoryCbbDebitCategoryAndroidDrawableBgCbbEnableCbbDebitCategoryAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbDebitCategory.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbDebitCategory.getContext(), R.drawable.bg_cbb_disable)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
                    vmIsHaveCategoryBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveCategoryGet) ? (true) : (false));
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (vm != null) {
                        // read vm.isHaveTag
                        vmIsHaveTag = vm.isHaveTag;
                    }
                    updateRegistration(5, vmIsHaveTag);


                    if (vmIsHaveTag != null) {
                        // read vm.isHaveTag.get()
                        vmIsHaveTagGet = vmIsHaveTag.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsHaveTagGet);
                if((dirtyFlags & 0x160L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                    vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbTag.getContext(), R.drawable.bg_cbb_disable)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
                    vmIsHaveTagBooleanTrueBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveTagGet) ? (true) : (false));
            }
        }
        if ((dirtyFlags & 0x1c8L) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.debitRequest.get().note)
                    aDecryptVmDebitRequestNote = a.decrypt(vmDebitRequestNote);
                    // read a.decrypt(vm.debitRequest.get().name)
                    aDecryptVmDebitRequestName = a.decrypt(vmDebitRequestName);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {



                if (a != null) {
                    // read a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)
                    aCheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION = a.checkPermission(com.finance.constant.Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION);
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION))
                androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION = androidx.databinding.ViewDataBinding.safeUnbox(aCheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION);
        }

        if ((dirtyFlags & 0x1c2L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxVmIsHaveAccountGet) ? (androidxDatabindingViewDataBindingSafeUnboxACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATION) : (false));
            if((dirtyFlags & 0x1c2L) != 0) {
                if(vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbAddedBy.getContext(), R.drawable.bg_cbb_enable)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(cbbAddedBy.getContext(), R.drawable.bg_cbb_disable)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
                vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse = ((vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalse) ? (true) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnUpdate.setOnClickListener(mCallback118);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.update_debit));
            this.layoutMain.setOnClickListener(mCallback112);
            this.mboundView1.setOnClickListener(mCallback113);
            this.mboundView11.setOnClickListener(mCallback116);
            this.mboundView14.setOnClickListener(mCallback117);
            this.mboundView2.setOnClickListener(mCallback114);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, (" ") + (mboundView4.getResources().getString(R.string.asterisk)));
            this.pickDebitDate.setOnClickListener(mCallback115);
        }
        if ((dirtyFlags & 0x1c2L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbAddedBy, vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseCbbAddedByAndroidDrawableBgCbbEnableCbbAddedByAndroidDrawableBgCbbDisable);
            this.mboundView8.setEnabled(vmIsHaveAccountACheckPermissionConstantsPERMISSIONDEBITUPDATEFULLAUTHENTICATIONBooleanFalseBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            this.cbbDebitCategory.setEnabled(vmIsHaveCategoryBooleanTrueBooleanFalse);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbDebitCategory, vmIsHaveCategoryCbbDebitCategoryAndroidDrawableBgCbbEnableCbbDebitCategoryAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            this.cbbDebitGroup.setEnabled(vmIsHaveGroupTransactionBooleanTrueBooleanFalse);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbDebitGroup, vmIsHaveGroupTransactionCbbDebitGroupAndroidDrawableBgCbbEnableCbbDebitGroupAndroidDrawableBgCbbDisable);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.cbbTag, vmIsHaveTagCbbTagAndroidDrawableBgCbbEnableCbbTagAndroidDrawableBgCbbDisable);
            this.mboundView6.setEnabled(vmIsHaveTagBooleanTrueBooleanFalse);
        }
        if ((dirtyFlags & 0x1c8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editDebitContent, aDecryptVmDebitRequestNote);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editDebitName, aDecryptVmDebitRequestName);
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
            case 5: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickDebitDate();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



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
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.showDialogChooseFile();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.hideKeyboard();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.updateDebit();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



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
                com.finance.ui.debit.update.DebitUpdateActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.pickDebitDate();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.isHaveAccount
        flag 2 (0x3L): vm.isHaveGroupTransaction
        flag 3 (0x4L): vm.debitRequest
        flag 4 (0x5L): vm.isHaveCategory
        flag 5 (0x6L): vm.isHaveTag
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveCategory.get()) ? true : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false ? true : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? true : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveTag.get()) ? true : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveGroupTransaction.get()) ? @android:drawable/bg_cbb_enable : @android:drawable/bg_cbb_disable
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(vm.isHaveAccount.get()) ? androidx.databinding.ViewDataBinding.safeUnbox(a.checkPermission(Constants.PERMISSION_DEBIT_UPDATE_FULL_AUTHENTICATION)) : false
    flag mapping end*/
    //end
}