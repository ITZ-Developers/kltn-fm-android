// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.password.forget.ForgetPasswordViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideForgetPasswordViewModelFactory implements Factory<ForgetPasswordViewModel> {
  private final ActivityModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public ActivityModule_ProvideForgetPasswordViewModelFactory(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ForgetPasswordViewModel get() {
    return provideForgetPasswordViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static ActivityModule_ProvideForgetPasswordViewModelFactory create(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    return new ActivityModule_ProvideForgetPasswordViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static ForgetPasswordViewModel provideForgetPasswordViewModel(ActivityModule instance,
      Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideForgetPasswordViewModel(repository, application));
  }
}
