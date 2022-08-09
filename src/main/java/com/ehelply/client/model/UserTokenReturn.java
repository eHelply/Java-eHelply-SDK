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
 * Tokens, naming scheme based off of cognito return fields
 */
@ApiModel(description = "Tokens, naming scheme based off of cognito return fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-09T20:54:01.083519Z[Etc/UTC]")
public class UserTokenReturn {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "AccessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "ExpiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "TokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_ID_TOKEN = "IdToken";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public UserTokenReturn() { 
  }

  public UserTokenReturn accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public UserTokenReturn expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public UserTokenReturn tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public UserTokenReturn idToken(String idToken) {
    
    this.idToken = idToken;
    return this;
  }

   /**
   * Get idToken
   * @return idToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIdToken() {
    return idToken;
  }


  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokenReturn userTokenReturn = (UserTokenReturn) o;
    return Objects.equals(this.accessToken, userTokenReturn.accessToken) &&
        Objects.equals(this.expiresIn, userTokenReturn.expiresIn) &&
        Objects.equals(this.tokenType, userTokenReturn.tokenType) &&
        Objects.equals(this.idToken, userTokenReturn.idToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, tokenType, idToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokenReturn {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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
    openapiFields.add("AccessToken");
    openapiFields.add("ExpiresIn");
    openapiFields.add("TokenType");
    openapiFields.add("IdToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccessToken");
    openapiRequiredFields.add("ExpiresIn");
    openapiRequiredFields.add("TokenType");
    openapiRequiredFields.add("IdToken");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserTokenReturn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserTokenReturn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserTokenReturn is not found in the empty JSON string", UserTokenReturn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserTokenReturn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserTokenReturn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserTokenReturn.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("AccessToken") != null && !jsonObj.get("AccessToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccessToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccessToken").toString()));
      }
      if (jsonObj.get("TokenType") != null && !jsonObj.get("TokenType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TokenType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TokenType").toString()));
      }
      if (jsonObj.get("IdToken") != null && !jsonObj.get("IdToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IdToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IdToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserTokenReturn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserTokenReturn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserTokenReturn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserTokenReturn.class));

       return (TypeAdapter<T>) new TypeAdapter<UserTokenReturn>() {
           @Override
           public void write(JsonWriter out, UserTokenReturn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserTokenReturn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserTokenReturn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserTokenReturn
  * @throws IOException if the JSON string is invalid with respect to UserTokenReturn
  */
  public static UserTokenReturn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserTokenReturn.class);
  }

 /**
  * Convert an instance of UserTokenReturn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

