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
 * Request to replace a regex string in a string
 */
@ApiModel(description = "Request to replace a regex string in a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:48.871-07:00")
public class ReplaceStringRegexRequest {
  @SerializedName("TextContent")
  private String textContent = null;

  @SerializedName("RegularExpressionString")
  private String regularExpressionString = null;

  @SerializedName("ReplaceWithString")
  private String replaceWithString = null;

  public ReplaceStringRegexRequest textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @ApiModelProperty(value = "Input text content")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public ReplaceStringRegexRequest regularExpressionString(String regularExpressionString) {
    this.regularExpressionString = regularExpressionString;
    return this;
  }

   /**
   * Target input regular expression (regex) string to match and be replaced; supports all regular expression values
   * @return regularExpressionString
  **/
  @ApiModelProperty(value = "Target input regular expression (regex) string to match and be replaced; supports all regular expression values")
  public String getRegularExpressionString() {
    return regularExpressionString;
  }

  public void setRegularExpressionString(String regularExpressionString) {
    this.regularExpressionString = regularExpressionString;
  }

  public ReplaceStringRegexRequest replaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
    return this;
  }

   /**
   * Replacement for target string; supports referencing indexed regex matched values from RegularExpressionString, such as $1, $2, and so on
   * @return replaceWithString
  **/
  @ApiModelProperty(value = "Replacement for target string; supports referencing indexed regex matched values from RegularExpressionString, such as $1, $2, and so on")
  public String getReplaceWithString() {
    return replaceWithString;
  }

  public void setReplaceWithString(String replaceWithString) {
    this.replaceWithString = replaceWithString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceStringRegexRequest replaceStringRegexRequest = (ReplaceStringRegexRequest) o;
    return Objects.equals(this.textContent, replaceStringRegexRequest.textContent) &&
        Objects.equals(this.regularExpressionString, replaceStringRegexRequest.regularExpressionString) &&
        Objects.equals(this.replaceWithString, replaceStringRegexRequest.replaceWithString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, regularExpressionString, replaceWithString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceStringRegexRequest {\n");
    
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    regularExpressionString: ").append(toIndentedString(regularExpressionString)).append("\n");
    sb.append("    replaceWithString: ").append(toIndentedString(replaceWithString)).append("\n");
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

