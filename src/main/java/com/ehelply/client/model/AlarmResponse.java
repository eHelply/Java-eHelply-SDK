/*
 * eHelply SDK - 1.1.87
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.87
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
 * AlarmResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T21:52:09.863537Z[Etc/UTC]")
public class AlarmResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_SERVICE_UUID = "service_uuid";
  @SerializedName(SERIALIZED_NAME_SERVICE_UUID)
  private String serviceUuid;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private String stage;

  public static final String SERIALIZED_NAME_PROCESS = "process";
  @SerializedName(SERIALIZED_NAME_PROCESS)
  private String process;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_TICKET_UUID = "ticket_uuid";
  @SerializedName(SERIALIZED_NAME_TICKET_UUID)
  private String ticketUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private List<Object> note = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_LATEST_AT = "latest_at";
  @SerializedName(SERIALIZED_NAME_LATEST_AT)
  private String latestAt;

  public static final String SERIALIZED_NAME_ACKNOWLEDGED_AT = "acknowledged_at";
  @SerializedName(SERIALIZED_NAME_ACKNOWLEDGED_AT)
  private String acknowledgedAt;

  public static final String SERIALIZED_NAME_IGNORED_AT = "ignored_at";
  @SerializedName(SERIALIZED_NAME_IGNORED_AT)
  private String ignoredAt;

  public static final String SERIALIZED_NAME_CLEARED_AT = "cleared_at";
  @SerializedName(SERIALIZED_NAME_CLEARED_AT)
  private String clearedAt;

  public static final String SERIALIZED_NAME_TERMINATED_AT = "terminated_at";
  @SerializedName(SERIALIZED_NAME_TERMINATED_AT)
  private String terminatedAt;

  public static final String SERIALIZED_NAME_ASSIGNEE_UUID = "assignee_uuid";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_UUID)
  private String assigneeUuid;

  public static final String SERIALIZED_NAME_ACKNOWLEDGER_UUID = "acknowledger_uuid";
  @SerializedName(SERIALIZED_NAME_ACKNOWLEDGER_UUID)
  private String acknowledgerUuid;

  public static final String SERIALIZED_NAME_IGNORER_UUID = "ignorer_uuid";
  @SerializedName(SERIALIZED_NAME_IGNORER_UUID)
  private String ignorerUuid;

  public static final String SERIALIZED_NAME_TERMINATER_UUID = "terminater_uuid";
  @SerializedName(SERIALIZED_NAME_TERMINATER_UUID)
  private String terminaterUuid;

  public AlarmResponse() { 
  }

  public AlarmResponse uuid(String uuid) {
    
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


  public AlarmResponse serviceUuid(String serviceUuid) {
    
    this.serviceUuid = serviceUuid;
    return this;
  }

   /**
   * Get serviceUuid
   * @return serviceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceUuid() {
    return serviceUuid;
  }


  public void setServiceUuid(String serviceUuid) {
    this.serviceUuid = serviceUuid;
  }


  public AlarmResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public AlarmResponse stage(String stage) {
    
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStage() {
    return stage;
  }


  public void setStage(String stage) {
    this.stage = stage;
  }


  public AlarmResponse process(String process) {
    
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


  public AlarmResponse severity(String severity) {
    
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


  public AlarmResponse ticketUuid(String ticketUuid) {
    
    this.ticketUuid = ticketUuid;
    return this;
  }

   /**
   * Get ticketUuid
   * @return ticketUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTicketUuid() {
    return ticketUuid;
  }


  public void setTicketUuid(String ticketUuid) {
    this.ticketUuid = ticketUuid;
  }


  public AlarmResponse name(String name) {
    
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


  public AlarmResponse summary(String summary) {
    
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


  public AlarmResponse description(String description) {
    
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


  public AlarmResponse note(List<Object> note) {
    
    this.note = note;
    return this;
  }

  public AlarmResponse addNoteItem(Object noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getNote() {
    return note;
  }


  public void setNote(List<Object> note) {
    this.note = note;
  }


  public AlarmResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AlarmResponse latestAt(String latestAt) {
    
    this.latestAt = latestAt;
    return this;
  }

   /**
   * Get latestAt
   * @return latestAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatestAt() {
    return latestAt;
  }


  public void setLatestAt(String latestAt) {
    this.latestAt = latestAt;
  }


  public AlarmResponse acknowledgedAt(String acknowledgedAt) {
    
    this.acknowledgedAt = acknowledgedAt;
    return this;
  }

   /**
   * Get acknowledgedAt
   * @return acknowledgedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcknowledgedAt() {
    return acknowledgedAt;
  }


  public void setAcknowledgedAt(String acknowledgedAt) {
    this.acknowledgedAt = acknowledgedAt;
  }


  public AlarmResponse ignoredAt(String ignoredAt) {
    
    this.ignoredAt = ignoredAt;
    return this;
  }

   /**
   * Get ignoredAt
   * @return ignoredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIgnoredAt() {
    return ignoredAt;
  }


  public void setIgnoredAt(String ignoredAt) {
    this.ignoredAt = ignoredAt;
  }


  public AlarmResponse clearedAt(String clearedAt) {
    
    this.clearedAt = clearedAt;
    return this;
  }

   /**
   * Get clearedAt
   * @return clearedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClearedAt() {
    return clearedAt;
  }


  public void setClearedAt(String clearedAt) {
    this.clearedAt = clearedAt;
  }


  public AlarmResponse terminatedAt(String terminatedAt) {
    
    this.terminatedAt = terminatedAt;
    return this;
  }

   /**
   * Get terminatedAt
   * @return terminatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTerminatedAt() {
    return terminatedAt;
  }


  public void setTerminatedAt(String terminatedAt) {
    this.terminatedAt = terminatedAt;
  }


  public AlarmResponse assigneeUuid(String assigneeUuid) {
    
    this.assigneeUuid = assigneeUuid;
    return this;
  }

   /**
   * Get assigneeUuid
   * @return assigneeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssigneeUuid() {
    return assigneeUuid;
  }


  public void setAssigneeUuid(String assigneeUuid) {
    this.assigneeUuid = assigneeUuid;
  }


  public AlarmResponse acknowledgerUuid(String acknowledgerUuid) {
    
    this.acknowledgerUuid = acknowledgerUuid;
    return this;
  }

   /**
   * Get acknowledgerUuid
   * @return acknowledgerUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcknowledgerUuid() {
    return acknowledgerUuid;
  }


  public void setAcknowledgerUuid(String acknowledgerUuid) {
    this.acknowledgerUuid = acknowledgerUuid;
  }


  public AlarmResponse ignorerUuid(String ignorerUuid) {
    
    this.ignorerUuid = ignorerUuid;
    return this;
  }

   /**
   * Get ignorerUuid
   * @return ignorerUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIgnorerUuid() {
    return ignorerUuid;
  }


  public void setIgnorerUuid(String ignorerUuid) {
    this.ignorerUuid = ignorerUuid;
  }


  public AlarmResponse terminaterUuid(String terminaterUuid) {
    
    this.terminaterUuid = terminaterUuid;
    return this;
  }

   /**
   * Get terminaterUuid
   * @return terminaterUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTerminaterUuid() {
    return terminaterUuid;
  }


  public void setTerminaterUuid(String terminaterUuid) {
    this.terminaterUuid = terminaterUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmResponse alarmResponse = (AlarmResponse) o;
    return Objects.equals(this.uuid, alarmResponse.uuid) &&
        Objects.equals(this.serviceUuid, alarmResponse.serviceUuid) &&
        Objects.equals(this.count, alarmResponse.count) &&
        Objects.equals(this.stage, alarmResponse.stage) &&
        Objects.equals(this.process, alarmResponse.process) &&
        Objects.equals(this.severity, alarmResponse.severity) &&
        Objects.equals(this.ticketUuid, alarmResponse.ticketUuid) &&
        Objects.equals(this.name, alarmResponse.name) &&
        Objects.equals(this.summary, alarmResponse.summary) &&
        Objects.equals(this.description, alarmResponse.description) &&
        Objects.equals(this.note, alarmResponse.note) &&
        Objects.equals(this.createdAt, alarmResponse.createdAt) &&
        Objects.equals(this.latestAt, alarmResponse.latestAt) &&
        Objects.equals(this.acknowledgedAt, alarmResponse.acknowledgedAt) &&
        Objects.equals(this.ignoredAt, alarmResponse.ignoredAt) &&
        Objects.equals(this.clearedAt, alarmResponse.clearedAt) &&
        Objects.equals(this.terminatedAt, alarmResponse.terminatedAt) &&
        Objects.equals(this.assigneeUuid, alarmResponse.assigneeUuid) &&
        Objects.equals(this.acknowledgerUuid, alarmResponse.acknowledgerUuid) &&
        Objects.equals(this.ignorerUuid, alarmResponse.ignorerUuid) &&
        Objects.equals(this.terminaterUuid, alarmResponse.terminaterUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, serviceUuid, count, stage, process, severity, ticketUuid, name, summary, description, note, createdAt, latestAt, acknowledgedAt, ignoredAt, clearedAt, terminatedAt, assigneeUuid, acknowledgerUuid, ignorerUuid, terminaterUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    serviceUuid: ").append(toIndentedString(serviceUuid)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    ticketUuid: ").append(toIndentedString(ticketUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    latestAt: ").append(toIndentedString(latestAt)).append("\n");
    sb.append("    acknowledgedAt: ").append(toIndentedString(acknowledgedAt)).append("\n");
    sb.append("    ignoredAt: ").append(toIndentedString(ignoredAt)).append("\n");
    sb.append("    clearedAt: ").append(toIndentedString(clearedAt)).append("\n");
    sb.append("    terminatedAt: ").append(toIndentedString(terminatedAt)).append("\n");
    sb.append("    assigneeUuid: ").append(toIndentedString(assigneeUuid)).append("\n");
    sb.append("    acknowledgerUuid: ").append(toIndentedString(acknowledgerUuid)).append("\n");
    sb.append("    ignorerUuid: ").append(toIndentedString(ignorerUuid)).append("\n");
    sb.append("    terminaterUuid: ").append(toIndentedString(terminaterUuid)).append("\n");
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
    openapiFields.add("service_uuid");
    openapiFields.add("count");
    openapiFields.add("stage");
    openapiFields.add("process");
    openapiFields.add("severity");
    openapiFields.add("ticket_uuid");
    openapiFields.add("name");
    openapiFields.add("summary");
    openapiFields.add("description");
    openapiFields.add("note");
    openapiFields.add("created_at");
    openapiFields.add("latest_at");
    openapiFields.add("acknowledged_at");
    openapiFields.add("ignored_at");
    openapiFields.add("cleared_at");
    openapiFields.add("terminated_at");
    openapiFields.add("assignee_uuid");
    openapiFields.add("acknowledger_uuid");
    openapiFields.add("ignorer_uuid");
    openapiFields.add("terminater_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlarmResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlarmResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlarmResponse is not found in the empty JSON string", AlarmResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlarmResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlarmResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("service_uuid") != null && !jsonObj.get("service_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_uuid").toString()));
      }
      if (jsonObj.get("stage") != null && !jsonObj.get("stage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stage").toString()));
      }
      if (jsonObj.get("process") != null && !jsonObj.get("process").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process").toString()));
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("ticket_uuid") != null && !jsonObj.get("ticket_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticket_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticket_uuid").toString()));
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
      // ensure the json data is an array
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be an array in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("latest_at") != null && !jsonObj.get("latest_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_at").toString()));
      }
      if (jsonObj.get("acknowledged_at") != null && !jsonObj.get("acknowledged_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acknowledged_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acknowledged_at").toString()));
      }
      if (jsonObj.get("ignored_at") != null && !jsonObj.get("ignored_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignored_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ignored_at").toString()));
      }
      if (jsonObj.get("cleared_at") != null && !jsonObj.get("cleared_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cleared_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cleared_at").toString()));
      }
      if (jsonObj.get("terminated_at") != null && !jsonObj.get("terminated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminated_at").toString()));
      }
      if (jsonObj.get("assignee_uuid") != null && !jsonObj.get("assignee_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignee_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignee_uuid").toString()));
      }
      if (jsonObj.get("acknowledger_uuid") != null && !jsonObj.get("acknowledger_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acknowledger_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acknowledger_uuid").toString()));
      }
      if (jsonObj.get("ignorer_uuid") != null && !jsonObj.get("ignorer_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ignorer_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ignorer_uuid").toString()));
      }
      if (jsonObj.get("terminater_uuid") != null && !jsonObj.get("terminater_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminater_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminater_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlarmResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlarmResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlarmResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlarmResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AlarmResponse>() {
           @Override
           public void write(JsonWriter out, AlarmResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlarmResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlarmResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlarmResponse
  * @throws IOException if the JSON string is invalid with respect to AlarmResponse
  */
  public static AlarmResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlarmResponse.class);
  }

 /**
  * Convert an instance of AlarmResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

