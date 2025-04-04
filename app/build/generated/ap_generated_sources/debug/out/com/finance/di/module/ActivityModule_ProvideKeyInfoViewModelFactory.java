// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.key.infor.KeyInfoViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideKeyInfoViewModelFactory implements Factory<KeyInfoViewModel> {
  private final ActivityModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public ActivityModule_ProvideKeyInfoViewModelFactory(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public KeyInfoViewModel get() {
    return provideKeyInfoViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static ActivityModule_ProvideKeyInfoViewModelFactory create(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    return new ActivityModule_ProvideKeyInfoViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static KeyInfoViewModel provideKeyInfoViewModel(ActivityModule instance,
      Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideKeyInfoViewModel(repository, application));
  }
}
