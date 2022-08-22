/*
 * eHelply SDK - 1.1.109
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.109
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
 * ProjectCreditResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-22T20:09:12.124195Z[Etc/UTC]")
public class ProjectCreditResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_CREDITS_GRANTED = "credits_granted";
  @SerializedName(SERIALIZED_NAME_CREDITS_GRANTED)
  private Integer creditsGranted;

  public static final String SERIALIZED_NAME_CREDITS_CONSUMED = "credits_consumed";
  @SerializedName(SERIALIZED_NAME_CREDITS_CONSUMED)
  private Integer creditsConsumed;

  public static final String SERIALIZED_NAME_GRANTED_BY = "granted_by";
  @SerializedName(SERIALIZED_NAME_GRANTED_BY)
  private String grantedBy;

  public static final String SERIALIZED_NAME_GRANTED_REASON = "granted_reason";
  @SerializedName(SERIALIZED_NAME_GRANTED_REASON)
  private String grantedReason;

  public static final String SERIALIZED_NAME_GRANTED_AT = "granted_at";
  @SerializedName(SERIALIZED_NAME_GRANTED_AT)
  private String grantedAt;

  public static final String SERIALIZED_NAME_FULLY_CONSUMED_AT = "fully_consumed_at";
  @SerializedName(SERIALIZED_NAME_FULLY_CONSUMED_AT)
  private String fullyConsumedAt;

  public static final String SERIALIZED_NAME_REVOKED_REASON = "revoked_reason";
  @SerializedName(SERIALIZED_NAME_REVOKED_REASON)
  private String revokedReason;

  public static final String SERIALIZED_NAME_REVOKED_AT = "revoked_at";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT)
  private String revokedAt;

  public ProjectCreditResponse() { 
  }

  public ProjectCreditResponse uuid(String uuid) {
    
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


  public ProjectCreditResponse projectUuid(String projectUuid) {
    
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


  public ProjectCreditResponse creditsGranted(Integer creditsGranted) {
    
    this.creditsGranted = creditsGranted;
    return this;
  }

   /**
   * Get creditsGranted
   * @return creditsGranted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCreditsGranted() {
    return creditsGranted;
  }


  public void setCreditsGranted(Integer creditsGranted) {
    this.creditsGranted = creditsGranted;
  }


  public ProjectCreditResponse creditsConsumed(Integer creditsConsumed) {
    
    this.creditsConsumed = creditsConsumed;
    return this;
  }

   /**
   * Get creditsConsumed
   * @return creditsConsumed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreditsConsumed() {
    return creditsConsumed;
  }


  public void setCreditsConsumed(Integer creditsConsumed) {
    this.creditsConsumed = creditsConsumed;
  }


  public ProjectCreditResponse grantedBy(String grantedBy) {
    
    this.grantedBy = grantedBy;
    return this;
  }

   /**
   * Get grantedBy
   * @return grantedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGrantedBy() {
    return grantedBy;
  }


  public void setGrantedBy(String grantedBy) {
    this.grantedBy = grantedBy;
  }


  public ProjectCreditResponse grantedReason(String grantedReason) {
    
    this.grantedReason = grantedReason;
    return this;
  }

   /**
   * Get grantedReason
   * @return grantedReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGrantedReason() {
    return grantedReason;
  }


  public void setGrantedReason(String grantedReason) {
    this.grantedReason = grantedReason;
  }


  public ProjectCreditResponse grantedAt(String grantedAt) {
    
    this.grantedAt = grantedAt;
    return this;
  }

   /**
   * Get grantedAt
   * @return grantedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGrantedAt() {
    return grantedAt;
  }


  public void setGrantedAt(String grantedAt) {
    this.grantedAt = grantedAt;
  }


  public ProjectCreditResponse fullyConsumedAt(String fullyConsumedAt) {
    
    this.fullyConsumedAt = fullyConsumedAt;
    return this;
  }

   /**
   * Get fullyConsumedAt
   * @return fullyConsumedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullyConsumedAt() {
    return fullyConsumedAt;
  }


  public void setFullyConsumedAt(String fullyConsumedAt) {
    this.fullyConsumedAt = fullyConsumedAt;
  }


  public ProjectCreditResponse revokedReason(String revokedReason) {
    
    this.revokedReason = revokedReason;
    return this;
  }

   /**
   * Get revokedReason
   * @return revokedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevokedReason() {
    return revokedReason;
  }


  public void setRevokedReason(String revokedReason) {
    this.revokedReason = revokedReason;
  }


  public ProjectCreditResponse revokedAt(String revokedAt) {
    
    this.revokedAt = revokedAt;
    return this;
  }

   /**
   * Get revokedAt
   * @return revokedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevokedAt() {
    return revokedAt;
  }


  public void setRevokedAt(String revokedAt) {
    this.revokedAt = revokedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreditResponse projectCreditResponse = (ProjectCreditResponse) o;
    return Objects.equals(this.uuid, projectCreditResponse.uuid) &&
        Objects.equals(this.projectUuid, projectCreditResponse.projectUuid) &&
        Objects.equals(this.creditsGranted, projectCreditResponse.creditsGranted) &&
        Objects.equals(this.creditsConsumed, projectCreditResponse.creditsConsumed) &&
        Objects.equals(this.grantedBy, projectCreditResponse.grantedBy) &&
        Objects.equals(this.grantedReason, projectCreditResponse.grantedReason) &&
        Objects.equals(this.grantedAt, projectCreditResponse.grantedAt) &&
        Objects.equals(this.fullyConsumedAt, projectCreditResponse.fullyConsumedAt) &&
        Objects.equals(this.revokedReason, projectCreditResponse.revokedReason) &&
        Objects.equals(this.revokedAt, projectCreditResponse.revokedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, projectUuid, creditsGranted, creditsConsumed, grantedBy, grantedReason, grantedAt, fullyConsumedAt, revokedReason, revokedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreditResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    creditsGranted: ").append(toIndentedString(creditsGranted)).append("\n");
    sb.append("    creditsConsumed: ").append(toIndentedString(creditsConsumed)).append("\n");
    sb.append("    grantedBy: ").append(toIndentedString(grantedBy)).append("\n");
    sb.append("    grantedReason: ").append(toIndentedString(grantedReason)).append("\n");
    sb.append("    grantedAt: ").append(toIndentedString(grantedAt)).append("\n");
    sb.append("    fullyConsumedAt: ").append(toIndentedString(fullyConsumedAt)).append("\n");
    sb.append("    revokedReason: ").append(toIndentedString(revokedReason)).append("\n");
    sb.append("    revokedAt: ").append(toIndentedString(revokedAt)).append("\n");
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
    openapiFields.add("credits_granted");
    openapiFields.add("credits_consumed");
    openapiFields.add("granted_by");
    openapiFields.add("granted_reason");
    openapiFields.add("granted_at");
    openapiFields.add("fully_consumed_at");
    openapiFields.add("revoked_reason");
    openapiFields.add("revoked_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("project_uuid");
    openapiRequiredFields.add("credits_granted");
    openapiRequiredFields.add("granted_by");
    openapiRequiredFields.add("granted_reason");
    openapiRequiredFields.add("granted_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectCreditResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectCreditResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectCreditResponse is not found in the empty JSON string", ProjectCreditResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectCreditResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectCreditResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectCreditResponse.openapiRequiredFields) {
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
      if (jsonObj.get("granted_by") != null && !jsonObj.get("granted_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `granted_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("granted_by").toString()));
      }
      if (jsonObj.get("granted_reason") != null && !jsonObj.get("granted_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `granted_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("granted_reason").toString()));
      }
      if (jsonObj.get("granted_at") != null && !jsonObj.get("granted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `granted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("granted_at").toString()));
      }
      if (jsonObj.get("fully_consumed_at") != null && !jsonObj.get("fully_consumed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fully_consumed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fully_consumed_at").toString()));
      }
      if (jsonObj.get("revoked_reason") != null && !jsonObj.get("revoked_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revoked_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revoked_reason").toString()));
      }
      if (jsonObj.get("revoked_at") != null && !jsonObj.get("revoked_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revoked_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revoked_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreditResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreditResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreditResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreditResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreditResponse>() {
           @Override
           public void write(JsonWriter out, ProjectCreditResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreditResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreditResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreditResponse
  * @throws IOException if the JSON string is invalid with respect to ProjectCreditResponse
  */
  public static ProjectCreditResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreditResponse.class);
  }

 /**
  * Convert an instance of ProjectCreditResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

