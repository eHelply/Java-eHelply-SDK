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
import com.ehelply.client.model.ServiceSuperStackMetaFaq;
import com.ehelply.client.model.ServiceSuperStackMetaFeature;
import com.ehelply.client.model.ServiceSuperStackMetaGettingStarted;
import com.ehelply.client.model.ServiceSuperStackMetaUseCase;
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
 * ServiceSuperStackMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-29T14:13:55.848369Z[Etc/UTC]")
public class ServiceSuperStackMeta {
  public static final String SERIALIZED_NAME_HUMAN_NAME = "human_name";
  @SerializedName(SERIALIZED_NAME_HUMAN_NAME)
  private String humanName;

  public static final String SERIALIZED_NAME_ROUTE_NAME = "route_name";
  @SerializedName(SERIALIZED_NAME_ROUTE_NAME)
  private String routeName;

  public static final String SERIALIZED_NAME_SERVICE_NAME = "service_name";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_ADVERTISE = "advertise";
  @SerializedName(SERIALIZED_NAME_ADVERTISE)
  private Boolean advertise;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_BACKGROUND_PICTURE = "background_picture";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_PICTURE)
  private String backgroundPicture;

  public static final String SERIALIZED_NAME_TAG_LINE = "tag_line";
  @SerializedName(SERIALIZED_NAME_TAG_LINE)
  private String tagLine;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<ServiceSuperStackMetaFeature> features = new ArrayList<>();

  public static final String SERIALIZED_NAME_USE_CASES = "use_cases";
  @SerializedName(SERIALIZED_NAME_USE_CASES)
  private List<ServiceSuperStackMetaUseCase> useCases = new ArrayList<>();

  public static final String SERIALIZED_NAME_GETTING_STARTED = "getting_started";
  @SerializedName(SERIALIZED_NAME_GETTING_STARTED)
  private ServiceSuperStackMetaGettingStarted gettingStarted;

  public static final String SERIALIZED_NAME_FAQS = "faqs";
  @SerializedName(SERIALIZED_NAME_FAQS)
  private List<ServiceSuperStackMetaFaq> faqs = new ArrayList<>();

  public ServiceSuperStackMeta() { 
  }

  public ServiceSuperStackMeta humanName(String humanName) {
    
    this.humanName = humanName;
    return this;
  }

   /**
   * Get humanName
   * @return humanName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHumanName() {
    return humanName;
  }


  public void setHumanName(String humanName) {
    this.humanName = humanName;
  }


  public ServiceSuperStackMeta routeName(String routeName) {
    
    this.routeName = routeName;
    return this;
  }

   /**
   * Get routeName
   * @return routeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRouteName() {
    return routeName;
  }


  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }


  public ServiceSuperStackMeta serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getServiceName() {
    return serviceName;
  }


  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public ServiceSuperStackMeta advertise(Boolean advertise) {
    
    this.advertise = advertise;
    return this;
  }

   /**
   * Get advertise
   * @return advertise
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAdvertise() {
    return advertise;
  }


  public void setAdvertise(Boolean advertise) {
    this.advertise = advertise;
  }


  public ServiceSuperStackMeta featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  public ServiceSuperStackMeta picture(String picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPicture() {
    return picture;
  }


  public void setPicture(String picture) {
    this.picture = picture;
  }


  public ServiceSuperStackMeta backgroundPicture(String backgroundPicture) {
    
    this.backgroundPicture = backgroundPicture;
    return this;
  }

   /**
   * Get backgroundPicture
   * @return backgroundPicture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBackgroundPicture() {
    return backgroundPicture;
  }


  public void setBackgroundPicture(String backgroundPicture) {
    this.backgroundPicture = backgroundPicture;
  }


  public ServiceSuperStackMeta tagLine(String tagLine) {
    
    this.tagLine = tagLine;
    return this;
  }

   /**
   * Get tagLine
   * @return tagLine
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTagLine() {
    return tagLine;
  }


  public void setTagLine(String tagLine) {
    this.tagLine = tagLine;
  }


  public ServiceSuperStackMeta summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public ServiceSuperStackMeta description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceSuperStackMeta features(List<ServiceSuperStackMetaFeature> features) {
    
    this.features = features;
    return this;
  }

  public ServiceSuperStackMeta addFeaturesItem(ServiceSuperStackMetaFeature featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ServiceSuperStackMetaFeature> getFeatures() {
    return features;
  }


  public void setFeatures(List<ServiceSuperStackMetaFeature> features) {
    this.features = features;
  }


  public ServiceSuperStackMeta useCases(List<ServiceSuperStackMetaUseCase> useCases) {
    
    this.useCases = useCases;
    return this;
  }

  public ServiceSuperStackMeta addUseCasesItem(ServiceSuperStackMetaUseCase useCasesItem) {
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ServiceSuperStackMetaUseCase> getUseCases() {
    return useCases;
  }


  public void setUseCases(List<ServiceSuperStackMetaUseCase> useCases) {
    this.useCases = useCases;
  }


  public ServiceSuperStackMeta gettingStarted(ServiceSuperStackMetaGettingStarted gettingStarted) {
    
    this.gettingStarted = gettingStarted;
    return this;
  }

   /**
   * Get gettingStarted
   * @return gettingStarted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ServiceSuperStackMetaGettingStarted getGettingStarted() {
    return gettingStarted;
  }


  public void setGettingStarted(ServiceSuperStackMetaGettingStarted gettingStarted) {
    this.gettingStarted = gettingStarted;
  }


  public ServiceSuperStackMeta faqs(List<ServiceSuperStackMetaFaq> faqs) {
    
    this.faqs = faqs;
    return this;
  }

  public ServiceSuperStackMeta addFaqsItem(ServiceSuperStackMetaFaq faqsItem) {
    this.faqs.add(faqsItem);
    return this;
  }

   /**
   * Get faqs
   * @return faqs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ServiceSuperStackMetaFaq> getFaqs() {
    return faqs;
  }


  public void setFaqs(List<ServiceSuperStackMetaFaq> faqs) {
    this.faqs = faqs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSuperStackMeta serviceSuperStackMeta = (ServiceSuperStackMeta) o;
    return Objects.equals(this.humanName, serviceSuperStackMeta.humanName) &&
        Objects.equals(this.routeName, serviceSuperStackMeta.routeName) &&
        Objects.equals(this.serviceName, serviceSuperStackMeta.serviceName) &&
        Objects.equals(this.advertise, serviceSuperStackMeta.advertise) &&
        Objects.equals(this.featured, serviceSuperStackMeta.featured) &&
        Objects.equals(this.picture, serviceSuperStackMeta.picture) &&
        Objects.equals(this.backgroundPicture, serviceSuperStackMeta.backgroundPicture) &&
        Objects.equals(this.tagLine, serviceSuperStackMeta.tagLine) &&
        Objects.equals(this.summary, serviceSuperStackMeta.summary) &&
        Objects.equals(this.description, serviceSuperStackMeta.description) &&
        Objects.equals(this.features, serviceSuperStackMeta.features) &&
        Objects.equals(this.useCases, serviceSuperStackMeta.useCases) &&
        Objects.equals(this.gettingStarted, serviceSuperStackMeta.gettingStarted) &&
        Objects.equals(this.faqs, serviceSuperStackMeta.faqs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humanName, routeName, serviceName, advertise, featured, picture, backgroundPicture, tagLine, summary, description, features, useCases, gettingStarted, faqs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSuperStackMeta {\n");
    sb.append("    humanName: ").append(toIndentedString(humanName)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    advertise: ").append(toIndentedString(advertise)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    backgroundPicture: ").append(toIndentedString(backgroundPicture)).append("\n");
    sb.append("    tagLine: ").append(toIndentedString(tagLine)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
    sb.append("    gettingStarted: ").append(toIndentedString(gettingStarted)).append("\n");
    sb.append("    faqs: ").append(toIndentedString(faqs)).append("\n");
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
    openapiFields.add("human_name");
    openapiFields.add("route_name");
    openapiFields.add("service_name");
    openapiFields.add("advertise");
    openapiFields.add("featured");
    openapiFields.add("picture");
    openapiFields.add("background_picture");
    openapiFields.add("tag_line");
    openapiFields.add("summary");
    openapiFields.add("description");
    openapiFields.add("features");
    openapiFields.add("use_cases");
    openapiFields.add("getting_started");
    openapiFields.add("faqs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("human_name");
    openapiRequiredFields.add("route_name");
    openapiRequiredFields.add("service_name");
    openapiRequiredFields.add("advertise");
    openapiRequiredFields.add("featured");
    openapiRequiredFields.add("picture");
    openapiRequiredFields.add("background_picture");
    openapiRequiredFields.add("tag_line");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("features");
    openapiRequiredFields.add("use_cases");
    openapiRequiredFields.add("getting_started");
    openapiRequiredFields.add("faqs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceSuperStackMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ServiceSuperStackMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceSuperStackMeta is not found in the empty JSON string", ServiceSuperStackMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ServiceSuperStackMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ServiceSuperStackMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceSuperStackMeta.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("human_name") != null && !jsonObj.get("human_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `human_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("human_name").toString()));
      }
      if (jsonObj.get("route_name") != null && !jsonObj.get("route_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_name").toString()));
      }
      if (jsonObj.get("service_name") != null && !jsonObj.get("service_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_name").toString()));
      }
      if (jsonObj.get("picture") != null && !jsonObj.get("picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picture").toString()));
      }
      if (jsonObj.get("background_picture") != null && !jsonObj.get("background_picture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `background_picture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("background_picture").toString()));
      }
      if (jsonObj.get("tag_line") != null && !jsonObj.get("tag_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_line").toString()));
      }
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      JsonArray jsonArrayfeatures = jsonObj.getAsJsonArray("features");
      if (jsonArrayfeatures != null) {
        // ensure the json data is an array
        if (!jsonObj.get("features").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `features` to be an array in the JSON string but got `%s`", jsonObj.get("features").toString()));
        }

        // validate the optional field `features` (array)
        for (int i = 0; i < jsonArrayfeatures.size(); i++) {
          ServiceSuperStackMetaFeature.validateJsonObject(jsonArrayfeatures.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayuseCases = jsonObj.getAsJsonArray("use_cases");
      if (jsonArrayuseCases != null) {
        // ensure the json data is an array
        if (!jsonObj.get("use_cases").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `use_cases` to be an array in the JSON string but got `%s`", jsonObj.get("use_cases").toString()));
        }

        // validate the optional field `use_cases` (array)
        for (int i = 0; i < jsonArrayuseCases.size(); i++) {
          ServiceSuperStackMetaUseCase.validateJsonObject(jsonArrayuseCases.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `getting_started`
      if (jsonObj.getAsJsonObject("getting_started") != null) {
        ServiceSuperStackMetaGettingStarted.validateJsonObject(jsonObj.getAsJsonObject("getting_started"));
      }
      JsonArray jsonArrayfaqs = jsonObj.getAsJsonArray("faqs");
      if (jsonArrayfaqs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("faqs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `faqs` to be an array in the JSON string but got `%s`", jsonObj.get("faqs").toString()));
        }

        // validate the optional field `faqs` (array)
        for (int i = 0; i < jsonArrayfaqs.size(); i++) {
          ServiceSuperStackMetaFaq.validateJsonObject(jsonArrayfaqs.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceSuperStackMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceSuperStackMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceSuperStackMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceSuperStackMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceSuperStackMeta>() {
           @Override
           public void write(JsonWriter out, ServiceSuperStackMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServiceSuperStackMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServiceSuperStackMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceSuperStackMeta
  * @throws IOException if the JSON string is invalid with respect to ServiceSuperStackMeta
  */
  public static ServiceSuperStackMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceSuperStackMeta.class);
  }

 /**
  * Convert an instance of ServiceSuperStackMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

