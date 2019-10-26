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
import com.cloudmersive.client.model.FormTableDefinition;
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
 * Definition of a form template; use a form template definition to recognize the fields in a form with Cloudmersive OCR
 */
@ApiModel(description = "Definition of a form template; use a form template definition to recognize the fields in a form with Cloudmersive OCR")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-26T13:02:03.004-07:00")
public class FormDefinitionTemplate {
  @SerializedName("FieldDefinitions")
  private List<FormFieldDefinition> fieldDefinitions = null;

  @SerializedName("TableDefinitions")
  private List<FormTableDefinition> tableDefinitions = null;

  public FormDefinitionTemplate fieldDefinitions(List<FormFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
    return this;
  }

  public FormDefinitionTemplate addFieldDefinitionsItem(FormFieldDefinition fieldDefinitionsItem) {
    if (this.fieldDefinitions == null) {
      this.fieldDefinitions = new ArrayList<FormFieldDefinition>();
    }
    this.fieldDefinitions.add(fieldDefinitionsItem);
    return this;
  }

   /**
   * Field definitions in the template; a field is comprised of a key/value pair
   * @return fieldDefinitions
  **/
  @ApiModelProperty(value = "Field definitions in the template; a field is comprised of a key/value pair")
  public List<FormFieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<FormFieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  public FormDefinitionTemplate tableDefinitions(List<FormTableDefinition> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
    return this;
  }

  public FormDefinitionTemplate addTableDefinitionsItem(FormTableDefinition tableDefinitionsItem) {
    if (this.tableDefinitions == null) {
      this.tableDefinitions = new ArrayList<FormTableDefinition>();
    }
    this.tableDefinitions.add(tableDefinitionsItem);
    return this;
  }

   /**
   * Table definitions in the template; a table is comprised of columns and rows and exists in a 2-dimensional layout; a common example of a table would be an invoice
   * @return tableDefinitions
  **/
  @ApiModelProperty(value = "Table definitions in the template; a table is comprised of columns and rows and exists in a 2-dimensional layout; a common example of a table would be an invoice")
  public List<FormTableDefinition> getTableDefinitions() {
    return tableDefinitions;
  }

  public void setTableDefinitions(List<FormTableDefinition> tableDefinitions) {
    this.tableDefinitions = tableDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDefinitionTemplate formDefinitionTemplate = (FormDefinitionTemplate) o;
    return Objects.equals(this.fieldDefinitions, formDefinitionTemplate.fieldDefinitions) &&
        Objects.equals(this.tableDefinitions, formDefinitionTemplate.tableDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldDefinitions, tableDefinitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDefinitionTemplate {\n");
    
    sb.append("    fieldDefinitions: ").append(toIndentedString(fieldDefinitions)).append("\n");
    sb.append("    tableDefinitions: ").append(toIndentedString(tableDefinitions)).append("\n");
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

