/*
 * eHelply SDK - 1.1.83
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.83
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.NotesValidationError;

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

import org.openapitools.client.JSON;

/**
 * NotesHTTPValidationError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T00:21:58.664423Z[Etc/UTC]")
public class NotesHTTPValidationError {
  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private List<NotesValidationError> detail = null;

  public NotesHTTPValidationError() { 
  }

  public NotesHTTPValidationError detail(List<NotesValidationError> detail) {
    
    this.detail = detail;
    return this;
  }

  public NotesHTTPValidationError addDetailItem(NotesValidationError detailItem) {
    if (this.detail == null) {
      this.detail = new ArrayList<>();
    }
    this.detail.add(detailItem);
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NotesValidationError> getDetail() {
    return detail;
  }


  public void setDetail(List<NotesValidationError> detail) {
    this.detail = detail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotesHTTPValidationError notesHTTPValidationError = (NotesHTTPValidationError) o;
    return Objects.equals(this.detail, notesHTTPValidationError.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotesHTTPValidationError {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotesHTTPValidationError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NotesHTTPValidationError.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotesHTTPValidationError is not found in the empty JSON string", NotesHTTPValidationError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotesHTTPValidationError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotesHTTPValidationError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydetail = jsonObj.getAsJsonArray("detail");
      if (jsonArraydetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `detail` to be an array in the JSON string but got `%s`", jsonObj.get("detail").toString()));
        }

        // validate the optional field `detail` (array)
        for (int i = 0; i < jsonArraydetail.size(); i++) {
          NotesValidationError.validateJsonObject(jsonArraydetail.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotesHTTPValidationError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotesHTTPValidationError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotesHTTPValidationError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotesHTTPValidationError.class));

       return (TypeAdapter<T>) new TypeAdapter<NotesHTTPValidationError>() {
           @Override
           public void write(JsonWriter out, NotesHTTPValidationError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotesHTTPValidationError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotesHTTPValidationError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotesHTTPValidationError
  * @throws IOException if the JSON string is invalid with respect to NotesHTTPValidationError
  */
  public static NotesHTTPValidationError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotesHTTPValidationError.class);
  }

 /**
  * Convert an instance of NotesHTTPValidationError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

