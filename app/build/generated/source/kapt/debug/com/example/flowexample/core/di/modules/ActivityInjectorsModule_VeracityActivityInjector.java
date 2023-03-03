package com.example.flowexample.core.di.modules;

import com.example.flowexample.veracity.presentation.ui.activites.VeracityActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent.class
)
public abstract class ActivityInjectorsModule_VeracityActivityInjector {
  private ActivityInjectorsModule_VeracityActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(VeracityActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      VeracityActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface VeracityActivitySubcomponent extends AndroidInjector<VeracityActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<VeracityActivity> {}
  }
}
