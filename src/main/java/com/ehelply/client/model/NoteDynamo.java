/*
 * eHelply SDK - 1.1.86
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.86
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.NoteMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * A note from DynamoDB
 */
@ApiModel(description = "A note from DynamoDB")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-06T20:38:43.803868Z[Etc/UTC]")
public class NoteDynamo {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private File content;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private NoteMeta meta;

  public NoteDynamo() { 
  }

  public NoteDynamo uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public NoteDynamo content(File content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getContent() {
    return content;
  }


  public void setContent(File content) {
    this.content = content;
  }


  public NoteDynamo time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }


  public NoteDynamo meta(NoteMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NoteMeta getMeta() {
    return meta;
  }


  public void setMeta(NoteMeta meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteDynamo noteDynamo = (NoteDynamo) o;
    return Objects.equals(this.uuid, noteDynamo.uuid) &&
        Objects.equals(this.content, noteDynamo.content) &&
        Objects.equals(this.time, noteDynamo.time) &&
        Objects.equals(this.meta, noteDynamo.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, content, time, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteDynamo {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("content");
    openapiFields.add("time");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NoteDynamo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NoteDynamo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NoteDynamo is not found in the empty JSON string", NoteDynamo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NoteDynamo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NoteDynamo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NoteDynamo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("time") != null && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.getAsJsonObject("meta") != null) {
        NoteMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NoteDynamo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NoteDynamo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NoteDynamo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NoteDynamo.class));

       return (TypeAdapter<T>) new TypeAdapter<NoteDynamo>() {
           @Override
           public void write(JsonWriter out, NoteDynamo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NoteDynamo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NoteDynamo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NoteDynamo
  * @throws IOException if the JSON string is invalid with respect to NoteDynamo
  */
  public static NoteDynamo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NoteDynamo.class);
  }

 /**
  * Convert an instance of NoteDynamo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

