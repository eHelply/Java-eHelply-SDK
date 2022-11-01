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
 * CreateProjectCredit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T13:40:23.254235Z[Etc/UTC]")
public class CreateProjectCredit {
  public static final String SERIALIZED_NAME_CREDITS_GRANTED = "credits_granted";
  @SerializedName(SERIALIZED_NAME_CREDITS_GRANTED)
  private Integer creditsGranted;

  public static final String SERIALIZED_NAME_GRANTED_REASON = "granted_reason";
  @SerializedName(SERIALIZED_NAME_GRANTED_REASON)
  private String grantedReason;

  public CreateProjectCredit() { 
  }

  public CreateProjectCredit creditsGranted(Integer creditsGranted) {
    
    this.creditsGranted = creditsGranted;
    return this;
  }

   /**
   * Get creditsGranted
   * @return creditsGranted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCreditsGranted() {
    return creditsGranted;
  }


  public void setCreditsGranted(Integer creditsGranted) {
    this.creditsGranted = creditsGranted;
  }


  public CreateProjectCredit grantedReason(String grantedReason) {
    
    this.grantedReason = grantedReason;
    return this;
  }

   /**
   * Get grantedReason
   * @return grantedReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGrantedReason() {
    return grantedReason;
  }


  public void setGrantedReason(String grantedReason) {
    this.grantedReason = grantedReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectCredit createProjectCredit = (CreateProjectCredit) o;
    return Objects.equals(this.creditsGranted, createProjectCredit.creditsGranted) &&
        Objects.equals(this.grantedReason, createProjectCredit.grantedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditsGranted, grantedReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectCredit {\n");
    sb.append("    creditsGranted: ").append(toIndentedString(creditsGranted)).append("\n");
    sb.append("    grantedReason: ").append(toIndentedString(grantedReason)).append("\n");
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
    openapiFields.add("credits_granted");
    openapiFields.add("granted_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credits_granted");
    openapiRequiredFields.add("granted_reason");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateProjectCredit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateProjectCredit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateProjectCredit is not found in the empty JSON string", CreateProjectCredit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateProjectCredit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateProjectCredit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateProjectCredit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("granted_reason") != null && !jsonObj.get("granted_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `granted_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("granted_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProjectCredit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProjectCredit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProjectCredit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProjectCredit.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProjectCredit>() {
           @Override
           public void write(JsonWriter out, CreateProjectCredit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProjectCredit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateProjectCredit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateProjectCredit
  * @throws IOException if the JSON string is invalid with respect to CreateProjectCredit
  */
  public static CreateProjectCredit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProjectCredit.class);
  }

 /**
  * Convert an instance of CreateProjectCredit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

