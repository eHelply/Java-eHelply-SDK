/*
 * eHelply SDK - 1.1.98
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.98
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.AlarmResponse;
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
 * ServiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:54:36.352081Z[Etc/UTC]")
public class ServiceResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_AUTHORS = "authors";
  @SerializedName(SERIALIZED_NAME_AUTHORS)
  private List<String> authors = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHOR_EMAILS = "author_emails";
  @SerializedName(SERIALIZED_NAME_AUTHOR_EMAILS)
  private List<String> authorEmails = new ArrayList<>();

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_HEARTBEATS = "heartbeats";
  @SerializedName(SERIALIZED_NAME_HEARTBEATS)
  private List<Object> heartbeats = null;

  public static final String SERIALIZED_NAME_ALARMS = "alarms";
  @SerializedName(SERIALIZED_NAME_ALARMS)
  private List<AlarmResponse> alarms = null;

  public static final String SERIALIZED_NAME_HIDDEN_STAGES = "hidden_stages";
  @SerializedName(SERIALIZED_NAME_HIDDEN_STAGES)
  private List<String> hiddenStages = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public ServiceResponse() { 
  }

  public ServiceResponse name(String name) {
    
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


  public ServiceResponse key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ServiceResponse version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ServiceResponse summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public ServiceResponse authors(List<String> authors) {
    
    this.authors = authors;
    return this;
  }

  public ServiceResponse addAuthorsItem(String authorsItem) {
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Get authors
   * @return authors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAuthors() {
    return authors;
  }


  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }


  public ServiceResponse authorEmails(List<String> authorEmails) {
    
    this.authorEmails = authorEmails;
    return this;
  }

  public ServiceResponse addAuthorEmailsItem(String authorEmailsItem) {
    this.authorEmails.add(authorEmailsItem);
    return this;
  }

   /**
   * Get authorEmails
   * @return authorEmails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAuthorEmails() {
    return authorEmails;
  }


  public void setAuthorEmails(List<String> authorEmails) {
    this.authorEmails = authorEmails;
  }


  public ServiceResponse uuid(String uuid) {
    
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


  public ServiceResponse heartbeats(List<Object> heartbeats) {
    
    this.heartbeats = heartbeats;
    return this;
  }

  public ServiceResponse addHeartbeatsItem(Object heartbeatsItem) {
    if (this.heartbeats == null) {
      this.heartbeats = new ArrayList<>();
    }
    this.heartbeats.add(heartbeatsItem);
    return this;
  }

   /**
   * Get heartbeats
   * @return heartbeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getHeartbeats() {
    return heartbeats;
  }


  public void setHeartbeats(List<Object> heartbeats) {
    this.heartbeats = heartbeats;
  }


  public ServiceResponse alarms(List<AlarmResponse> alarms) {
    
    this.alarms = alarms;
    return this;
  }

  public ServiceResponse addAlarmsItem(AlarmResponse alarmsItem) {
    if (this.alarms == null) {
      this.alarms = new ArrayList<>();
    }
    this.alarms.add(alarmsItem);
    return this;
  }

   /**
   * Get alarms
   * @return alarms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlarmResponse> getAlarms() {
    return alarms;
  }


  public void setAlarms(List<AlarmResponse> alarms) {
    this.alarms = alarms;
  }


  public ServiceResponse hiddenStages(List<String> hiddenStages) {
    
    this.hiddenStages = hiddenStages;
    return this;
  }

  public ServiceResponse addHiddenStagesItem(String hiddenStagesItem) {
    if (this.hiddenStages == null) {
      this.hiddenStages = new ArrayList<>();
    }
    this.hiddenStages.add(hiddenStagesItem);
    return this;
  }

   /**
   * Get hiddenStages
   * @return hiddenStages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHiddenStages() {
    return hiddenStages;
  }


  public void setHiddenStages(List<String> hiddenStages) {
    this.hiddenStages = hiddenStages;
  }


  public ServiceResponse createdAt(String createdAt) {
    
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


  public ServiceResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceResponse serviceResponse = (ServiceResponse) o;
    return Objects.equals(this.name, serviceResponse.name) &&
        Objects.equals(this.key, serviceResponse.key) &&
        Objects.equals(this.version, serviceResponse.version) &&
        Objects.equals(this.summary, serviceResponse.summary) &&
        Objects.equals(this.authors, serviceResponse.authors) &&
        Objects.equals(this.authorEmails, serviceResponse.authorEmails) &&
        Objects.equals(this.uuid, serviceResponse.uuid) &&
        Objects.equals(this.heartbeats, serviceResponse.heartbeats) &&
        Objects.equals(this.alarms, serviceResponse.alarms) &&
        Objects.equals(this.hiddenStages, serviceResponse.hiddenStages) &&
        Objects.equals(this.createdAt, serviceResponse.createdAt) &&
        Objects.equals(this.updatedAt, serviceResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, version, summary, authors, authorEmails, uuid, heartbeats, alarms, hiddenStages, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceResponse {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    authorEmails: ").append(toIndentedString(authorEmails)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    heartbeats: ").append(toIndentedString(heartbeats)).append("\n");
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
    sb.append("    hiddenStages: ").append(toIndentedString(hiddenStages)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("key");
    openapiFields.add("version");
    openapiFields.add("summary");
    openapiFields.add("authors");
    openapiFields.add("author_emails");
    openapiFields.add("uuid");
    openapiFields.add("heartbeats");
    openapiFields.add("alarms");
    openapiFields.add("hidden_stages");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("authors");
    openapiRequiredFields.add("author_emails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceResponse is not found in the empty JSON string", ServiceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("authors") != null && !jsonObj.get("authors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authors` to be an array in the JSON string but got `%s`", jsonObj.get("authors").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("author_emails") != null && !jsonObj.get("author_emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `author_emails` to be an array in the JSON string but got `%s`", jsonObj.get("author_emails").toString()));
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("heartbeats") != null && !jsonObj.get("heartbeats").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `heartbeats` to be an array in the JSON string but got `%s`", jsonObj.get("heartbeats").toString()));
      }
      JsonArray jsonArrayalarms = jsonObj.getAsJsonArray("alarms");
      if (jsonArrayalarms != null) {
        // ensure the json data is an array
        if (!jsonObj.get("alarms").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `alarms` to be an array in the JSON string but got `%s`", jsonObj.get("alarms").toString()));
        }

        // validate the optional field `alarms` (array)
        for (int i = 0; i < jsonArrayalarms.size(); i++) {
          AlarmResponse.validateJsonObject(jsonArrayalarms.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("hidden_stages") != null && !jsonObj.get("hidden_stages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hidden_stages` to be an array in the JSON string but got `%s`", jsonObj.get("hidden_stages").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceResponse>() {
           @Override
           public void write(JsonWriter out, ServiceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceResponse
  * @throws IOException if the JSON string is invalid with respect to ServiceResponse
  */
  public static ServiceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceResponse.class);
  }

 /**
  * Convert an instance of ServiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

