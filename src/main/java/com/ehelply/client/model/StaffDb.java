/*
 * eHelply SDK - 1.1.114
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.114
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
 * **:param** uuid                                **type:** string **:param** project_uuid                        **type:** string or None  **:param** entity_uuid                         **type:** string or None  **:param** schedule_uuid                       **type:** string or None  **:param** catalog_uuid                        **type:** string or None  **:param** review_group_uuid                   **type:** string or None  **:param** created_at                          **type:** string or None  **:param** updated_at                          **type:** string or None  **:param** deleted_at                          **type:** string or None
 */
@ApiModel(description = "**:param** uuid                                **type:** string **:param** project_uuid                        **type:** string or None  **:param** entity_uuid                         **type:** string or None  **:param** schedule_uuid                       **type:** string or None  **:param** catalog_uuid                        **type:** string or None  **:param** review_group_uuid                   **type:** string or None  **:param** created_at                          **type:** string or None  **:param** updated_at                          **type:** string or None  **:param** deleted_at                          **type:** string or None")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T14:06:08.981108Z[Etc/UTC]")
public class StaffDb {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_ENTITY_UUID = "entity_uuid";
  @SerializedName(SERIALIZED_NAME_ENTITY_UUID)
  private String entityUuid;

  public static final String SERIALIZED_NAME_SCHEDULE_UUID = "schedule_uuid";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_UUID)
  private String scheduleUuid;

  public static final String SERIALIZED_NAME_CATALOG_UUID = "catalog_uuid";
  @SerializedName(SERIALIZED_NAME_CATALOG_UUID)
  private String catalogUuid;

  public static final String SERIALIZED_NAME_REVIEW_GROUP_UUID = "review_group_uuid";
  @SerializedName(SERIALIZED_NAME_REVIEW_GROUP_UUID)
  private String reviewGroupUuid;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public StaffDb() { 
  }

  public StaffDb uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "uuid_1234", required = true, value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public StaffDb projectUuid(String projectUuid) {
    
    this.projectUuid = projectUuid;
    return this;
  }

   /**
   * Get projectUuid
   * @return projectUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "project_uuid_1234", value = "")

  public String getProjectUuid() {
    return projectUuid;
  }


  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }


  public StaffDb entityUuid(String entityUuid) {
    
    this.entityUuid = entityUuid;
    return this;
  }

   /**
   * Get entityUuid
   * @return entityUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "entity_uuid_1234", value = "")

  public String getEntityUuid() {
    return entityUuid;
  }


  public void setEntityUuid(String entityUuid) {
    this.entityUuid = entityUuid;
  }


  public StaffDb scheduleUuid(String scheduleUuid) {
    
    this.scheduleUuid = scheduleUuid;
    return this;
  }

   /**
   * Get scheduleUuid
   * @return scheduleUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "schedule_uuid_1234", value = "")

  public String getScheduleUuid() {
    return scheduleUuid;
  }


  public void setScheduleUuid(String scheduleUuid) {
    this.scheduleUuid = scheduleUuid;
  }


  public StaffDb catalogUuid(String catalogUuid) {
    
    this.catalogUuid = catalogUuid;
    return this;
  }

   /**
   * Get catalogUuid
   * @return catalogUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "catalog_uuid_1234", value = "")

  public String getCatalogUuid() {
    return catalogUuid;
  }


  public void setCatalogUuid(String catalogUuid) {
    this.catalogUuid = catalogUuid;
  }


  public StaffDb reviewGroupUuid(String reviewGroupUuid) {
    
    this.reviewGroupUuid = reviewGroupUuid;
    return this;
  }

   /**
   * Get reviewGroupUuid
   * @return reviewGroupUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "review_uuid_1234", value = "")

  public String getReviewGroupUuid() {
    return reviewGroupUuid;
  }


  public void setReviewGroupUuid(String reviewGroupUuid) {
    this.reviewGroupUuid = reviewGroupUuid;
  }


  public StaffDb createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public StaffDb updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public StaffDb deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffDb staffDb = (StaffDb) o;
    return Objects.equals(this.uuid, staffDb.uuid) &&
        Objects.equals(this.projectUuid, staffDb.projectUuid) &&
        Objects.equals(this.entityUuid, staffDb.entityUuid) &&
        Objects.equals(this.scheduleUuid, staffDb.scheduleUuid) &&
        Objects.equals(this.catalogUuid, staffDb.catalogUuid) &&
        Objects.equals(this.reviewGroupUuid, staffDb.reviewGroupUuid) &&
        Objects.equals(this.createdAt, staffDb.createdAt) &&
        Objects.equals(this.updatedAt, staffDb.updatedAt) &&
        Objects.equals(this.deletedAt, staffDb.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, projectUuid, entityUuid, scheduleUuid, catalogUuid, reviewGroupUuid, createdAt, updatedAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffDb {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
    sb.append("    scheduleUuid: ").append(toIndentedString(scheduleUuid)).append("\n");
    sb.append("    catalogUuid: ").append(toIndentedString(catalogUuid)).append("\n");
    sb.append("    reviewGroupUuid: ").append(toIndentedString(reviewGroupUuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
    openapiFields.add("project_uuid");
    openapiFields.add("entity_uuid");
    openapiFields.add("schedule_uuid");
    openapiFields.add("catalog_uuid");
    openapiFields.add("review_group_uuid");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("deleted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StaffDb
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StaffDb.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StaffDb is not found in the empty JSON string", StaffDb.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StaffDb.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StaffDb` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StaffDb.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
      if (jsonObj.get("entity_uuid") != null && !jsonObj.get("entity_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_uuid").toString()));
      }
      if (jsonObj.get("schedule_uuid") != null && !jsonObj.get("schedule_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule_uuid").toString()));
      }
      if (jsonObj.get("catalog_uuid") != null && !jsonObj.get("catalog_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_uuid").toString()));
      }
      if (jsonObj.get("review_group_uuid") != null && !jsonObj.get("review_group_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_group_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_group_uuid").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (jsonObj.get("deleted_at") != null && !jsonObj.get("deleted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleted_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaffDb.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaffDb' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaffDb> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaffDb.class));

       return (TypeAdapter<T>) new TypeAdapter<StaffDb>() {
           @Override
           public void write(JsonWriter out, StaffDb value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaffDb read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaffDb given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaffDb
  * @throws IOException if the JSON string is invalid with respect to StaffDb
  */
  public static StaffDb fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaffDb.class);
  }

 /**
  * Convert an instance of StaffDb to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

