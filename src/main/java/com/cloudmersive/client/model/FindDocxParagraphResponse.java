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
 * Result of performing a find matching paragraphs operation on a Word Document
 */
@ApiModel(description = "Result of performing a find matching paragraphs operation on a Word Document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-25T19:53:24.676-07:00")
public class FindDocxParagraphResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("MatchingParagraphs")
  private List<DocxParagraph> matchingParagraphs = null;

  @SerializedName("Count")
  private Integer count = null;

  public FindDocxParagraphResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful; false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful; false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FindDocxParagraphResponse matchingParagraphs(List<DocxParagraph> matchingParagraphs) {
    this.matchingParagraphs = matchingParagraphs;
    return this;
  }

  public FindDocxParagraphResponse addMatchingParagraphsItem(DocxParagraph matchingParagraphsItem) {
    if (this.matchingParagraphs == null) {
      this.matchingParagraphs = new ArrayList<DocxParagraph>();
    }
    this.matchingParagraphs.add(matchingParagraphsItem);
    return this;
  }

   /**
   * Matching paragraphs
   * @return matchingParagraphs
  **/
  @ApiModelProperty(value = "Matching paragraphs")
  public List<DocxParagraph> getMatchingParagraphs() {
    return matchingParagraphs;
  }

  public void setMatchingParagraphs(List<DocxParagraph> matchingParagraphs) {
    this.matchingParagraphs = matchingParagraphs;
  }

  public FindDocxParagraphResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of matching paragraphs
   * @return count
  **/
  @ApiModelProperty(value = "Count of matching paragraphs")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindDocxParagraphResponse findDocxParagraphResponse = (FindDocxParagraphResponse) o;
    return Objects.equals(this.successful, findDocxParagraphResponse.successful) &&
        Objects.equals(this.matchingParagraphs, findDocxParagraphResponse.matchingParagraphs) &&
        Objects.equals(this.count, findDocxParagraphResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matchingParagraphs, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocxParagraphResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matchingParagraphs: ").append(toIndentedString(matchingParagraphs)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

