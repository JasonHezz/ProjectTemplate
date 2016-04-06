package com.jasonhezz.github.rxandroidtemplate.module;

import rx.functions.Func1;

class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {

  @Override public T call(HttpResult<T> httpResult) {
    if (httpResult.getStatusCode().equals("0")) {
      throw new RuntimeException(httpResult.getMessage());
    }
    return httpResult.getData();
  }
}