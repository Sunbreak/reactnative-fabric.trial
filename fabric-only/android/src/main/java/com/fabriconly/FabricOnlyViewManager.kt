package com.fabriconly

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.FabricOnlyViewManagerInterface
import com.facebook.react.viewmanagers.FabricOnlyViewManagerDelegate

@ReactModule(name = FabricOnlyViewManager.NAME)
class FabricOnlyViewManager : SimpleViewManager<FabricOnlyView>(),
  FabricOnlyViewManagerInterface<FabricOnlyView> {
  private val mDelegate: ViewManagerDelegate<FabricOnlyView>

  init {
    mDelegate = FabricOnlyViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<FabricOnlyView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): FabricOnlyView {
    return FabricOnlyView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: FabricOnlyView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "FabricOnlyView"
  }
}
