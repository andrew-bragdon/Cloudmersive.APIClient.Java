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
 * DocxBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-19T18:35:33.539-08:00")
public class DocxBody {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("AllParagraphs")
  private List<DocxParagraph> allParagraphs = null;

  @SerializedName("AllTables")
  private List<DocxTable> allTables = null;

  public DocxBody path(String path) {
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

  public DocxBody allParagraphs(List<DocxParagraph> allParagraphs) {
    this.allParagraphs = allParagraphs;
    return this;
  }

  public DocxBody addAllParagraphsItem(DocxParagraph allParagraphsItem) {
    if (this.allParagraphs == null) {
      this.allParagraphs = new ArrayList<DocxParagraph>();
    }
    this.allParagraphs.add(allParagraphsItem);
    return this;
  }

   /**
   * All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document
   * @return allParagraphs
  **/
  @ApiModelProperty(value = "All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document")
  public List<DocxParagraph> getAllParagraphs() {
    return allParagraphs;
  }

  public void setAllParagraphs(List<DocxParagraph> allParagraphs) {
    this.allParagraphs = allParagraphs;
  }

  public DocxBody allTables(List<DocxTable> allTables) {
    this.allTables = allTables;
    return this;
  }

  public DocxBody addAllTablesItem(DocxTable allTablesItem) {
    if (this.allTables == null) {
      this.allTables = new ArrayList<DocxTable>();
    }
    this.allTables.add(allTablesItem);
    return this;
  }

   /**
   * All tables anywhere in the document; these objects are not sequentially placed but are scatted across the document
   * @return allTables
  **/
  @ApiModelProperty(value = "All tables anywhere in the document; these objects are not sequentially placed but are scatted across the document")
  public List<DocxTable> getAllTables() {
    return allTables;
  }

  public void setAllTables(List<DocxTable> allTables) {
    this.allTables = allTables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxBody docxBody = (DocxBody) o;
    return Objects.equals(this.path, docxBody.path) &&
        Objects.equals(this.allParagraphs, docxBody.allParagraphs) &&
        Objects.equals(this.allTables, docxBody.allTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, allParagraphs, allTables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxBody {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    allParagraphs: ").append(toIndentedString(allParagraphs)).append("\n");
    sb.append("    allTables: ").append(toIndentedString(allTables)).append("\n");
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

