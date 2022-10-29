/*
 * eHelply SDK - 1.1.115
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.115
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
 * Default participant UUID
 */
@ApiModel(description = "Default participant UUID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-29T14:14:58.899442Z[Etc/UTC]")
public class UserSignupReturn {
  public static final String SERIALIZED_NAME_PARTICIPANT_UUID = "participant_uuid";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_UUID)
  private String participantUuid;

  public UserSignupReturn() { 
  }

  public UserSignupReturn participantUuid(String participantUuid) {
    
    this.participantUuid = participantUuid;
    return this;
  }

   /**
   * Get participantUuid
   * @return participantUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getParticipantUuid() {
    return participantUuid;
  }


  public void setParticipantUuid(String participantUuid) {
    this.participantUuid = participantUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignupReturn userSignupReturn = (UserSignupReturn) o;
    return Objects.equals(this.participantUuid, userSignupReturn.participantUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignupReturn {\n");
    sb.append("    participantUuid: ").append(toIndentedString(participantUuid)).append("\n");
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
    openapiFields.add("participant_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("participant_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserSignupReturn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserSignupReturn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSignupReturn is not found in the empty JSON string", UserSignupReturn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserSignupReturn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserSignupReturn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserSignupReturn.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("participant_uuid") != null && !jsonObj.get("participant_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participant_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participant_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSignupReturn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSignupReturn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSignupReturn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSignupReturn.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSignupReturn>() {
           @Override
           public void write(JsonWriter out, UserSignupReturn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSignupReturn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSignupReturn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSignupReturn
  * @throws IOException if the JSON string is invalid with respect to UserSignupReturn
  */
  public static UserSignupReturn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSignupReturn.class);
  }

 /**
  * Convert an instance of UserSignupReturn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

