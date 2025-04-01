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
 * Input to a Get Cell request
 */
@ApiModel(description = "Input to a Get Cell request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:34:02.603-07:00")
public class GetXlsxCellRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToQuery")
  private XlsxWorksheet worksheetToQuery = null;

  @SerializedName("RowIndex")
  private Integer rowIndex = null;

  @SerializedName("CellIndex")
  private Integer cellIndex = null;

  public GetXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
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

  public GetXlsxCellRequest inputFileUrl(String inputFileUrl) {
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

  public GetXlsxCellRequest worksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
    return this;
  }

   /**
   * Optional; Worksheet (tab) within the spreadsheet to get the rows and cells of; leave blank to default to the first worksheet
   * @return worksheetToQuery
  **/
  @ApiModelProperty(value = "Optional; Worksheet (tab) within the spreadsheet to get the rows and cells of; leave blank to default to the first worksheet")
  public XlsxWorksheet getWorksheetToQuery() {
    return worksheetToQuery;
  }

  public void setWorksheetToQuery(XlsxWorksheet worksheetToQuery) {
    this.worksheetToQuery = worksheetToQuery;
  }

  public GetXlsxCellRequest rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to retrieve
   * @return rowIndex
  **/
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to retrieve")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public GetXlsxCellRequest cellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to retrieve
   * @return cellIndex
  **/
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to retrieve")
  public Integer getCellIndex() {
    return cellIndex;
  }

  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellRequest getXlsxCellRequest = (GetXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, getXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToQuery, getXlsxCellRequest.worksheetToQuery) &&
        Objects.equals(this.rowIndex, getXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, getXlsxCellRequest.cellIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToQuery, rowIndex, cellIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToQuery: ").append(toIndentedString(worksheetToQuery)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
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

