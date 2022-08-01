/*
 * eHelply SDK - 1.1.100
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.100
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
 * ProjectsProjectMemberDB
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-01T19:56:14.686297Z[Etc/UTC]")
public class ProjectsProjectMemberDB {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_ENTITY_UUID = "entity_uuid";
  @SerializedName(SERIALIZED_NAME_ENTITY_UUID)
  private String entityUuid;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public ProjectsProjectMemberDB() { 
  }

  public ProjectsProjectMemberDB uuid(String uuid) {
    
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


  public ProjectsProjectMemberDB projectUuid(String projectUuid) {
    
    this.projectUuid = projectUuid;
    return this;
  }

   /**
   * Get projectUuid
   * @return projectUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProjectUuid() {
    return projectUuid;
  }


  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }


  public ProjectsProjectMemberDB entityUuid(String entityUuid) {
    
    this.entityUuid = entityUuid;
    return this;
  }

   /**
   * Get entityUuid
   * @return entityUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEntityUuid() {
    return entityUuid;
  }


  public void setEntityUuid(String entityUuid) {
    this.entityUuid = entityUuid;
  }


  public ProjectsProjectMemberDB role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public ProjectsProjectMemberDB createdAt(String createdAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsProjectMemberDB projectsProjectMemberDB = (ProjectsProjectMemberDB) o;
    return Objects.equals(this.uuid, projectsProjectMemberDB.uuid) &&
        Objects.equals(this.projectUuid, projectsProjectMemberDB.projectUuid) &&
        Objects.equals(this.entityUuid, projectsProjectMemberDB.entityUuid) &&
        Objects.equals(this.role, projectsProjectMemberDB.role) &&
        Objects.equals(this.createdAt, projectsProjectMemberDB.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, projectUuid, entityUuid, role, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsProjectMemberDB {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("project_uuid");
    openapiFields.add("entity_uuid");
    openapiFields.add("role");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("project_uuid");
    openapiRequiredFields.add("entity_uuid");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsProjectMemberDB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectsProjectMemberDB.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsProjectMemberDB is not found in the empty JSON string", ProjectsProjectMemberDB.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsProjectMemberDB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsProjectMemberDB` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsProjectMemberDB.openapiRequiredFields) {
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
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsProjectMemberDB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsProjectMemberDB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsProjectMemberDB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsProjectMemberDB.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsProjectMemberDB>() {
           @Override
           public void write(JsonWriter out, ProjectsProjectMemberDB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsProjectMemberDB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsProjectMemberDB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsProjectMemberDB
  * @throws IOException if the JSON string is invalid with respect to ProjectsProjectMemberDB
  */
  public static ProjectsProjectMemberDB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsProjectMemberDB.class);
  }

 /**
  * Convert an instance of ProjectsProjectMemberDB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

