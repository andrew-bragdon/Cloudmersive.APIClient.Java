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
 * Row in an Excel spreadsheet worksheet
 */
@ApiModel(description = "Row in an Excel spreadsheet worksheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T19:56:33.707-07:00")
public class XlsxSpreadsheetRow {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Cells")
  private List<XlsxSpreadsheetCell> cells = null;

  public XlsxSpreadsheetRow path(String path) {
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

  public XlsxSpreadsheetRow cells(List<XlsxSpreadsheetCell> cells) {
    this.cells = cells;
    return this;
  }

  public XlsxSpreadsheetRow addCellsItem(XlsxSpreadsheetCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<XlsxSpreadsheetCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Spreadsheet Cells in the spreadsheet row
   * @return cells
  **/
  @ApiModelProperty(value = "Spreadsheet Cells in the spreadsheet row")
  public List<XlsxSpreadsheetCell> getCells() {
    return cells;
  }

  public void setCells(List<XlsxSpreadsheetCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetRow xlsxSpreadsheetRow = (XlsxSpreadsheetRow) o;
    return Objects.equals(this.path, xlsxSpreadsheetRow.path) &&
        Objects.equals(this.cells, xlsxSpreadsheetRow.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, cells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetRow {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

