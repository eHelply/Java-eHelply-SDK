/*
 * eHelply SDK - 1.1.98
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.98
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
 * MetaChildren
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-23T01:42:38.023302Z[Etc/UTC]")
public class MetaChildren {
  public static final String SERIALIZED_NAME_CHILD_NAME = "child_name";
  @SerializedName(SERIALIZED_NAME_CHILD_NAME)
  private String childName;

  public static final String SERIALIZED_NAME_CHILD_DESCRIPTION = "child_description";
  @SerializedName(SERIALIZED_NAME_CHILD_DESCRIPTION)
  private String childDescription;

  public static final String SERIALIZED_NAME_CHILD_UUID = "child_uuid";
  @SerializedName(SERIALIZED_NAME_CHILD_UUID)
  private String childUuid;

  public MetaChildren() { 
  }

  public MetaChildren childName(String childName) {
    
    this.childName = childName;
    return this;
  }

   /**
   * Get childName
   * @return childName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChildName() {
    return childName;
  }


  public void setChildName(String childName) {
    this.childName = childName;
  }


  public MetaChildren childDescription(String childDescription) {
    
    this.childDescription = childDescription;
    return this;
  }

   /**
   * Get childDescription
   * @return childDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChildDescription() {
    return childDescription;
  }


  public void setChildDescription(String childDescription) {
    this.childDescription = childDescription;
  }


  public MetaChildren childUuid(String childUuid) {
    
    this.childUuid = childUuid;
    return this;
  }

   /**
   * Get childUuid
   * @return childUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChildUuid() {
    return childUuid;
  }


  public void setChildUuid(String childUuid) {
    this.childUuid = childUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaChildren metaChildren = (MetaChildren) o;
    return Objects.equals(this.childName, metaChildren.childName) &&
        Objects.equals(this.childDescription, metaChildren.childDescription) &&
        Objects.equals(this.childUuid, metaChildren.childUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childName, childDescription, childUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaChildren {\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    childDescription: ").append(toIndentedString(childDescription)).append("\n");
    sb.append("    childUuid: ").append(toIndentedString(childUuid)).append("\n");
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
    openapiFields.add("child_name");
    openapiFields.add("child_description");
    openapiFields.add("child_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetaChildren
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MetaChildren.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetaChildren is not found in the empty JSON string", MetaChildren.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetaChildren.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetaChildren` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("child_name") != null && !jsonObj.get("child_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_name").toString()));
      }
      if (jsonObj.get("child_description") != null && !jsonObj.get("child_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_description").toString()));
      }
      if (jsonObj.get("child_uuid") != null && !jsonObj.get("child_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("child_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetaChildren.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetaChildren' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetaChildren> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetaChildren.class));

       return (TypeAdapter<T>) new TypeAdapter<MetaChildren>() {
           @Override
           public void write(JsonWriter out, MetaChildren value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetaChildren read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetaChildren given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetaChildren
  * @throws IOException if the JSON string is invalid with respect to MetaChildren
  */
  public static MetaChildren fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetaChildren.class);
  }

 /**
  * Convert an instance of MetaChildren to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

