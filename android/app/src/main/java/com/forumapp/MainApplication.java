package com.forumapp;
import com.chirag.RNMail.*;
import android.app.Application;
import com.facebook.react.ReactApplication;
import org.wonday.pdf.RCTPdfView;
import com.RNFetchBlob.RNFetchBlobPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RCTPdfView(),
            new RNFetchBlobPackage(),
            new RNMail(),
            new SplashScreenReactPackage(),
            new ReanimatedPackage(),
            new VectorIconsPackage(),
            new AsyncStoragePackage(),
            new RNGestureHandlerPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
