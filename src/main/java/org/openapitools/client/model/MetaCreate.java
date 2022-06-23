/*
 * eHelply SDK - 1.1.81
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.81
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.BasicMetaCreate;
import org.openapitools.client.model.DetailedMetaCreate;
import org.openapitools.client.model.Field;
import org.openapitools.client.model.MetaChildren;
import org.openapitools.client.model.MetaCustom;

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

import org.openapitools.client.JSON;

/**
 * Meta
 */
@ApiModel(description = "Meta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T00:51:45.571201Z[Etc/UTC]")
public class MetaCreate {
  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private BasicMetaCreate basic;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private DetailedMetaCreate detailed;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private MetaCustom custom;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Field> fields = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<MetaChildren> children = null;

  public static final String SERIALIZED_NAME_PARENT_UUID = "parent_uuid";
  @SerializedName(SERIALIZED_NAME_PARENT_UUID)
  private String parentUuid;

  public MetaCreate() { 
  }

  public MetaCreate basic(BasicMetaCreate basic) {
    
    this.basic = basic;
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BasicMetaCreate getBasic() {
    return basic;
  }


  public void setBasic(BasicMetaCreate basic) {
    this.basic = basic;
  }


  public MetaCreate detailed(DetailedMetaCreate detailed) {
    
    this.detailed = detailed;
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DetailedMetaCreate getDetailed() {
    return detailed;
  }


  public void setDetailed(DetailedMetaCreate detailed) {
    this.detailed = detailed;
  }


  public MetaCreate custom(MetaCustom custom) {
    
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


  public MetaCreate fields(List<Field> fields) {
    
    this.fields = fields;
    return this;
  }

  public MetaCreate addFieldsItem(Field fieldsItem) {
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


  public MetaCreate children(List<MetaChildren> children) {
    
    this.children = children;
    return this;
  }

  public MetaCreate addChildrenItem(MetaChildren childrenItem) {
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


  public MetaCreate parentUuid(String parentUuid) {
    
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
    MetaCreate metaCreate = (MetaCreate) o;
    return Objects.equals(this.basic, metaCreate.basic) &&
        Objects.equals(this.detailed, metaCreate.detailed) &&
        Objects.equals(this.custom, metaCreate.custom) &&
        Objects.equals(this.fields, metaCreate.fields) &&
        Objects.equals(this.children, metaCreate.children) &&
        Objects.equals(this.parentUuid, metaCreate.parentUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, detailed, custom, fields, children, parentUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaCreate {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
    openapiFields.add("basic");
    openapiFields.add("detailed");
    openapiFields.add("custom");
    openapiFields.add("fields");
    openapiFields.add("children");
    openapiFields.add("parent_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetaCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetaCreate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetaCreate is not found in the empty JSON string", MetaCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetaCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetaCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `basic`
      if (jsonObj.getAsJsonObject("basic") != null) {
        BasicMetaCreate.validateJsonObject(jsonObj.getAsJsonObject("basic"));
      }
      // validate the optional field `detailed`
      if (jsonObj.getAsJsonObject("detailed") != null) {
        DetailedMetaCreate.validateJsonObject(jsonObj.getAsJsonObject("detailed"));
      }
      // validate the optional field `custom`
      if (jsonObj.getAsJsonObject("custom") != null) {
        MetaCustom.validateJsonObject(jsonObj.getAsJsonObject("custom"));
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
       if (!MetaCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetaCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetaCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetaCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<MetaCreate>() {
           @Override
           public void write(JsonWriter out, MetaCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetaCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetaCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetaCreate
  * @throws IOException if the JSON string is invalid with respect to MetaCreate
  */
  public static MetaCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetaCreate.class);
  }

 /**
  * Convert an instance of MetaCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

