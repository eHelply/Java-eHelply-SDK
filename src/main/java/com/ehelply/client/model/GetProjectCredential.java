/*
 * eHelply SDK - 1.1.100
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.100
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.GetSecret;
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
 * GetProjectCredential
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-26T18:44:04.995985Z[Etc/UTC]")
public class GetProjectCredential {
  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<GetSecret> secrets = new ArrayList<>();

  public GetProjectCredential() { 
  }

  public GetProjectCredential serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public GetProjectCredential secrets(List<GetSecret> secrets) {
    
    this.secrets = secrets;
    return this;
  }

  public GetProjectCredential addSecretsItem(GetSecret secretsItem) {
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<GetSecret> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<GetSecret> secrets) {
    this.secrets = secrets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProjectCredential getProjectCredential = (GetProjectCredential) o;
    return Objects.equals(this.serviceName, getProjectCredential.serviceName) &&
        Objects.equals(this.secrets, getProjectCredential.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectCredential {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
    openapiFields.add("service_name");
    openapiFields.add("secrets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("service_name");
    openapiRequiredFields.add("secrets");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetProjectCredential
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetProjectCredential.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProjectCredential is not found in the empty JSON string", GetProjectCredential.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetProjectCredential.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProjectCredential` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProjectCredential.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
      JsonArray jsonArraysecrets = jsonObj.getAsJsonArray("secrets");
      if (jsonArraysecrets != null) {
        // ensure the json data is an array
        if (!jsonObj.get("secrets").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `secrets` to be an array in the JSON string but got `%s`", jsonObj.get("secrets").toString()));
        }

        // validate the optional field `secrets` (array)
        for (int i = 0; i < jsonArraysecrets.size(); i++) {
          GetSecret.validateJsonObject(jsonArraysecrets.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProjectCredential.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProjectCredential' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProjectCredential> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProjectCredential.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProjectCredential>() {
           @Override
           public void write(JsonWriter out, GetProjectCredential value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProjectCredential read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetProjectCredential given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProjectCredential
  * @throws IOException if the JSON string is invalid with respect to GetProjectCredential
  */
  public static GetProjectCredential fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProjectCredential.class);
  }

 /**
  * Convert an instance of GetProjectCredential to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

