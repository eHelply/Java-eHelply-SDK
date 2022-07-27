/*
 * eHelply SDK - 1.1.103
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.103
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
 * KpiResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:54:34.967430Z[Etc/UTC]")
public class KpiResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_SERVICE_UUID = "service_uuid";
  @SerializedName(SERIALIZED_NAME_SERVICE_UUID)
  private String serviceUuid;

  public static final String SERIALIZED_NAME_KPIS = "kpis";
  @SerializedName(SERIALIZED_NAME_KPIS)
  private List<Object> kpis = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_FETCHED_AT = "fetched_at";
  @SerializedName(SERIALIZED_NAME_FETCHED_AT)
  private String fetchedAt;

  public KpiResponse() { 
  }

  public KpiResponse uuid(String uuid) {
    
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


  public KpiResponse serviceUuid(String serviceUuid) {
    
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


  public KpiResponse kpis(List<Object> kpis) {
    
    this.kpis = kpis;
    return this;
  }

  public KpiResponse addKpisItem(Object kpisItem) {
    this.kpis.add(kpisItem);
    return this;
  }

   /**
   * Get kpis
   * @return kpis
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getKpis() {
    return kpis;
  }


  public void setKpis(List<Object> kpis) {
    this.kpis = kpis;
  }


  public KpiResponse createdAt(String createdAt) {
    
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


  public KpiResponse fetchedAt(String fetchedAt) {
    
    this.fetchedAt = fetchedAt;
    return this;
  }

   /**
   * Get fetchedAt
   * @return fetchedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFetchedAt() {
    return fetchedAt;
  }


  public void setFetchedAt(String fetchedAt) {
    this.fetchedAt = fetchedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiResponse kpiResponse = (KpiResponse) o;
    return Objects.equals(this.uuid, kpiResponse.uuid) &&
        Objects.equals(this.serviceUuid, kpiResponse.serviceUuid) &&
        Objects.equals(this.kpis, kpiResponse.kpis) &&
        Objects.equals(this.createdAt, kpiResponse.createdAt) &&
        Objects.equals(this.fetchedAt, kpiResponse.fetchedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, serviceUuid, kpis, createdAt, fetchedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    serviceUuid: ").append(toIndentedString(serviceUuid)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fetchedAt: ").append(toIndentedString(fetchedAt)).append("\n");
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
    openapiFields.add("kpis");
    openapiFields.add("created_at");
    openapiFields.add("fetched_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("service_uuid");
    openapiRequiredFields.add("kpis");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KpiResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KpiResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KpiResponse is not found in the empty JSON string", KpiResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KpiResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KpiResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KpiResponse.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (jsonObj.get("kpis") != null && !jsonObj.get("kpis").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `kpis` to be an array in the JSON string but got `%s`", jsonObj.get("kpis").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("fetched_at") != null && !jsonObj.get("fetched_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fetched_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fetched_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KpiResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KpiResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KpiResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KpiResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KpiResponse>() {
           @Override
           public void write(JsonWriter out, KpiResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KpiResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KpiResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KpiResponse
  * @throws IOException if the JSON string is invalid with respect to KpiResponse
  */
  public static KpiResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KpiResponse.class);
  }

 /**
  * Convert an instance of KpiResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

