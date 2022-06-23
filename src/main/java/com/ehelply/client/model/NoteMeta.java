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
 * Metadata associated to a note
 */
@ApiModel(description = "Metadata associated to a note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T01:03:17.599283Z[Etc/UTC]")
public class NoteMeta {
  public static final String SERIALIZED_NAME_ORIGINAL_AUTHOR = "original_author";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AUTHOR)
  private String originalAuthor;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_PREVIOUS_VERSION = "previous_version";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VERSION)
  private String previousVersion;

  public static final String SERIALIZED_NAME_NEXT_VERSION = "next_version";
  @SerializedName(SERIALIZED_NAME_NEXT_VERSION)
  private String nextVersion;

  public NoteMeta() { 
  }

  public NoteMeta originalAuthor(String originalAuthor) {
    
    this.originalAuthor = originalAuthor;
    return this;
  }

   /**
   * Get originalAuthor
   * @return originalAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalAuthor() {
    return originalAuthor;
  }


  public void setOriginalAuthor(String originalAuthor) {
    this.originalAuthor = originalAuthor;
  }


  public NoteMeta author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public NoteMeta previousVersion(String previousVersion) {
    
    this.previousVersion = previousVersion;
    return this;
  }

   /**
   * Get previousVersion
   * @return previousVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviousVersion() {
    return previousVersion;
  }


  public void setPreviousVersion(String previousVersion) {
    this.previousVersion = previousVersion;
  }


  public NoteMeta nextVersion(String nextVersion) {
    
    this.nextVersion = nextVersion;
    return this;
  }

   /**
   * Get nextVersion
   * @return nextVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextVersion() {
    return nextVersion;
  }


  public void setNextVersion(String nextVersion) {
    this.nextVersion = nextVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteMeta noteMeta = (NoteMeta) o;
    return Objects.equals(this.originalAuthor, noteMeta.originalAuthor) &&
        Objects.equals(this.author, noteMeta.author) &&
        Objects.equals(this.previousVersion, noteMeta.previousVersion) &&
        Objects.equals(this.nextVersion, noteMeta.nextVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalAuthor, author, previousVersion, nextVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteMeta {\n");
    sb.append("    originalAuthor: ").append(toIndentedString(originalAuthor)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
    sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
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
    openapiFields.add("original_author");
    openapiFields.add("author");
    openapiFields.add("previous_version");
    openapiFields.add("next_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NoteMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NoteMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NoteMeta is not found in the empty JSON string", NoteMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NoteMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NoteMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NoteMeta.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("original_author") != null && !jsonObj.get("original_author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_author").toString()));
      }
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if (jsonObj.get("previous_version") != null && !jsonObj.get("previous_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_version").toString()));
      }
      if (jsonObj.get("next_version") != null && !jsonObj.get("next_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NoteMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NoteMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NoteMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NoteMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<NoteMeta>() {
           @Override
           public void write(JsonWriter out, NoteMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NoteMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NoteMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NoteMeta
  * @throws IOException if the JSON string is invalid with respect to NoteMeta
  */
  public static NoteMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NoteMeta.class);
  }

 /**
  * Convert an instance of NoteMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
