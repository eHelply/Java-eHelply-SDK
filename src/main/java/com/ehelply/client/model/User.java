/*
 * eHelply SDK - 1.1.103
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.103
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
import java.time.OffsetDateTime;

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
 * User object, contains all required parameters
 */
@ApiModel(description = "User object, contains all required parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:54:34.967430Z[Etc/UTC]")
public class User {
  public static final String SERIALIZED_NAME_COGNITO_ID = "cognito_id";
  @SerializedName(SERIALIZED_NAME_COGNITO_ID)
  private String cognitoId;

  public static final String SERIALIZED_NAME_COGNITO_DATA = "cognito_data";
  @SerializedName(SERIALIZED_NAME_COGNITO_DATA)
  private Object cognitoData;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_GPS_LOCATION = "gps_location";
  @SerializedName(SERIALIZED_NAME_GPS_LOCATION)
  private Object gpsLocation;

  public static final String SERIALIZED_NAME_VERIFIED_LEGAL_TERMS = "verified_legal_terms";
  @SerializedName(SERIALIZED_NAME_VERIFIED_LEGAL_TERMS)
  private Boolean verifiedLegalTerms = false;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_DATE_DELETED = "date_deleted";
  @SerializedName(SERIALIZED_NAME_DATE_DELETED)
  private OffsetDateTime dateDeleted;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_FIRST_LOGIN = "first_login";
  @SerializedName(SERIALIZED_NAME_FIRST_LOGIN)
  private Boolean firstLogin = true;

  public User() { 
  }

  public User cognitoId(String cognitoId) {
    
    this.cognitoId = cognitoId;
    return this;
  }

   /**
   * Get cognitoId
   * @return cognitoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCognitoId() {
    return cognitoId;
  }


  public void setCognitoId(String cognitoId) {
    this.cognitoId = cognitoId;
  }


  public User cognitoData(Object cognitoData) {
    
    this.cognitoData = cognitoData;
    return this;
  }

   /**
   * Get cognitoData
   * @return cognitoData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCognitoData() {
    return cognitoData;
  }


  public void setCognitoData(Object cognitoData) {
    this.cognitoData = cognitoData;
  }


  public User firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public User email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public User phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public User country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public User picture(String picture) {
    
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


  public User gpsLocation(Object gpsLocation) {
    
    this.gpsLocation = gpsLocation;
    return this;
  }

   /**
   * Get gpsLocation
   * @return gpsLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getGpsLocation() {
    return gpsLocation;
  }


  public void setGpsLocation(Object gpsLocation) {
    this.gpsLocation = gpsLocation;
  }


  public User verifiedLegalTerms(Boolean verifiedLegalTerms) {
    
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


  public User dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public User dateUpdated(OffsetDateTime dateUpdated) {
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public User dateDeleted(OffsetDateTime dateDeleted) {
    
    this.dateDeleted = dateDeleted;
    return this;
  }

   /**
   * Get dateDeleted
   * @return dateDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateDeleted() {
    return dateDeleted;
  }


  public void setDateDeleted(OffsetDateTime dateDeleted) {
    this.dateDeleted = dateDeleted;
  }


  public User uuid(String uuid) {
    
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


  public User lastLogin(OffsetDateTime lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }


  public User firstLogin(Boolean firstLogin) {
    
    this.firstLogin = firstLogin;
    return this;
  }

   /**
   * Get firstLogin
   * @return firstLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFirstLogin() {
    return firstLogin;
  }


  public void setFirstLogin(Boolean firstLogin) {
    this.firstLogin = firstLogin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.cognitoId, user.cognitoId) &&
        Objects.equals(this.cognitoData, user.cognitoData) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phoneNumber, user.phoneNumber) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.picture, user.picture) &&
        Objects.equals(this.gpsLocation, user.gpsLocation) &&
        Objects.equals(this.verifiedLegalTerms, user.verifiedLegalTerms) &&
        Objects.equals(this.dateCreated, user.dateCreated) &&
        Objects.equals(this.dateUpdated, user.dateUpdated) &&
        Objects.equals(this.dateDeleted, user.dateDeleted) &&
        Objects.equals(this.uuid, user.uuid) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.firstLogin, user.firstLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cognitoId, cognitoData, firstName, lastName, email, phoneNumber, country, picture, gpsLocation, verifiedLegalTerms, dateCreated, dateUpdated, dateDeleted, uuid, lastLogin, firstLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    cognitoId: ").append(toIndentedString(cognitoId)).append("\n");
    sb.append("    cognitoData: ").append(toIndentedString(cognitoData)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    gpsLocation: ").append(toIndentedString(gpsLocation)).append("\n");
    sb.append("    verifiedLegalTerms: ").append(toIndentedString(verifiedLegalTerms)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    firstLogin: ").append(toIndentedString(firstLogin)).append("\n");
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
    openapiFields.add("cognito_id");
    openapiFields.add("cognito_data");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("phone_number");
    openapiFields.add("country");
    openapiFields.add("picture");
    openapiFields.add("gps_location");
    openapiFields.add("verified_legal_terms");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("date_deleted");
    openapiFields.add("uuid");
    openapiFields.add("last_login");
    openapiFields.add("first_login");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to User
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (User.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("cognito_id") != null && !jsonObj.get("cognito_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cognito_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cognito_id").toString()));
      }
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture").toString()));
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

