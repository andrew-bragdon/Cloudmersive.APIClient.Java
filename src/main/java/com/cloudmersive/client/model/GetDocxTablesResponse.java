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
import com.cloudmersive.client.model.DocxTable;
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
 * Result of running a Get-Tables command
 */
@ApiModel(description = "Result of running a Get-Tables command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-11T18:04:14.328-07:00")
public class GetDocxTablesResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Tables")
  private List<DocxTable> tables = null;

  public GetDocxTablesResponse successful(Boolean successful) {
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

  public GetDocxTablesResponse tables(List<DocxTable> tables) {
    this.tables = tables;
    return this;
  }

  public GetDocxTablesResponse addTablesItem(DocxTable tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<DocxTable>();
    }
    this.tables.add(tablesItem);
    return this;
  }

   /**
   * Tables in the DOCX file
   * @return tables
  **/
  @ApiModelProperty(value = "Tables in the DOCX file")
  public List<DocxTable> getTables() {
    return tables;
  }

  public void setTables(List<DocxTable> tables) {
    this.tables = tables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTablesResponse getDocxTablesResponse = (GetDocxTablesResponse) o;
    return Objects.equals(this.successful, getDocxTablesResponse.successful) &&
        Objects.equals(this.tables, getDocxTablesResponse.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, tables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTablesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

