/*
 * eHelply SDK - 1.1.114
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.114
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
 * AlarmTicket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-19T16:14:05.123210Z[Etc/UTC]")
public class AlarmTicket {
  public static final String SERIALIZED_NAME_TICKET_UUID = "ticket_uuid";
  @SerializedName(SERIALIZED_NAME_TICKET_UUID)
  private String ticketUuid;

  public AlarmTicket() { 
  }

  public AlarmTicket ticketUuid(String ticketUuid) {
    
    this.ticketUuid = ticketUuid;
    return this;
  }

   /**
   * Get ticketUuid
   * @return ticketUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTicketUuid() {
    return ticketUuid;
  }


  public void setTicketUuid(String ticketUuid) {
    this.ticketUuid = ticketUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmTicket alarmTicket = (AlarmTicket) o;
    return Objects.equals(this.ticketUuid, alarmTicket.ticketUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmTicket {\n");
    sb.append("    ticketUuid: ").append(toIndentedString(ticketUuid)).append("\n");
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
    openapiFields.add("ticket_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ticket_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlarmTicket
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlarmTicket.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlarmTicket is not found in the empty JSON string", AlarmTicket.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlarmTicket.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlarmTicket` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlarmTicket.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ticket_uuid") != null && !jsonObj.get("ticket_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlarmTicket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlarmTicket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlarmTicket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlarmTicket.class));

       return (TypeAdapter<T>) new TypeAdapter<AlarmTicket>() {
           @Override
           public void write(JsonWriter out, AlarmTicket value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlarmTicket read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlarmTicket given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlarmTicket
  * @throws IOException if the JSON string is invalid with respect to AlarmTicket
  */
  public static AlarmTicket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlarmTicket.class);
  }

 /**
  * Convert an instance of AlarmTicket to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

