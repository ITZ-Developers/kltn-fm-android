// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.debit.detail.DebitDetailViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideDebitDetailViewModelFactory implements Factory<DebitDetailViewModel> {
  private final ActivityModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public ActivityModule_ProvideDebitDetailViewModelFactory(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public DebitDetailViewModel get() {
    return provideDebitDetailViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static ActivityModule_ProvideDebitDetailViewModelFactory create(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    return new ActivityModule_ProvideDebitDetailViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static DebitDetailViewModel provideDebitDetailViewModel(ActivityModule instance,
      Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideDebitDetailViewModel(repository, application));
  }
}
