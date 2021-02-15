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
import com.cloudmersive.client.model.PdfPageText;
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
 * Text of the PDF, broken down by page
 */
@ApiModel(description = "Text of the PDF, broken down by page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-15T01:01:53.598-08:00")
public class PdfTextByPageResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Pages")
  private List<PdfPageText> pages = null;

  public PdfTextByPageResult successful(Boolean successful) {
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

  public PdfTextByPageResult pages(List<PdfPageText> pages) {
    this.pages = pages;
    return this;
  }

  public PdfTextByPageResult addPagesItem(PdfPageText pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PdfPageText>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Pages in the PDF
   * @return pages
  **/
  @ApiModelProperty(value = "Pages in the PDF")
  public List<PdfPageText> getPages() {
    return pages;
  }

  public void setPages(List<PdfPageText> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTextByPageResult pdfTextByPageResult = (PdfTextByPageResult) o;
    return Objects.equals(this.successful, pdfTextByPageResult.successful) &&
        Objects.equals(this.pages, pdfTextByPageResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTextByPageResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

