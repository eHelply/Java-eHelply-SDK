/*
 * eHelply SDK - 1.1.111
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.111
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
 * GetTransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-28T02:36:34.595144Z[Etc/UTC]")
public class GetTransactionResponse {
  public static final String SERIALIZED_NAME_INVOICE = "invoice";
  @SerializedName(SERIALIZED_NAME_INVOICE)
  private GetInvoiceResponse invoice;

  public static final String SERIALIZED_NAME_TRANSACTION_UUID = "transaction_uuid";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_UUID)
  private String transactionUuid;

  public static final String SERIALIZED_NAME_STRIPE_ID = "stripe_id";
  @SerializedName(SERIALIZED_NAME_STRIPE_ID)
  private String stripeId;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private Integer credit;

  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private Integer debit;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public GetTransactionResponse() { 
  }

  public GetTransactionResponse invoice(GetInvoiceResponse invoice) {
    
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


  public GetTransactionResponse transactionUuid(String transactionUuid) {
    
    this.transactionUuid = transactionUuid;
    return this;
  }

   /**
   * Get transactionUuid
   * @return transactionUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTransactionUuid() {
    return transactionUuid;
  }


  public void setTransactionUuid(String transactionUuid) {
    this.transactionUuid = transactionUuid;
  }


  public GetTransactionResponse stripeId(String stripeId) {
    
    this.stripeId = stripeId;
    return this;
  }

   /**
   * Get stripeId
   * @return stripeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStripeId() {
    return stripeId;
  }


  public void setStripeId(String stripeId) {
    this.stripeId = stripeId;
  }


  public GetTransactionResponse credit(Integer credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCredit() {
    return credit;
  }


  public void setCredit(Integer credit) {
    this.credit = credit;
  }


  public GetTransactionResponse debit(Integer debit) {
    
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDebit() {
    return debit;
  }


  public void setDebit(Integer debit) {
    this.debit = debit;
  }


  public GetTransactionResponse createdAt(String createdAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionResponse getTransactionResponse = (GetTransactionResponse) o;
    return Objects.equals(this.invoice, getTransactionResponse.invoice) &&
        Objects.equals(this.transactionUuid, getTransactionResponse.transactionUuid) &&
        Objects.equals(this.stripeId, getTransactionResponse.stripeId) &&
        Objects.equals(this.credit, getTransactionResponse.credit) &&
        Objects.equals(this.debit, getTransactionResponse.debit) &&
        Objects.equals(this.createdAt, getTransactionResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, transactionUuid, stripeId, credit, debit, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionResponse {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    transactionUuid: ").append(toIndentedString(transactionUuid)).append("\n");
    sb.append("    stripeId: ").append(toIndentedString(stripeId)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("invoice");
    openapiFields.add("transaction_uuid");
    openapiFields.add("stripe_id");
    openapiFields.add("credit");
    openapiFields.add("debit");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transaction_uuid");
    openapiRequiredFields.add("stripe_id");
    openapiRequiredFields.add("credit");
    openapiRequiredFields.add("debit");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTransactionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTransactionResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionResponse is not found in the empty JSON string", GetTransactionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTransactionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTransactionResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `invoice`
      if (jsonObj.getAsJsonObject("invoice") != null) {
        GetInvoiceResponse.validateJsonObject(jsonObj.getAsJsonObject("invoice"));
      }
      if (jsonObj.get("transaction_uuid") != null && !jsonObj.get("transaction_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_uuid").toString()));
      }
      if (jsonObj.get("stripe_id") != null && !jsonObj.get("stripe_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_id").toString()));
      }
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionResponse>() {
           @Override
           public void write(JsonWriter out, GetTransactionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTransactionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionResponse
  * @throws IOException if the JSON string is invalid with respect to GetTransactionResponse
  */
  public static GetTransactionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionResponse.class);
  }

 /**
  * Convert an instance of GetTransactionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

