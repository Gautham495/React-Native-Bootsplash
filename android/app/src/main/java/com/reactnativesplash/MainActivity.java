package com.reactnativesplash;

import android.os.Bundle;
import android.view.WindowManager;

import com.facebook.react.ReactActivityDelegate; 
import com.zoontek.rnbootsplash.RNBootSplash;

import com.facebook.react.ReactActivity;


public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "reactnativesplash";
  }
   @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);      
      RNBootSplash.init(MainActivity.this);
  }
}
