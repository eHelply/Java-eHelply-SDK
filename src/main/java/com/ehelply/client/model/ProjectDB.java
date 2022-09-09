/*
 * eHelply SDK - 1.1.113
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.113
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
 * Used for DB row entry
 */
@ApiModel(description = "Used for DB row entry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T15:57:05.968057Z[Etc/UTC]")
public class ProjectDB {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CURRENT_SPEND = "current_spend";
  @SerializedName(SERIALIZED_NAME_CURRENT_SPEND)
  private Integer currentSpend;

  public static final String SERIALIZED_NAME_MAX_SPEND = "max_spend";
  @SerializedName(SERIALIZED_NAME_MAX_SPEND)
  private Integer maxSpend;

  public static final String SERIALIZED_NAME_PROJECT_STATUS = "project_status";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS)
  private String projectStatus;

  public static final String SERIALIZED_NAME_ARCHIVED_AT = "archived_at";
  @SerializedName(SERIALIZED_NAME_ARCHIVED_AT)
  private String archivedAt;

  public ProjectDB() { 
  }

  public ProjectDB uuid(String uuid) {
    
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


  public ProjectDB name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectDB createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ProjectDB currentSpend(Integer currentSpend) {
    
    this.currentSpend = currentSpend;
    return this;
  }

   /**
   * Get currentSpend
   * @return currentSpend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrentSpend() {
    return currentSpend;
  }


  public void setCurrentSpend(Integer currentSpend) {
    this.currentSpend = currentSpend;
  }


  public ProjectDB maxSpend(Integer maxSpend) {
    
    this.maxSpend = maxSpend;
    return this;
  }

   /**
   * Get maxSpend
   * @return maxSpend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxSpend() {
    return maxSpend;
  }


  public void setMaxSpend(Integer maxSpend) {
    this.maxSpend = maxSpend;
  }


  public ProjectDB projectStatus(String projectStatus) {
    
    this.projectStatus = projectStatus;
    return this;
  }

   /**
   * Get projectStatus
   * @return projectStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProjectStatus() {
    return projectStatus;
  }


  public void setProjectStatus(String projectStatus) {
    this.projectStatus = projectStatus;
  }


  public ProjectDB archivedAt(String archivedAt) {
    
    this.archivedAt = archivedAt;
    return this;
  }

   /**
   * Get archivedAt
   * @return archivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArchivedAt() {
    return archivedAt;
  }


  public void setArchivedAt(String archivedAt) {
    this.archivedAt = archivedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDB projectDB = (ProjectDB) o;
    return Objects.equals(this.uuid, projectDB.uuid) &&
        Objects.equals(this.name, projectDB.name) &&
        Objects.equals(this.createdAt, projectDB.createdAt) &&
        Objects.equals(this.currentSpend, projectDB.currentSpend) &&
        Objects.equals(this.maxSpend, projectDB.maxSpend) &&
        Objects.equals(this.projectStatus, projectDB.projectStatus) &&
        Objects.equals(this.archivedAt, projectDB.archivedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, createdAt, currentSpend, maxSpend, projectStatus, archivedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDB {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentSpend: ").append(toIndentedString(currentSpend)).append("\n");
    sb.append("    maxSpend: ").append(toIndentedString(maxSpend)).append("\n");
    sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("current_spend");
    openapiFields.add("max_spend");
    openapiFields.add("project_status");
    openapiFields.add("archived_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("current_spend");
    openapiRequiredFields.add("max_spend");
    openapiRequiredFields.add("project_status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectDB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectDB.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectDB is not found in the empty JSON string", ProjectDB.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectDB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectDB` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectDB.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("project_status") != null && !jsonObj.get("project_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_status").toString()));
      }
      if (jsonObj.get("archived_at") != null && !jsonObj.get("archived_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `archived_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("archived_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectDB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectDB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectDB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectDB.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectDB>() {
           @Override
           public void write(JsonWriter out, ProjectDB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectDB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectDB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectDB
  * @throws IOException if the JSON string is invalid with respect to ProjectDB
  */
  public static ProjectDB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectDB.class);
  }

 /**
  * Convert an instance of ProjectDB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

