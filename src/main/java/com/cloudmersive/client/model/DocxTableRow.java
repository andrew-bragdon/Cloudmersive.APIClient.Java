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
import com.cloudmersive.client.model.DocxTableCell;
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
 * A row in a Word Document (DOCX) file
 */
@ApiModel(description = "A row in a Word Document (DOCX) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-21T20:51:15.104-07:00")
public class DocxTableRow {
  @SerializedName("RowIndex")
  private Integer rowIndex = null;

  @SerializedName("RowCells")
  private List<DocxTableCell> rowCells = null;

  public DocxTableRow rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Index of the row, 0-based
   * @return rowIndex
  **/
  @ApiModelProperty(value = "Index of the row, 0-based")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public DocxTableRow rowCells(List<DocxTableCell> rowCells) {
    this.rowCells = rowCells;
    return this;
  }

  public DocxTableRow addRowCellsItem(DocxTableCell rowCellsItem) {
    if (this.rowCells == null) {
      this.rowCells = new ArrayList<DocxTableCell>();
    }
    this.rowCells.add(rowCellsItem);
    return this;
  }

   /**
   * Cells in the row; this is where the contents of the row is stored
   * @return rowCells
  **/
  @ApiModelProperty(value = "Cells in the row; this is where the contents of the row is stored")
  public List<DocxTableCell> getRowCells() {
    return rowCells;
  }

  public void setRowCells(List<DocxTableCell> rowCells) {
    this.rowCells = rowCells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableRow docxTableRow = (DocxTableRow) o;
    return Objects.equals(this.rowIndex, docxTableRow.rowIndex) &&
        Objects.equals(this.rowCells, docxTableRow.rowCells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowIndex, rowCells);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableRow {\n");
    
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    rowCells: ").append(toIndentedString(rowCells)).append("\n");
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

