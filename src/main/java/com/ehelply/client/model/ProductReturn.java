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
 * ProductReturn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T13:40:23.254235Z[Etc/UTC]")
public class ProductReturn {
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

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_META_UUID = "meta_uuid";
  @SerializedName(SERIALIZED_NAME_META_UUID)
  private String metaUuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_CATALOG_UUID = "catalog_uuid";
  @SerializedName(SERIALIZED_NAME_CATALOG_UUID)
  private String catalogUuid;

  public static final String SERIALIZED_NAME_ADDON_LIST = "addon_list";
  @SerializedName(SERIALIZED_NAME_ADDON_LIST)
  private List<Object> addonList = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public ProductReturn() { 
  }

  public ProductReturn metaData(Object metaData) {
    
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


  public ProductReturn collectionUuid(String collectionUuid) {
    
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


  public ProductReturn reviewGroupUuid(String reviewGroupUuid) {
    
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


  public ProductReturn addons(List<String> addons) {
    
    this.addons = addons;
    return this;
  }

  public ProductReturn addAddonsItem(String addonsItem) {
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


  public ProductReturn name(String name) {
    
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


  public ProductReturn price(Integer price) {
    
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


  public ProductReturn quantityForPublic(Integer quantityForPublic) {
    
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


  public ProductReturn uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "uuid", required = true, value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ProductReturn metaUuid(String metaUuid) {
    
    this.metaUuid = metaUuid;
    return this;
  }

   /**
   * Get metaUuid
   * @return metaUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "meta_uuid", value = "")

  public String getMetaUuid() {
    return metaUuid;
  }


  public void setMetaUuid(String metaUuid) {
    this.metaUuid = metaUuid;
  }


  public ProductReturn projectUuid(String projectUuid) {
    
    this.projectUuid = projectUuid;
    return this;
  }

   /**
   * Get projectUuid
   * @return projectUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "project_uuid", required = true, value = "")

  public String getProjectUuid() {
    return projectUuid;
  }


  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }


  public ProductReturn catalogUuid(String catalogUuid) {
    
    this.catalogUuid = catalogUuid;
    return this;
  }

   /**
   * Get catalogUuid
   * @return catalogUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "catalog_uuid", value = "")

  public String getCatalogUuid() {
    return catalogUuid;
  }


  public void setCatalogUuid(String catalogUuid) {
    this.catalogUuid = catalogUuid;
  }


  public ProductReturn addonList(List<Object> addonList) {
    
    this.addonList = addonList;
    return this;
  }

  public ProductReturn addAddonListItem(Object addonListItem) {
    if (this.addonList == null) {
      this.addonList = new ArrayList<>();
    }
    this.addonList.add(addonListItem);
    return this;
  }

   /**
   * Get addonList
   * @return addonList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Object> getAddonList() {
    return addonList;
  }


  public void setAddonList(List<Object> addonList) {
    this.addonList = addonList;
  }


  public ProductReturn createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ProductReturn updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ProductReturn deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-27T12:00:00.000000", value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReturn productReturn = (ProductReturn) o;
    return Objects.equals(this.metaData, productReturn.metaData) &&
        Objects.equals(this.collectionUuid, productReturn.collectionUuid) &&
        Objects.equals(this.reviewGroupUuid, productReturn.reviewGroupUuid) &&
        Objects.equals(this.addons, productReturn.addons) &&
        Objects.equals(this.name, productReturn.name) &&
        Objects.equals(this.price, productReturn.price) &&
        Objects.equals(this.quantityForPublic, productReturn.quantityForPublic) &&
        Objects.equals(this.uuid, productReturn.uuid) &&
        Objects.equals(this.metaUuid, productReturn.metaUuid) &&
        Objects.equals(this.projectUuid, productReturn.projectUuid) &&
        Objects.equals(this.catalogUuid, productReturn.catalogUuid) &&
        Objects.equals(this.addonList, productReturn.addonList) &&
        Objects.equals(this.createdAt, productReturn.createdAt) &&
        Objects.equals(this.updatedAt, productReturn.updatedAt) &&
        Objects.equals(this.deletedAt, productReturn.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, collectionUuid, reviewGroupUuid, addons, name, price, quantityForPublic, uuid, metaUuid, projectUuid, catalogUuid, addonList, createdAt, updatedAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReturn {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    collectionUuid: ").append(toIndentedString(collectionUuid)).append("\n");
    sb.append("    reviewGroupUuid: ").append(toIndentedString(reviewGroupUuid)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantityForPublic: ").append(toIndentedString(quantityForPublic)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metaUuid: ").append(toIndentedString(metaUuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    catalogUuid: ").append(toIndentedString(catalogUuid)).append("\n");
    sb.append("    addonList: ").append(toIndentedString(addonList)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("meta_uuid");
    openapiFields.add("project_uuid");
    openapiFields.add("catalog_uuid");
    openapiFields.add("addon_list");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("deleted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("quantity_for_public");
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("project_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductReturn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductReturn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductReturn is not found in the empty JSON string", ProductReturn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProductReturn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductReturn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductReturn.openapiRequiredFields) {
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
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("meta_uuid") != null && !jsonObj.get("meta_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meta_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meta_uuid").toString()));
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
      if (jsonObj.get("catalog_uuid") != null && !jsonObj.get("catalog_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_uuid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("addon_list") != null && !jsonObj.get("addon_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addon_list` to be an array in the JSON string but got `%s`", jsonObj.get("addon_list").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if (jsonObj.get("deleted_at") != null && !jsonObj.get("deleted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleted_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductReturn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductReturn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductReturn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductReturn.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductReturn>() {
           @Override
           public void write(JsonWriter out, ProductReturn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductReturn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductReturn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductReturn
  * @throws IOException if the JSON string is invalid with respect to ProductReturn
  */
  public static ProductReturn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductReturn.class);
  }

 /**
  * Convert an instance of ProductReturn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

