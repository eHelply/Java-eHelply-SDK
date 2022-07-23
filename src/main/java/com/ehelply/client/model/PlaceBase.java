/*
 * eHelply SDK - 1.1.98
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.98
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.AddressBase;
import com.ehelply.client.model.ContactBase;
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
 * **:param** name                                **type:** string **:param** summary                             **type:** string or None  **:param** public                              **type:** bool or None  **:param** meta                                **type:** dict or None  **:param** addresses                           **type:** PlaceAddress or None  **:param** contact                             **type:** ContactBase or None
 */
@ApiModel(description = "**:param** name                                **type:** string **:param** summary                             **type:** string or None  **:param** public                              **type:** bool or None  **:param** meta                                **type:** dict or None  **:param** addresses                           **type:** PlaceAddress or None  **:param** contact                             **type:** ContactBase or None")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-23T01:42:38.023302Z[Etc/UTC]")
public class PlaceBase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public = true;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<AddressBase> addresses = null;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ContactBase contact;

  public PlaceBase() { 
  }

  public PlaceBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Example Clinic", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PlaceBase summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Summary of the clinic", value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public PlaceBase _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public PlaceBase meta(Object meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "")

  public Object getMeta() {
    return meta;
  }


  public void setMeta(Object meta) {
    this.meta = meta;
  }


  public PlaceBase addresses(List<AddressBase> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public PlaceBase addAddressesItem(AddressBase addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<AddressBase> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<AddressBase> addresses) {
    this.addresses = addresses;
  }


  public PlaceBase contact(ContactBase contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactBase getContact() {
    return contact;
  }


  public void setContact(ContactBase contact) {
    this.contact = contact;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceBase placeBase = (PlaceBase) o;
    return Objects.equals(this.name, placeBase.name) &&
        Objects.equals(this.summary, placeBase.summary) &&
        Objects.equals(this._public, placeBase._public) &&
        Objects.equals(this.meta, placeBase.meta) &&
        Objects.equals(this.addresses, placeBase.addresses) &&
        Objects.equals(this.contact, placeBase.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, summary, _public, meta, addresses, contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceBase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("summary");
    openapiFields.add("public");
    openapiFields.add("meta");
    openapiFields.add("addresses");
    openapiFields.add("contact");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PlaceBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PlaceBase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlaceBase is not found in the empty JSON string", PlaceBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PlaceBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlaceBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlaceBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      if (jsonArrayaddresses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("addresses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
        }

        // validate the optional field `addresses` (array)
        for (int i = 0; i < jsonArrayaddresses.size(); i++) {
          AddressBase.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `contact`
      if (jsonObj.getAsJsonObject("contact") != null) {
        ContactBase.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlaceBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlaceBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlaceBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlaceBase.class));

       return (TypeAdapter<T>) new TypeAdapter<PlaceBase>() {
           @Override
           public void write(JsonWriter out, PlaceBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlaceBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlaceBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlaceBase
  * @throws IOException if the JSON string is invalid with respect to PlaceBase
  */
  public static PlaceBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlaceBase.class);
  }

 /**
  * Convert an instance of PlaceBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

