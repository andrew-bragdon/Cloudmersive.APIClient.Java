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
 * Input to a Set Cell by identifier in XLSX Worksheets request
 */
@ApiModel(description = "Input to a Set Cell by identifier in XLSX Worksheets request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-27T17:49:31.725-07:00")
public class SetXlsxCellByIdentifierRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToUpdate")
  private XlsxWorksheet worksheetToUpdate = null;

  @SerializedName("CellIdentifier")
  private String cellIdentifier = null;

  @SerializedName("CellValue")
  private XlsxSpreadsheetCell cellValue = null;

  public SetXlsxCellByIdentifierRequest inputFileBytes(byte[] inputFileBytes) {
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

  public SetXlsxCellByIdentifierRequest inputFileUrl(String inputFileUrl) {
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

  public SetXlsxCellByIdentifierRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
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

  public SetXlsxCellByIdentifierRequest cellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
    return this;
  }

   /**
   * The Excel cell identifier (e.g. A1, B2, C33, etc.) of the cell to update
   * @return cellIdentifier
  **/
  @ApiModelProperty(value = "The Excel cell identifier (e.g. A1, B2, C33, etc.) of the cell to update")
  public String getCellIdentifier() {
    return cellIdentifier;
  }

  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }

  public SetXlsxCellByIdentifierRequest cellValue(XlsxSpreadsheetCell cellValue) {
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
    SetXlsxCellByIdentifierRequest setXlsxCellByIdentifierRequest = (SetXlsxCellByIdentifierRequest) o;
    return Arrays.equals(this.inputFileBytes, setXlsxCellByIdentifierRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, setXlsxCellByIdentifierRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, setXlsxCellByIdentifierRequest.worksheetToUpdate) &&
        Objects.equals(this.cellIdentifier, setXlsxCellByIdentifierRequest.cellIdentifier) &&
        Objects.equals(this.cellValue, setXlsxCellByIdentifierRequest.cellValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, cellIdentifier, cellValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetXlsxCellByIdentifierRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
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

