/*
 * eHelply SDK - 1.1.101
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.101
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.BasicMeta;
import com.ehelply.client.model.DatesMeta;
import com.ehelply.client.model.DetailedMetaGet;
import com.ehelply.client.model.Field;
import com.ehelply.client.model.MetaChildren;
import com.ehelply.client.model.MetaCustom;
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
 * Meta
 */
@ApiModel(description = "Meta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-09T21:11:28.331846Z[Etc/UTC]")
public class MetaGet {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private BasicMeta basic;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private DetailedMetaGet detailed;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private MetaCustom custom;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private DatesMeta dates;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Field> fields = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<MetaChildren> children = null;

  public static final String SERIALIZED_NAME_PARENT_UUID = "parent_uuid";
  @SerializedName(SERIALIZED_NAME_PARENT_UUID)
  private String parentUuid;

  public MetaGet() { 
  }

  public MetaGet uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public MetaGet basic(BasicMeta basic) {
    
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BasicMeta getBasic() {
    return basic;
  }


  public void setBasic(BasicMeta basic) {
    this.basic = basic;
  }


  public MetaGet detailed(DetailedMetaGet detailed) {
    
    this.detailed = detailed;
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DetailedMetaGet getDetailed() {
    return detailed;
  }


  public void setDetailed(DetailedMetaGet detailed) {
    this.detailed = detailed;
  }


  public MetaGet custom(MetaCustom custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MetaCustom getCustom() {
    return custom;
  }


  public void setCustom(MetaCustom custom) {
    this.custom = custom;
  }


  public MetaGet dates(DatesMeta dates) {
    
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatesMeta getDates() {
    return dates;
  }


  public void setDates(DatesMeta dates) {
    this.dates = dates;
  }


  public MetaGet fields(List<Field> fields) {
    
    this.fields = fields;
    return this;
  }

  public MetaGet addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Field> getFields() {
    return fields;
  }


  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


  public MetaGet children(List<MetaChildren> children) {
    
    this.children = children;
    return this;
  }

  public MetaGet addChildrenItem(MetaChildren childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MetaChildren> getChildren() {
    return children;
  }


  public void setChildren(List<MetaChildren> children) {
    this.children = children;
  }


  public MetaGet parentUuid(String parentUuid) {
    
    this.parentUuid = parentUuid;
    return this;
  }

   /**
   * Get parentUuid
   * @return parentUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentUuid() {
    return parentUuid;
  }


  public void setParentUuid(String parentUuid) {
    this.parentUuid = parentUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaGet metaGet = (MetaGet) o;
    return Objects.equals(this.uuid, metaGet.uuid) &&
        Objects.equals(this.basic, metaGet.basic) &&
        Objects.equals(this.detailed, metaGet.detailed) &&
        Objects.equals(this.custom, metaGet.custom) &&
        Objects.equals(this.dates, metaGet.dates) &&
        Objects.equals(this.fields, metaGet.fields) &&
        Objects.equals(this.children, metaGet.children) &&
        Objects.equals(this.parentUuid, metaGet.parentUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, basic, detailed, custom, dates, fields, children, parentUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaGet {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    parentUuid: ").append(toIndentedString(parentUuid)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("basic");
    openapiFields.add("detailed");
    openapiFields.add("custom");
    openapiFields.add("dates");
    openapiFields.add("fields");
    openapiFields.add("children");
    openapiFields.add("parent_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("basic");
    openapiRequiredFields.add("detailed");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetaGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetaGet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetaGet is not found in the empty JSON string", MetaGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetaGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetaGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetaGet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `basic`
      if (jsonObj.getAsJsonObject("basic") != null) {
        BasicMeta.validateJsonObject(jsonObj.getAsJsonObject("basic"));
      }
      // validate the optional field `detailed`
      if (jsonObj.getAsJsonObject("detailed") != null) {
        DetailedMetaGet.validateJsonObject(jsonObj.getAsJsonObject("detailed"));
      }
      // validate the optional field `custom`
      if (jsonObj.getAsJsonObject("custom") != null) {
        MetaCustom.validateJsonObject(jsonObj.getAsJsonObject("custom"));
      }
      // validate the optional field `dates`
      if (jsonObj.getAsJsonObject("dates") != null) {
        DatesMeta.validateJsonObject(jsonObj.getAsJsonObject("dates"));
      }
      JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
      if (jsonArrayfields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
        }

        // validate the optional field `fields` (array)
        for (int i = 0; i < jsonArrayfields.size(); i++) {
          Field.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
      if (jsonArraychildren != null) {
        // ensure the json data is an array
        if (!jsonObj.get("children").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
        }

        // validate the optional field `children` (array)
        for (int i = 0; i < jsonArraychildren.size(); i++) {
          MetaChildren.validateJsonObject(jsonArraychildren.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("parent_uuid") != null && !jsonObj.get("parent_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetaGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetaGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetaGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetaGet.class));

       return (TypeAdapter<T>) new TypeAdapter<MetaGet>() {
           @Override
           public void write(JsonWriter out, MetaGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetaGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetaGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetaGet
  * @throws IOException if the JSON string is invalid with respect to MetaGet
  */
  public static MetaGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetaGet.class);
  }

 /**
  * Convert an instance of MetaGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

