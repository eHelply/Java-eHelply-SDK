/*
 * eHelply SDK - 1.1.103
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.103
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
 * Detailed meta based on Notes
 */
@ApiModel(description = "Detailed meta based on Notes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:54:34.967430Z[Etc/UTC]")
public class DetailedMeta {
  public static final String SERIALIZED_NAME_SUMMARY_UUID = "summary_uuid";
  @SerializedName(SERIALIZED_NAME_SUMMARY_UUID)
  private String summaryUuid;

  public static final String SERIALIZED_NAME_DESCRIPTION_UUID = "description_uuid";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_UUID)
  private String descriptionUuid;

  public DetailedMeta() { 
  }

  public DetailedMeta summaryUuid(String summaryUuid) {
    
    this.summaryUuid = summaryUuid;
    return this;
  }

   /**
   * Get summaryUuid
   * @return summaryUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummaryUuid() {
    return summaryUuid;
  }


  public void setSummaryUuid(String summaryUuid) {
    this.summaryUuid = summaryUuid;
  }


  public DetailedMeta descriptionUuid(String descriptionUuid) {
    
    this.descriptionUuid = descriptionUuid;
    return this;
  }

   /**
   * Get descriptionUuid
   * @return descriptionUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionUuid() {
    return descriptionUuid;
  }


  public void setDescriptionUuid(String descriptionUuid) {
    this.descriptionUuid = descriptionUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedMeta detailedMeta = (DetailedMeta) o;
    return Objects.equals(this.summaryUuid, detailedMeta.summaryUuid) &&
        Objects.equals(this.descriptionUuid, detailedMeta.descriptionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryUuid, descriptionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedMeta {\n");
    sb.append("    summaryUuid: ").append(toIndentedString(summaryUuid)).append("\n");
    sb.append("    descriptionUuid: ").append(toIndentedString(descriptionUuid)).append("\n");
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
    openapiFields.add("summary_uuid");
    openapiFields.add("description_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DetailedMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DetailedMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailedMeta is not found in the empty JSON string", DetailedMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DetailedMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetailedMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("summary_uuid") != null && !jsonObj.get("summary_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary_uuid").toString()));
      }
      if (jsonObj.get("description_uuid") != null && !jsonObj.get("description_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailedMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailedMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailedMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailedMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailedMeta>() {
           @Override
           public void write(JsonWriter out, DetailedMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailedMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DetailedMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DetailedMeta
  * @throws IOException if the JSON string is invalid with respect to DetailedMeta
  */
  public static DetailedMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedMeta.class);
  }

 /**
  * Convert an instance of DetailedMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

