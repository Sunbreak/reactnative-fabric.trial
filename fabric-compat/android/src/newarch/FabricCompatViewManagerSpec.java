package com.fabriccompat;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.FabricCompatViewManagerDelegate;
import com.facebook.react.viewmanagers.FabricCompatViewManagerInterface;
import com.facebook.soloader.SoLoader;

public abstract class FabricCompatViewManagerSpec<T extends View> extends SimpleViewManager<T> implements FabricCompatViewManagerInterface<T> {
  static {
    try {
      SoLoader.loadLibrary("fabriccompat_registration");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private final ViewManagerDelegate<T> mDelegate;

  public FabricCompatViewManagerSpec() {
    mDelegate = new FabricCompatViewManagerDelegate(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<T> getDelegate() {
    return mDelegate;
  }
}
