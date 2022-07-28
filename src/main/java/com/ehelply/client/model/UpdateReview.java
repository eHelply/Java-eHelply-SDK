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
 * UpdateReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T01:17:03.689338Z[Etc/UTC]")
public class UpdateReview {
  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Integer rating;

  public static final String SERIALIZED_NAME_MAX_RATING = "max_rating";
  @SerializedName(SERIALIZED_NAME_MAX_RATING)
  private Integer maxRating;

  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public UpdateReview() { 
  }

  public UpdateReview rating(Integer rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRating() {
    return rating;
  }


  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public UpdateReview maxRating(Integer maxRating) {
    
    this.maxRating = maxRating;
    return this;
  }

   /**
   * Get maxRating
   * @return maxRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxRating() {
    return maxRating;
  }


  public void setMaxRating(Integer maxRating) {
    this.maxRating = maxRating;
  }


  public UpdateReview reviewText(String reviewText) {
    
    this.reviewText = reviewText;
    return this;
  }

   /**
   * Get reviewText
   * @return reviewText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReviewText() {
    return reviewText;
  }


  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateReview updateReview = (UpdateReview) o;
    return Objects.equals(this.rating, updateReview.rating) &&
        Objects.equals(this.maxRating, updateReview.maxRating) &&
        Objects.equals(this.reviewText, updateReview.reviewText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, maxRating, reviewText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReview {\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    maxRating: ").append(toIndentedString(maxRating)).append("\n");
    sb.append("    reviewText: ").append(toIndentedString(reviewText)).append("\n");
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
    openapiFields.add("rating");
    openapiFields.add("max_rating");
    openapiFields.add("review_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateReview.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateReview is not found in the empty JSON string", UpdateReview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateReview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateReview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("review_text") != null && !jsonObj.get("review_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateReview.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateReview>() {
           @Override
           public void write(JsonWriter out, UpdateReview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateReview
  * @throws IOException if the JSON string is invalid with respect to UpdateReview
  */
  public static UpdateReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateReview.class);
  }

 /**
  * Convert an instance of UpdateReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

