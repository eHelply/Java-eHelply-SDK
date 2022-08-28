/*
 * eHelply SDK - 1.1.106
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.106
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.UserEmail;
import com.ehelply.client.model.UserFlags;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * When retrieving a user
 */
@ApiModel(description = "When retrieving a user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-28T15:22:53.769041Z[Etc/UTC]")
public class UserResponse {
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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private UserEmail email;

  public static final String SERIALIZED_NAME_MISSING = "missing";
  @SerializedName(SERIALIZED_NAME_MISSING)
  private List<String> missing = null;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PARTICIPANTS = "participants";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS)
  private List<Object> participants = null;

  public static final String SERIALIZED_NAME_FLAGS = "flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private UserFlags flags;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private String lastLogin;

  public UserResponse() { 
  }

  public UserResponse firstName(String firstName) {
    
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


  public UserResponse lastName(String lastName) {
    
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


  public UserResponse phoneNumber(String phoneNumber) {
    
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


  public UserResponse country(String country) {
    
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


  public UserResponse picture(String picture) {
    
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


  public UserResponse gpsLocation(Object gpsLocation) {
    
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


  public UserResponse verifiedLegalTerms(Boolean verifiedLegalTerms) {
    
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


  public UserResponse dateCreated(OffsetDateTime dateCreated) {
    
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


  public UserResponse dateUpdated(OffsetDateTime dateUpdated) {
    
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


  public UserResponse dateDeleted(OffsetDateTime dateDeleted) {
    
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


  public UserResponse email(UserEmail email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserEmail getEmail() {
    return email;
  }


  public void setEmail(UserEmail email) {
    this.email = email;
  }


  public UserResponse missing(List<String> missing) {
    
    this.missing = missing;
    return this;
  }

  public UserResponse addMissingItem(String missingItem) {
    if (this.missing == null) {
      this.missing = new ArrayList<>();
    }
    this.missing.add(missingItem);
    return this;
  }

   /**
   * Get missing
   * @return missing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMissing() {
    return missing;
  }


  public void setMissing(List<String> missing) {
    this.missing = missing;
  }


  public UserResponse uuid(String uuid) {
    
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


  public UserResponse participants(List<Object> participants) {
    
    this.participants = participants;
    return this;
  }

  public UserResponse addParticipantsItem(Object participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getParticipants() {
    return participants;
  }


  public void setParticipants(List<Object> participants) {
    this.participants = participants;
  }


  public UserResponse flags(UserFlags flags) {
    
    this.flags = flags;
    return this;
  }

   /**
   * Get flags
   * @return flags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserFlags getFlags() {
    return flags;
  }


  public void setFlags(UserFlags flags) {
    this.flags = flags;
  }


  public UserResponse lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponse userResponse = (UserResponse) o;
    return Objects.equals(this.firstName, userResponse.firstName) &&
        Objects.equals(this.lastName, userResponse.lastName) &&
        Objects.equals(this.phoneNumber, userResponse.phoneNumber) &&
        Objects.equals(this.country, userResponse.country) &&
        Objects.equals(this.picture, userResponse.picture) &&
        Objects.equals(this.gpsLocation, userResponse.gpsLocation) &&
        Objects.equals(this.verifiedLegalTerms, userResponse.verifiedLegalTerms) &&
        Objects.equals(this.dateCreated, userResponse.dateCreated) &&
        Objects.equals(this.dateUpdated, userResponse.dateUpdated) &&
        Objects.equals(this.dateDeleted, userResponse.dateDeleted) &&
        Objects.equals(this.email, userResponse.email) &&
        Objects.equals(this.missing, userResponse.missing) &&
        Objects.equals(this.uuid, userResponse.uuid) &&
        Objects.equals(this.participants, userResponse.participants) &&
        Objects.equals(this.flags, userResponse.flags) &&
        Objects.equals(this.lastLogin, userResponse.lastLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber, country, picture, gpsLocation, verifiedLegalTerms, dateCreated, dateUpdated, dateDeleted, email, missing, uuid, participants, flags, lastLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponse {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    gpsLocation: ").append(toIndentedString(gpsLocation)).append("\n");
    sb.append("    verifiedLegalTerms: ").append(toIndentedString(verifiedLegalTerms)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
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
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("phone_number");
    openapiFields.add("country");
    openapiFields.add("picture");
    openapiFields.add("gps_location");
    openapiFields.add("verified_legal_terms");
    openapiFields.add("date_created");
    openapiFields.add("date_updated");
    openapiFields.add("date_deleted");
    openapiFields.add("email");
    openapiFields.add("missing");
    openapiFields.add("uuid");
    openapiFields.add("participants");
    openapiFields.add("flags");
    openapiFields.add("last_login");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserResponse is not found in the empty JSON string", UserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
      if (jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture").toString()));
      }
      // validate the optional field `email`
      if (jsonObj.getAsJsonObject("email") != null) {
        UserEmail.validateJsonObject(jsonObj.getAsJsonObject("email"));
      }
      // ensure the json data is an array
      if (jsonObj.get("missing") != null && !jsonObj.get("missing").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `missing` to be an array in the JSON string but got `%s`", jsonObj.get("missing").toString()));
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("participants") != null && !jsonObj.get("participants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `participants` to be an array in the JSON string but got `%s`", jsonObj.get("participants").toString()));
      }
      // validate the optional field `flags`
      if (jsonObj.getAsJsonObject("flags") != null) {
        UserFlags.validateJsonObject(jsonObj.getAsJsonObject("flags"));
      }
      if (jsonObj.get("last_login") != null && !jsonObj.get("last_login").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_login` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_login").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UserResponse>() {
           @Override
           public void write(JsonWriter out, UserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserResponse
  * @throws IOException if the JSON string is invalid with respect to UserResponse
  */
  public static UserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserResponse.class);
  }

 /**
  * Convert an instance of UserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

