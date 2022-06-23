/*
 * eHelply SDK - 1.1.93
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.93
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
 * AlarmCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T04:18:44.257297Z[Etc/UTC]")
public class AlarmCreate {
  public static final String SERIALIZED_NAME_PROCESS = "process";
  @SerializedName(SERIALIZED_NAME_PROCESS)
  private String process;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public AlarmCreate() { 
  }

  public AlarmCreate process(String process) {
    
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcess() {
    return process;
  }


  public void setProcess(String process) {
    this.process = process;
  }


  public AlarmCreate severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public AlarmCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlarmCreate summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public AlarmCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmCreate alarmCreate = (AlarmCreate) o;
    return Objects.equals(this.process, alarmCreate.process) &&
        Objects.equals(this.severity, alarmCreate.severity) &&
        Objects.equals(this.name, alarmCreate.name) &&
        Objects.equals(this.summary, alarmCreate.summary) &&
        Objects.equals(this.description, alarmCreate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(process, severity, name, summary, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmCreate {\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("process");
    openapiFields.add("severity");
    openapiFields.add("name");
    openapiFields.add("summary");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlarmCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlarmCreate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlarmCreate is not found in the empty JSON string", AlarmCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlarmCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlarmCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("process") != null && !jsonObj.get("process").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process").toString()));
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlarmCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlarmCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlarmCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlarmCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<AlarmCreate>() {
           @Override
           public void write(JsonWriter out, AlarmCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlarmCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlarmCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlarmCreate
  * @throws IOException if the JSON string is invalid with respect to AlarmCreate
  */
  public static AlarmCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlarmCreate.class);
  }

 /**
  * Convert an instance of AlarmCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

