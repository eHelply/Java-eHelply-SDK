/*
 * eHelply SDK - 1.1.105
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.105
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
 * AttachPaymentToProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-28T02:36:30.814140Z[Etc/UTC]")
public class AttachPaymentToProject {
  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "payment_type";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_EXP_MONTH = "exp_month";
  @SerializedName(SERIALIZED_NAME_EXP_MONTH)
  private Integer expMonth;

  public static final String SERIALIZED_NAME_EXP_YEAR = "exp_year";
  @SerializedName(SERIALIZED_NAME_EXP_YEAR)
  private Integer expYear;

  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public AttachPaymentToProject() { 
  }

  public AttachPaymentToProject paymentType(String paymentType) {
    
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPaymentType() {
    return paymentType;
  }


  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  public AttachPaymentToProject number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public AttachPaymentToProject expMonth(Integer expMonth) {
    
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Get expMonth
   * @return expMonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getExpMonth() {
    return expMonth;
  }


  public void setExpMonth(Integer expMonth) {
    this.expMonth = expMonth;
  }


  public AttachPaymentToProject expYear(Integer expYear) {
    
    this.expYear = expYear;
    return this;
  }

   /**
   * Get expYear
   * @return expYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getExpYear() {
    return expYear;
  }


  public void setExpYear(Integer expYear) {
    this.expYear = expYear;
  }


  public AttachPaymentToProject cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * Get cvc
   * @return cvc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachPaymentToProject attachPaymentToProject = (AttachPaymentToProject) o;
    return Objects.equals(this.paymentType, attachPaymentToProject.paymentType) &&
        Objects.equals(this.number, attachPaymentToProject.number) &&
        Objects.equals(this.expMonth, attachPaymentToProject.expMonth) &&
        Objects.equals(this.expYear, attachPaymentToProject.expYear) &&
        Objects.equals(this.cvc, attachPaymentToProject.cvc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, number, expMonth, expYear, cvc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachPaymentToProject {\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
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
    openapiFields.add("payment_type");
    openapiFields.add("number");
    openapiFields.add("exp_month");
    openapiFields.add("exp_year");
    openapiFields.add("cvc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_type");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("exp_month");
    openapiRequiredFields.add("exp_year");
    openapiRequiredFields.add("cvc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachPaymentToProject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachPaymentToProject.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachPaymentToProject is not found in the empty JSON string", AttachPaymentToProject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachPaymentToProject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachPaymentToProject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AttachPaymentToProject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("payment_type") != null && !jsonObj.get("payment_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_type").toString()));
      }
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if (jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachPaymentToProject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachPaymentToProject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachPaymentToProject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachPaymentToProject.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachPaymentToProject>() {
           @Override
           public void write(JsonWriter out, AttachPaymentToProject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachPaymentToProject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachPaymentToProject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachPaymentToProject
  * @throws IOException if the JSON string is invalid with respect to AttachPaymentToProject
  */
  public static AttachPaymentToProject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachPaymentToProject.class);
  }

 /**
  * Convert an instance of AttachPaymentToProject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

