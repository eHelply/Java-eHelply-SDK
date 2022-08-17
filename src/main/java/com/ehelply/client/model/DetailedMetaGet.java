/*
 * eHelply SDK - 1.1.108
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.108
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
 * Detailed meta based on Notes
 */
@ApiModel(description = "Detailed meta based on Notes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T19:57:27.600683Z[Etc/UTC]")
public class DetailedMetaGet {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUMMARY_HISTORY = "summary_history";
  @SerializedName(SERIALIZED_NAME_SUMMARY_HISTORY)
  private List<String> summaryHistory = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_HISTORY = "description_history";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_HISTORY)
  private List<String> descriptionHistory = null;

  public DetailedMetaGet() { 
  }

  public DetailedMetaGet summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public DetailedMetaGet description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DetailedMetaGet summaryHistory(List<String> summaryHistory) {
    
    this.summaryHistory = summaryHistory;
    return this;
  }

  public DetailedMetaGet addSummaryHistoryItem(String summaryHistoryItem) {
    if (this.summaryHistory == null) {
      this.summaryHistory = new ArrayList<>();
    }
    this.summaryHistory.add(summaryHistoryItem);
    return this;
  }

   /**
   * Get summaryHistory
   * @return summaryHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSummaryHistory() {
    return summaryHistory;
  }


  public void setSummaryHistory(List<String> summaryHistory) {
    this.summaryHistory = summaryHistory;
  }


  public DetailedMetaGet descriptionHistory(List<String> descriptionHistory) {
    
    this.descriptionHistory = descriptionHistory;
    return this;
  }

  public DetailedMetaGet addDescriptionHistoryItem(String descriptionHistoryItem) {
    if (this.descriptionHistory == null) {
      this.descriptionHistory = new ArrayList<>();
    }
    this.descriptionHistory.add(descriptionHistoryItem);
    return this;
  }

   /**
   * Get descriptionHistory
   * @return descriptionHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionHistory() {
    return descriptionHistory;
  }


  public void setDescriptionHistory(List<String> descriptionHistory) {
    this.descriptionHistory = descriptionHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedMetaGet detailedMetaGet = (DetailedMetaGet) o;
    return Objects.equals(this.summary, detailedMetaGet.summary) &&
        Objects.equals(this.description, detailedMetaGet.description) &&
        Objects.equals(this.summaryHistory, detailedMetaGet.summaryHistory) &&
        Objects.equals(this.descriptionHistory, detailedMetaGet.descriptionHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, description, summaryHistory, descriptionHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedMetaGet {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    summaryHistory: ").append(toIndentedString(summaryHistory)).append("\n");
    sb.append("    descriptionHistory: ").append(toIndentedString(descriptionHistory)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("description");
    openapiFields.add("summary_history");
    openapiFields.add("description_history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DetailedMetaGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DetailedMetaGet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailedMetaGet is not found in the empty JSON string", DetailedMetaGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DetailedMetaGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetailedMetaGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("summary_history") != null && !jsonObj.get("summary_history").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary_history` to be an array in the JSON string but got `%s`", jsonObj.get("summary_history").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("description_history") != null && !jsonObj.get("description_history").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `description_history` to be an array in the JSON string but got `%s`", jsonObj.get("description_history").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailedMetaGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailedMetaGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailedMetaGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailedMetaGet.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailedMetaGet>() {
           @Override
           public void write(JsonWriter out, DetailedMetaGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailedMetaGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DetailedMetaGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DetailedMetaGet
  * @throws IOException if the JSON string is invalid with respect to DetailedMetaGet
  */
  public static DetailedMetaGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailedMetaGet.class);
  }

 /**
  * Convert an instance of DetailedMetaGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

