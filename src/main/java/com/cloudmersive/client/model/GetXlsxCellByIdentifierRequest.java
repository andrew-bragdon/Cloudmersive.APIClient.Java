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
 * Input to a Get Cell by cell identifier request
 */
@ApiModel(description = "Input to a Get Cell by cell identifier request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-23T15:52:42.630-07:00")
public class GetXlsxCellByIdentifierRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToQuery")
  private XlsxWorksheet worksheetToQuery = null;

  @SerializedName("CellIdentifier")
  private String cellIdentifier = null;

  public GetXlsxCellByIdentifierRequest inputFileBytes(byte[] inputFileBytes) {
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

  public GetXlsxCellByIdentifierRequest inputFileUrl(String inputFileUrl) {
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

  public GetXlsxCellByIdentifierRequest worksheetToQuery(XlsxWorksheet worksheetToQuery) {
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

  public GetXlsxCellByIdentifierRequest cellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
    return this;
  }

   /**
   * Required; Excel cell identifier, e.g. A1, B22, C33, etc.
   * @return cellIdentifier
  **/
  @ApiModelProperty(value = "Required; Excel cell identifier, e.g. A1, B22, C33, etc.")
  public String getCellIdentifier() {
    return cellIdentifier;
  }

  public void setCellIdentifier(String cellIdentifier) {
    this.cellIdentifier = cellIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellByIdentifierRequest getXlsxCellByIdentifierRequest = (GetXlsxCellByIdentifierRequest) o;
    return Arrays.equals(this.inputFileBytes, getXlsxCellByIdentifierRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getXlsxCellByIdentifierRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToQuery, getXlsxCellByIdentifierRequest.worksheetToQuery) &&
        Objects.equals(this.cellIdentifier, getXlsxCellByIdentifierRequest.cellIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToQuery, cellIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellByIdentifierRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToQuery: ").append(toIndentedString(worksheetToQuery)).append("\n");
    sb.append("    cellIdentifier: ").append(toIndentedString(cellIdentifier)).append("\n");
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

