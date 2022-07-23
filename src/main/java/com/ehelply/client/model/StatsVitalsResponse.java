/*
 * eHelply SDK - 1.1.90
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.90
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
 * StatsVitalsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-23T01:42:19.459737Z[Etc/UTC]")
public class StatsVitalsResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_SERVICE_UUID = "service_uuid";
  @SerializedName(SERIALIZED_NAME_SERVICE_UUID)
  private String serviceUuid;

  public static final String SERIALIZED_NAME_HEARTBEAT_UUID = "heartbeat_uuid";
  @SerializedName(SERIALIZED_NAME_HEARTBEAT_UUID)
  private String heartbeatUuid;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private Object stats;

  public static final String SERIALIZED_NAME_VITALS = "vitals";
  @SerializedName(SERIALIZED_NAME_VITALS)
  private Object vitals;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public StatsVitalsResponse() { 
  }

  public StatsVitalsResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public StatsVitalsResponse serviceUuid(String serviceUuid) {
    
    this.serviceUuid = serviceUuid;
    return this;
  }

   /**
   * Get serviceUuid
   * @return serviceUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getServiceUuid() {
    return serviceUuid;
  }


  public void setServiceUuid(String serviceUuid) {
    this.serviceUuid = serviceUuid;
  }


  public StatsVitalsResponse heartbeatUuid(String heartbeatUuid) {
    
    this.heartbeatUuid = heartbeatUuid;
    return this;
  }

   /**
   * Get heartbeatUuid
   * @return heartbeatUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHeartbeatUuid() {
    return heartbeatUuid;
  }


  public void setHeartbeatUuid(String heartbeatUuid) {
    this.heartbeatUuid = heartbeatUuid;
  }


  public StatsVitalsResponse stats(Object stats) {
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStats() {
    return stats;
  }


  public void setStats(Object stats) {
    this.stats = stats;
  }


  public StatsVitalsResponse vitals(Object vitals) {
    
    this.vitals = vitals;
    return this;
  }

   /**
   * Get vitals
   * @return vitals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getVitals() {
    return vitals;
  }


  public void setVitals(Object vitals) {
    this.vitals = vitals;
  }


  public StatsVitalsResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsVitalsResponse statsVitalsResponse = (StatsVitalsResponse) o;
    return Objects.equals(this.uuid, statsVitalsResponse.uuid) &&
        Objects.equals(this.serviceUuid, statsVitalsResponse.serviceUuid) &&
        Objects.equals(this.heartbeatUuid, statsVitalsResponse.heartbeatUuid) &&
        Objects.equals(this.stats, statsVitalsResponse.stats) &&
        Objects.equals(this.vitals, statsVitalsResponse.vitals) &&
        Objects.equals(this.createdAt, statsVitalsResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, serviceUuid, heartbeatUuid, stats, vitals, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsVitalsResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    serviceUuid: ").append(toIndentedString(serviceUuid)).append("\n");
    sb.append("    heartbeatUuid: ").append(toIndentedString(heartbeatUuid)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    vitals: ").append(toIndentedString(vitals)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("service_uuid");
    openapiFields.add("heartbeat_uuid");
    openapiFields.add("stats");
    openapiFields.add("vitals");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("service_uuid");
    openapiRequiredFields.add("heartbeat_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatsVitalsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatsVitalsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatsVitalsResponse is not found in the empty JSON string", StatsVitalsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatsVitalsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatsVitalsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatsVitalsResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("service_uuid") != null && !jsonObj.get("service_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_uuid").toString()));
      }
      if (jsonObj.get("heartbeat_uuid") != null && !jsonObj.get("heartbeat_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `heartbeat_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("heartbeat_uuid").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatsVitalsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatsVitalsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatsVitalsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatsVitalsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StatsVitalsResponse>() {
           @Override
           public void write(JsonWriter out, StatsVitalsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatsVitalsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatsVitalsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatsVitalsResponse
  * @throws IOException if the JSON string is invalid with respect to StatsVitalsResponse
  */
  public static StatsVitalsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatsVitalsResponse.class);
  }

 /**
  * Convert an instance of StatsVitalsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

