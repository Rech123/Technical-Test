package com.example.flowexample.core.di.modules;

import com.example.flowexample.veracity.di.VeracityModule;
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent.class
)
public abstract class FragmentInjectorsModule_VeracityFragmentInjector {
  private FragmentInjectorsModule_VeracityFragmentInjector() {}

  @Binds
  @IntoMap
  @ClassKey(VeracityFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      VeracityFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = VeracityModule.class)
  public interface VeracityFragmentSubcomponent extends AndroidInjector<VeracityFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<VeracityFragment> {}
  }
}
