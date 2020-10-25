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
import com.cloudmersive.client.model.WorksheetResult;
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
 * The result of splitting a spreadsheet into individual Excel XLSX worksheets
 */
@ApiModel(description = "The result of splitting a spreadsheet into individual Excel XLSX worksheets")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-25T00:32:41.947-07:00")
public class SplitXlsxWorksheetResult {
  @SerializedName("ResultWorksheets")
  private List<WorksheetResult> resultWorksheets = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public SplitXlsxWorksheetResult resultWorksheets(List<WorksheetResult> resultWorksheets) {
    this.resultWorksheets = resultWorksheets;
    return this;
  }

  public SplitXlsxWorksheetResult addResultWorksheetsItem(WorksheetResult resultWorksheetsItem) {
    if (this.resultWorksheets == null) {
      this.resultWorksheets = new ArrayList<WorksheetResult>();
    }
    this.resultWorksheets.add(resultWorksheetsItem);
    return this;
  }

   /**
   * Get resultWorksheets
   * @return resultWorksheets
  **/
  @ApiModelProperty(value = "")
  public List<WorksheetResult> getResultWorksheets() {
    return resultWorksheets;
  }

  public void setResultWorksheets(List<WorksheetResult> resultWorksheets) {
    this.resultWorksheets = resultWorksheets;
  }

  public SplitXlsxWorksheetResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitXlsxWorksheetResult splitXlsxWorksheetResult = (SplitXlsxWorksheetResult) o;
    return Objects.equals(this.resultWorksheets, splitXlsxWorksheetResult.resultWorksheets) &&
        Objects.equals(this.successful, splitXlsxWorksheetResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultWorksheets, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitXlsxWorksheetResult {\n");
    
    sb.append("    resultWorksheets: ").append(toIndentedString(resultWorksheets)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

