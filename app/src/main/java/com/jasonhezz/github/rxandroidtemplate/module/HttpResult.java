package com.jasonhezz.github.rxandroidtemplate.module;

import com.google.gson.annotations.SerializedName;

public class HttpResult<T> {

  /** 返回类型 */
  private T data;

  /** 响应码 */
  // 状态码
  @SerializedName("code") private String statusCode;
  /** 响应消息 */

  private String message;
  /** 是否成功 */
  @SerializedName("succ") private boolean isSuccessful;

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isSuccessful() {
    return isSuccessful;
  }

  public void setSuccessful(boolean successful) {
    isSuccessful = successful;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
