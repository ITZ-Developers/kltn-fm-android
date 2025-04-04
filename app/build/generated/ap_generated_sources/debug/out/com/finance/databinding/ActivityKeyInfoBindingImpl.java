package com.finance.databinding;
import com.finance.R;
import com.finance.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityKeyInfoBindingImpl extends ActivityKeyInfoBinding implements com.finance.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(36);
        sIncludes.setIncludes(0, 
            new String[] {"layout_header_title"},
            new int[] {30},
            new int[] {com.finance.R.layout.layout_header_title});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_organization, 31);
        sViewsWithIds.put(R.id.color_tag, 32);
        sViewsWithIds.put(R.id.img_document, 33);
        sViewsWithIds.put(R.id.tv_title_document, 34);
        sViewsWithIds.put(R.id.ic_detail_document, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView17;
    @NonNull
    private final android.widget.RelativeLayout mboundView19;
    @NonNull
    private final android.widget.TextView mboundView20;
    @NonNull
    private final android.widget.TextView mboundView22;
    @NonNull
    private final android.widget.RelativeLayout mboundView24;
    @NonNull
    private final android.widget.TextView mboundView25;
    @NonNull
    private final android.widget.TextView mboundView29;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityKeyInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private ActivityKeyInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[32]
            , (kr.co.prnd.readmore.ReadMoreTextView) bindings[27]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.RelativeLayout) bindings[28]
            , (com.finance.databinding.LayoutHeaderTitleBinding) bindings[30]
            , (android.widget.RelativeLayout) bindings[31]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.editGroupServiceDescription.setTag(null);
        this.imgCopyHost.setTag(null);
        this.imgCopyPassword.setTag(null);
        this.imgCopyPasswordServer.setTag(null);
        this.imgCopyPhone.setTag(null);
        this.imgCopyPort.setTag(null);
        this.imgCopyPrivateKey.setTag(null);
        this.imgCopyUsername.setTag(null);
        this.imgCopyUsernameServer.setTag(null);
        this.layoutDocument.setTag(null);
        setContainedBinding(this.layoutHeader);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.widget.LinearLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.widget.TextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView19 = (android.widget.RelativeLayout) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView22 = (android.widget.TextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView24 = (android.widget.RelativeLayout) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView25 = (android.widget.TextView) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView29 = (android.widget.TextView) bindings[29];
        this.mboundView29.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.tvKeyGroup.setTag(null);
        this.tvOrganization.setTag(null);
        this.tvTag.setTag(null);
        this.tvTransactionDateCreated.setTag(null);
        this.tvTransactionName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new com.finance.generated.callback.OnClickListener(this, 9);
        mCallback65 = new com.finance.generated.callback.OnClickListener(this, 7);
        mCallback64 = new com.finance.generated.callback.OnClickListener(this, 6);
        mCallback66 = new com.finance.generated.callback.OnClickListener(this, 8);
        mCallback59 = new com.finance.generated.callback.OnClickListener(this, 1);
        mCallback62 = new com.finance.generated.callback.OnClickListener(this, 4);
        mCallback63 = new com.finance.generated.callback.OnClickListener(this, 5);
        mCallback60 = new com.finance.generated.callback.OnClickListener(this, 2);
        mCallback61 = new com.finance.generated.callback.OnClickListener(this, 3);
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
            setVm((com.finance.ui.key.infor.KeyInfoViewModel) variable);
        }
        else if (BR.a == variableId) {
            setA((com.finance.ui.key.infor.KeyInfoActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.finance.ui.key.infor.KeyInfoViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setA(@Nullable com.finance.ui.key.infor.KeyInfoActivity A) {
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
                return onChangeVmKeyResponse((androidx.databinding.ObservableField<com.finance.data.model.api.response.key.KeyResponse>) object, fieldId);
            case 2 :
                return onChangeVmServerKey((androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey>) object, fieldId);
            case 3 :
                return onChangeVmGgKey((androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey>) object, fieldId);
            case 4 :
                return onChangeVmTotalDocuments((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeVmIsShowPassword((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeVmKeyResponse(androidx.databinding.ObservableField<com.finance.data.model.api.response.key.KeyResponse> VmKeyResponse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmServerKey(androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> VmServerKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmGgKey(androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> VmGgKey, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTotalDocuments(androidx.databinding.ObservableField<java.lang.Integer> VmTotalDocuments, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsShowPassword(androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword, int fieldId) {
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
        java.lang.String vmGgKeyPasswordReplaceAllJavaLangStringJavaLangString = null;
        com.finance.data.model.api.response.tag.TagResponse vmKeyResponseTag = null;
        java.lang.String vmServerKeyUsernameTrim = null;
        com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
        boolean vmKeyResponseKindInt1 = false;
        boolean vmGgKeyPasswordJavaLangObjectNull = false;
        boolean vmKeyResponseTagColorCodeJavaLangObjectNull = false;
        java.lang.String vmServerKeyPrivateKey = null;
        com.finance.ui.key.infor.KeyInfoActivity a = mA;
        boolean vmGgKeyUsernameTrimEmpty = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmTotalDocumentsGet = 0;
        boolean vmServerKeyUsernameTrimEmpty = false;
        int vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String vmGgKeyUsernameTrim = null;
        java.lang.String vmServerKeyHostTrim = null;
        java.lang.String vmKeyResponseKindInt1JavaLangStringServerJavaLangStringWeb = null;
        java.lang.String vmServerKeyHost = null;
        java.lang.String vmGgKeyPhoneNumber = null;
        boolean vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalse = false;
        com.finance.data.model.api.response.key.KeyGroupResponse vmKeyResponseKeyInformationGroup = null;
        boolean vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalse = false;
        boolean vmGgKeyPasswordTrimEmpty = false;
        boolean vmServerKeyPrivateKeyTrimEmpty = false;
        java.lang.String aDecryptVmKeyResponseDescription = null;
        java.lang.String vmServerKeyPort = null;
        boolean vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalse = false;
        int vmTotalDocumentsInt0ViewVISIBLEViewGONE = 0;
        java.lang.String vmGgKeyPasswordTrim = null;
        java.lang.String vmKeyResponseOrganizationName = null;
        boolean vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalse = false;
        java.lang.String aDecryptVmKeyResponseTagName = null;
        boolean vmServerKeyHostJavaLangObjectNull = false;
        java.lang.String vmServerKeyPassword = null;
        boolean vmServerKeyPortJavaLangObjectNull = false;
        com.finance.data.model.api.response.organization.OrganizationResponse vmKeyResponseOrganization = null;
        java.lang.String vmServerKeyPrivateKeyReplaceAllJavaLangStringJavaLangString = null;
        boolean VmGgKeyUsernameTrimEmpty1 = false;
        int vmKeyResponseKindInt1ViewVISIBLEViewGONE = 0;
        com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
        java.lang.String vmKeyResponseName = null;
        java.lang.String vmKeyResponseKeyInformationGroupName = null;
        boolean vmKeyResponseTagJavaLangObjectNull = false;
        boolean vmGgKeyPhoneNumberTrimEmpty = false;
        java.lang.String aDecryptVmKeyResponseOrganizationName = null;
        boolean vmIsShowPassword = false;
        java.lang.Integer vmKeyResponseKind = null;
        boolean VmServerKeyUsernameTrimEmpty1 = false;
        java.lang.String vmServerKeyPasswordReplaceAllJavaLangStringJavaLangString = null;
        boolean vmServerKeyPasswordJavaLangObjectNull = false;
        boolean vmServerKeyPasswordTrimEmpty = false;
        boolean vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalse = false;
        int vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String vmServerKeyPrivateKeyTrim = null;
        java.lang.String vmGgKeyPassword = null;
        int vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String vmServerKeyPortTrim = null;
        java.lang.Integer vmTotalDocumentsGet = null;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.key.KeyResponse> vmKeyResponse = null;
        com.finance.data.model.api.response.key.KeyResponse vmKeyResponseGet = null;
        boolean VmGgKeyPhoneNumberTrimEmpty1 = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;
        boolean vmServerKeyHostTrimEmpty = false;
        androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
        java.lang.String vmIsShowPasswordVmServerKeyPasswordReplaceAllJavaLangStringJavaLangStringVmServerKeyPassword = null;
        int vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String vmKeyResponseTagColorCode = null;
        boolean vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalse = false;
        java.lang.String vmKeyResponseTagName = null;
        androidx.databinding.ObservableField<java.lang.Integer> vmTotalDocuments = null;
        com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
        java.lang.String aDecryptVmKeyResponseName = null;
        boolean vmKeyResponseKindInt2 = false;
        int androidxDatabindingViewDataBindingSafeUnboxVmKeyResponseKind = 0;
        java.lang.String vmKeyResponseDescription = null;
        boolean vmGgKeyUsernameJavaLangObjectNull = false;
        int vmKeyResponseKindInt2ViewVISIBLEViewGONE = 0;
        int vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfVmTotalDocuments = null;
        androidx.databinding.ObservableField<java.lang.Boolean> VmIsShowPassword1 = null;
        boolean vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalse = false;
        boolean vmServerKeyPortTrimEmpty = false;
        boolean vmServerKeyPrivateKeyJavaLangObjectNull = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = false;
        int vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean VmServerKeyPortTrimEmpty1 = false;
        java.lang.String vmGgKeyPhoneNumberTrim = null;
        boolean vmServerKeyUsernameJavaLangObjectNull = false;
        boolean VmServerKeyPasswordTrimEmpty1 = false;
        boolean VmServerKeyPrivateKeyTrimEmpty1 = false;
        boolean vmTotalDocumentsInt0 = false;
        java.lang.String vmServerKeyPasswordTrim = null;
        boolean VmGgKeyPasswordTrimEmpty1 = false;
        boolean vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalse = false;
        int vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String aDecryptVmKeyResponseKeyInformationGroupName = null;
        java.lang.String vmGgKeyUsername = null;
        int vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String vmServerKeyUsername = null;
        java.lang.Boolean vmIsShowPasswordGet = null;
        boolean VmServerKeyHostTrimEmpty1 = false;
        boolean vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalse = false;
        int vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean vmGgKeyPhoneNumberJavaLangObjectNull = false;

        if ((dirtyFlags & 0x1feL) != 0) {


            if ((dirtyFlags & 0x1c2L) != 0) {

                    if (vm != null) {
                        // read vm.keyResponse
                        vmKeyResponse = vm.keyResponse;
                    }
                    updateRegistration(1, vmKeyResponse);


                    if (vmKeyResponse != null) {
                        // read vm.keyResponse.get()
                        vmKeyResponseGet = vmKeyResponse.get();
                    }


                    if (vmKeyResponseGet != null) {
                        // read vm.keyResponse.get().tag
                        vmKeyResponseTag = vmKeyResponseGet.getTag();
                        // read vm.keyResponse.get().keyInformationGroup
                        vmKeyResponseKeyInformationGroup = vmKeyResponseGet.getKeyInformationGroup();
                        // read vm.keyResponse.get().organization
                        vmKeyResponseOrganization = vmKeyResponseGet.getOrganization();
                        // read vm.keyResponse.get().name
                        vmKeyResponseName = vmKeyResponseGet.getName();
                        // read vm.keyResponse.get().description
                        vmKeyResponseDescription = vmKeyResponseGet.getDescription();
                    }

                if ((dirtyFlags & 0x142L) != 0) {

                        // read vm.keyResponse.get().tag != null
                        vmKeyResponseTagJavaLangObjectNull = (vmKeyResponseTag) != (null);
                    if((dirtyFlags & 0x142L) != 0) {
                        if(vmKeyResponseTagJavaLangObjectNull) {
                                dirtyFlags |= 0x40000L;
                        }
                        else {
                                dirtyFlags |= 0x20000L;
                        }
                    }
                }

                    if (vmKeyResponseTag != null) {
                        // read vm.keyResponse.get().tag.name
                        vmKeyResponseTagName = vmKeyResponseTag.getName();
                    }
                    if (vmKeyResponseKeyInformationGroup != null) {
                        // read vm.keyResponse.get().keyInformationGroup.name
                        vmKeyResponseKeyInformationGroupName = vmKeyResponseKeyInformationGroup.getName();
                    }
                    if (vmKeyResponseOrganization != null) {
                        // read vm.keyResponse.get().organization.name
                        vmKeyResponseOrganizationName = vmKeyResponseOrganization.getName();
                    }
                if ((dirtyFlags & 0x142L) != 0) {

                        if (vmKeyResponseGet != null) {
                            // read vm.keyResponse.get().kind
                            vmKeyResponseKind = vmKeyResponseGet.getKind();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind)
                        androidxDatabindingViewDataBindingSafeUnboxVmKeyResponseKind = androidx.databinding.ViewDataBinding.safeUnbox(vmKeyResponseKind);


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1
                        vmKeyResponseKindInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmKeyResponseKind) == (1);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 2
                        vmKeyResponseKindInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmKeyResponseKind) == (2);
                    if((dirtyFlags & 0x142L) != 0) {
                        if(vmKeyResponseKindInt1) {
                                dirtyFlags |= 0x1000L;
                                dirtyFlags |= 0x1000000L;
                        }
                        else {
                                dirtyFlags |= 0x800L;
                                dirtyFlags |= 0x800000L;
                        }
                    }
                    if((dirtyFlags & 0x142L) != 0) {
                        if(vmKeyResponseKindInt2) {
                                dirtyFlags |= 0x4000000000L;
                        }
                        else {
                                dirtyFlags |= 0x2000000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? "Server" : "Web"
                        vmKeyResponseKindInt1JavaLangStringServerJavaLangStringWeb = ((vmKeyResponseKindInt1) ? ("Server") : ("Web"));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? View.VISIBLE : View.GONE
                        vmKeyResponseKindInt1ViewVISIBLEViewGONE = ((vmKeyResponseKindInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 2 ? View.VISIBLE : View.GONE
                        vmKeyResponseKindInt2ViewVISIBLEViewGONE = ((vmKeyResponseKindInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.serverKey
                        vmServerKey = vm.serverKey;
                    }
                    updateRegistration(2, vmServerKey);


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


                    if (vmServerKeyPrivateKey != null) {
                        // read vm.serverKey.get().privateKey.replaceAll(".", "*")
                        vmServerKeyPrivateKeyReplaceAllJavaLangStringJavaLangString = vmServerKeyPrivateKey.replaceAll(".", "*");
                    }
                    // read vm.serverKey.get().privateKey != null
                    vmServerKeyPrivateKeyJavaLangObjectNull = (vmServerKeyPrivateKey) != (null);
                    // read vm.serverKey.get().host != null
                    vmServerKeyHostJavaLangObjectNull = (vmServerKeyHost) != (null);
                    // read vm.serverKey.get().port != null
                    vmServerKeyPortJavaLangObjectNull = (vmServerKeyPort) != (null);
                    // read vm.serverKey.get().password != null
                    vmServerKeyPasswordJavaLangObjectNull = (vmServerKeyPassword) != (null);
                    // read vm.serverKey.get().username != null
                    vmServerKeyUsernameJavaLangObjectNull = (vmServerKeyUsername) != (null);
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmServerKeyPrivateKeyJavaLangObjectNull) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmServerKeyHostJavaLangObjectNull) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmServerKeyPortJavaLangObjectNull) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmServerKeyPasswordJavaLangObjectNull) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x144L) != 0) {
                    if(vmServerKeyUsernameJavaLangObjectNull) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (vm != null) {
                        // read vm.ggKey
                        vmGgKey = vm.ggKey;
                    }
                    updateRegistration(3, vmGgKey);


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


                    // read vm.ggKey.get().phoneNumber != null
                    vmGgKeyPhoneNumberJavaLangObjectNull = (vmGgKeyPhoneNumber) != (null);
                    // read vm.ggKey.get().password != null
                    vmGgKeyPasswordJavaLangObjectNull = (vmGgKeyPassword) != (null);
                    // read vm.ggKey.get().username != null
                    vmGgKeyUsernameJavaLangObjectNull = (vmGgKeyUsername) != (null);
                if((dirtyFlags & 0x148L) != 0) {
                    if(vmGgKeyPhoneNumberJavaLangObjectNull) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }
                if((dirtyFlags & 0x148L) != 0) {
                    if(vmGgKeyPasswordJavaLangObjectNull) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }
                if((dirtyFlags & 0x148L) != 0) {
                    if(vmGgKeyUsernameJavaLangObjectNull) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                    if (vmGgKeyPassword != null) {
                        // read vm.ggKey.get().password.replaceAll(".", "*")
                        vmGgKeyPasswordReplaceAllJavaLangStringJavaLangString = vmGgKeyPassword.replaceAll(".", "*");
                    }
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.totalDocuments
                        vmTotalDocuments = vm.totalDocuments;
                    }
                    updateRegistration(4, vmTotalDocuments);


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
                if((dirtyFlags & 0x150L) != 0) {
                    if(vmTotalDocumentsInt0) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
                    vmTotalDocumentsInt0ViewVISIBLEViewGONE = ((vmTotalDocumentsInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x164L) != 0) {

                    if (vm != null) {
                        // read vm.isShowPassword
                        VmIsShowPassword1 = vm.isShowPassword;
                    }
                    updateRegistration(5, VmIsShowPassword1);


                    if (VmIsShowPassword1 != null) {
                        // read vm.isShowPassword.get()
                        vmIsShowPasswordGet = VmIsShowPassword1.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet = androidx.databinding.ViewDataBinding.safeUnbox(vmIsShowPasswordGet);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get())
                    vmIsShowPassword = !androidxDatabindingViewDataBindingSafeUnboxVmIsShowPasswordGet;
                if((dirtyFlags & 0x164L) != 0) {
                    if(vmIsShowPassword) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x1c2L) != 0) {



                if (a != null) {
                    // read a.decrypt(vm.keyResponse.get().description)
                    aDecryptVmKeyResponseDescription = a.decrypt(vmKeyResponseDescription);
                    // read a.decrypt(vm.keyResponse.get().tag.name)
                    aDecryptVmKeyResponseTagName = a.decrypt(vmKeyResponseTagName);
                    // read a.decrypt(vm.keyResponse.get().organization.name)
                    aDecryptVmKeyResponseOrganizationName = a.decrypt(vmKeyResponseOrganizationName);
                    // read a.decrypt(vm.keyResponse.get().name)
                    aDecryptVmKeyResponseName = a.decrypt(vmKeyResponseName);
                    // read a.decrypt(vm.keyResponse.get().keyInformationGroup.name)
                    aDecryptVmKeyResponseKeyInformationGroupName = a.decrypt(vmKeyResponseKeyInformationGroupName);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (vmServerKeyUsername != null) {
                    // read vm.serverKey.get().username.trim()
                    vmServerKeyUsernameTrim = vmServerKeyUsername.trim();
                }


                if (vmServerKeyUsernameTrim != null) {
                    // read vm.serverKey.get().username.trim().empty
                    vmServerKeyUsernameTrimEmpty = vmServerKeyUsernameTrim.isEmpty();
                }


                // read !vm.serverKey.get().username.trim().empty
                VmServerKeyUsernameTrimEmpty1 = !vmServerKeyUsernameTrimEmpty;
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (vmGgKeyUsername != null) {
                    // read vm.ggKey.get().username.trim()
                    vmGgKeyUsernameTrim = vmGgKeyUsername.trim();
                }


                if (vmGgKeyUsernameTrim != null) {
                    // read vm.ggKey.get().username.trim().empty
                    VmGgKeyUsernameTrimEmpty1 = vmGgKeyUsernameTrim.isEmpty();
                }


                // read !vm.ggKey.get().username.trim().empty
                vmGgKeyUsernameTrimEmpty = !VmGgKeyUsernameTrimEmpty1;
        }
        if ((dirtyFlags & 0x400000L) != 0) {

                if (vmServerKeyHost != null) {
                    // read vm.serverKey.get().host.trim()
                    vmServerKeyHostTrim = vmServerKeyHost.trim();
                }


                if (vmServerKeyHostTrim != null) {
                    // read vm.serverKey.get().host.trim().empty
                    VmServerKeyHostTrimEmpty1 = vmServerKeyHostTrim.isEmpty();
                }


                // read !vm.serverKey.get().host.trim().empty
                vmServerKeyHostTrimEmpty = !VmServerKeyHostTrimEmpty1;
        }
        if ((dirtyFlags & 0x1000000000L) != 0) {

                if (vmGgKeyPassword != null) {
                    // read vm.ggKey.get().password.trim()
                    vmGgKeyPasswordTrim = vmGgKeyPassword.trim();
                }


                if (vmGgKeyPasswordTrim != null) {
                    // read vm.ggKey.get().password.trim().empty
                    vmGgKeyPasswordTrimEmpty = vmGgKeyPasswordTrim.isEmpty();
                }


                // read !vm.ggKey.get().password.trim().empty
                VmGgKeyPasswordTrimEmpty1 = !vmGgKeyPasswordTrimEmpty;
        }
        if ((dirtyFlags & 0x10000000000000L) != 0) {

                if (vmServerKeyPrivateKey != null) {
                    // read vm.serverKey.get().privateKey.trim()
                    vmServerKeyPrivateKeyTrim = vmServerKeyPrivateKey.trim();
                }


                if (vmServerKeyPrivateKeyTrim != null) {
                    // read vm.serverKey.get().privateKey.trim().empty
                    VmServerKeyPrivateKeyTrimEmpty1 = vmServerKeyPrivateKeyTrim.isEmpty();
                }


                // read !vm.serverKey.get().privateKey.trim().empty
                vmServerKeyPrivateKeyTrimEmpty = !VmServerKeyPrivateKeyTrimEmpty1;
        }
        if ((dirtyFlags & 0x400000000000L) != 0) {

                if (vmServerKeyPort != null) {
                    // read vm.serverKey.get().port.trim()
                    vmServerKeyPortTrim = vmServerKeyPort.trim();
                }


                if (vmServerKeyPortTrim != null) {
                    // read vm.serverKey.get().port.trim().empty
                    vmServerKeyPortTrimEmpty = vmServerKeyPortTrim.isEmpty();
                }


                // read !vm.serverKey.get().port.trim().empty
                VmServerKeyPortTrimEmpty1 = !vmServerKeyPortTrimEmpty;
        }
        if ((dirtyFlags & 0x180004000L) != 0) {

                if (vm != null) {
                    // read vm.serverKey
                    vmServerKey = vm.serverKey;
                }
                updateRegistration(2, vmServerKey);


                if (vmServerKey != null) {
                    // read vm.serverKey.get()
                    vmServerKeyGet = vmServerKey.get();
                }


                if (vmServerKeyGet != null) {
                    // read vm.serverKey.get().password
                    vmServerKeyPassword = vmServerKeyGet.getPassword();
                }

            if ((dirtyFlags & 0x100000000L) != 0) {

                    if (vmServerKeyPassword != null) {
                        // read vm.serverKey.get().password.replaceAll(".", "*")
                        vmServerKeyPasswordReplaceAllJavaLangStringJavaLangString = vmServerKeyPassword.replaceAll(".", "*");
                    }
            }
            if ((dirtyFlags & 0x4000L) != 0) {

                    if (vmServerKeyPassword != null) {
                        // read vm.serverKey.get().password.trim()
                        vmServerKeyPasswordTrim = vmServerKeyPassword.trim();
                    }


                    if (vmServerKeyPasswordTrim != null) {
                        // read vm.serverKey.get().password.trim().empty
                        VmServerKeyPasswordTrimEmpty1 = vmServerKeyPasswordTrim.isEmpty();
                    }


                    // read !vm.serverKey.get().password.trim().empty
                    vmServerKeyPasswordTrimEmpty = !VmServerKeyPasswordTrimEmpty1;
            }
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                if (vmKeyResponseTag != null) {
                    // read vm.keyResponse.get().tag.colorCode
                    vmKeyResponseTagColorCode = vmKeyResponseTag.getColorCode();
                }


                // read vm.keyResponse.get().tag.colorCode != null
                vmKeyResponseTagColorCodeJavaLangObjectNull = (vmKeyResponseTagColorCode) != (null);
        }
        if ((dirtyFlags & 0x40000000000L) != 0) {

                if (vmGgKeyPhoneNumber != null) {
                    // read vm.ggKey.get().phoneNumber.trim()
                    vmGgKeyPhoneNumberTrim = vmGgKeyPhoneNumber.trim();
                }


                if (vmGgKeyPhoneNumberTrim != null) {
                    // read vm.ggKey.get().phoneNumber.trim().empty
                    VmGgKeyPhoneNumberTrimEmpty1 = vmGgKeyPhoneNumberTrim.isEmpty();
                }


                // read !vm.ggKey.get().phoneNumber.trim().empty
                vmGgKeyPhoneNumberTrimEmpty = !VmGgKeyPhoneNumberTrimEmpty1;
        }

        if ((dirtyFlags & 0x144L) != 0) {

                // read vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false
                vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalse = ((vmServerKeyPasswordJavaLangObjectNull) ? (vmServerKeyPasswordTrimEmpty) : (false));
                // read vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false
                vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalse = ((vmServerKeyHostJavaLangObjectNull) ? (vmServerKeyHostTrimEmpty) : (false));
                // read vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false
                vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalse = ((vmServerKeyUsernameJavaLangObjectNull) ? (VmServerKeyUsernameTrimEmpty1) : (false));
                // read vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false
                vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalse = ((vmServerKeyPortJavaLangObjectNull) ? (VmServerKeyPortTrimEmpty1) : (false));
                // read vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false
                vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalse = ((vmServerKeyPrivateKeyJavaLangObjectNull) ? (vmServerKeyPrivateKeyTrimEmpty) : (false));
            if((dirtyFlags & 0x144L) != 0) {
                if(vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x144L) != 0) {
                if(vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }
            if((dirtyFlags & 0x144L) != 0) {
                if(vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }
            if((dirtyFlags & 0x144L) != 0) {
                if(vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
            if((dirtyFlags & 0x144L) != 0) {
                if(vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000L;
                }
            }


                // read vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
                vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false ? View.VISIBLE : View.GONE
                vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
                vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false ? View.VISIBLE : View.GONE
                vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false ? View.VISIBLE : View.GONE
                vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x148L) != 0) {

                // read vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false
                vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalse = ((vmGgKeyUsernameJavaLangObjectNull) ? (vmGgKeyUsernameTrimEmpty) : (false));
                // read vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false
                vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalse = ((vmGgKeyPasswordJavaLangObjectNull) ? (VmGgKeyPasswordTrimEmpty1) : (false));
                // read vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false
                vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalse = ((vmGgKeyPhoneNumberJavaLangObjectNull) ? (vmGgKeyPhoneNumberTrimEmpty) : (false));
            if((dirtyFlags & 0x148L) != 0) {
                if(vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }
            if((dirtyFlags & 0x148L) != 0) {
                if(vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000000L;
                }
            }
            if((dirtyFlags & 0x148L) != 0) {
                if(vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalse) {
                        dirtyFlags |= 0x1000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000L;
                }
            }


                // read vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
                vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
                vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false ? View.VISIBLE : View.GONE
                vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalseViewVISIBLEViewGONE = ((vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x142L) != 0) {

                // read vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false
                vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalse = ((vmKeyResponseTagJavaLangObjectNull) ? (vmKeyResponseTagColorCodeJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x142L) != 0) {
                if(vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }


                // read vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false ? View.VISIBLE : View.GONE
                vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x164L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? vm.serverKey.get().password.replaceAll(".", "*") : vm.serverKey.get().password
                vmIsShowPasswordVmServerKeyPasswordReplaceAllJavaLangStringJavaLangStringVmServerKeyPassword = ((vmIsShowPassword) ? (vmServerKeyPasswordReplaceAllJavaLangStringJavaLangString) : (vmServerKeyPassword));
        }
        // batch finished
        if ((dirtyFlags & 0x1c2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editGroupServiceDescription, aDecryptVmKeyResponseDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvKeyGroup, aDecryptVmKeyResponseKeyInformationGroupName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrganization, aDecryptVmKeyResponseOrganizationName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTag, aDecryptVmKeyResponseTagName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionName, aDecryptVmKeyResponseName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.imgCopyHost.setOnClickListener(mCallback62);
            this.imgCopyPassword.setOnClickListener(mCallback60);
            this.imgCopyPasswordServer.setOnClickListener(mCallback66);
            this.imgCopyPhone.setOnClickListener(mCallback61);
            this.imgCopyPort.setOnClickListener(mCallback63);
            this.imgCopyPrivateKey.setOnClickListener(mCallback64);
            this.imgCopyUsername.setOnClickListener(mCallback59);
            this.imgCopyUsernameServer.setOnClickListener(mCallback65);
            this.layoutDocument.setOnClickListener(mCallback67);
            this.layoutHeader.setTitle(getRoot().getResources().getString(R.string.key_details));
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            this.imgCopyHost.setVisibility(vmServerKeyHostJavaLangObjectNullVmServerKeyHostTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            this.imgCopyPasswordServer.setVisibility(vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            this.imgCopyPort.setVisibility(vmServerKeyPortJavaLangObjectNullVmServerKeyPortTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            this.imgCopyUsernameServer.setVisibility(vmServerKeyUsernameJavaLangObjectNullVmServerKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, vmServerKeyHost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, vmServerKeyPort);
            this.mboundView19.setVisibility(vmServerKeyPrivateKeyJavaLangObjectNullVmServerKeyPrivateKeyTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, vmServerKeyPrivateKeyReplaceAllJavaLangStringJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, vmServerKeyUsername);
            this.mboundView24.setVisibility(vmServerKeyPasswordJavaLangObjectNullVmServerKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            this.imgCopyPassword.setVisibility(vmGgKeyPasswordJavaLangObjectNullVmGgKeyPasswordTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            this.imgCopyPhone.setVisibility(vmGgKeyPhoneNumberJavaLangObjectNullVmGgKeyPhoneNumberTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            this.imgCopyUsername.setVisibility(vmGgKeyUsernameJavaLangObjectNullVmGgKeyUsernameTrimEmptyBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, vmGgKeyPasswordReplaceAllJavaLangStringJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, vmGgKeyPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, vmGgKeyUsername);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            this.layoutDocument.setVisibility(vmTotalDocumentsInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView29, stringValueOfVmTotalDocuments);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            this.layoutHeader.setA(a);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            this.mboundView14.setVisibility(vmKeyResponseKindInt1ViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(vmKeyResponseTagJavaLangObjectNullVmKeyResponseTagColorCodeJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(vmKeyResponseKindInt2ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTransactionDateCreated, vmKeyResponseKindInt1JavaLangStringServerJavaLangStringWeb);
        }
        if ((dirtyFlags & 0x164L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView25, vmIsShowPasswordVmServerKeyPasswordReplaceAllJavaLangStringJavaLangStringVmServerKeyPassword);
        }
        executeBindingsOn(layoutHeader);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 9: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {


                    a.navigateToDocument();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
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



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmServerKey = vm.serverKey;

                        vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                        if (vmServerKeyJavaLangObjectNull) {


                            vmServerKeyGet = vmServerKey.get();

                            vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                            if (vmServerKeyGetJavaLangObjectNull) {


                                vmServerKeyUsername = vmServerKeyGet.getUsername();

                                a.copy(vmServerKeyUsername);
                            }
                        }
                    }
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.serverKey.get().privateKey
                java.lang.String vmServerKeyPrivateKey = null;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.serverKey.get()
                com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
                // vm.serverKey != null
                boolean vmServerKeyJavaLangObjectNull = false;
                // vm.serverKey.get() != null
                boolean vmServerKeyGetJavaLangObjectNull = false;
                // vm.serverKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmServerKey = vm.serverKey;

                        vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                        if (vmServerKeyJavaLangObjectNull) {


                            vmServerKeyGet = vmServerKey.get();

                            vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                            if (vmServerKeyGetJavaLangObjectNull) {


                                vmServerKeyPrivateKey = vmServerKeyGet.getPrivateKey();

                                a.copy(vmServerKeyPrivateKey);
                            }
                        }
                    }
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.serverKey.get().password
                java.lang.String vmServerKeyPassword = null;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.serverKey.get()
                com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
                // vm.serverKey != null
                boolean vmServerKeyJavaLangObjectNull = false;
                // vm.serverKey.get() != null
                boolean vmServerKeyGetJavaLangObjectNull = false;
                // vm.serverKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmServerKey = vm.serverKey;

                        vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                        if (vmServerKeyJavaLangObjectNull) {


                            vmServerKeyGet = vmServerKey.get();

                            vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                            if (vmServerKeyGetJavaLangObjectNull) {


                                vmServerKeyPassword = vmServerKeyGet.getPassword();

                                a.copy(vmServerKeyPassword);
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.ggKey.get()
                com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.ggKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
                // vm.ggKey.get() != null
                boolean vmGgKeyGetJavaLangObjectNull = false;
                // vm.ggKey != null
                boolean vmGgKeyJavaLangObjectNull = false;
                // vm.ggKey.get().username
                java.lang.String vmGgKeyUsername = null;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmGgKey = vm.ggKey;

                        vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                        if (vmGgKeyJavaLangObjectNull) {


                            vmGgKeyGet = vmGgKey.get();

                            vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                            if (vmGgKeyGetJavaLangObjectNull) {


                                vmGgKeyUsername = vmGgKeyGet.getUsername();

                                a.copy(vmGgKeyUsername);
                            }
                        }
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
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



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmServerKey = vm.serverKey;

                        vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                        if (vmServerKeyJavaLangObjectNull) {


                            vmServerKeyGet = vmServerKey.get();

                            vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                            if (vmServerKeyGetJavaLangObjectNull) {


                                vmServerKeyHost = vmServerKeyGet.getHost();

                                a.copy(vmServerKeyHost);
                            }
                        }
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // vm.serverKey.get().port
                java.lang.String vmServerKeyPort = null;
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.serverKey.get()
                com.finance.data.model.api.response.key.ServerKey vmServerKeyGet = null;
                // vm.serverKey != null
                boolean vmServerKeyJavaLangObjectNull = false;
                // vm.serverKey.get() != null
                boolean vmServerKeyGetJavaLangObjectNull = false;
                // vm.serverKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.ServerKey> vmServerKey = null;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmServerKey = vm.serverKey;

                        vmServerKeyJavaLangObjectNull = (vmServerKey) != (null);
                        if (vmServerKeyJavaLangObjectNull) {


                            vmServerKeyGet = vmServerKey.get();

                            vmServerKeyGetJavaLangObjectNull = (vmServerKeyGet) != (null);
                            if (vmServerKeyGetJavaLangObjectNull) {


                                vmServerKeyPort = vmServerKeyGet.getPort();

                                a.copy(vmServerKeyPort);
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
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.ggKey.get()
                com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.ggKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
                // vm.ggKey.get().password
                java.lang.String vmGgKeyPassword = null;
                // vm.ggKey.get() != null
                boolean vmGgKeyGetJavaLangObjectNull = false;
                // vm.ggKey != null
                boolean vmGgKeyJavaLangObjectNull = false;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmGgKey = vm.ggKey;

                        vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                        if (vmGgKeyJavaLangObjectNull) {


                            vmGgKeyGet = vmGgKey.get();

                            vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                            if (vmGgKeyGetJavaLangObjectNull) {


                                vmGgKeyPassword = vmGgKeyGet.getPassword();

                                a.copy(vmGgKeyPassword);
                            }
                        }
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // a != null
                boolean aJavaLangObjectNull = false;
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm.ggKey.get()
                com.finance.data.model.api.response.key.GoogleKey vmGgKeyGet = null;
                // vm
                com.finance.ui.key.infor.KeyInfoViewModel vm = mVm;
                // a
                com.finance.ui.key.infor.KeyInfoActivity a = mA;
                // vm.ggKey.get().phoneNumber
                java.lang.String vmGgKeyPhoneNumber = null;
                // vm.ggKey
                androidx.databinding.ObservableField<com.finance.data.model.api.response.key.GoogleKey> vmGgKey = null;
                // vm.ggKey.get() != null
                boolean vmGgKeyGetJavaLangObjectNull = false;
                // vm.ggKey != null
                boolean vmGgKeyJavaLangObjectNull = false;



                aJavaLangObjectNull = (a) != (null);
                if (aJavaLangObjectNull) {



                    vmJavaLangObjectNull = (vm) != (null);
                    if (vmJavaLangObjectNull) {


                        vmGgKey = vm.ggKey;

                        vmGgKeyJavaLangObjectNull = (vmGgKey) != (null);
                        if (vmGgKeyJavaLangObjectNull) {


                            vmGgKeyGet = vmGgKey.get();

                            vmGgKeyGetJavaLangObjectNull = (vmGgKeyGet) != (null);
                            if (vmGgKeyGetJavaLangObjectNull) {


                                vmGgKeyPhoneNumber = vmGgKeyGet.getPhoneNumber();

                                a.copy(vmGgKeyPhoneNumber);
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): layoutHeader
        flag 1 (0x2L): vm.keyResponse
        flag 2 (0x3L): vm.serverKey
        flag 3 (0x4L): vm.ggKey
        flag 4 (0x5L): vm.totalDocuments
        flag 5 (0x6L): vm.isShowPassword
        flag 6 (0x7L): vm
        flag 7 (0x8L): a
        flag 8 (0x9L): null
        flag 9 (0xaL): vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? "Server" : "Web"
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? "Server" : "Web"
        flag 13 (0xeL): vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false
        flag 14 (0xfL): vm.serverKey.get().password != null ? !vm.serverKey.get().password.trim().empty : false
        flag 15 (0x10L): vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false
        flag 16 (0x11L): vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false
        flag 17 (0x12L): vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false
        flag 18 (0x13L): vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(vm.totalDocuments.get()) > 0 ? View.VISIBLE : View.GONE
        flag 21 (0x16L): vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false
        flag 22 (0x17L): vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 1 ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false
        flag 26 (0x1bL): vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false
        flag 27 (0x1cL): vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): vm.keyResponse.get().tag != null ? vm.keyResponse.get().tag.colorCode != null : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? vm.serverKey.get().password.replaceAll(".", "*") : vm.serverKey.get().password
        flag 32 (0x21L): !androidx.databinding.ViewDataBinding.safeUnbox(vm.isShowPassword.get()) ? vm.serverKey.get().password.replaceAll(".", "*") : vm.serverKey.get().password
        flag 33 (0x22L): vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false ? View.VISIBLE : View.GONE
        flag 34 (0x23L): vm.serverKey.get().host != null ? !vm.serverKey.get().host.trim().empty : false ? View.VISIBLE : View.GONE
        flag 35 (0x24L): vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false
        flag 36 (0x25L): vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 2 ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(vm.keyResponse.get().kind) == 2 ? View.VISIBLE : View.GONE
        flag 39 (0x28L): vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false ? View.VISIBLE : View.GONE
        flag 40 (0x29L): vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false
        flag 42 (0x2bL): vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false
        flag 43 (0x2cL): vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): vm.serverKey.get().username != null ? !vm.serverKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false
        flag 46 (0x2fL): vm.serverKey.get().port != null ? !vm.serverKey.get().port.trim().empty : false
        flag 47 (0x30L): vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false ? View.VISIBLE : View.GONE
        flag 48 (0x31L): vm.ggKey.get().phoneNumber != null ? !vm.ggKey.get().phoneNumber.trim().empty : false ? View.VISIBLE : View.GONE
        flag 49 (0x32L): vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
        flag 50 (0x33L): vm.ggKey.get().username != null ? !vm.ggKey.get().username.trim().empty : false ? View.VISIBLE : View.GONE
        flag 51 (0x34L): vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false
        flag 52 (0x35L): vm.serverKey.get().privateKey != null ? !vm.serverKey.get().privateKey.trim().empty : false
        flag 53 (0x36L): vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
        flag 54 (0x37L): vm.ggKey.get().password != null ? !vm.ggKey.get().password.trim().empty : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}