/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.FormFieldDefinition;
import com.cloudmersive.client.model.OcrPhotoTextElement;
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

/**
 * A pairing target field and actual value read from form
 */
@ApiModel(description = "A pairing target field and actual value read from form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-07T20:25:39.208-08:00")
public class FieldResult {
  @SerializedName("TargetField")
  private FormFieldDefinition targetField = null;

  @SerializedName("FieldValues")
  private List<OcrPhotoTextElement> fieldValues = null;

  public FieldResult targetField(FormFieldDefinition targetField) {
    this.targetField = targetField;
    return this;
  }

   /**
   * Target field to extract from the form
   * @return targetField
  **/
  @ApiModelProperty(value = "Target field to extract from the form")
  public FormFieldDefinition getTargetField() {
    return targetField;
  }

  public void setTargetField(FormFieldDefinition targetField) {
    this.targetField = targetField;
  }

  public FieldResult fieldValues(List<OcrPhotoTextElement> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public FieldResult addFieldValuesItem(OcrPhotoTextElement fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<OcrPhotoTextElement>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Result field value(s) extracted
   * @return fieldValues
  **/
  @ApiModelProperty(value = "Result field value(s) extracted")
  public List<OcrPhotoTextElement> getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(List<OcrPhotoTextElement> fieldValues) {
    this.fieldValues = fieldValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldResult fieldResult = (FieldResult) o;
    return Objects.equals(this.targetField, fieldResult.targetField) &&
        Objects.equals(this.fieldValues, fieldResult.fieldValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetField, fieldValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldResult {\n");
    
    sb.append("    targetField: ").append(toIndentedString(targetField)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

