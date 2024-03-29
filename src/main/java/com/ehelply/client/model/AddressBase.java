/*
 * eHelply SDK - 1.1.118
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.118
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
 * **:param** address_type                        **type:** string or None  **:param** address_line_1                      **type:** string or None  **:param** address_line_2                      **type:** string or None  **:param** postal_zip_code                     **type:** string or None  **:param** city                                **type:** string or None  **:param** province_state                      **type:** string or None  **:param** country                             **type:** string or None  **:param** lat                                 **type:** string or None  **:param** lng                                 **type:** string or None
 */
@ApiModel(description = "**:param** address_type                        **type:** string or None  **:param** address_line_1                      **type:** string or None  **:param** address_line_2                      **type:** string or None  **:param** postal_zip_code                     **type:** string or None  **:param** city                                **type:** string or None  **:param** province_state                      **type:** string or None  **:param** country                             **type:** string or None  **:param** lat                                 **type:** string or None  **:param** lng                                 **type:** string or None")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-18T16:17:48.272343Z[Etc/UTC]")
public class AddressBase {
  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "address_type";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line_1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line_2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_POSTAL_ZIP_CODE = "postal_zip_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_ZIP_CODE)
  private String postalZipCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PROVINCE_STATE = "province_state";
  @SerializedName(SERIALIZED_NAME_PROVINCE_STATE)
  private String provinceState;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private String lat;

  public static final String SERIALIZED_NAME_LNG = "lng";
  @SerializedName(SERIALIZED_NAME_LNG)
  private String lng;

  public AddressBase() { 
  }

  public AddressBase addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mailing", value = "")

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public AddressBase addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234 Street Name", value = "")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public AddressBase addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unit #2", value = "")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public AddressBase postalZipCode(String postalZipCode) {
    
    this.postalZipCode = postalZipCode;
    return this;
  }

   /**
   * Get postalZipCode
   * @return postalZipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 456", value = "")

  public String getPostalZipCode() {
    return postalZipCode;
  }


  public void setPostalZipCode(String postalZipCode) {
    this.postalZipCode = postalZipCode;
  }


  public AddressBase city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "city name", value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AddressBase provinceState(String provinceState) {
    
    this.provinceState = provinceState;
    return this;
  }

   /**
   * Get provinceState
   * @return provinceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "province", value = "")

  public String getProvinceState() {
    return provinceState;
  }


  public void setProvinceState(String provinceState) {
    this.provinceState = provinceState;
  }


  public AddressBase country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Canada", value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public AddressBase lat(String lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public String getLat() {
    return lat;
  }


  public void setLat(String lat) {
    this.lat = lat;
  }


  public AddressBase lng(String lng) {
    
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * @return lng
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-123", value = "")

  public String getLng() {
    return lng;
  }


  public void setLng(String lng) {
    this.lng = lng;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBase addressBase = (AddressBase) o;
    return Objects.equals(this.addressType, addressBase.addressType) &&
        Objects.equals(this.addressLine1, addressBase.addressLine1) &&
        Objects.equals(this.addressLine2, addressBase.addressLine2) &&
        Objects.equals(this.postalZipCode, addressBase.postalZipCode) &&
        Objects.equals(this.city, addressBase.city) &&
        Objects.equals(this.provinceState, addressBase.provinceState) &&
        Objects.equals(this.country, addressBase.country) &&
        Objects.equals(this.lat, addressBase.lat) &&
        Objects.equals(this.lng, addressBase.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine1, addressLine2, postalZipCode, city, provinceState, country, lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBase {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    postalZipCode: ").append(toIndentedString(postalZipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    provinceState: ").append(toIndentedString(provinceState)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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
    openapiFields.add("address_type");
    openapiFields.add("address_line_1");
    openapiFields.add("address_line_2");
    openapiFields.add("postal_zip_code");
    openapiFields.add("city");
    openapiFields.add("province_state");
    openapiFields.add("country");
    openapiFields.add("lat");
    openapiFields.add("lng");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddressBase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressBase is not found in the empty JSON string", AddressBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddressBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address_type") != null && !jsonObj.get("address_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_type").toString()));
      }
      if (jsonObj.get("address_line_1") != null && !jsonObj.get("address_line_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_1").toString()));
      }
      if (jsonObj.get("address_line_2") != null && !jsonObj.get("address_line_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line_2").toString()));
      }
      if (jsonObj.get("postal_zip_code") != null && !jsonObj.get("postal_zip_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_zip_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_zip_code").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("province_state") != null && !jsonObj.get("province_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_state").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("lat") != null && !jsonObj.get("lat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lat").toString()));
      }
      if (jsonObj.get("lng") != null && !jsonObj.get("lng").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lng` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lng").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressBase.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressBase>() {
           @Override
           public void write(JsonWriter out, AddressBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressBase
  * @throws IOException if the JSON string is invalid with respect to AddressBase
  */
  public static AddressBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressBase.class);
  }

 /**
  * Convert an instance of AddressBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

