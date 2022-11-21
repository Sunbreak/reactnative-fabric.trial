package com.fabriccompat;

import androidx.annotation.Nullable;

import android.content.Context;
import android.util.AttributeSet;

import android.view.View;

public class FabricCompatView extends View {

  public FabricCompatView(Context context) {
    super(context);
  }

  public FabricCompatView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public FabricCompatView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

}
