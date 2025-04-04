// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.transaction.create_or_update.TransactionCreateUpdateViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideCreateTransactionViewModelFactory implements Factory<TransactionCreateUpdateViewModel> {
  private final ActivityModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public ActivityModule_ProvideCreateTransactionViewModelFactory(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TransactionCreateUpdateViewModel get() {
    return provideCreateTransactionViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static ActivityModule_ProvideCreateTransactionViewModelFactory create(
      ActivityModule module, Provider<Repository> repositoryProvider,
      Provider<Context> applicationProvider) {
    return new ActivityModule_ProvideCreateTransactionViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static TransactionCreateUpdateViewModel provideCreateTransactionViewModel(
      ActivityModule instance, Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideCreateTransactionViewModel(repository, application));
  }
}
