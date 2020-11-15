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
import com.cloudmersive.client.model.XlsxSpreadsheetCell;
import com.cloudmersive.client.model.XlsxWorksheet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Set Cell in XLSX Worksheets request
 */
@ApiModel(description = "Input to a Set Cell in XLSX Worksheets request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-14T18:36:18.122-08:00")
public class SetXlsxCellRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToUpdate")
  private XlsxWorksheet worksheetToUpdate = null;

  @SerializedName("RowIndex")
  private Integer rowIndex = null;

  @SerializedName("CellIndex")
  private Integer cellIndex = null;

  @SerializedName("CellValue")
  private XlsxSpreadsheetCell cellValue = null;

  public SetXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public SetXlsxCellRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public SetXlsxCellRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
    return this;
  }

   /**
   * Optional; Worksheet (tab) within the spreadsheet to update; leave blank to default to the first worksheet
   * @return worksheetToUpdate
  **/
  @ApiModelProperty(value = "Optional; Worksheet (tab) within the spreadsheet to update; leave blank to default to the first worksheet")
  public XlsxWorksheet getWorksheetToUpdate() {
    return worksheetToUpdate;
  }

  public void setWorksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
  }

  public SetXlsxCellRequest rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to set
   * @return rowIndex
  **/
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to set")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public SetXlsxCellRequest cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to set
   * @return cellIndex
  **/
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to set")
  public Integer getCellIndex() {
    return cellIndex;
  }

  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }

  public SetXlsxCellRequest cellValue(XlsxSpreadsheetCell cellValue) {
    this.cellValue = cellValue;
    return this;
  }

   /**
   * New Cell value to update/overwrite into the Excel XLSX spreadsheet
   * @return cellValue
  **/
  @ApiModelProperty(value = "New Cell value to update/overwrite into the Excel XLSX spreadsheet")
  public XlsxSpreadsheetCell getCellValue() {
    return cellValue;
  }

  public void setCellValue(XlsxSpreadsheetCell cellValue) {
    this.cellValue = cellValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetXlsxCellRequest setXlsxCellRequest = (SetXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, setXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, setXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, setXlsxCellRequest.worksheetToUpdate) &&
        Objects.equals(this.rowIndex, setXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, setXlsxCellRequest.cellIndex) &&
        Objects.equals(this.cellValue, setXlsxCellRequest.cellValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, rowIndex, cellIndex, cellValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetXlsxCellRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
    sb.append("    cellValue: ").append(toIndentedString(cellValue)).append("\n");
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

