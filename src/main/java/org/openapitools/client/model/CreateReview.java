/*
 * eHelply SDK - 1.1.89
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.89
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
 * CreateReview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T19:19:46.796450Z[Etc/UTC]")
public class CreateReview {
  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Integer rating;

  public static final String SERIALIZED_NAME_MAX_RATING = "max_rating";
  @SerializedName(SERIALIZED_NAME_MAX_RATING)
  private Integer maxRating;

  public static final String SERIALIZED_NAME_REVIEW_TEXT = "review_text";
  @SerializedName(SERIALIZED_NAME_REVIEW_TEXT)
  private String reviewText;

  public CreateReview() { 
  }

  public CreateReview rating(Integer rating) {
    
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRating() {
    return rating;
  }


  public void setRating(Integer rating) {
    this.rating = rating;
  }


  public CreateReview maxRating(Integer maxRating) {
    
    this.maxRating = maxRating;
    return this;
  }

   /**
   * Get maxRating
   * @return maxRating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMaxRating() {
    return maxRating;
  }


  public void setMaxRating(Integer maxRating) {
    this.maxRating = maxRating;
  }


  public CreateReview reviewText(String reviewText) {
    
    this.reviewText = reviewText;
    return this;
  }

   /**
   * Get reviewText
   * @return reviewText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    CreateReview createReview = (CreateReview) o;
    return Objects.equals(this.rating, createReview.rating) &&
        Objects.equals(this.maxRating, createReview.maxRating) &&
        Objects.equals(this.reviewText, createReview.reviewText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, maxRating, reviewText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReview {\n");
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
    openapiRequiredFields.add("rating");
    openapiRequiredFields.add("max_rating");
    openapiRequiredFields.add("review_text");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateReview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateReview.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateReview is not found in the empty JSON string", CreateReview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateReview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateReview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateReview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
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
       if (!CreateReview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateReview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateReview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateReview.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateReview>() {
           @Override
           public void write(JsonWriter out, CreateReview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateReview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateReview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateReview
  * @throws IOException if the JSON string is invalid with respect to CreateReview
  */
  public static CreateReview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateReview.class);
  }

 /**
  * Convert an instance of CreateReview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

