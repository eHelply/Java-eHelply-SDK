/*
 * eHelply SDK - 1.1.101
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.101
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.Email;
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
 * Contains all fields required when doing a Participant GET but also has user fields (name, location, ect). This is what is returned from all participant endpoints.
 */
@ApiModel(description = "Contains all fields required when doing a Participant GET but also has user fields (name, location, ect). This is what is returned from all participant endpoints.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-09T21:11:28.331846Z[Etc/UTC]")
public class ParticipantUserReturn {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_USER_UUID = "user_uuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;

  public static final String SERIALIZED_NAME_PARTICIPANT_META = "participant_meta";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_META)
  private Object participantMeta;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Email email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_GPS_LOCATION = "gps_location";
  @SerializedName(SERIALIZED_NAME_GPS_LOCATION)
  private Object gpsLocation;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private OffsetDateTime lastLogin;

  public static final String SERIALIZED_NAME_VERIFIED_LEGAL_TERMS = "verified_legal_terms";
  @SerializedName(SERIALIZED_NAME_VERIFIED_LEGAL_TERMS)
  private Boolean verifiedLegalTerms;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "date_updated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public ParticipantUserReturn() { 
  }

  public ParticipantUserReturn uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ParticipantUserReturn userUuid(String userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public ParticipantUserReturn participantMeta(Object participantMeta) {
    
    this.participantMeta = participantMeta;
    return this;
  }

   /**
   * Get participantMeta
   * @return participantMeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"some_key\":\"some_value\"}", value = "")

  public Object getParticipantMeta() {
    return participantMeta;
  }


  public void setParticipantMeta(Object participantMeta) {
    this.participantMeta = participantMeta;
  }


  public ParticipantUserReturn firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ParticipantUserReturn lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ParticipantUserReturn email(Email email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Email getEmail() {
    return email;
  }


  public void setEmail(Email email) {
    this.email = email;
  }


  public ParticipantUserReturn phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "306-555-5555", value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ParticipantUserReturn country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Canada", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ParticipantUserReturn gpsLocation(Object gpsLocation) {
    
    this.gpsLocation = gpsLocation;
    return this;
  }

   /**
   * Get gpsLocation
   * @return gpsLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lat\":10,\"lng\":-10}", value = "")

  public Object getGpsLocation() {
    return gpsLocation;
  }


  public void setGpsLocation(Object gpsLocation) {
    this.gpsLocation = gpsLocation;
  }


  public ParticipantUserReturn picture(String picture) {
    
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


  public ParticipantUserReturn lastLogin(OffsetDateTime lastLogin) {
    
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


  public ParticipantUserReturn verifiedLegalTerms(Boolean verifiedLegalTerms) {
    
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


  public ParticipantUserReturn dateCreated(OffsetDateTime dateCreated) {
    
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


  public ParticipantUserReturn dateUpdated(OffsetDateTime dateUpdated) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantUserReturn participantUserReturn = (ParticipantUserReturn) o;
    return Objects.equals(this.uuid, participantUserReturn.uuid) &&
        Objects.equals(this.userUuid, participantUserReturn.userUuid) &&
        Objects.equals(this.participantMeta, participantUserReturn.participantMeta) &&
        Objects.equals(this.firstName, participantUserReturn.firstName) &&
        Objects.equals(this.lastName, participantUserReturn.lastName) &&
        Objects.equals(this.email, participantUserReturn.email) &&
        Objects.equals(this.phoneNumber, participantUserReturn.phoneNumber) &&
        Objects.equals(this.country, participantUserReturn.country) &&
        Objects.equals(this.gpsLocation, participantUserReturn.gpsLocation) &&
        Objects.equals(this.picture, participantUserReturn.picture) &&
        Objects.equals(this.lastLogin, participantUserReturn.lastLogin) &&
        Objects.equals(this.verifiedLegalTerms, participantUserReturn.verifiedLegalTerms) &&
        Objects.equals(this.dateCreated, participantUserReturn.dateCreated) &&
        Objects.equals(this.dateUpdated, participantUserReturn.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, userUuid, participantMeta, firstName, lastName, email, phoneNumber, country, gpsLocation, picture, lastLogin, verifiedLegalTerms, dateCreated, dateUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantUserReturn {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    participantMeta: ").append(toIndentedString(participantMeta)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gpsLocation: ").append(toIndentedString(gpsLocation)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    verifiedLegalTerms: ").append(toIndentedString(verifiedLegalTerms)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("user_uuid");
    openapiFields.add("participant_meta");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("email");
    openapiFields.add("phone_number");
    openapiFields.add("country");
    openapiFields.add("gps_location");
    openapiFields.add("picture");
    openapiFields.add("last_login");
    openapiFields.add("verified_legal_terms");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ParticipantUserReturn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ParticipantUserReturn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParticipantUserReturn is not found in the empty JSON string", ParticipantUserReturn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ParticipantUserReturn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParticipantUserReturn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("user_uuid") != null && !jsonObj.get("user_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_uuid").toString()));
      }
      if (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      // validate the optional field `email`
      if (jsonObj.getAsJsonObject("email") != null) {
        Email.validateJsonObject(jsonObj.getAsJsonObject("email"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParticipantUserReturn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParticipantUserReturn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParticipantUserReturn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParticipantUserReturn.class));

       return (TypeAdapter<T>) new TypeAdapter<ParticipantUserReturn>() {
           @Override
           public void write(JsonWriter out, ParticipantUserReturn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParticipantUserReturn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParticipantUserReturn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParticipantUserReturn
  * @throws IOException if the JSON string is invalid with respect to ParticipantUserReturn
  */
  public static ParticipantUserReturn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParticipantUserReturn.class);
  }

 /**
  * Convert an instance of ParticipantUserReturn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

