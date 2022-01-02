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
 * A single PDF file corresponding to one page in the original document
 */
@ApiModel(description = "A single PDF file corresponding to one page in the original document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-01T16:39:14.898-08:00")
public class PdfDocument {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("URL")
  private String URL = null;

  @SerializedName("DocumentContents")
  private byte[] documentContents = null;

  public PdfDocument pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the converted page, starting with 1 for the first page
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the converted page, starting with 1 for the first page")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PdfDocument URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL to the PDF file of this worksheet; file is stored in an in-memory cache and will be deleted
   * @return URL
  **/
  @ApiModelProperty(value = "URL to the PDF file of this worksheet; file is stored in an in-memory cache and will be deleted")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public PdfDocument documentContents(byte[] documentContents) {
    this.documentContents = documentContents;
    return this;
  }

   /**
   * If returnDocumentContents is set to true, will contain the contents of the document; otherwise will be set to null and the document contents will be available via the URL parameter
   * @return documentContents
  **/
  @ApiModelProperty(value = "If returnDocumentContents is set to true, will contain the contents of the document; otherwise will be set to null and the document contents will be available via the URL parameter")
  public byte[] getDocumentContents() {
    return documentContents;
  }

  public void setDocumentContents(byte[] documentContents) {
    this.documentContents = documentContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDocument pdfDocument = (PdfDocument) o;
    return Objects.equals(this.pageNumber, pdfDocument.pageNumber) &&
        Objects.equals(this.URL, pdfDocument.URL) &&
        Arrays.equals(this.documentContents, pdfDocument.documentContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, URL, Arrays.hashCode(documentContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDocument {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    documentContents: ").append(toIndentedString(documentContents)).append("\n");
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

