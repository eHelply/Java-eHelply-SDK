/*
 * eHelply SDK - 1.1.89
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.89
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
 * Used for update endpoint
 */
@ApiModel(description = "Used for update endpoint")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-23T00:50:33.744539Z[Etc/UTC]")
public class ProjectsProjectUpdate {
  public static final String SERIALIZED_NAME_MAX_SPEND = "max_spend";
  @SerializedName(SERIALIZED_NAME_MAX_SPEND)
  private Integer maxSpend;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ProjectsProjectUpdate() { 
  }

  public ProjectsProjectUpdate maxSpend(Integer maxSpend) {
    
    this.maxSpend = maxSpend;
    return this;
  }

   /**
   * Get maxSpend
   * @return maxSpend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSpend() {
    return maxSpend;
  }


  public void setMaxSpend(Integer maxSpend) {
    this.maxSpend = maxSpend;
  }


  public ProjectsProjectUpdate status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsProjectUpdate projectsProjectUpdate = (ProjectsProjectUpdate) o;
    return Objects.equals(this.maxSpend, projectsProjectUpdate.maxSpend) &&
        Objects.equals(this.status, projectsProjectUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSpend, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsProjectUpdate {\n");
    sb.append("    maxSpend: ").append(toIndentedString(maxSpend)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("max_spend");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsProjectUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectsProjectUpdate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsProjectUpdate is not found in the empty JSON string", ProjectsProjectUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsProjectUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsProjectUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsProjectUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsProjectUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsProjectUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsProjectUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsProjectUpdate>() {
           @Override
           public void write(JsonWriter out, ProjectsProjectUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsProjectUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsProjectUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsProjectUpdate
  * @throws IOException if the JSON string is invalid with respect to ProjectsProjectUpdate
  */
  public static ProjectsProjectUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsProjectUpdate.class);
  }

 /**
  * Convert an instance of ProjectsProjectUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

