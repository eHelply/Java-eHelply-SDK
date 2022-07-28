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
import com.ehelply.client.model.OptionGroup;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Options
 */
@ApiModel(description = "Options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T01:17:03.689338Z[Etc/UTC]")
public class Options {
  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_INSET_LABEL = "insetLabel";
  @SerializedName(SERIALIZED_NAME_INSET_LABEL)
  private String insetLabel;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_HINT = "hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "maxLength";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private BigDecimal maxLength;

  public static final String SERIALIZED_NAME_COUNTER = "counter";
  @SerializedName(SERIALIZED_NAME_COUNTER)
  private Boolean counter;

  public static final String SERIALIZED_NAME_CAPTION = "caption";
  @SerializedName(SERIALIZED_NAME_CAPTION)
  private String caption;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ICON_POSITION = "iconPosition";
  @SerializedName(SERIALIZED_NAME_ICON_POSITION)
  private String iconPosition;

  public static final String SERIALIZED_NAME_SELECTIONS = "selections";
  @SerializedName(SERIALIZED_NAME_SELECTIONS)
  private List<OptionGroup> selections = null;

  public Options() { 
  }

  public Options required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public Options label(String label) {
    
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


  public Options insetLabel(String insetLabel) {
    
    this.insetLabel = insetLabel;
    return this;
  }

   /**
   * Get insetLabel
   * @return insetLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInsetLabel() {
    return insetLabel;
  }


  public void setInsetLabel(String insetLabel) {
    this.insetLabel = insetLabel;
  }


  public Options placeholder(String placeholder) {
    
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


  public Options hint(String hint) {
    
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


  public Options icon(String icon) {
    
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


  public Options maxLength(BigDecimal maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(BigDecimal maxLength) {
    this.maxLength = maxLength;
  }


  public Options counter(Boolean counter) {
    
    this.counter = counter;
    return this;
  }

   /**
   * Get counter
   * @return counter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCounter() {
    return counter;
  }


  public void setCounter(Boolean counter) {
    this.counter = counter;
  }


  public Options caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaption() {
    return caption;
  }


  public void setCaption(String caption) {
    this.caption = caption;
  }


  public Options color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public Options size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public Options type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Options iconPosition(String iconPosition) {
    
    this.iconPosition = iconPosition;
    return this;
  }

   /**
   * Get iconPosition
   * @return iconPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconPosition() {
    return iconPosition;
  }


  public void setIconPosition(String iconPosition) {
    this.iconPosition = iconPosition;
  }


  public Options selections(List<OptionGroup> selections) {
    
    this.selections = selections;
    return this;
  }

  public Options addSelectionsItem(OptionGroup selectionsItem) {
    if (this.selections == null) {
      this.selections = new ArrayList<>();
    }
    this.selections.add(selectionsItem);
    return this;
  }

   /**
   * Get selections
   * @return selections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OptionGroup> getSelections() {
    return selections;
  }


  public void setSelections(List<OptionGroup> selections) {
    this.selections = selections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.required, options.required) &&
        Objects.equals(this.label, options.label) &&
        Objects.equals(this.insetLabel, options.insetLabel) &&
        Objects.equals(this.placeholder, options.placeholder) &&
        Objects.equals(this.hint, options.hint) &&
        Objects.equals(this.icon, options.icon) &&
        Objects.equals(this.maxLength, options.maxLength) &&
        Objects.equals(this.counter, options.counter) &&
        Objects.equals(this.caption, options.caption) &&
        Objects.equals(this.color, options.color) &&
        Objects.equals(this.size, options.size) &&
        Objects.equals(this.type, options.type) &&
        Objects.equals(this.iconPosition, options.iconPosition) &&
        Objects.equals(this.selections, options.selections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, label, insetLabel, placeholder, hint, icon, maxLength, counter, caption, color, size, type, iconPosition, selections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    insetLabel: ").append(toIndentedString(insetLabel)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    iconPosition: ").append(toIndentedString(iconPosition)).append("\n");
    sb.append("    selections: ").append(toIndentedString(selections)).append("\n");
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
    openapiFields.add("required");
    openapiFields.add("label");
    openapiFields.add("insetLabel");
    openapiFields.add("placeholder");
    openapiFields.add("hint");
    openapiFields.add("icon");
    openapiFields.add("maxLength");
    openapiFields.add("counter");
    openapiFields.add("caption");
    openapiFields.add("color");
    openapiFields.add("size");
    openapiFields.add("type");
    openapiFields.add("iconPosition");
    openapiFields.add("selections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Options
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Options.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Options is not found in the empty JSON string", Options.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Options.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Options` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if (jsonObj.get("insetLabel") != null && !jsonObj.get("insetLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insetLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insetLabel").toString()));
      }
      if (jsonObj.get("placeholder") != null && !jsonObj.get("placeholder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder").toString()));
      }
      if (jsonObj.get("hint") != null && !jsonObj.get("hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hint").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("caption") != null && !jsonObj.get("caption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caption").toString()));
      }
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if (jsonObj.get("size") != null && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("iconPosition") != null && !jsonObj.get("iconPosition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconPosition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconPosition").toString()));
      }
      JsonArray jsonArrayselections = jsonObj.getAsJsonArray("selections");
      if (jsonArrayselections != null) {
        // ensure the json data is an array
        if (!jsonObj.get("selections").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `selections` to be an array in the JSON string but got `%s`", jsonObj.get("selections").toString()));
        }

        // validate the optional field `selections` (array)
        for (int i = 0; i < jsonArrayselections.size(); i++) {
          OptionGroup.validateJsonObject(jsonArrayselections.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Options.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Options' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Options> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Options.class));

       return (TypeAdapter<T>) new TypeAdapter<Options>() {
           @Override
           public void write(JsonWriter out, Options value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Options read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Options given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Options
  * @throws IOException if the JSON string is invalid with respect to Options
  */
  public static Options fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Options.class);
  }

 /**
  * Convert an instance of Options to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

