/*
 * eHelply SDK - 1.1.114
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.114
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.ehelply.client.model.Options;
import com.ehelply.client.model.Validations;
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
 * Field
 */
@ApiModel(description = "Field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T14:06:08.981108Z[Etc/UTC]")
public class Field {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  private Validations validations;

  public static final String SERIALIZED_NAME_HINT = "hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Options options;

  public Field() { 
  }

  public Field type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public Field placeholder(String placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public Field validations(Validations validations) {
    
    this.validations = validations;
    return this;
  }

   /**
   * Get validations
   * @return validations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Validations getValidations() {
    return validations;
  }


  public void setValidations(Validations validations) {
    this.validations = validations;
  }


  public Field hint(String hint) {
    
    this.hint = hint;
    return this;
  }

   /**
   * Get hint
   * @return hint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHint() {
    return hint;
  }


  public void setHint(String hint) {
    this.hint = hint;
  }


  public Field icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public Field label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public Field options(Options options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Options getOptions() {
    return options;
  }


  public void setOptions(Options options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.type, field.type) &&
        Objects.equals(this.placeholder, field.placeholder) &&
        Objects.equals(this.validations, field.validations) &&
        Objects.equals(this.hint, field.hint) &&
        Objects.equals(this.icon, field.icon) &&
        Objects.equals(this.label, field.label) &&
        Objects.equals(this.options, field.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, placeholder, validations, hint, icon, label, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("placeholder");
    openapiFields.add("validations");
    openapiFields.add("hint");
    openapiFields.add("icon");
    openapiFields.add("label");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Field
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Field.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Field is not found in the empty JSON string", Field.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Field.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Field` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("placeholder") != null && !jsonObj.get("placeholder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder").toString()));
      }
      // validate the optional field `validations`
      if (jsonObj.getAsJsonObject("validations") != null) {
        Validations.validateJsonObject(jsonObj.getAsJsonObject("validations"));
      }
      if (jsonObj.get("hint") != null && !jsonObj.get("hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hint").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.getAsJsonObject("options") != null) {
        Options.validateJsonObject(jsonObj.getAsJsonObject("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Field.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Field' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Field> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Field.class));

       return (TypeAdapter<T>) new TypeAdapter<Field>() {
           @Override
           public void write(JsonWriter out, Field value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Field read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Field given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Field
  * @throws IOException if the JSON string is invalid with respect to Field
  */
  public static Field fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Field.class);
  }

 /**
  * Convert an instance of Field to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

