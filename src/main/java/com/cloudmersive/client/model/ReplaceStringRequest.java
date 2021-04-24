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
 * Input to a string replacement request
 */
@ApiModel(description = "Input to a string replacement request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:48.871-07:00")
public class ReplaceStringRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("MatchString")
  private String matchString = null;

  @SerializedName("ReplaceString")
  private String replaceString = null;

  @SerializedName("MatchCase")
  private Boolean matchCase = null;

  public ReplaceStringRequest inputFileBytes(byte[] inputFileBytes) {
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

  public ReplaceStringRequest inputFileUrl(String inputFileUrl) {
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

  public ReplaceStringRequest matchString(String matchString) {
    this.matchString = matchString;
    return this;
  }

   /**
   * String to search for and match against, to be replaced
   * @return matchString
  **/
  @ApiModelProperty(value = "String to search for and match against, to be replaced")
  public String getMatchString() {
    return matchString;
  }

  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }

  public ReplaceStringRequest replaceString(String replaceString) {
    this.replaceString = replaceString;
    return this;
  }

   /**
   * String to replace the matched values with
   * @return replaceString
  **/
  @ApiModelProperty(value = "String to replace the matched values with")
  public String getReplaceString() {
    return replaceString;
  }

  public void setReplaceString(String replaceString) {
    this.replaceString = replaceString;
  }

  public ReplaceStringRequest matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * True if the case should be matched, false for case insensitive match
   * @return matchCase
  **/
  @ApiModelProperty(value = "True if the case should be matched, false for case insensitive match")
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
    ReplaceStringRequest replaceStringRequest = (ReplaceStringRequest) o;
    return Arrays.equals(this.inputFileBytes, replaceStringRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, replaceStringRequest.inputFileUrl) &&
        Objects.equals(this.matchString, replaceStringRequest.matchString) &&
        Objects.equals(this.replaceString, replaceStringRequest.replaceString) &&
        Objects.equals(this.matchCase, replaceStringRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, matchString, replaceString, matchCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    replaceString: ").append(toIndentedString(replaceString)).append("\n");
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

