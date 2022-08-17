/*
 * eHelply SDK - 1.1.102
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.102
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.History;
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
 * GetProjectInvoiceHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-17T20:38:15.683271Z[Etc/UTC]")
public class GetProjectInvoiceHistory {
  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_INVOICE_HISTORY = "invoice_history";
  @SerializedName(SERIALIZED_NAME_INVOICE_HISTORY)
  private List<History> invoiceHistory = null;

  public GetProjectInvoiceHistory() { 
  }

  public GetProjectInvoiceHistory projectUuid(String projectUuid) {
    
    this.projectUuid = projectUuid;
    return this;
  }

   /**
   * Get projectUuid
   * @return projectUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProjectUuid() {
    return projectUuid;
  }


  public void setProjectUuid(String projectUuid) {
    this.projectUuid = projectUuid;
  }


  public GetProjectInvoiceHistory invoiceHistory(List<History> invoiceHistory) {
    
    this.invoiceHistory = invoiceHistory;
    return this;
  }

  public GetProjectInvoiceHistory addInvoiceHistoryItem(History invoiceHistoryItem) {
    if (this.invoiceHistory == null) {
      this.invoiceHistory = new ArrayList<>();
    }
    this.invoiceHistory.add(invoiceHistoryItem);
    return this;
  }

   /**
   * Get invoiceHistory
   * @return invoiceHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<History> getInvoiceHistory() {
    return invoiceHistory;
  }


  public void setInvoiceHistory(List<History> invoiceHistory) {
    this.invoiceHistory = invoiceHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProjectInvoiceHistory getProjectInvoiceHistory = (GetProjectInvoiceHistory) o;
    return Objects.equals(this.projectUuid, getProjectInvoiceHistory.projectUuid) &&
        Objects.equals(this.invoiceHistory, getProjectInvoiceHistory.invoiceHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectUuid, invoiceHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectInvoiceHistory {\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    invoiceHistory: ").append(toIndentedString(invoiceHistory)).append("\n");
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
    openapiFields.add("project_uuid");
    openapiFields.add("invoice_history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetProjectInvoiceHistory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetProjectInvoiceHistory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProjectInvoiceHistory is not found in the empty JSON string", GetProjectInvoiceHistory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetProjectInvoiceHistory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProjectInvoiceHistory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProjectInvoiceHistory.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
      JsonArray jsonArrayinvoiceHistory = jsonObj.getAsJsonArray("invoice_history");
      if (jsonArrayinvoiceHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_history").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_history` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_history").toString()));
        }

        // validate the optional field `invoice_history` (array)
        for (int i = 0; i < jsonArrayinvoiceHistory.size(); i++) {
          History.validateJsonObject(jsonArrayinvoiceHistory.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProjectInvoiceHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProjectInvoiceHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProjectInvoiceHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProjectInvoiceHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProjectInvoiceHistory>() {
           @Override
           public void write(JsonWriter out, GetProjectInvoiceHistory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProjectInvoiceHistory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetProjectInvoiceHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProjectInvoiceHistory
  * @throws IOException if the JSON string is invalid with respect to GetProjectInvoiceHistory
  */
  public static GetProjectInvoiceHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProjectInvoiceHistory.class);
  }

 /**
  * Convert an instance of GetProjectInvoiceHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

