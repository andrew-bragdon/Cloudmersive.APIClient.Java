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
 * Input to a request to find matching paragraphs in a Word DOCX document
 */
@ApiModel(description = "Input to a request to find matching paragraphs in a Word DOCX document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T14:32:54.100-07:00")
public class FindDocxParagraphRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("FindString")
  private String findString = null;

  @SerializedName("MatchCase")
  private Boolean matchCase = null;

  public FindDocxParagraphRequest inputFileBytes(byte[] inputFileBytes) {
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

  public FindDocxParagraphRequest inputFileUrl(String inputFileUrl) {
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

  public FindDocxParagraphRequest findString(String findString) {
    this.findString = findString;
    return this;
  }

   /**
   * Required: The target string to search for in the paragraphs of the document
   * @return findString
  **/
  @ApiModelProperty(value = "Required: The target string to search for in the paragraphs of the document")
  public String getFindString() {
    return findString;
  }

  public void setFindString(String findString) {
    this.findString = findString;
  }

  public FindDocxParagraphRequest matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Optional: True to match case, false to ignore case when matching
   * @return matchCase
  **/
  @ApiModelProperty(value = "Optional: True to match case, false to ignore case when matching")
  public Boolean isMatchCase() {
    return matchCase;
  }

  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindDocxParagraphRequest findDocxParagraphRequest = (FindDocxParagraphRequest) o;
    return Arrays.equals(this.inputFileBytes, findDocxParagraphRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, findDocxParagraphRequest.inputFileUrl) &&
        Objects.equals(this.findString, findDocxParagraphRequest.findString) &&
        Objects.equals(this.matchCase, findDocxParagraphRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, findString, matchCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocxParagraphRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    findString: ").append(toIndentedString(findString)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
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

