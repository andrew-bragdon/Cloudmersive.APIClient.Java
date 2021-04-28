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
import com.cloudmersive.client.model.XlsxSpreadsheetRow;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of running a Get-Specific-Row command
 */
@ApiModel(description = "Result of running a Get-Specific-Row command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:48.137-07:00")
public class GetXlsxSpecificRowResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Row")
  private XlsxSpreadsheetRow row = null;

  public GetXlsxSpecificRowResponse successful(Boolean successful) {
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

  public GetXlsxSpecificRowResponse row(XlsxSpreadsheetRow row) {
    this.row = row;
    return this;
  }

   /**
   * Spreadsheet Row from the Excel XLSX document
   * @return row
  **/
  @ApiModelProperty(value = "Spreadsheet Row from the Excel XLSX document")
  public XlsxSpreadsheetRow getRow() {
    return row;
  }

  public void setRow(XlsxSpreadsheetRow row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxSpecificRowResponse getXlsxSpecificRowResponse = (GetXlsxSpecificRowResponse) o;
    return Objects.equals(this.successful, getXlsxSpecificRowResponse.successful) &&
        Objects.equals(this.row, getXlsxSpecificRowResponse.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, row);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxSpecificRowResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

