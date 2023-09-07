package com.example.flowexample.core.di.modules;

import com.example.flowexample.breedsList.presentation.ui.activites.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityInjectorsModule_VeracityActivityInjector.MainActivitySubcomponent.class
)
public abstract class ActivityInjectorsModule_VeracityActivityInjector {
  private ActivityInjectorsModule_VeracityActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
