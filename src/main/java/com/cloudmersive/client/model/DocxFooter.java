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
import com.cloudmersive.client.model.DocxSection;
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
 * Footer in a Word Document (DOCX)
 */
@ApiModel(description = "Footer in a Word Document (DOCX)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-04T21:44:29.559-07:00")
public class DocxFooter {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Paragraphs")
  private List<DocxParagraph> paragraphs = null;

  @SerializedName("SectionsWithFooter")
  private List<DocxSection> sectionsWithFooter = null;

  public DocxFooter path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxFooter paragraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxFooter addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<DocxParagraph>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Paragraphs in this footer
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Paragraphs in this footer")
  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public DocxFooter sectionsWithFooter(List<DocxSection> sectionsWithFooter) {
    this.sectionsWithFooter = sectionsWithFooter;
    return this;
  }

  public DocxFooter addSectionsWithFooterItem(DocxSection sectionsWithFooterItem) {
    if (this.sectionsWithFooter == null) {
      this.sectionsWithFooter = new ArrayList<DocxSection>();
    }
    this.sectionsWithFooter.add(sectionsWithFooterItem);
    return this;
  }

   /**
   * Sections that the footer is applied to
   * @return sectionsWithFooter
  **/
  @ApiModelProperty(value = "Sections that the footer is applied to")
  public List<DocxSection> getSectionsWithFooter() {
    return sectionsWithFooter;
  }

  public void setSectionsWithFooter(List<DocxSection> sectionsWithFooter) {
    this.sectionsWithFooter = sectionsWithFooter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxFooter docxFooter = (DocxFooter) o;
    return Objects.equals(this.path, docxFooter.path) &&
        Objects.equals(this.paragraphs, docxFooter.paragraphs) &&
        Objects.equals(this.sectionsWithFooter, docxFooter.sectionsWithFooter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, paragraphs, sectionsWithFooter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxFooter {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    sectionsWithFooter: ").append(toIndentedString(sectionsWithFooter)).append("\n");
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

