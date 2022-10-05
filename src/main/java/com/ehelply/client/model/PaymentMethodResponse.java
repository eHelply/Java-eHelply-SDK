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
 * PaymentMethodResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T20:43:53.929130Z[Etc/UTC]")
public class PaymentMethodResponse {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_LAST4_DIGITS = "last_4_digits";
  @SerializedName(SERIALIZED_NAME_LAST4_DIGITS)
  private String last4Digits;

  public static final String SERIALIZED_NAME_CARD_BRAND = "card_brand";
  @SerializedName(SERIALIZED_NAME_CARD_BRAND)
  private String cardBrand;

  public static final String SERIALIZED_NAME_PROJECT_UUID = "project_uuid";
  @SerializedName(SERIALIZED_NAME_PROJECT_UUID)
  private String projectUuid;

  public PaymentMethodResponse() { 
  }

  public PaymentMethodResponse paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentMethodResponse last4Digits(String last4Digits) {
    
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * Get last4Digits
   * @return last4Digits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLast4Digits() {
    return last4Digits;
  }


  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  public PaymentMethodResponse cardBrand(String cardBrand) {
    
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * Get cardBrand
   * @return cardBrand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCardBrand() {
    return cardBrand;
  }


  public void setCardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
  }


  public PaymentMethodResponse projectUuid(String projectUuid) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodResponse paymentMethodResponse = (PaymentMethodResponse) o;
    return Objects.equals(this.paymentId, paymentMethodResponse.paymentId) &&
        Objects.equals(this.last4Digits, paymentMethodResponse.last4Digits) &&
        Objects.equals(this.cardBrand, paymentMethodResponse.cardBrand) &&
        Objects.equals(this.projectUuid, paymentMethodResponse.projectUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, last4Digits, cardBrand, projectUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
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
    openapiFields.add("payment_id");
    openapiFields.add("last_4_digits");
    openapiFields.add("card_brand");
    openapiFields.add("project_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_id");
    openapiRequiredFields.add("last_4_digits");
    openapiRequiredFields.add("card_brand");
    openapiRequiredFields.add("project_uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethodResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMethodResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethodResponse is not found in the empty JSON string", PaymentMethodResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentMethodResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentMethodResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMethodResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if (jsonObj.get("last_4_digits") != null && !jsonObj.get("last_4_digits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_4_digits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_4_digits").toString()));
      }
      if (jsonObj.get("card_brand") != null && !jsonObj.get("card_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_brand").toString()));
      }
      if (jsonObj.get("project_uuid") != null && !jsonObj.get("project_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodResponse>() {
           @Override
           public void write(JsonWriter out, PaymentMethodResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodResponse
  */
  public static PaymentMethodResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodResponse.class);
  }

 /**
  * Convert an instance of PaymentMethodResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

