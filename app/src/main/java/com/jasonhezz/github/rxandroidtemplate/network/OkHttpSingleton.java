package com.jasonhezz.github.rxandroidtemplate.network;

import com.jasonhezz.github.rxandroidtemplate.MainApplication;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by Admin on 2016/3/2.
 */
public class OkHttpSingleton {
  public static OkHttpSingleton okHttpInstance = new OkHttpSingleton();
  private final int cacheSize = 10 * 1024 * 1024;
  private File httpCacheDir =
      new File(MainApplication.mainContext.getExternalCacheDir(), "dirCache");
  private okhttp3.OkHttpClient OkHttpClient;

  private OkHttpSingleton() {
    OkHttpClient = new OkHttpClient().newBuilder()
        .connectTimeout(Constraint.DEFAULT_CONNECT_TIMEOUT_MILLIS, TimeUnit.SECONDS)
        .writeTimeout(Constraint.DEFAULT_WRITE_TIMEOUT_MILLIS, TimeUnit.SECONDS)
        .readTimeout(Constraint.DEFAULT_READ_TIMEOUT_MILLIS, TimeUnit.SECONDS)
        .cache(new Cache(httpCacheDir, cacheSize))
        .build();
  }

  public okhttp3.OkHttpClient getOkHttpClient() {
    return okHttpInstance.OkHttpClient;
  }
}
