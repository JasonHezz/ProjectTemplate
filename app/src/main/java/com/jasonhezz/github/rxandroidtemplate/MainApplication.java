package com.jasonhezz.github.rxandroidtemplate;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
  public static Context mainContext;

  @Override public void onCreate() {
    super.onCreate();
    mainContext = getApplicationContext();
  }
}
