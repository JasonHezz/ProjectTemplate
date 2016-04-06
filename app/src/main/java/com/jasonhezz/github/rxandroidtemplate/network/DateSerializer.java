package com.jasonhezz.github.rxandroidtemplate.network;

/**
 * Created by Admin on 2016/3/9.
 */

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Date;

public class DateSerializer implements JsonSerializer<Date> {
  public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
    return new JsonPrimitive(src.getTime());
  }
}
