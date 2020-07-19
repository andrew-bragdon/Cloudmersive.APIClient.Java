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
 * A worksheet (tab) in an Excel (XLSX) spreadsheet
 */
@ApiModel(description = "A worksheet (tab) in an Excel (XLSX) spreadsheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-18T23:23:18.353-07:00")
public class XlsxWorksheet {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("WorksheetName")
  private String worksheetName = null;

  public XlsxWorksheet path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new worksheets
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new worksheets")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public XlsxWorksheet worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * User-facing name of the worksheet tab
   * @return worksheetName
  **/
  @ApiModelProperty(value = "User-facing name of the worksheet tab")
  public String getWorksheetName() {
    return worksheetName;
  }

  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxWorksheet xlsxWorksheet = (XlsxWorksheet) o;
    return Objects.equals(this.path, xlsxWorksheet.path) &&
        Objects.equals(this.worksheetName, xlsxWorksheet.worksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, worksheetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxWorksheet {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
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

