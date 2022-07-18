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
import com.ehelply.client.model.ContactMethod;
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
 * **:param** phones                              **type:** List[ContactKeys] or None  **:param** email                               **type:** string or None  **:param** website                             **type:** string or None  **:param** socials                             **type:** List[ContactKeys] or None
 */
@ApiModel(description = "**:param** phones                              **type:** List[ContactKeys] or None  **:param** email                               **type:** string or None  **:param** website                             **type:** string or None  **:param** socials                             **type:** List[ContactKeys] or None")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T21:52:09.863537Z[Etc/UTC]")
public class ContactBase {
  public static final String SERIALIZED_NAME_PHONES = "phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  private List<ContactMethod> phones = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_SOCIALS = "socials";
  @SerializedName(SERIALIZED_NAME_SOCIALS)
  private List<ContactMethod> socials = null;

  public ContactBase() { 
  }

  public ContactBase phones(List<ContactMethod> phones) {
    
    this.phones = phones;
    return this;
  }

  public ContactBase addPhonesItem(ContactMethod phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Get phones
   * @return phones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"name\":\"cell\",\"value\":\"1234567\"}]", value = "")

  public List<ContactMethod> getPhones() {
    return phones;
  }


  public void setPhones(List<ContactMethod> phones) {
    this.phones = phones;
  }


  public ContactBase email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@example.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ContactBase website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.ehelply.com", value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public ContactBase socials(List<ContactMethod> socials) {
    
    this.socials = socials;
    return this;
  }

  public ContactBase addSocialsItem(ContactMethod socialsItem) {
    if (this.socials == null) {
      this.socials = new ArrayList<>();
    }
    this.socials.add(socialsItem);
    return this;
  }

   /**
   * Get socials
   * @return socials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"name\":\"Twitter\",\"value\":\"twitter.com\"}]", value = "")

  public List<ContactMethod> getSocials() {
    return socials;
  }


  public void setSocials(List<ContactMethod> socials) {
    this.socials = socials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBase contactBase = (ContactBase) o;
    return Objects.equals(this.phones, contactBase.phones) &&
        Objects.equals(this.email, contactBase.email) &&
        Objects.equals(this.website, contactBase.website) &&
        Objects.equals(this.socials, contactBase.socials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phones, email, website, socials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBase {\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    socials: ").append(toIndentedString(socials)).append("\n");
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
    openapiFields.add("phones");
    openapiFields.add("email");
    openapiFields.add("website");
    openapiFields.add("socials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactBase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactBase is not found in the empty JSON string", ContactBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayphones = jsonObj.getAsJsonArray("phones");
      if (jsonArrayphones != null) {
        // ensure the json data is an array
        if (!jsonObj.get("phones").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `phones` to be an array in the JSON string but got `%s`", jsonObj.get("phones").toString()));
        }

        // validate the optional field `phones` (array)
        for (int i = 0; i < jsonArrayphones.size(); i++) {
          ContactMethod.validateJsonObject(jsonArrayphones.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("website") != null && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      JsonArray jsonArraysocials = jsonObj.getAsJsonArray("socials");
      if (jsonArraysocials != null) {
        // ensure the json data is an array
        if (!jsonObj.get("socials").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `socials` to be an array in the JSON string but got `%s`", jsonObj.get("socials").toString()));
        }

        // validate the optional field `socials` (array)
        for (int i = 0; i < jsonArraysocials.size(); i++) {
          ContactMethod.validateJsonObject(jsonArraysocials.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactBase>() {
           @Override
           public void write(JsonWriter out, ContactBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactBase
  * @throws IOException if the JSON string is invalid with respect to ContactBase
  */
  public static ContactBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactBase.class);
  }

 /**
  * Convert an instance of ContactBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

