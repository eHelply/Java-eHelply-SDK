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
import com.ehelply.client.model.ServiceSuperStackMetaGettingStartedEndpointTeaser;
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
 * ServiceSuperStackMetaGettingStarted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T13:40:23.254235Z[Etc/UTC]")
public class ServiceSuperStackMetaGettingStarted {
  public static final String SERIALIZED_NAME_BLURB = "blurb";
  @SerializedName(SERIALIZED_NAME_BLURB)
  private String blurb;

  public static final String SERIALIZED_NAME_ENDPOINT_TEASERS = "endpoint_teasers";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TEASERS)
  private List<ServiceSuperStackMetaGettingStartedEndpointTeaser> endpointTeasers = new ArrayList<>();

  public ServiceSuperStackMetaGettingStarted() { 
  }

  public ServiceSuperStackMetaGettingStarted blurb(String blurb) {
    
    this.blurb = blurb;
    return this;
  }

   /**
   * Get blurb
   * @return blurb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBlurb() {
    return blurb;
  }


  public void setBlurb(String blurb) {
    this.blurb = blurb;
  }


  public ServiceSuperStackMetaGettingStarted endpointTeasers(List<ServiceSuperStackMetaGettingStartedEndpointTeaser> endpointTeasers) {
    
    this.endpointTeasers = endpointTeasers;
    return this;
  }

  public ServiceSuperStackMetaGettingStarted addEndpointTeasersItem(ServiceSuperStackMetaGettingStartedEndpointTeaser endpointTeasersItem) {
    this.endpointTeasers.add(endpointTeasersItem);
    return this;
  }

   /**
   * Get endpointTeasers
   * @return endpointTeasers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ServiceSuperStackMetaGettingStartedEndpointTeaser> getEndpointTeasers() {
    return endpointTeasers;
  }


  public void setEndpointTeasers(List<ServiceSuperStackMetaGettingStartedEndpointTeaser> endpointTeasers) {
    this.endpointTeasers = endpointTeasers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSuperStackMetaGettingStarted serviceSuperStackMetaGettingStarted = (ServiceSuperStackMetaGettingStarted) o;
    return Objects.equals(this.blurb, serviceSuperStackMetaGettingStarted.blurb) &&
        Objects.equals(this.endpointTeasers, serviceSuperStackMetaGettingStarted.endpointTeasers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blurb, endpointTeasers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSuperStackMetaGettingStarted {\n");
    sb.append("    blurb: ").append(toIndentedString(blurb)).append("\n");
    sb.append("    endpointTeasers: ").append(toIndentedString(endpointTeasers)).append("\n");
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
    openapiFields.add("blurb");
    openapiFields.add("endpoint_teasers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blurb");
    openapiRequiredFields.add("endpoint_teasers");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceSuperStackMetaGettingStarted
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceSuperStackMetaGettingStarted.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceSuperStackMetaGettingStarted is not found in the empty JSON string", ServiceSuperStackMetaGettingStarted.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceSuperStackMetaGettingStarted.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceSuperStackMetaGettingStarted` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceSuperStackMetaGettingStarted.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("blurb") != null && !jsonObj.get("blurb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blurb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blurb").toString()));
      }
      JsonArray jsonArrayendpointTeasers = jsonObj.getAsJsonArray("endpoint_teasers");
      if (jsonArrayendpointTeasers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("endpoint_teasers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `endpoint_teasers` to be an array in the JSON string but got `%s`", jsonObj.get("endpoint_teasers").toString()));
        }

        // validate the optional field `endpoint_teasers` (array)
        for (int i = 0; i < jsonArrayendpointTeasers.size(); i++) {
          ServiceSuperStackMetaGettingStartedEndpointTeaser.validateJsonObject(jsonArrayendpointTeasers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceSuperStackMetaGettingStarted.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceSuperStackMetaGettingStarted' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceSuperStackMetaGettingStarted> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceSuperStackMetaGettingStarted.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceSuperStackMetaGettingStarted>() {
           @Override
           public void write(JsonWriter out, ServiceSuperStackMetaGettingStarted value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceSuperStackMetaGettingStarted read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceSuperStackMetaGettingStarted given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceSuperStackMetaGettingStarted
  * @throws IOException if the JSON string is invalid with respect to ServiceSuperStackMetaGettingStarted
  */
  public static ServiceSuperStackMetaGettingStarted fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceSuperStackMetaGettingStarted.class);
  }

 /**
  * Convert an instance of ServiceSuperStackMetaGettingStarted to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

