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
 * A single line of a Text document
 */
@ApiModel(description = "A single line of a Text document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-19T10:45:42.122-07:00")
public class TextDocumentLine {
  @SerializedName("LineNumber")
  private Integer lineNumber = null;

  @SerializedName("LineContents")
  private String lineContents = null;

  public TextDocumentLine lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * The 1-based line index of the line
   * @return lineNumber
  **/
  @ApiModelProperty(value = "The 1-based line index of the line")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public TextDocumentLine lineContents(String lineContents) {
    this.lineContents = lineContents;
    return this;
  }

   /**
   * The text contents of a single line of a text file
   * @return lineContents
  **/
  @ApiModelProperty(value = "The text contents of a single line of a text file")
  public String getLineContents() {
    return lineContents;
  }

  public void setLineContents(String lineContents) {
    this.lineContents = lineContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextDocumentLine textDocumentLine = (TextDocumentLine) o;
    return Objects.equals(this.lineNumber, textDocumentLine.lineNumber) &&
        Objects.equals(this.lineContents, textDocumentLine.lineContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, lineContents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextDocumentLine {\n");
    
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    lineContents: ").append(toIndentedString(lineContents)).append("\n");
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

