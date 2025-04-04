package com.finance.data;


import com.finance.data.model.api.response.account.AccountResponse;
import com.finance.data.prefs.PreferencesService;
import com.finance.data.remote.ApiService;

import javax.inject.Inject;

public class AppRepository implements Repository {

    private final ApiService mApiService;
    private final PreferencesService mPreferencesHelper;

    @Inject
    public AppRepository(ApiService apiService, PreferencesService mPreferencesHelper) {
        this.mApiService = apiService;
        this.mPreferencesHelper = mPreferencesHelper;
    }

    @Override
    public String getToken() {
        return mPreferencesHelper.getToken();
    }

    @Override
    public void setToken(String token) {
        mPreferencesHelper.setToken(token);
    }

    @Override
    public AccountResponse getAccount() {
        return mPreferencesHelper.getAccount();
    }

    @Override
    public void setAccount(AccountResponse account) {
        mPreferencesHelper.setAccount(account);
    }


    @Override
    public PreferencesService getSharedPreferences(){
        return mPreferencesHelper;
    }

    @Override
    public ApiService getApiService(){
        return mApiService;
    }

}
