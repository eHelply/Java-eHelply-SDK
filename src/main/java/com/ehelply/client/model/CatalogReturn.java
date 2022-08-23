/*
 * eHelply SDK - 1.1.110
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.110
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
 * CatalogReturn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-23T16:22:31.475694Z[Etc/UTC]")
public class CatalogReturn {
  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Object featured;

  public static final String SERIALIZED_NAME_SUB_CATALOGS = "sub_catalogs";
  @SerializedName(SERIALIZED_NAME_SUB_CATALOGS)
  private Object subCatalogs;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_META_UUID = "meta_uuid";
  @SerializedName(SERIALIZED_NAME_META_UUID)
  private String metaUuid;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_PRODUCT_UUIDS = "product_uuids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_UUIDS)
  private List<String> productUuids = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public CatalogReturn() { 
  }

  public CatalogReturn metaData(Object metaData) {
    
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


  public CatalogReturn name(String name) {
    
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


  public CatalogReturn featured(Object featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Special Feature\":\"Plants\"}", value = "")

  public Object getFeatured() {
    return featured;
  }


  public void setFeatured(Object featured) {
    this.featured = featured;
  }


  public CatalogReturn subCatalogs(Object subCatalogs) {
    
    this.subCatalogs = subCatalogs;
    return this;
  }

   /**
   * Get subCatalogs
   * @return subCatalogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Summer Catalog\":[]}", value = "")

  public Object getSubCatalogs() {
    return subCatalogs;
  }


  public void setSubCatalogs(Object subCatalogs) {
    this.subCatalogs = subCatalogs;
  }


  public CatalogReturn uuid(String uuid) {
    
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


  public CatalogReturn metaUuid(String metaUuid) {
    
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


  public CatalogReturn projectUuid(String projectUuid) {
    
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


  public CatalogReturn productUuids(List<String> productUuids) {
    
    this.productUuids = productUuids;
    return this;
  }

  public CatalogReturn addProductUuidsItem(String productUuidsItem) {
    if (this.productUuids == null) {
      this.productUuids = new ArrayList<>();
    }
    this.productUuids.add(productUuidsItem);
    return this;
  }

   /**
   * Get productUuids
   * @return productUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"product_uuid\"]", value = "")

  public List<String> getProductUuids() {
    return productUuids;
  }


  public void setProductUuids(List<String> productUuids) {
    this.productUuids = productUuids;
  }


  public CatalogReturn createdAt(String createdAt) {
    
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


  public CatalogReturn updatedAt(String updatedAt) {
    
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


  public CatalogReturn deletedAt(String deletedAt) {
    
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
    CatalogReturn catalogReturn = (CatalogReturn) o;
    return Objects.equals(this.metaData, catalogReturn.metaData) &&
        Objects.equals(this.name, catalogReturn.name) &&
        Objects.equals(this.featured, catalogReturn.featured) &&
        Objects.equals(this.subCatalogs, catalogReturn.subCatalogs) &&
        Objects.equals(this.uuid, catalogReturn.uuid) &&
        Objects.equals(this.metaUuid, catalogReturn.metaUuid) &&
        Objects.equals(this.projectUuid, catalogReturn.projectUuid) &&
        Objects.equals(this.productUuids, catalogReturn.productUuids) &&
        Objects.equals(this.createdAt, catalogReturn.createdAt) &&
        Objects.equals(this.updatedAt, catalogReturn.updatedAt) &&
        Objects.equals(this.deletedAt, catalogReturn.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, name, featured, subCatalogs, uuid, metaUuid, projectUuid, productUuids, createdAt, updatedAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogReturn {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    subCatalogs: ").append(toIndentedString(subCatalogs)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    metaUuid: ").append(toIndentedString(metaUuid)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    productUuids: ").append(toIndentedString(productUuids)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("featured");
    openapiFields.add("sub_catalogs");
    openapiFields.add("uuid");
    openapiFields.add("meta_uuid");
    openapiFields.add("project_uuid");
    openapiFields.add("product_uuids");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("deleted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("project_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogReturn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CatalogReturn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogReturn is not found in the empty JSON string", CatalogReturn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CatalogReturn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogReturn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogReturn.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
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
      // ensure the json data is an array
      if (jsonObj.get("product_uuids") != null && !jsonObj.get("product_uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_uuids` to be an array in the JSON string but got `%s`", jsonObj.get("product_uuids").toString()));
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
       if (!CatalogReturn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogReturn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogReturn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogReturn.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogReturn>() {
           @Override
           public void write(JsonWriter out, CatalogReturn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogReturn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogReturn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogReturn
  * @throws IOException if the JSON string is invalid with respect to CatalogReturn
  */
  public static CatalogReturn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogReturn.class);
  }

 /**
  * Convert an instance of CatalogReturn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

