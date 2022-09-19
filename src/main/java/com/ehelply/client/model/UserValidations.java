/*
 * eHelply SDK - 1.1.107
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.107
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
 * Fields used to validate a user&#39;s field
 */
@ApiModel(description = "Fields used to validate a user's field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-19T00:13:08.392559Z[Etc/UTC]")
public class UserValidations {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALIDATION_TYPE = "validation_type";
  @SerializedName(SERIALIZED_NAME_VALIDATION_TYPE)
  private String validationType;

  public UserValidations() { 
  }

  public UserValidations value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public UserValidations validationType(String validationType) {
    
    this.validationType = validationType;
    return this;
  }

   /**
   * Get validationType
   * @return validationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getValidationType() {
    return validationType;
  }


  public void setValidationType(String validationType) {
    this.validationType = validationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserValidations userValidations = (UserValidations) o;
    return Objects.equals(this.value, userValidations.value) &&
        Objects.equals(this.validationType, userValidations.validationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, validationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserValidations {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("validation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("validation_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserValidations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserValidations.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserValidations is not found in the empty JSON string", UserValidations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserValidations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserValidations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserValidations.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (jsonObj.get("validation_type") != null && !jsonObj.get("validation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserValidations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserValidations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserValidations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserValidations.class));

       return (TypeAdapter<T>) new TypeAdapter<UserValidations>() {
           @Override
           public void write(JsonWriter out, UserValidations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserValidations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserValidations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserValidations
  * @throws IOException if the JSON string is invalid with respect to UserValidations
  */
  public static UserValidations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserValidations.class);
  }

 /**
  * Convert an instance of UserValidations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

