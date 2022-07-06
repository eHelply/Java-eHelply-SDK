/*
 * eHelply SDK - 1.1.85
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.85
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
 * ProductBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-06T17:41:46.288135Z[Etc/UTC]")
public class ProductBase {
  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData;

  public static final String SERIALIZED_NAME_COLLECTION_UUID = "collection_uuid";
  @SerializedName(SERIALIZED_NAME_COLLECTION_UUID)
  private String collectionUuid;

  public static final String SERIALIZED_NAME_REVIEW_GROUP_UUID = "review_group_uuid";
  @SerializedName(SERIALIZED_NAME_REVIEW_GROUP_UUID)
  private String reviewGroupUuid;

  public static final String SERIALIZED_NAME_ADDONS = "addons";
  @SerializedName(SERIALIZED_NAME_ADDONS)
  private List<String> addons = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_QUANTITY_FOR_PUBLIC = "quantity_for_public";
  @SerializedName(SERIALIZED_NAME_QUANTITY_FOR_PUBLIC)
  private Integer quantityForPublic;

  public ProductBase() { 
  }

  public ProductBase metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public ProductBase collectionUuid(String collectionUuid) {
    
    this.collectionUuid = collectionUuid;
    return this;
  }

   /**
   * Get collectionUuid
   * @return collectionUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "collection_uuid", value = "")

  public String getCollectionUuid() {
    return collectionUuid;
  }


  public void setCollectionUuid(String collectionUuid) {
    this.collectionUuid = collectionUuid;
  }


  public ProductBase reviewGroupUuid(String reviewGroupUuid) {
    
    this.reviewGroupUuid = reviewGroupUuid;
    return this;
  }

   /**
   * Get reviewGroupUuid
   * @return reviewGroupUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "review_group_uuid", value = "")

  public String getReviewGroupUuid() {
    return reviewGroupUuid;
  }


  public void setReviewGroupUuid(String reviewGroupUuid) {
    this.reviewGroupUuid = reviewGroupUuid;
  }


  public ProductBase addons(List<String> addons) {
    
    this.addons = addons;
    return this;
  }

  public ProductBase addAddonsItem(String addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Get addons
   * @return addons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"addon1\",\"addon_uuid\"]", value = "")

  public List<String> getAddons() {
    return addons;
  }


  public void setAddons(List<String> addons) {
    this.addons = addons;
  }


  public ProductBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Product Name", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductBase price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "")

  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public ProductBase quantityForPublic(Integer quantityForPublic) {
    
    this.quantityForPublic = quantityForPublic;
    return this;
  }

   /**
   * Get quantityForPublic
   * @return quantityForPublic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "")

  public Integer getQuantityForPublic() {
    return quantityForPublic;
  }


  public void setQuantityForPublic(Integer quantityForPublic) {
    this.quantityForPublic = quantityForPublic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBase productBase = (ProductBase) o;
    return Objects.equals(this.metaData, productBase.metaData) &&
        Objects.equals(this.collectionUuid, productBase.collectionUuid) &&
        Objects.equals(this.reviewGroupUuid, productBase.reviewGroupUuid) &&
        Objects.equals(this.addons, productBase.addons) &&
        Objects.equals(this.name, productBase.name) &&
        Objects.equals(this.price, productBase.price) &&
        Objects.equals(this.quantityForPublic, productBase.quantityForPublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, collectionUuid, reviewGroupUuid, addons, name, price, quantityForPublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBase {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    collectionUuid: ").append(toIndentedString(collectionUuid)).append("\n");
    sb.append("    reviewGroupUuid: ").append(toIndentedString(reviewGroupUuid)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantityForPublic: ").append(toIndentedString(quantityForPublic)).append("\n");
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
    openapiFields.add("meta_data");
    openapiFields.add("collection_uuid");
    openapiFields.add("review_group_uuid");
    openapiFields.add("addons");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("quantity_for_public");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("quantity_for_public");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductBase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductBase is not found in the empty JSON string", ProductBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("collection_uuid") != null && !jsonObj.get("collection_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collection_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collection_uuid").toString()));
      }
      if (jsonObj.get("review_group_uuid") != null && !jsonObj.get("review_group_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_group_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_group_uuid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("addons") != null && !jsonObj.get("addons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addons` to be an array in the JSON string but got `%s`", jsonObj.get("addons").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductBase>() {
           @Override
           public void write(JsonWriter out, ProductBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductBase
  * @throws IOException if the JSON string is invalid with respect to ProductBase
  */
  public static ProductBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductBase.class);
  }

 /**
  * Convert an instance of ProductBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

