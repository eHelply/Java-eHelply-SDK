/*
 * eHelply SDK - 1.1.121
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.121
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
 * ServiceCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T13:40:23.254235Z[Etc/UTC]")
public class ServiceCreate {
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

  public ServiceCreate() { 
  }

  public ServiceCreate name(String name) {
    
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


  public ServiceCreate key(String key) {
    
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


  public ServiceCreate version(String version) {
    
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


  public ServiceCreate summary(String summary) {
    
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


  public ServiceCreate authors(List<String> authors) {
    
    this.authors = authors;
    return this;
  }

  public ServiceCreate addAuthorsItem(String authorsItem) {
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


  public ServiceCreate authorEmails(List<String> authorEmails) {
    
    this.authorEmails = authorEmails;
    return this;
  }

  public ServiceCreate addAuthorEmailsItem(String authorEmailsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCreate serviceCreate = (ServiceCreate) o;
    return Objects.equals(this.name, serviceCreate.name) &&
        Objects.equals(this.key, serviceCreate.key) &&
        Objects.equals(this.version, serviceCreate.version) &&
        Objects.equals(this.summary, serviceCreate.summary) &&
        Objects.equals(this.authors, serviceCreate.authors) &&
        Objects.equals(this.authorEmails, serviceCreate.authorEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, version, summary, authors, authorEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    authorEmails: ").append(toIndentedString(authorEmails)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to ServiceCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceCreate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceCreate is not found in the empty JSON string", ServiceCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceCreate.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceCreate>() {
           @Override
           public void write(JsonWriter out, ServiceCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceCreate
  * @throws IOException if the JSON string is invalid with respect to ServiceCreate
  */
  public static ServiceCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceCreate.class);
  }

 /**
  * Convert an instance of ServiceCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

