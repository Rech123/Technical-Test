// Generated by Dagger (https://dagger.dev).
package com.example.flowexample.core.di.components;

import android.content.Context;
import com.example.flowexample.core.App;
import com.example.flowexample.core.App_MembersInjector;
import com.example.flowexample.core.api.RestWebService;
import com.example.flowexample.core.di.modules.ActivityInjectorsModule_VeracityActivityInjector;
import com.example.flowexample.core.di.modules.AppModule;
import com.example.flowexample.core.di.modules.AppModule_ProvideApplicationContextFactory;
import com.example.flowexample.core.di.modules.FragmentInjectorsModule_VeracityFragmentInjector;
import com.example.flowexample.core.di.modules.InjectionViewModelProvider;
import com.example.flowexample.core.di.modules.InjectionViewModelProvider_Factory;
import com.example.flowexample.core.di.modules.NetworkModule;
import com.example.flowexample.core.di.modules.NetworkModule_ProvideRestServiceFactory;
import com.example.flowexample.veracity.data.CurrencyRepostiory;
import com.example.flowexample.veracity.di.VeracityModule;
import com.example.flowexample.veracity.di.VeracityModule_ProvideVeracityiewModelFactory;
import com.example.flowexample.veracity.di.VeracityModule_ProvidesCurrencyRepostioryFactory;
import com.example.flowexample.veracity.presentation.ui.activites.VeracityActivity;
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment;
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment_MembersInjector;
import com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel;
import com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent.Factory> veracityActivitySubcomponentFactoryProvider;

  private Provider<FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent.Factory> veracityFragmentSubcomponentFactoryProvider;

  private Provider<App> applicationProvider;

  private Provider<Context> provideApplicationContextProvider;

  private Provider<RestWebService> provideRestServiceProvider;

  private DaggerAppComponent(NetworkModule networkModuleParam, AppModule appModuleParam,
      App applicationParam) {

    initialize(networkModuleParam, appModuleParam, applicationParam);

  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2).put(VeracityActivity.class, ((Provider) veracityActivitySubcomponentFactoryProvider)).put(VeracityFragment.class, ((Provider) veracityFragmentSubcomponentFactoryProvider)).build();
  }

  private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam, final AppModule appModuleParam,
      final App applicationParam) {
    this.veracityActivitySubcomponentFactoryProvider = new Provider<ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent.Factory>() {
      @Override
      public ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent.Factory get(
          ) {
        return new VeracityActivitySubcomponentFactory(appComponent);
      }
    };
    this.veracityFragmentSubcomponentFactoryProvider = new Provider<FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent.Factory>() {
      @Override
      public FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent.Factory get(
          ) {
        return new VeracityFragmentSubcomponentFactory(appComponent);
      }
    };
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideApplicationContextProvider = DoubleCheck.provider(AppModule_ProvideApplicationContextFactory.create(appModuleParam, applicationProvider));
    this.provideRestServiceProvider = NetworkModule_ProvideRestServiceFactory.create(networkModuleParam, provideApplicationContextProvider, applicationProvider);
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private App application;

    @Override
    public Builder application(App application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, App.class);
      return new DaggerAppComponent(new NetworkModule(), new AppModule(), application);
    }
  }

  private static final class VeracityActivitySubcomponentFactory implements ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent.Factory {
    private final DaggerAppComponent appComponent;

    private VeracityActivitySubcomponentFactory(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent create(
        VeracityActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new VeracityActivitySubcomponentImpl(appComponent, arg0);
    }
  }

  private static final class VeracityFragmentSubcomponentFactory implements FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent.Factory {
    private final DaggerAppComponent appComponent;

    private VeracityFragmentSubcomponentFactory(DaggerAppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent create(
        VeracityFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new VeracityFragmentSubcomponentImpl(appComponent, new VeracityModule(), arg0);
    }
  }

  private static final class VeracityActivitySubcomponentImpl implements ActivityInjectorsModule_VeracityActivityInjector.VeracityActivitySubcomponent {
    private final DaggerAppComponent appComponent;

    private final VeracityActivitySubcomponentImpl veracityActivitySubcomponentImpl = this;

    private VeracityActivitySubcomponentImpl(DaggerAppComponent appComponent,
        VeracityActivity arg0Param) {
      this.appComponent = appComponent;


    }

    @Override
    public void inject(VeracityActivity arg0) {
      injectVeracityActivity(arg0);
    }

    private VeracityActivity injectVeracityActivity(VeracityActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, appComponent.dispatchingAndroidInjectorOfObject());
      return instance;
    }
  }

  private static final class VeracityFragmentSubcomponentImpl implements FragmentInjectorsModule_VeracityFragmentInjector.VeracityFragmentSubcomponent {
    private final DaggerAppComponent appComponent;

    private final VeracityFragmentSubcomponentImpl veracityFragmentSubcomponentImpl = this;

    private Provider<VeracityFragment> arg0Provider;

    private Provider<CurrencyRepostiory> providesCurrencyRepostioryProvider;

    private Provider<VeracityViewModel> veracityViewModelProvider;

    private Provider<InjectionViewModelProvider<VeracityViewModel>> injectionViewModelProvider;

    private Provider<VeracityViewModel> provideVeracityiewModelProvider;

    private VeracityFragmentSubcomponentImpl(DaggerAppComponent appComponent,
        VeracityModule veracityModuleParam, VeracityFragment arg0Param) {
      this.appComponent = appComponent;

      initialize(veracityModuleParam, arg0Param);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final VeracityModule veracityModuleParam,
        final VeracityFragment arg0Param) {
      this.arg0Provider = InstanceFactory.create(arg0Param);
      this.providesCurrencyRepostioryProvider = VeracityModule_ProvidesCurrencyRepostioryFactory.create(veracityModuleParam, appComponent.provideRestServiceProvider);
      this.veracityViewModelProvider = VeracityViewModel_Factory.create(providesCurrencyRepostioryProvider);
      this.injectionViewModelProvider = InjectionViewModelProvider_Factory.create(veracityViewModelProvider);
      this.provideVeracityiewModelProvider = VeracityModule_ProvideVeracityiewModelFactory.create(veracityModuleParam, arg0Provider, injectionViewModelProvider);
    }

    @Override
    public void inject(VeracityFragment arg0) {
      injectVeracityFragment(arg0);
    }

    private VeracityFragment injectVeracityFragment(VeracityFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, appComponent.dispatchingAndroidInjectorOfObject());
      VeracityFragment_MembersInjector.injectViewModel(instance, DoubleCheck.lazy(provideVeracityiewModelProvider));
      return instance;
    }
  }
}
