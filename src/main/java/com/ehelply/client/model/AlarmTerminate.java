/*
 * eHelply SDK - 1.1.99
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.99
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
 * AlarmTerminate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T01:14:40.544181Z[Etc/UTC]")
public class AlarmTerminate {
  public static final String SERIALIZED_NAME_TERMINATER_UUID = "terminater_uuid";
  @SerializedName(SERIALIZED_NAME_TERMINATER_UUID)
  private String terminaterUuid;

  public AlarmTerminate() { 
  }

  public AlarmTerminate terminaterUuid(String terminaterUuid) {
    
    this.terminaterUuid = terminaterUuid;
    return this;
  }

   /**
   * Get terminaterUuid
   * @return terminaterUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTerminaterUuid() {
    return terminaterUuid;
  }


  public void setTerminaterUuid(String terminaterUuid) {
    this.terminaterUuid = terminaterUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmTerminate alarmTerminate = (AlarmTerminate) o;
    return Objects.equals(this.terminaterUuid, alarmTerminate.terminaterUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminaterUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmTerminate {\n");
    sb.append("    terminaterUuid: ").append(toIndentedString(terminaterUuid)).append("\n");
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
    openapiFields.add("terminater_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminater_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlarmTerminate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlarmTerminate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlarmTerminate is not found in the empty JSON string", AlarmTerminate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlarmTerminate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlarmTerminate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlarmTerminate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("terminater_uuid") != null && !jsonObj.get("terminater_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminater_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminater_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlarmTerminate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlarmTerminate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlarmTerminate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlarmTerminate.class));

       return (TypeAdapter<T>) new TypeAdapter<AlarmTerminate>() {
           @Override
           public void write(JsonWriter out, AlarmTerminate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlarmTerminate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlarmTerminate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlarmTerminate
  * @throws IOException if the JSON string is invalid with respect to AlarmTerminate
  */
  public static AlarmTerminate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlarmTerminate.class);
  }

 /**
  * Convert an instance of AlarmTerminate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

