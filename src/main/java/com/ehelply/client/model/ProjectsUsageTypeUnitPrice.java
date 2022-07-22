/*
 * eHelply SDK - 1.1.97
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.97
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
 * ProjectsUsageTypeUnitPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-22T22:10:54.965733Z[Etc/UTC]")
public class ProjectsUsageTypeUnitPrice {
  public static final String SERIALIZED_NAME_MIN_QUANTITY = "min_quantity";
  @SerializedName(SERIALIZED_NAME_MIN_QUANTITY)
  private Integer minQuantity;

  public static final String SERIALIZED_NAME_MAX_QUANTITY = "max_quantity";
  @SerializedName(SERIALIZED_NAME_MAX_QUANTITY)
  private Integer maxQuantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Integer unitPrice;

  public ProjectsUsageTypeUnitPrice() { 
  }

  public ProjectsUsageTypeUnitPrice minQuantity(Integer minQuantity) {
    
    this.minQuantity = minQuantity;
    return this;
  }

   /**
   * Get minQuantity
   * @return minQuantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMinQuantity() {
    return minQuantity;
  }


  public void setMinQuantity(Integer minQuantity) {
    this.minQuantity = minQuantity;
  }


  public ProjectsUsageTypeUnitPrice maxQuantity(Integer maxQuantity) {
    
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * Get maxQuantity
   * @return maxQuantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxQuantity() {
    return maxQuantity;
  }


  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }


  public ProjectsUsageTypeUnitPrice unitPrice(Integer unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Integer unitPrice) {
    this.unitPrice = unitPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsUsageTypeUnitPrice projectsUsageTypeUnitPrice = (ProjectsUsageTypeUnitPrice) o;
    return Objects.equals(this.minQuantity, projectsUsageTypeUnitPrice.minQuantity) &&
        Objects.equals(this.maxQuantity, projectsUsageTypeUnitPrice.maxQuantity) &&
        Objects.equals(this.unitPrice, projectsUsageTypeUnitPrice.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minQuantity, maxQuantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsUsageTypeUnitPrice {\n");
    sb.append("    minQuantity: ").append(toIndentedString(minQuantity)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
    openapiFields.add("min_quantity");
    openapiFields.add("max_quantity");
    openapiFields.add("unit_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min_quantity");
    openapiRequiredFields.add("max_quantity");
    openapiRequiredFields.add("unit_price");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsUsageTypeUnitPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectsUsageTypeUnitPrice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsUsageTypeUnitPrice is not found in the empty JSON string", ProjectsUsageTypeUnitPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectsUsageTypeUnitPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectsUsageTypeUnitPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsUsageTypeUnitPrice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsUsageTypeUnitPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsUsageTypeUnitPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsUsageTypeUnitPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsUsageTypeUnitPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsUsageTypeUnitPrice>() {
           @Override
           public void write(JsonWriter out, ProjectsUsageTypeUnitPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectsUsageTypeUnitPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectsUsageTypeUnitPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsUsageTypeUnitPrice
  * @throws IOException if the JSON string is invalid with respect to ProjectsUsageTypeUnitPrice
  */
  public static ProjectsUsageTypeUnitPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsUsageTypeUnitPrice.class);
  }

 /**
  * Convert an instance of ProjectsUsageTypeUnitPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

