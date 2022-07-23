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
 * Flags that may be attached to a user
 */
@ApiModel(description = "Flags that may be attached to a user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-23T01:42:38.023302Z[Etc/UTC]")
public class UserFlags {
  public static final String SERIALIZED_NAME_REQUIRES_TOUR = "requires_tour";
  @SerializedName(SERIALIZED_NAME_REQUIRES_TOUR)
  private Boolean requiresTour = false;

  public static final String SERIALIZED_NAME_MISSING_DATA = "missing_data";
  @SerializedName(SERIALIZED_NAME_MISSING_DATA)
  private Boolean missingData = false;

  public static final String SERIALIZED_NAME_LEGAL_UPDATES = "legal_updates";
  @SerializedName(SERIALIZED_NAME_LEGAL_UPDATES)
  private Boolean legalUpdates = false;

  public static final String SERIALIZED_NAME_NEWSLETTERS = "newsletters";
  @SerializedName(SERIALIZED_NAME_NEWSLETTERS)
  private Boolean newsletters = false;

  public UserFlags() { 
  }

  public UserFlags requiresTour(Boolean requiresTour) {
    
    this.requiresTour = requiresTour;
    return this;
  }

   /**
   * Get requiresTour
   * @return requiresTour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresTour() {
    return requiresTour;
  }


  public void setRequiresTour(Boolean requiresTour) {
    this.requiresTour = requiresTour;
  }


  public UserFlags missingData(Boolean missingData) {
    
    this.missingData = missingData;
    return this;
  }

   /**
   * Get missingData
   * @return missingData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingData() {
    return missingData;
  }


  public void setMissingData(Boolean missingData) {
    this.missingData = missingData;
  }


  public UserFlags legalUpdates(Boolean legalUpdates) {
    
    this.legalUpdates = legalUpdates;
    return this;
  }

   /**
   * Get legalUpdates
   * @return legalUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLegalUpdates() {
    return legalUpdates;
  }


  public void setLegalUpdates(Boolean legalUpdates) {
    this.legalUpdates = legalUpdates;
  }


  public UserFlags newsletters(Boolean newsletters) {
    
    this.newsletters = newsletters;
    return this;
  }

   /**
   * Get newsletters
   * @return newsletters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNewsletters() {
    return newsletters;
  }


  public void setNewsletters(Boolean newsletters) {
    this.newsletters = newsletters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFlags userFlags = (UserFlags) o;
    return Objects.equals(this.requiresTour, userFlags.requiresTour) &&
        Objects.equals(this.missingData, userFlags.missingData) &&
        Objects.equals(this.legalUpdates, userFlags.legalUpdates) &&
        Objects.equals(this.newsletters, userFlags.newsletters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresTour, missingData, legalUpdates, newsletters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFlags {\n");
    sb.append("    requiresTour: ").append(toIndentedString(requiresTour)).append("\n");
    sb.append("    missingData: ").append(toIndentedString(missingData)).append("\n");
    sb.append("    legalUpdates: ").append(toIndentedString(legalUpdates)).append("\n");
    sb.append("    newsletters: ").append(toIndentedString(newsletters)).append("\n");
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
    openapiFields.add("requires_tour");
    openapiFields.add("missing_data");
    openapiFields.add("legal_updates");
    openapiFields.add("newsletters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserFlags
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserFlags.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserFlags is not found in the empty JSON string", UserFlags.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserFlags.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserFlags` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserFlags.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserFlags' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserFlags> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserFlags.class));

       return (TypeAdapter<T>) new TypeAdapter<UserFlags>() {
           @Override
           public void write(JsonWriter out, UserFlags value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserFlags read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserFlags given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserFlags
  * @throws IOException if the JSON string is invalid with respect to UserFlags
  */
  public static UserFlags fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserFlags.class);
  }

 /**
  * Convert an instance of UserFlags to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

