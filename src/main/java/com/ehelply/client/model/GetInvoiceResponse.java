/*
 * eHelply SDK - 1.1.119
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.119
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.Discount;
import com.ehelply.client.model.LineItem;
import com.ehelply.client.model.Note;
import com.ehelply.client.model.Tax;
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
 * GetInvoiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-29T14:13:55.848369Z[Etc/UTC]")
public class GetInvoiceResponse {
  public static final String SERIALIZED_NAME_INVOICE_UUID = "invoice_uuid";
  @SerializedName(SERIALIZED_NAME_INVOICE_UUID)
  private String invoiceUuid;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "line_items";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private Integer subtotal;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<Discount> discounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<Tax> taxes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<Note> notes = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAID = "paid";
  @SerializedName(SERIALIZED_NAME_PAID)
  private Boolean paid = false;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATE_AT = "update_at";
  @SerializedName(SERIALIZED_NAME_UPDATE_AT)
  private String updateAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public GetInvoiceResponse() { 
  }

  public GetInvoiceResponse invoiceUuid(String invoiceUuid) {
    
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


  public GetInvoiceResponse lineItems(List<LineItem> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public GetInvoiceResponse addLineItemsItem(LineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }


  public GetInvoiceResponse subtotal(Integer subtotal) {
    
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Get subtotal
   * @return subtotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSubtotal() {
    return subtotal;
  }


  public void setSubtotal(Integer subtotal) {
    this.subtotal = subtotal;
  }


  public GetInvoiceResponse discounts(List<Discount> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public GetInvoiceResponse addDiscountsItem(Discount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Discount> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(List<Discount> discounts) {
    this.discounts = discounts;
  }


  public GetInvoiceResponse taxes(List<Tax> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public GetInvoiceResponse addTaxesItem(Tax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Tax> getTaxes() {
    return taxes;
  }


  public void setTaxes(List<Tax> taxes) {
    this.taxes = taxes;
  }


  public GetInvoiceResponse total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public GetInvoiceResponse notes(List<Note> notes) {
    
    this.notes = notes;
    return this;
  }

  public GetInvoiceResponse addNotesItem(Note notesItem) {
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Note> getNotes() {
    return notes;
  }


  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }


  public GetInvoiceResponse paid(Boolean paid) {
    
    this.paid = paid;
    return this;
  }

   /**
   * Get paid
   * @return paid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPaid() {
    return paid;
  }


  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


  public GetInvoiceResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public GetInvoiceResponse updateAt(String updateAt) {
    
    this.updateAt = updateAt;
    return this;
  }

   /**
   * Get updateAt
   * @return updateAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUpdateAt() {
    return updateAt;
  }


  public void setUpdateAt(String updateAt) {
    this.updateAt = updateAt;
  }


  public GetInvoiceResponse deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvoiceResponse getInvoiceResponse = (GetInvoiceResponse) o;
    return Objects.equals(this.invoiceUuid, getInvoiceResponse.invoiceUuid) &&
        Objects.equals(this.lineItems, getInvoiceResponse.lineItems) &&
        Objects.equals(this.subtotal, getInvoiceResponse.subtotal) &&
        Objects.equals(this.discounts, getInvoiceResponse.discounts) &&
        Objects.equals(this.taxes, getInvoiceResponse.taxes) &&
        Objects.equals(this.total, getInvoiceResponse.total) &&
        Objects.equals(this.notes, getInvoiceResponse.notes) &&
        Objects.equals(this.paid, getInvoiceResponse.paid) &&
        Objects.equals(this.createdAt, getInvoiceResponse.createdAt) &&
        Objects.equals(this.updateAt, getInvoiceResponse.updateAt) &&
        Objects.equals(this.deletedAt, getInvoiceResponse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceUuid, lineItems, subtotal, discounts, taxes, total, notes, paid, createdAt, updateAt, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoiceResponse {\n");
    sb.append("    invoiceUuid: ").append(toIndentedString(invoiceUuid)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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
    openapiFields.add("invoice_uuid");
    openapiFields.add("line_items");
    openapiFields.add("subtotal");
    openapiFields.add("discounts");
    openapiFields.add("taxes");
    openapiFields.add("total");
    openapiFields.add("notes");
    openapiFields.add("paid");
    openapiFields.add("created_at");
    openapiFields.add("update_at");
    openapiFields.add("deleted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_uuid");
    openapiRequiredFields.add("line_items");
    openapiRequiredFields.add("subtotal");
    openapiRequiredFields.add("discounts");
    openapiRequiredFields.add("taxes");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("notes");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("update_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetInvoiceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetInvoiceResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetInvoiceResponse is not found in the empty JSON string", GetInvoiceResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetInvoiceResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetInvoiceResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetInvoiceResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("invoice_uuid") != null && !jsonObj.get("invoice_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_uuid").toString()));
      }
      JsonArray jsonArraylineItems = jsonObj.getAsJsonArray("line_items");
      if (jsonArraylineItems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("line_items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `line_items` to be an array in the JSON string but got `%s`", jsonObj.get("line_items").toString()));
        }

        // validate the optional field `line_items` (array)
        for (int i = 0; i < jsonArraylineItems.size(); i++) {
          LineItem.validateJsonObject(jsonArraylineItems.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraydiscounts = jsonObj.getAsJsonArray("discounts");
      if (jsonArraydiscounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("discounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
        }

        // validate the optional field `discounts` (array)
        for (int i = 0; i < jsonArraydiscounts.size(); i++) {
          Discount.validateJsonObject(jsonArraydiscounts.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytaxes = jsonObj.getAsJsonArray("taxes");
      if (jsonArraytaxes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("taxes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `taxes` to be an array in the JSON string but got `%s`", jsonObj.get("taxes").toString()));
        }

        // validate the optional field `taxes` (array)
        for (int i = 0; i < jsonArraytaxes.size(); i++) {
          Tax.validateJsonObject(jsonArraytaxes.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
      if (jsonArraynotes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("notes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
        }

        // validate the optional field `notes` (array)
        for (int i = 0; i < jsonArraynotes.size(); i++) {
          Note.validateJsonObject(jsonArraynotes.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if (jsonObj.get("update_at") != null && !jsonObj.get("update_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_at").toString()));
      }
      if (jsonObj.get("deleted_at") != null && !jsonObj.get("deleted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deleted_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetInvoiceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetInvoiceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetInvoiceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetInvoiceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetInvoiceResponse>() {
           @Override
           public void write(JsonWriter out, GetInvoiceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetInvoiceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetInvoiceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetInvoiceResponse
  * @throws IOException if the JSON string is invalid with respect to GetInvoiceResponse
  */
  public static GetInvoiceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetInvoiceResponse.class);
  }

 /**
  * Convert an instance of GetInvoiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

