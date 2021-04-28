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
import java.util.ArrayList;
import java.util.List;

/**
 * Result of running a Get-Worksheets command
 */
@ApiModel(description = "Result of running a Get-Worksheets command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-26T21:01:13.943-07:00")
public class GetXlsxWorksheetsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Worksheets")
  private List<XlsxWorksheet> worksheets = null;

  public GetXlsxWorksheetsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetXlsxWorksheetsResponse worksheets(List<XlsxWorksheet> worksheets) {
    this.worksheets = worksheets;
    return this;
  }

  public GetXlsxWorksheetsResponse addWorksheetsItem(XlsxWorksheet worksheetsItem) {
    if (this.worksheets == null) {
      this.worksheets = new ArrayList<XlsxWorksheet>();
    }
    this.worksheets.add(worksheetsItem);
    return this;
  }

   /**
   * Worksheets in the Excel XLSX spreadsheet
   * @return worksheets
  **/
  @ApiModelProperty(value = "Worksheets in the Excel XLSX spreadsheet")
  public List<XlsxWorksheet> getWorksheets() {
    return worksheets;
  }

  public void setWorksheets(List<XlsxWorksheet> worksheets) {
    this.worksheets = worksheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxWorksheetsResponse getXlsxWorksheetsResponse = (GetXlsxWorksheetsResponse) o;
    return Objects.equals(this.successful, getXlsxWorksheetsResponse.successful) &&
        Objects.equals(this.worksheets, getXlsxWorksheetsResponse.worksheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, worksheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxWorksheetsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    worksheets: ").append(toIndentedString(worksheets)).append("\n");
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

