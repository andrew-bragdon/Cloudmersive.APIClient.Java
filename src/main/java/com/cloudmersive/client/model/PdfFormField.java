/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Field definition and value in the form
 */
@ApiModel(description = "Field definition and value in the form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:48.871-07:00")
public class PdfFormField {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("FieldType")
  private String fieldType = null;

  @SerializedName("FieldValue")
  private String fieldValue = null;

  @SerializedName("FieldComboBoxSelectedIndex")
  private Integer fieldComboBoxSelectedIndex = null;

  public PdfFormField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the form field
   * @return fieldName
  **/
  @ApiModelProperty(value = "Name of the form field")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public PdfFormField fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The data type of the field; possible values are Text (FieldValue will be a string), Checkbox (FieldValue can be \&quot;true\&quot; or \&quot;false\&quot;), ComboBox (FieldComboBoxSelectedIndex will also be populated), Other
   * @return fieldType
  **/
  @ApiModelProperty(value = "The data type of the field; possible values are Text (FieldValue will be a string), Checkbox (FieldValue can be \"true\" or \"false\"), ComboBox (FieldComboBoxSelectedIndex will also be populated), Other")
  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public PdfFormField fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Value of the form field
   * @return fieldValue
  **/
  @ApiModelProperty(value = "Value of the form field")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public PdfFormField fieldComboBoxSelectedIndex(Integer fieldComboBoxSelectedIndex) {
    this.fieldComboBoxSelectedIndex = fieldComboBoxSelectedIndex;
    return this;
  }

   /**
   * Applies to ComboBox field types only; specifies the selected index of the combo box selection if available
   * @return fieldComboBoxSelectedIndex
  **/
  @ApiModelProperty(value = "Applies to ComboBox field types only; specifies the selected index of the combo box selection if available")
  public Integer getFieldComboBoxSelectedIndex() {
    return fieldComboBoxSelectedIndex;
  }

  public void setFieldComboBoxSelectedIndex(Integer fieldComboBoxSelectedIndex) {
    this.fieldComboBoxSelectedIndex = fieldComboBoxSelectedIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFormField pdfFormField = (PdfFormField) o;
    return Objects.equals(this.fieldName, pdfFormField.fieldName) &&
        Objects.equals(this.fieldType, pdfFormField.fieldType) &&
        Objects.equals(this.fieldValue, pdfFormField.fieldValue) &&
        Objects.equals(this.fieldComboBoxSelectedIndex, pdfFormField.fieldComboBoxSelectedIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldType, fieldValue, fieldComboBoxSelectedIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFormField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldComboBoxSelectedIndex: ").append(toIndentedString(fieldComboBoxSelectedIndex)).append("\n");
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

