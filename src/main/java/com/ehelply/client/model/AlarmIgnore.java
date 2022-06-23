/*
 * eHelply SDK - 1.1.83
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.83
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ehelply.client.JSON;

/**
 * AlarmIgnore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T02:34:59.482234Z[Etc/UTC]")
public class AlarmIgnore {
  public static final String SERIALIZED_NAME_IGNORER_UUID = "ignorer_uuid";
  @SerializedName(SERIALIZED_NAME_IGNORER_UUID)
  private String ignorerUuid;

  public AlarmIgnore() { 
  }

  public AlarmIgnore ignorerUuid(String ignorerUuid) {
    
    this.ignorerUuid = ignorerUuid;
    return this;
  }

   /**
   * Get ignorerUuid
   * @return ignorerUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIgnorerUuid() {
    return ignorerUuid;
  }


  public void setIgnorerUuid(String ignorerUuid) {
    this.ignorerUuid = ignorerUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmIgnore alarmIgnore = (AlarmIgnore) o;
    return Objects.equals(this.ignorerUuid, alarmIgnore.ignorerUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignorerUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmIgnore {\n");
    sb.append("    ignorerUuid: ").append(toIndentedString(ignorerUuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ignorer_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ignorer_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlarmIgnore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlarmIgnore.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlarmIgnore is not found in the empty JSON string", AlarmIgnore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlarmIgnore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlarmIgnore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlarmIgnore.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ignorer_uuid") != null && !jsonObj.get("ignorer_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignorer_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ignorer_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlarmIgnore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlarmIgnore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlarmIgnore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlarmIgnore.class));

       return (TypeAdapter<T>) new TypeAdapter<AlarmIgnore>() {
           @Override
           public void write(JsonWriter out, AlarmIgnore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlarmIgnore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlarmIgnore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlarmIgnore
  * @throws IOException if the JSON string is invalid with respect to AlarmIgnore
  */
  public static AlarmIgnore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlarmIgnore.class);
  }

 /**
  * Convert an instance of AlarmIgnore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

