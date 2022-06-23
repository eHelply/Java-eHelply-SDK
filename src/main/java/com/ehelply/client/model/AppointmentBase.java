/*
 * eHelply SDK - 1.1.82
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.82
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
 * AppointmentBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T01:03:17.599283Z[Etc/UTC]")
public class AppointmentBase {
  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_PLACE_UUID = "place_uuid";
  @SerializedName(SERIALIZED_NAME_PLACE_UUID)
  private String placeUuid;

  public static final String SERIALIZED_NAME_REVIEW_GROUP_UUID = "review_group_uuid";
  @SerializedName(SERIALIZED_NAME_REVIEW_GROUP_UUID)
  private String reviewGroupUuid;

  public static final String SERIALIZED_NAME_EXPECTED_FINISH_AT = "expected_finish_at";
  @SerializedName(SERIALIZED_NAME_EXPECTED_FINISH_AT)
  private String expectedFinishAt;

  public static final String SERIALIZED_NAME_EXPECTED_START_AT = "expected_start_at";
  @SerializedName(SERIALIZED_NAME_EXPECTED_START_AT)
  private String expectedStartAt;

  public static final String SERIALIZED_NAME_ACTUAL_START_AT = "actual_start_at";
  @SerializedName(SERIALIZED_NAME_ACTUAL_START_AT)
  private String actualStartAt;

  public static final String SERIALIZED_NAME_ACTUAL_FINISH_AT = "actual_finish_at";
  @SerializedName(SERIALIZED_NAME_ACTUAL_FINISH_AT)
  private String actualFinishAt;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private Object products;

  public static final String SERIALIZED_NAME_META_UUID = "meta_uuid";
  @SerializedName(SERIALIZED_NAME_META_UUID)
  private String metaUuid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CANCELLATION_AT = "cancellation_at";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_AT)
  private String cancellationAt;

  public static final String SERIALIZED_NAME_CANCELLATION_REASON = "cancellation_reason";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_REASON)
  private String cancellationReason;

  public static final String SERIALIZED_NAME_CANCELLATION_ENTITY_UUID = "cancellation_entity_uuid";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_ENTITY_UUID)
  private String cancellationEntityUuid;

  public AppointmentBase() { 
  }

  public AppointmentBase projectUuid(String projectUuid) {
    
    this.projectUuid = projectUuid;
    return this;
  }

   /**
   * Get projectUuid
   * @return projectUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "project_uuid", value = "")

  public String getProjectUuid() {
    return projectUuid;
  }


  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }


  public AppointmentBase placeUuid(String placeUuid) {
    
    this.placeUuid = placeUuid;
    return this;
  }

   /**
   * Get placeUuid
   * @return placeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "place_uuid", value = "")

  public String getPlaceUuid() {
    return placeUuid;
  }


  public void setPlaceUuid(String placeUuid) {
    this.placeUuid = placeUuid;
  }


  public AppointmentBase reviewGroupUuid(String reviewGroupUuid) {
    
    this.reviewGroupUuid = reviewGroupUuid;
    return this;
  }

   /**
   * Get reviewGroupUuid
   * @return reviewGroupUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "review_group_uuid", value = "")

  public String getReviewGroupUuid() {
    return reviewGroupUuid;
  }


  public void setReviewGroupUuid(String reviewGroupUuid) {
    this.reviewGroupUuid = reviewGroupUuid;
  }


  public AppointmentBase expectedFinishAt(String expectedFinishAt) {
    
    this.expectedFinishAt = expectedFinishAt;
    return this;
  }

   /**
   * Get expectedFinishAt
   * @return expectedFinishAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getExpectedFinishAt() {
    return expectedFinishAt;
  }


  public void setExpectedFinishAt(String expectedFinishAt) {
    this.expectedFinishAt = expectedFinishAt;
  }


  public AppointmentBase expectedStartAt(String expectedStartAt) {
    
    this.expectedStartAt = expectedStartAt;
    return this;
  }

   /**
   * Get expectedStartAt
   * @return expectedStartAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getExpectedStartAt() {
    return expectedStartAt;
  }


  public void setExpectedStartAt(String expectedStartAt) {
    this.expectedStartAt = expectedStartAt;
  }


  public AppointmentBase actualStartAt(String actualStartAt) {
    
    this.actualStartAt = actualStartAt;
    return this;
  }

   /**
   * Get actualStartAt
   * @return actualStartAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getActualStartAt() {
    return actualStartAt;
  }


  public void setActualStartAt(String actualStartAt) {
    this.actualStartAt = actualStartAt;
  }


  public AppointmentBase actualFinishAt(String actualFinishAt) {
    
    this.actualFinishAt = actualFinishAt;
    return this;
  }

   /**
   * Get actualFinishAt
   * @return actualFinishAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getActualFinishAt() {
    return actualFinishAt;
  }


  public void setActualFinishAt(String actualFinishAt) {
    this.actualFinishAt = actualFinishAt;
  }


  public AppointmentBase products(Object products) {
    
    this.products = products;
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Service 1\":\"Hair Cut\"}", value = "")

  public Object getProducts() {
    return products;
  }


  public void setProducts(Object products) {
    this.products = products;
  }


  public AppointmentBase metaUuid(String metaUuid) {
    
    this.metaUuid = metaUuid;
    return this;
  }

   /**
   * Get metaUuid
   * @return metaUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "meta_uuid", value = "")

  public String getMetaUuid() {
    return metaUuid;
  }


  public void setMetaUuid(String metaUuid) {
    this.metaUuid = metaUuid;
  }


  public AppointmentBase status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Awaiting Approval", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public AppointmentBase cancellationAt(String cancellationAt) {
    
    this.cancellationAt = cancellationAt;
    return this;
  }

   /**
   * Get cancellationAt
   * @return cancellationAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getCancellationAt() {
    return cancellationAt;
  }


  public void setCancellationAt(String cancellationAt) {
    this.cancellationAt = cancellationAt;
  }


  public AppointmentBase cancellationReason(String cancellationReason) {
    
    this.cancellationReason = cancellationReason;
    return this;
  }

   /**
   * Get cancellationReason
   * @return cancellationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sick", value = "")

  public String getCancellationReason() {
    return cancellationReason;
  }


  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }


  public AppointmentBase cancellationEntityUuid(String cancellationEntityUuid) {
    
    this.cancellationEntityUuid = cancellationEntityUuid;
    return this;
  }

   /**
   * Get cancellationEntityUuid
   * @return cancellationEntityUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user_uuid", value = "")

  public String getCancellationEntityUuid() {
    return cancellationEntityUuid;
  }


  public void setCancellationEntityUuid(String cancellationEntityUuid) {
    this.cancellationEntityUuid = cancellationEntityUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentBase appointmentBase = (AppointmentBase) o;
    return Objects.equals(this.projectUuid, appointmentBase.projectUuid) &&
        Objects.equals(this.placeUuid, appointmentBase.placeUuid) &&
        Objects.equals(this.reviewGroupUuid, appointmentBase.reviewGroupUuid) &&
        Objects.equals(this.expectedFinishAt, appointmentBase.expectedFinishAt) &&
        Objects.equals(this.expectedStartAt, appointmentBase.expectedStartAt) &&
        Objects.equals(this.actualStartAt, appointmentBase.actualStartAt) &&
        Objects.equals(this.actualFinishAt, appointmentBase.actualFinishAt) &&
        Objects.equals(this.products, appointmentBase.products) &&
        Objects.equals(this.metaUuid, appointmentBase.metaUuid) &&
        Objects.equals(this.status, appointmentBase.status) &&
        Objects.equals(this.cancellationAt, appointmentBase.cancellationAt) &&
        Objects.equals(this.cancellationReason, appointmentBase.cancellationReason) &&
        Objects.equals(this.cancellationEntityUuid, appointmentBase.cancellationEntityUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectUuid, placeUuid, reviewGroupUuid, expectedFinishAt, expectedStartAt, actualStartAt, actualFinishAt, products, metaUuid, status, cancellationAt, cancellationReason, cancellationEntityUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentBase {\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    placeUuid: ").append(toIndentedString(placeUuid)).append("\n");
    sb.append("    reviewGroupUuid: ").append(toIndentedString(reviewGroupUuid)).append("\n");
    sb.append("    expectedFinishAt: ").append(toIndentedString(expectedFinishAt)).append("\n");
    sb.append("    expectedStartAt: ").append(toIndentedString(expectedStartAt)).append("\n");
    sb.append("    actualStartAt: ").append(toIndentedString(actualStartAt)).append("\n");
    sb.append("    actualFinishAt: ").append(toIndentedString(actualFinishAt)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    metaUuid: ").append(toIndentedString(metaUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cancellationAt: ").append(toIndentedString(cancellationAt)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    cancellationEntityUuid: ").append(toIndentedString(cancellationEntityUuid)).append("\n");
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
    openapiFields.add("project_uuid");
    openapiFields.add("place_uuid");
    openapiFields.add("review_group_uuid");
    openapiFields.add("expected_finish_at");
    openapiFields.add("expected_start_at");
    openapiFields.add("actual_start_at");
    openapiFields.add("actual_finish_at");
    openapiFields.add("products");
    openapiFields.add("meta_uuid");
    openapiFields.add("status");
    openapiFields.add("cancellation_at");
    openapiFields.add("cancellation_reason");
    openapiFields.add("cancellation_entity_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppointmentBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AppointmentBase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppointmentBase is not found in the empty JSON string", AppointmentBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppointmentBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppointmentBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
      if (jsonObj.get("place_uuid") != null && !jsonObj.get("place_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_uuid").toString()));
      }
      if (jsonObj.get("review_group_uuid") != null && !jsonObj.get("review_group_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_group_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_group_uuid").toString()));
      }
      if (jsonObj.get("expected_finish_at") != null && !jsonObj.get("expected_finish_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_finish_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_finish_at").toString()));
      }
      if (jsonObj.get("expected_start_at") != null && !jsonObj.get("expected_start_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expected_start_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expected_start_at").toString()));
      }
      if (jsonObj.get("actual_start_at") != null && !jsonObj.get("actual_start_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_start_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_start_at").toString()));
      }
      if (jsonObj.get("actual_finish_at") != null && !jsonObj.get("actual_finish_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_finish_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_finish_at").toString()));
      }
      if (jsonObj.get("meta_uuid") != null && !jsonObj.get("meta_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meta_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meta_uuid").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("cancellation_at") != null && !jsonObj.get("cancellation_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_at").toString()));
      }
      if (jsonObj.get("cancellation_reason") != null && !jsonObj.get("cancellation_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_reason").toString()));
      }
      if (jsonObj.get("cancellation_entity_uuid") != null && !jsonObj.get("cancellation_entity_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellation_entity_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellation_entity_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppointmentBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppointmentBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppointmentBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppointmentBase.class));

       return (TypeAdapter<T>) new TypeAdapter<AppointmentBase>() {
           @Override
           public void write(JsonWriter out, AppointmentBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppointmentBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppointmentBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppointmentBase
  * @throws IOException if the JSON string is invalid with respect to AppointmentBase
  */
  public static AppointmentBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppointmentBase.class);
  }

 /**
  * Convert an instance of AppointmentBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
