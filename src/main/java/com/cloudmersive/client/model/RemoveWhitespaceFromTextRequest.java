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
 * Request to remove whitespace from a string
 */
@ApiModel(description = "Request to remove whitespace from a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-09T19:06:16.441-08:00")
public class RemoveWhitespaceFromTextRequest {
  @SerializedName("TextContainingWhitespace")
  private String textContainingWhitespace = null;

  public RemoveWhitespaceFromTextRequest textContainingWhitespace(String textContainingWhitespace) {
    this.textContainingWhitespace = textContainingWhitespace;
    return this;
  }

   /**
   * Input text string to remove the whitespace from
   * @return textContainingWhitespace
  **/
  @ApiModelProperty(value = "Input text string to remove the whitespace from")
  public String getTextContainingWhitespace() {
    return textContainingWhitespace;
  }

  public void setTextContainingWhitespace(String textContainingWhitespace) {
    this.textContainingWhitespace = textContainingWhitespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveWhitespaceFromTextRequest removeWhitespaceFromTextRequest = (RemoveWhitespaceFromTextRequest) o;
    return Objects.equals(this.textContainingWhitespace, removeWhitespaceFromTextRequest.textContainingWhitespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContainingWhitespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveWhitespaceFromTextRequest {\n");
    
    sb.append("    textContainingWhitespace: ").append(toIndentedString(textContainingWhitespace)).append("\n");
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

