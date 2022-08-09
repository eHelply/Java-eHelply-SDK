/*
 * eHelply SDK - 1.1.101
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.101
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.NoteDynamoResponse;
import com.ehelply.client.model.NoteMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * A note from Dynamo DB including n amount of version history of that note
 */
@ApiModel(description = "A note from Dynamo DB including n amount of version history of that note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-09T21:11:28.331846Z[Etc/UTC]")
public class NoteDynamoHistoryResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private NoteMeta meta;

  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<NoteDynamoResponse> history = null;

  public NoteDynamoHistoryResponse() { 
  }

  public NoteDynamoHistoryResponse uuid(String uuid) {
    
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


  public NoteDynamoHistoryResponse content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public NoteDynamoHistoryResponse time(String time) {
    
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


  public NoteDynamoHistoryResponse meta(NoteMeta meta) {
    
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


  public NoteDynamoHistoryResponse history(List<NoteDynamoResponse> history) {
    
    this.history = history;
    return this;
  }

  public NoteDynamoHistoryResponse addHistoryItem(NoteDynamoResponse historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NoteDynamoResponse> getHistory() {
    return history;
  }


  public void setHistory(List<NoteDynamoResponse> history) {
    this.history = history;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteDynamoHistoryResponse noteDynamoHistoryResponse = (NoteDynamoHistoryResponse) o;
    return Objects.equals(this.uuid, noteDynamoHistoryResponse.uuid) &&
        Objects.equals(this.content, noteDynamoHistoryResponse.content) &&
        Objects.equals(this.time, noteDynamoHistoryResponse.time) &&
        Objects.equals(this.meta, noteDynamoHistoryResponse.meta) &&
        Objects.equals(this.history, noteDynamoHistoryResponse.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, content, time, meta, history);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteDynamoHistoryResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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
    openapiFields.add("history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NoteDynamoHistoryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NoteDynamoHistoryResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NoteDynamoHistoryResponse is not found in the empty JSON string", NoteDynamoHistoryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NoteDynamoHistoryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NoteDynamoHistoryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NoteDynamoHistoryResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("time") != null && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
      // validate the optional field `meta`
      if (jsonObj.getAsJsonObject("meta") != null) {
        NoteMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
      JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("history");
      if (jsonArrayhistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("history").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `history` to be an array in the JSON string but got `%s`", jsonObj.get("history").toString()));
        }

        // validate the optional field `history` (array)
        for (int i = 0; i < jsonArrayhistory.size(); i++) {
          NoteDynamoResponse.validateJsonObject(jsonArrayhistory.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NoteDynamoHistoryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NoteDynamoHistoryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NoteDynamoHistoryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NoteDynamoHistoryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NoteDynamoHistoryResponse>() {
           @Override
           public void write(JsonWriter out, NoteDynamoHistoryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NoteDynamoHistoryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NoteDynamoHistoryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NoteDynamoHistoryResponse
  * @throws IOException if the JSON string is invalid with respect to NoteDynamoHistoryResponse
  */
  public static NoteDynamoHistoryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NoteDynamoHistoryResponse.class);
  }

 /**
  * Convert an instance of NoteDynamoHistoryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

