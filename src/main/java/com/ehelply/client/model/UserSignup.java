/*
 * eHelply SDK - 1.1.82
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.82
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
 * User information used for user signup
 */
@ApiModel(description = "User information used for user signup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T01:03:17.599283Z[Etc/UTC]")
public class UserSignup {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private String lat;

  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private String lng;

  public static final String SERIALIZED_NAME_VERIFIED_LEGAL_TERMS = "verified_legal_terms";
  @SerializedName(SERIALIZED_NAME_VERIFIED_LEGAL_TERMS)
  private Boolean verifiedLegalTerms = false;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_NEWSLETTERS = "newsletters";
  @SerializedName(SERIALIZED_NAME_NEWSLETTERS)
  private Boolean newsletters;

  public UserSignup() { 
  }

  public UserSignup username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserSignup password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public UserSignup email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserSignup firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserSignup lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserSignup phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public UserSignup country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public UserSignup lat(String lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLat() {
    return lat;
  }


  public void setLat(String lat) {
    this.lat = lat;
  }


  public UserSignup lng(String lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * @return lng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLng() {
    return lng;
  }


  public void setLng(String lng) {
    this.lng = lng;
  }


  public UserSignup verifiedLegalTerms(Boolean verifiedLegalTerms) {
    
    this.verifiedLegalTerms = verifiedLegalTerms;
    return this;
  }

   /**
   * Get verifiedLegalTerms
   * @return verifiedLegalTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVerifiedLegalTerms() {
    return verifiedLegalTerms;
  }


  public void setVerifiedLegalTerms(Boolean verifiedLegalTerms) {
    this.verifiedLegalTerms = verifiedLegalTerms;
  }


  public UserSignup picture(String picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPicture() {
    return picture;
  }


  public void setPicture(String picture) {
    this.picture = picture;
  }


  public UserSignup newsletters(Boolean newsletters) {
    
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
    UserSignup userSignup = (UserSignup) o;
    return Objects.equals(this.username, userSignup.username) &&
        Objects.equals(this.password, userSignup.password) &&
        Objects.equals(this.email, userSignup.email) &&
        Objects.equals(this.firstName, userSignup.firstName) &&
        Objects.equals(this.lastName, userSignup.lastName) &&
        Objects.equals(this.phoneNumber, userSignup.phoneNumber) &&
        Objects.equals(this.country, userSignup.country) &&
        Objects.equals(this.lat, userSignup.lat) &&
        Objects.equals(this.lng, userSignup.lng) &&
        Objects.equals(this.verifiedLegalTerms, userSignup.verifiedLegalTerms) &&
        Objects.equals(this.picture, userSignup.picture) &&
        Objects.equals(this.newsletters, userSignup.newsletters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, email, firstName, lastName, phoneNumber, country, lat, lng, verifiedLegalTerms, picture, newsletters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignup {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    verifiedLegalTerms: ").append(toIndentedString(verifiedLegalTerms)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("email");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("phone_number");
    openapiFields.add("country");
    openapiFields.add("lat");
    openapiFields.add("lng");
    openapiFields.add("verified_legal_terms");
    openapiFields.add("picture");
    openapiFields.add("newsletters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("password");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("last_name");
    openapiRequiredFields.add("phone_number");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserSignup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserSignup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSignup is not found in the empty JSON string", UserSignup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserSignup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSignup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserSignup.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("lat") != null && !jsonObj.get("lat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lat").toString()));
      }
      if (jsonObj.get("lng") != null && !jsonObj.get("lng").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lng` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lng").toString()));
      }
      if (jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSignup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSignup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSignup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSignup.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSignup>() {
           @Override
           public void write(JsonWriter out, UserSignup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSignup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSignup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSignup
  * @throws IOException if the JSON string is invalid with respect to UserSignup
  */
  public static UserSignup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSignup.class);
  }

 /**
  * Convert an instance of UserSignup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
