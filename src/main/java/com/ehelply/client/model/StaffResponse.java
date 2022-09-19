/*
 * eHelply SDK - 1.1.107
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.107
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
 * **:param** uuid                                **type:** string **:param** project_uuid                        **type:** string or None  **:param** entity                              **type:** string or None  **:param** place                               **type:** string or None  **:param** company                             **type:** string or None  **:param** schedule                            **type:** string or None  **:param** catalog                             **type:** string or None  **:param** reviews                             **type:** string or None  **:param** created_at                          **type:** string or None  **:param** updated_at                          **type:** string or None  **:param** deleted_at                          **type:** string or None
 */
@ApiModel(description = "**:param** uuid                                **type:** string **:param** project_uuid                        **type:** string or None  **:param** entity                              **type:** string or None  **:param** place                               **type:** string or None  **:param** company                             **type:** string or None  **:param** schedule                            **type:** string or None  **:param** catalog                             **type:** string or None  **:param** reviews                             **type:** string or None  **:param** created_at                          **type:** string or None  **:param** updated_at                          **type:** string or None  **:param** deleted_at                          **type:** string or None")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-19T00:13:08.392559Z[Etc/UTC]")
public class StaffResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private Object entity;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private Object place;

  public static final String SERIALIZED_NAME_PLACE_ROLES = "place_roles";
  @SerializedName(SERIALIZED_NAME_PLACE_ROLES)
  private List<String> placeRoles = null;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private Object company;

  public static final String SERIALIZED_NAME_COMPANY_ROLES = "company_roles";
  @SerializedName(SERIALIZED_NAME_COMPANY_ROLES)
  private List<String> companyRoles = null;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private Object schedule;

  public static final String SERIALIZED_NAME_CATALOG = "catalog";
  @SerializedName(SERIALIZED_NAME_CATALOG)
  private Object catalog;

  public static final String SERIALIZED_NAME_REVIEWS = "reviews";
  @SerializedName(SERIALIZED_NAME_REVIEWS)
  private Object reviews;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public StaffResponse() { 
  }

  public StaffResponse uuid(String uuid) {
    
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


  public StaffResponse projectUuid(String projectUuid) {
    
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


  public StaffResponse entity(Object entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getEntity() {
    return entity;
  }


  public void setEntity(Object entity) {
    this.entity = entity;
  }


  public StaffResponse place(Object place) {
    
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getPlace() {
    return place;
  }


  public void setPlace(Object place) {
    this.place = place;
  }


  public StaffResponse placeRoles(List<String> placeRoles) {
    
    this.placeRoles = placeRoles;
    return this;
  }

  public StaffResponse addPlaceRolesItem(String placeRolesItem) {
    if (this.placeRoles == null) {
      this.placeRoles = new ArrayList<>();
    }
    this.placeRoles.add(placeRolesItem);
    return this;
  }

   /**
   * Get placeRoles
   * @return placeRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<String> getPlaceRoles() {
    return placeRoles;
  }


  public void setPlaceRoles(List<String> placeRoles) {
    this.placeRoles = placeRoles;
  }


  public StaffResponse company(Object company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getCompany() {
    return company;
  }


  public void setCompany(Object company) {
    this.company = company;
  }


  public StaffResponse companyRoles(List<String> companyRoles) {
    
    this.companyRoles = companyRoles;
    return this;
  }

  public StaffResponse addCompanyRolesItem(String companyRolesItem) {
    if (this.companyRoles == null) {
      this.companyRoles = new ArrayList<>();
    }
    this.companyRoles.add(companyRolesItem);
    return this;
  }

   /**
   * Get companyRoles
   * @return companyRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<String> getCompanyRoles() {
    return companyRoles;
  }


  public void setCompanyRoles(List<String> companyRoles) {
    this.companyRoles = companyRoles;
  }


  public StaffResponse schedule(Object schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getSchedule() {
    return schedule;
  }


  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }


  public StaffResponse catalog(Object catalog) {
    
    this.catalog = catalog;
    return this;
  }

   /**
   * Get catalog
   * @return catalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getCatalog() {
    return catalog;
  }


  public void setCatalog(Object catalog) {
    this.catalog = catalog;
  }


  public StaffResponse reviews(Object reviews) {
    
    this.reviews = reviews;
    return this;
  }

   /**
   * Get reviews
   * @return reviews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getReviews() {
    return reviews;
  }


  public void setReviews(Object reviews) {
    this.reviews = reviews;
  }


  public StaffResponse createdAt(String createdAt) {
    
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


  public StaffResponse updatedAt(String updatedAt) {
    
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


  public StaffResponse deletedAt(String deletedAt) {
    
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
    StaffResponse staffResponse = (StaffResponse) o;
    return Objects.equals(this.uuid, staffResponse.uuid) &&
        Objects.equals(this.projectUuid, staffResponse.projectUuid) &&
        Objects.equals(this.entity, staffResponse.entity) &&
        Objects.equals(this.place, staffResponse.place) &&
        Objects.equals(this.placeRoles, staffResponse.placeRoles) &&
        Objects.equals(this.company, staffResponse.company) &&
        Objects.equals(this.companyRoles, staffResponse.companyRoles) &&
        Objects.equals(this.schedule, staffResponse.schedule) &&
        Objects.equals(this.catalog, staffResponse.catalog) &&
        Objects.equals(this.reviews, staffResponse.reviews) &&
        Objects.equals(this.createdAt, staffResponse.createdAt) &&
        Objects.equals(this.updatedAt, staffResponse.updatedAt) &&
        Objects.equals(this.deletedAt, staffResponse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, projectUuid, entity, place, placeRoles, company, companyRoles, schedule, catalog, reviews, createdAt, updatedAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    placeRoles: ").append(toIndentedString(placeRoles)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyRoles: ").append(toIndentedString(companyRoles)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("place");
    openapiFields.add("place_roles");
    openapiFields.add("company");
    openapiFields.add("company_roles");
    openapiFields.add("schedule");
    openapiFields.add("catalog");
    openapiFields.add("reviews");
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
  * @throws IOException if the JSON Object is invalid with respect to StaffResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StaffResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StaffResponse is not found in the empty JSON string", StaffResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StaffResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StaffResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StaffResponse.openapiRequiredFields) {
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
      // ensure the json data is an array
      if (jsonObj.get("place_roles") != null && !jsonObj.get("place_roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_roles` to be an array in the JSON string but got `%s`", jsonObj.get("place_roles").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("company_roles") != null && !jsonObj.get("company_roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_roles` to be an array in the JSON string but got `%s`", jsonObj.get("company_roles").toString()));
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
       if (!StaffResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaffResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaffResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaffResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StaffResponse>() {
           @Override
           public void write(JsonWriter out, StaffResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaffResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaffResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaffResponse
  * @throws IOException if the JSON string is invalid with respect to StaffResponse
  */
  public static StaffResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaffResponse.class);
  }

 /**
  * Convert an instance of StaffResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

