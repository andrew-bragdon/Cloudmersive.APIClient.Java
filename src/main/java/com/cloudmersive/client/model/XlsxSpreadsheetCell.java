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
 * Cell in an Excel Spreadsheet worksheet
 */
@ApiModel(description = "Cell in an Excel Spreadsheet worksheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-20T11:07:29.931-07:00")
public class XlsxSpreadsheetCell {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("TextValue")
  private String textValue = null;

  @SerializedName("CellIdentifier")
  private String cellIdentifier = null;

  @SerializedName("StyleIndex")
  private Integer styleIndex = null;

  @SerializedName("Formula")
  private String formula = null;

  public XlsxSpreadsheetCell path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public XlsxSpreadsheetCell textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

   /**
   * Text value of the cell
   * @return textValue
  **/
  @ApiModelProperty(value = "Text value of the cell")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  public XlsxSpreadsheetCell cellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
    return this;
  }

   /**
   * Cell reference of the cell, e.g. A1, Z22, etc.
   * @return cellIdentifier
  **/
  @ApiModelProperty(value = "Cell reference of the cell, e.g. A1, Z22, etc.")
  public String getCellIdentifier() {
    return cellIdentifier;
  }

  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }

  public XlsxSpreadsheetCell styleIndex(Integer styleIndex) {
    this.styleIndex = styleIndex;
    return this;
  }

   /**
   * Identifier for the style to apply to this style
   * @return styleIndex
  **/
  @ApiModelProperty(value = "Identifier for the style to apply to this style")
  public Integer getStyleIndex() {
    return styleIndex;
  }

  public void setStyleIndex(Integer styleIndex) {
    this.styleIndex = styleIndex;
  }

  public XlsxSpreadsheetCell formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * Get formula
   * @return formula
  **/
  @ApiModelProperty(value = "")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetCell xlsxSpreadsheetCell = (XlsxSpreadsheetCell) o;
    return Objects.equals(this.path, xlsxSpreadsheetCell.path) &&
        Objects.equals(this.textValue, xlsxSpreadsheetCell.textValue) &&
        Objects.equals(this.cellIdentifier, xlsxSpreadsheetCell.cellIdentifier) &&
        Objects.equals(this.styleIndex, xlsxSpreadsheetCell.styleIndex) &&
        Objects.equals(this.formula, xlsxSpreadsheetCell.formula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, textValue, cellIdentifier, styleIndex, formula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetCell {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
    sb.append("    styleIndex: ").append(toIndentedString(styleIndex)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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

