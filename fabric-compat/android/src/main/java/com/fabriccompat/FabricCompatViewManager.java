package com.fabriccompat;

import android.graphics.Color;

import androidx.annotation.Nullable;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = FabricCompatViewManager.NAME)
public class FabricCompatViewManager extends FabricCompatViewManagerSpec<FabricCompatView> {

  public static final String NAME = "FabricCompatView";

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public FabricCompatView createViewInstance(ThemedReactContext context) {
    return new FabricCompatView(context);
  }

  @Override
  @ReactProp(name = "color")
  public void setColor(FabricCompatView view, @Nullable String color) {
    view.setBackgroundColor(Color.parseColor(color));
  }
}
