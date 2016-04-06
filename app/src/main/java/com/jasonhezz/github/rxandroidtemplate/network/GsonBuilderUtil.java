package com.jasonhezz.github.rxandroidtemplate.network;

/**
 * Created by Admin on 2016/3/9.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.DateFormat;

public class GsonBuilderUtil {

  public static Gson create() {
    GsonBuilder gb = new GsonBuilder();
    gb.registerTypeAdapter(java.util.Date.class, new DateSerializer())
        .setDateFormat(DateFormat.LONG);
    gb.registerTypeAdapter(java.util.Date.class, new DateDeserializer())
        .setDateFormat(DateFormat.LONG);
    Gson gson = gb.create();
    return gson;
  }
}