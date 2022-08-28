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
import com.ehelply.client.model.GetInvoiceResponse;
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
 * GetProjectInvoiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-28T15:22:53.769041Z[Etc/UTC]")
public class GetProjectInvoiceResponse {
  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public static final String SERIALIZED_NAME_INVOICE_UUID = "invoice_uuid";
  @SerializedName(SERIALIZED_NAME_INVOICE_UUID)
  private String invoiceUuid;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private GetInvoiceResponse invoice;

  public GetProjectInvoiceResponse() { 
  }

  public GetProjectInvoiceResponse projectUuid(String projectUuid) {
    
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


  public GetProjectInvoiceResponse invoiceUuid(String invoiceUuid) {
    
    this.invoiceUuid = invoiceUuid;
    return this;
  }

   /**
   * Get invoiceUuid
   * @return invoiceUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInvoiceUuid() {
    return invoiceUuid;
  }


  public void setInvoiceUuid(String invoiceUuid) {
    this.invoiceUuid = invoiceUuid;
  }


  public GetProjectInvoiceResponse year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  public GetProjectInvoiceResponse month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public GetProjectInvoiceResponse createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GetProjectInvoiceResponse invoice(GetInvoiceResponse invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetInvoiceResponse getInvoice() {
    return invoice;
  }


  public void setInvoice(GetInvoiceResponse invoice) {
    this.invoice = invoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProjectInvoiceResponse getProjectInvoiceResponse = (GetProjectInvoiceResponse) o;
    return Objects.equals(this.projectUuid, getProjectInvoiceResponse.projectUuid) &&
        Objects.equals(this.invoiceUuid, getProjectInvoiceResponse.invoiceUuid) &&
        Objects.equals(this.year, getProjectInvoiceResponse.year) &&
        Objects.equals(this.month, getProjectInvoiceResponse.month) &&
        Objects.equals(this.createdBy, getProjectInvoiceResponse.createdBy) &&
        Objects.equals(this.invoice, getProjectInvoiceResponse.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectUuid, invoiceUuid, year, month, createdBy, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectInvoiceResponse {\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
    sb.append("    invoiceUuid: ").append(toIndentedString(invoiceUuid)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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
    openapiFields.add("invoice_uuid");
    openapiFields.add("year");
    openapiFields.add("month");
    openapiFields.add("created_by");
    openapiFields.add("invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project_uuid");
    openapiRequiredFields.add("invoice_uuid");
    openapiRequiredFields.add("year");
    openapiRequiredFields.add("month");
    openapiRequiredFields.add("created_by");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetProjectInvoiceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetProjectInvoiceResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProjectInvoiceResponse is not found in the empty JSON string", GetProjectInvoiceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetProjectInvoiceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProjectInvoiceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProjectInvoiceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
      if (jsonObj.get("invoice_uuid") != null && !jsonObj.get("invoice_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_uuid").toString()));
      }
      if (jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      // validate the optional field `invoice`
      if (jsonObj.getAsJsonObject("invoice") != null) {
        GetInvoiceResponse.validateJsonObject(jsonObj.getAsJsonObject("invoice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProjectInvoiceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProjectInvoiceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProjectInvoiceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProjectInvoiceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProjectInvoiceResponse>() {
           @Override
           public void write(JsonWriter out, GetProjectInvoiceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProjectInvoiceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetProjectInvoiceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProjectInvoiceResponse
  * @throws IOException if the JSON string is invalid with respect to GetProjectInvoiceResponse
  */
  public static GetProjectInvoiceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProjectInvoiceResponse.class);
  }

 /**
  * Convert an instance of GetProjectInvoiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

