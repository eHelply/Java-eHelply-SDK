/*
 * eHelply SDK - 1.1.105
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.105
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
 * HeartbeatResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T01:13:32.168081Z[Etc/UTC]")
public class HeartbeatResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_SERVICE_UUID = "service_uuid";
  @SerializedName(SERIALIZED_NAME_SERVICE_UUID)
  private String serviceUuid;

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private String stage;

  public static final String SERIALIZED_NAME_PROCESS = "process";
  @SerializedName(SERIALIZED_NAME_PROCESS)
  private String process;

  public static final String SERIALIZED_NAME_HEALTH = "health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private String health;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Object platform;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public HeartbeatResponse() { 
  }

  public HeartbeatResponse uuid(String uuid) {
    
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


  public HeartbeatResponse serviceUuid(String serviceUuid) {
    
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


  public HeartbeatResponse stage(String stage) {
    
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStage() {
    return stage;
  }


  public void setStage(String stage) {
    this.stage = stage;
  }


  public HeartbeatResponse process(String process) {
    
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProcess() {
    return process;
  }


  public void setProcess(String process) {
    this.process = process;
  }


  public HeartbeatResponse health(String health) {
    
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHealth() {
    return health;
  }


  public void setHealth(String health) {
    this.health = health;
  }


  public HeartbeatResponse platform(Object platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getPlatform() {
    return platform;
  }


  public void setPlatform(Object platform) {
    this.platform = platform;
  }


  public HeartbeatResponse createdAt(String createdAt) {
    
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
    HeartbeatResponse heartbeatResponse = (HeartbeatResponse) o;
    return Objects.equals(this.uuid, heartbeatResponse.uuid) &&
        Objects.equals(this.serviceUuid, heartbeatResponse.serviceUuid) &&
        Objects.equals(this.stage, heartbeatResponse.stage) &&
        Objects.equals(this.process, heartbeatResponse.process) &&
        Objects.equals(this.health, heartbeatResponse.health) &&
        Objects.equals(this.platform, heartbeatResponse.platform) &&
        Objects.equals(this.createdAt, heartbeatResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, serviceUuid, stage, process, health, platform, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartbeatResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    serviceUuid: ").append(toIndentedString(serviceUuid)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("stage");
    openapiFields.add("process");
    openapiFields.add("health");
    openapiFields.add("platform");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("service_uuid");
    openapiRequiredFields.add("stage");
    openapiRequiredFields.add("process");
    openapiRequiredFields.add("health");
    openapiRequiredFields.add("platform");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HeartbeatResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HeartbeatResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HeartbeatResponse is not found in the empty JSON string", HeartbeatResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HeartbeatResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HeartbeatResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HeartbeatResponse.openapiRequiredFields) {
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
      if (jsonObj.get("stage") != null && !jsonObj.get("stage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stage").toString()));
      }
      if (jsonObj.get("process") != null && !jsonObj.get("process").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process").toString()));
      }
      if (jsonObj.get("health") != null && !jsonObj.get("health").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HeartbeatResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HeartbeatResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HeartbeatResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HeartbeatResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<HeartbeatResponse>() {
           @Override
           public void write(JsonWriter out, HeartbeatResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HeartbeatResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HeartbeatResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HeartbeatResponse
  * @throws IOException if the JSON string is invalid with respect to HeartbeatResponse
  */
  public static HeartbeatResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HeartbeatResponse.class);
  }

 /**
  * Convert an instance of HeartbeatResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

