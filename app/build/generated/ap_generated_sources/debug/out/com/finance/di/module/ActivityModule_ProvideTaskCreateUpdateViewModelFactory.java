// Generated by Dagger (https://dagger.dev).
package com.finance.di.module;

import android.content.Context;
import com.finance.data.Repository;
import com.finance.ui.task.create_or_update.TaskCreateUpdateViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideTaskCreateUpdateViewModelFactory implements Factory<TaskCreateUpdateViewModel> {
  private final ActivityModule module;

  private final Provider<Repository> repositoryProvider;

  private final Provider<Context> applicationProvider;

  public ActivityModule_ProvideTaskCreateUpdateViewModelFactory(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TaskCreateUpdateViewModel get() {
    return provideTaskCreateUpdateViewModel(module, repositoryProvider.get(), applicationProvider.get());
  }

  public static ActivityModule_ProvideTaskCreateUpdateViewModelFactory create(ActivityModule module,
      Provider<Repository> repositoryProvider, Provider<Context> applicationProvider) {
    return new ActivityModule_ProvideTaskCreateUpdateViewModelFactory(module, repositoryProvider, applicationProvider);
  }

  public static TaskCreateUpdateViewModel provideTaskCreateUpdateViewModel(ActivityModule instance,
      Repository repository, Context application) {
    return Preconditions.checkNotNullFromProvides(instance.provideTaskCreateUpdateViewModel(repository, application));
  }
}
