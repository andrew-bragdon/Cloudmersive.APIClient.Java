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
import com.cloudmersive.client.model.DocxParagraph;
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
 * One page in a Word Document DOCX
 */
@ApiModel(description = "One page in a Word Document DOCX")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-22T19:40:44.935-07:00")
public class DocxPage {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("Paragraphs")
  private List<DocxParagraph> paragraphs = null;

  public DocxPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of this page, 1-based
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of this page, 1-based")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DocxPage paragraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxPage addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<DocxParagraph>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document
   * @return paragraphs
  **/
  @ApiModelProperty(value = "All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document")
  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxPage docxPage = (DocxPage) o;
    return Objects.equals(this.pageNumber, docxPage.pageNumber) &&
        Objects.equals(this.paragraphs, docxPage.paragraphs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, paragraphs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxPage {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
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

