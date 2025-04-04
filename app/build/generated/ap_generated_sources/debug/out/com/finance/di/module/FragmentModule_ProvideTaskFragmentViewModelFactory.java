// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.fragment.task.TaskFragmentViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentModule_ProvideTaskFragmentViewModelFactory implements Factory<TaskFragmentViewModel> {
  private final FragmentModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public FragmentModule_ProvideTaskFragmentViewModelFactory(FragmentModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TaskFragmentViewModel get() {
    return provideTaskFragmentViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static FragmentModule_ProvideTaskFragmentViewModelFactory create(FragmentModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    return new FragmentModule_ProvideTaskFragmentViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static TaskFragmentViewModel provideTaskFragmentViewModel(FragmentModule instance,
      Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideTaskFragmentViewModel(repository, application));
  }
}
