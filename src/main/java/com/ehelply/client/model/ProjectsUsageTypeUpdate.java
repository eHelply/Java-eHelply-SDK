/*
 * eHelply SDK - 1.1.84
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.84
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
 * Used for update endpoint
 */
@ApiModel(description = "Used for update endpoint")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T04:19:44.912630Z[Etc/UTC]")
public class ProjectsUsageTypeUpdate {
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
  private List<ProjectsUsageTypeUnitPrice> unitPrices = null;

  public ProjectsUsageTypeUpdate() { 
  }

  public ProjectsUsageTypeUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectsUsageTypeUpdate summary(String summary) {
    
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


  public ProjectsUsageTypeUpdate category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ProjectsUsageTypeUpdate service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public ProjectsUsageTypeUpdate unitPrices(List<ProjectsUsageTypeUnitPrice> unitPrices) {
    
    this.unitPrices = unitPrices;
    return this;
  }

  public ProjectsUsageTypeUpdate addUnitPricesItem(ProjectsUsageTypeUnitPrice unitPricesItem) {
    if (this.unitPrices == null) {
      this.unitPrices = new ArrayList<>();
    }
    this.unitPrices.add(unitPricesItem);
    return this;
  }

   /**
   * Get unitPrices
   * @return unitPrices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ProjectsUsageTypeUpdate projectsUsageTypeUpdate = (ProjectsUsageTypeUpdate) o;
    return Objects.equals(this.name, projectsUsageTypeUpdate.name) &&
        Objects.equals(this.summary, projectsUsageTypeUpdate.summary) &&
        Objects.equals(this.category, projectsUsageTypeUpdate.category) &&
        Objects.equals(this.service, projectsUsageTypeUpdate.service) &&
        Objects.equals(this.unitPrices, projectsUsageTypeUpdate.unitPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, summary, category, service, unitPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsUsageTypeUpdate {\n");
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
    openapiFields.add("name");
    openapiFields.add("summary");
    openapiFields.add("category");
    openapiFields.add("service");
    openapiFields.add("unit_prices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsUsageTypeUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectsUsageTypeUpdate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsUsageTypeUpdate is not found in the empty JSON string", ProjectsUsageTypeUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsUsageTypeUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsUsageTypeUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
       if (!ProjectsUsageTypeUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsUsageTypeUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsUsageTypeUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsUsageTypeUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsUsageTypeUpdate>() {
           @Override
           public void write(JsonWriter out, ProjectsUsageTypeUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsUsageTypeUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsUsageTypeUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsUsageTypeUpdate
  * @throws IOException if the JSON string is invalid with respect to ProjectsUsageTypeUpdate
  */
  public static ProjectsUsageTypeUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsUsageTypeUpdate.class);
  }

 /**
  * Convert an instance of ProjectsUsageTypeUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

