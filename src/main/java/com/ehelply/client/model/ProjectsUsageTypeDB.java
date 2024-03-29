/*
 * eHelply SDK - 1.1.118
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.118
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.ProjectsUsageTypeUnitPrice;
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
 * Used for DB row entry
 */
@ApiModel(description = "Used for DB row entry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T16:17:48.272343Z[Etc/UTC]")
public class ProjectsUsageTypeDB {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_UNIT_PRICES = "unit_prices";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICES)
  private List<ProjectsUsageTypeUnitPrice> unitPrices = new ArrayList<>();

  public ProjectsUsageTypeDB() { 
  }

  public ProjectsUsageTypeDB key(String key) {
    
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


  public ProjectsUsageTypeDB name(String name) {
    
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


  public ProjectsUsageTypeDB summary(String summary) {
    
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


  public ProjectsUsageTypeDB category(String category) {
    
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


  public ProjectsUsageTypeDB service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public ProjectsUsageTypeDB unitPrices(List<ProjectsUsageTypeUnitPrice> unitPrices) {
    
    this.unitPrices = unitPrices;
    return this;
  }

  public ProjectsUsageTypeDB addUnitPricesItem(ProjectsUsageTypeUnitPrice unitPricesItem) {
    this.unitPrices.add(unitPricesItem);
    return this;
  }

   /**
   * Get unitPrices
   * @return unitPrices
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ProjectsUsageTypeUnitPrice> getUnitPrices() {
    return unitPrices;
  }


  public void setUnitPrices(List<ProjectsUsageTypeUnitPrice> unitPrices) {
    this.unitPrices = unitPrices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsUsageTypeDB projectsUsageTypeDB = (ProjectsUsageTypeDB) o;
    return Objects.equals(this.key, projectsUsageTypeDB.key) &&
        Objects.equals(this.name, projectsUsageTypeDB.name) &&
        Objects.equals(this.summary, projectsUsageTypeDB.summary) &&
        Objects.equals(this.category, projectsUsageTypeDB.category) &&
        Objects.equals(this.service, projectsUsageTypeDB.service) &&
        Objects.equals(this.unitPrices, projectsUsageTypeDB.unitPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, summary, category, service, unitPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsUsageTypeDB {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    unitPrices: ").append(toIndentedString(unitPrices)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("summary");
    openapiFields.add("category");
    openapiFields.add("service");
    openapiFields.add("unit_prices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("service");
    openapiRequiredFields.add("unit_prices");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsUsageTypeDB
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectsUsageTypeDB.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsUsageTypeDB is not found in the empty JSON string", ProjectsUsageTypeDB.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsUsageTypeDB.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsUsageTypeDB` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsUsageTypeDB.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      JsonArray jsonArrayunitPrices = jsonObj.getAsJsonArray("unit_prices");
      if (jsonArrayunitPrices != null) {
        // ensure the json data is an array
        if (!jsonObj.get("unit_prices").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `unit_prices` to be an array in the JSON string but got `%s`", jsonObj.get("unit_prices").toString()));
        }

        // validate the optional field `unit_prices` (array)
        for (int i = 0; i < jsonArrayunitPrices.size(); i++) {
          ProjectsUsageTypeUnitPrice.validateJsonObject(jsonArrayunitPrices.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsUsageTypeDB.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsUsageTypeDB' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsUsageTypeDB> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsUsageTypeDB.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsUsageTypeDB>() {
           @Override
           public void write(JsonWriter out, ProjectsUsageTypeDB value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsUsageTypeDB read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsUsageTypeDB given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsUsageTypeDB
  * @throws IOException if the JSON string is invalid with respect to ProjectsUsageTypeDB
  */
  public static ProjectsUsageTypeDB fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsUsageTypeDB.class);
  }

 /**
  * Convert an instance of ProjectsUsageTypeDB to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

