package com.jasonhezz.github.rxandroidtemplate.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JasonHezz on 2016/3/2.
 */
public class RetrofitSingleton {

  public static RetrofitSingleton retrofitSingleton = new RetrofitSingleton();
  private ApiInterface ApiService = null;
  private Retrofit retrofit;

  private RetrofitSingleton() {
    retrofit = new Retrofit.Builder().baseUrl(Constraint.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilderUtil.create()))
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .client(OkHttpSingleton.okHttpInstance.getOkHttpClient())
        .build();
    ApiService = retrofit.create(ApiInterface.class);
  }

  public static RetrofitSingleton getInstance() {
    return retrofitSingleton;
  }

  public ApiInterface getApiService() {
    return retrofitSingleton.ApiService;
  }

  public Retrofit getRetrofit() {
    return retrofit;
  }
}
