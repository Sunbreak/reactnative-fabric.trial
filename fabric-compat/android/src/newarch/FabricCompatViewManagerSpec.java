package com.fabriccompat;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.FabricCompatViewManagerDelegate;
import com.facebook.react.viewmanagers.FabricCompatViewManagerInterface;

public abstract class FabricCompatViewManagerSpec<T extends View> extends SimpleViewManager<T> implements FabricCompatViewManagerInterface<T> {
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
