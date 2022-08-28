/*
 * eHelply SDK - 1.1.112
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.112
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
 * SecurityEncryptionKeyGet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-28T15:22:59.625558Z[Etc/UTC]")
public class SecurityEncryptionKeyGet {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_RETRIEVED_AT = "retrieved_at";
  @SerializedName(SERIALIZED_NAME_RETRIEVED_AT)
  private String retrievedAt;

  public SecurityEncryptionKeyGet() { 
  }

  public SecurityEncryptionKeyGet key(String key) {
    
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


  public SecurityEncryptionKeyGet category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public SecurityEncryptionKeyGet createdAt(String createdAt) {
    
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


  public SecurityEncryptionKeyGet retrievedAt(String retrievedAt) {
    
    this.retrievedAt = retrievedAt;
    return this;
  }

   /**
   * Get retrievedAt
   * @return retrievedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRetrievedAt() {
    return retrievedAt;
  }


  public void setRetrievedAt(String retrievedAt) {
    this.retrievedAt = retrievedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityEncryptionKeyGet securityEncryptionKeyGet = (SecurityEncryptionKeyGet) o;
    return Objects.equals(this.key, securityEncryptionKeyGet.key) &&
        Objects.equals(this.category, securityEncryptionKeyGet.category) &&
        Objects.equals(this.createdAt, securityEncryptionKeyGet.createdAt) &&
        Objects.equals(this.retrievedAt, securityEncryptionKeyGet.retrievedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, category, createdAt, retrievedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityEncryptionKeyGet {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    retrievedAt: ").append(toIndentedString(retrievedAt)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("category");
    openapiFields.add("created_at");
    openapiFields.add("retrieved_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("retrieved_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SecurityEncryptionKeyGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SecurityEncryptionKeyGet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecurityEncryptionKeyGet is not found in the empty JSON string", SecurityEncryptionKeyGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SecurityEncryptionKeyGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecurityEncryptionKeyGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SecurityEncryptionKeyGet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("retrieved_at") != null && !jsonObj.get("retrieved_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retrieved_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retrieved_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityEncryptionKeyGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityEncryptionKeyGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityEncryptionKeyGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityEncryptionKeyGet.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityEncryptionKeyGet>() {
           @Override
           public void write(JsonWriter out, SecurityEncryptionKeyGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityEncryptionKeyGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityEncryptionKeyGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityEncryptionKeyGet
  * @throws IOException if the JSON string is invalid with respect to SecurityEncryptionKeyGet
  */
  public static SecurityEncryptionKeyGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityEncryptionKeyGet.class);
  }

 /**
  * Convert an instance of SecurityEncryptionKeyGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

