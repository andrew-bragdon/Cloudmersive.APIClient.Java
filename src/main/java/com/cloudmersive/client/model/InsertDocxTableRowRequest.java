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
import com.cloudmersive.client.model.DocxTableRow;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Insert Table Row request
 */
@ApiModel(description = "Input to a Insert Table Row request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:48.137-07:00")
public class InsertDocxTableRowRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("RowToInsert")
  private DocxTableRow rowToInsert = null;

  @SerializedName("InsertPlacement")
  private String insertPlacement = null;

  @SerializedName("ExistingTablePath")
  private String existingTablePath = null;

  public InsertDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
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

  public InsertDocxTableRowRequest inputFileUrl(String inputFileUrl) {
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

  public InsertDocxTableRowRequest rowToInsert(DocxTableRow rowToInsert) {
    this.rowToInsert = rowToInsert;
    return this;
  }

   /**
   * Table you would like to insert
   * @return rowToInsert
  **/
  @ApiModelProperty(value = "Table you would like to insert")
  public DocxTableRow getRowToInsert() {
    return rowToInsert;
  }

  public void setRowToInsert(DocxTableRow rowToInsert) {
    this.rowToInsert = rowToInsert;
  }

  public InsertDocxTableRowRequest insertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
    return this;
  }

   /**
   * Optional; default is TableEnd.  Placement Type of the insert; possible values are: TableStart (very beginning of the table), TableEnd (very end of the document), or a 0-based row index number as an integer, 0 being the first row in the table, 1 being the second row in the table, 2 being the third row in the table, etc. to insert this row after
   * @return insertPlacement
  **/
  @ApiModelProperty(value = "Optional; default is TableEnd.  Placement Type of the insert; possible values are: TableStart (very beginning of the table), TableEnd (very end of the document), or a 0-based row index number as an integer, 0 being the first row in the table, 1 being the second row in the table, 2 being the third row in the table, etc. to insert this row after")
  public String getInsertPlacement() {
    return insertPlacement;
  }

  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }

  public InsertDocxTableRowRequest existingTablePath(String existingTablePath) {
    this.existingTablePath = existingTablePath;
    return this;
  }

   /**
   * Required; the path to the existing table to modify
   * @return existingTablePath
  **/
  @ApiModelProperty(value = "Required; the path to the existing table to modify")
  public String getExistingTablePath() {
    return existingTablePath;
  }

  public void setExistingTablePath(String existingTablePath) {
    this.existingTablePath = existingTablePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocxTableRowRequest insertDocxTableRowRequest = (InsertDocxTableRowRequest) o;
    return Arrays.equals(this.inputFileBytes, insertDocxTableRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, insertDocxTableRowRequest.inputFileUrl) &&
        Objects.equals(this.rowToInsert, insertDocxTableRowRequest.rowToInsert) &&
        Objects.equals(this.insertPlacement, insertDocxTableRowRequest.insertPlacement) &&
        Objects.equals(this.existingTablePath, insertDocxTableRowRequest.existingTablePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, rowToInsert, insertPlacement, existingTablePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocxTableRowRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    rowToInsert: ").append(toIndentedString(rowToInsert)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    existingTablePath: ").append(toIndentedString(existingTablePath)).append("\n");
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

