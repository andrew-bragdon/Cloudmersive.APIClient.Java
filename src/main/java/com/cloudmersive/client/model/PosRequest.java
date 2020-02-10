/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Part of speech tagging request
 */
@ApiModel(description = "Part of speech tagging request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-09T19:05:58.893-08:00")
public class PosRequest {
  @SerializedName("InputText")
  private String inputText = null;

  public PosRequest inputText(String inputText) {
    this.inputText = inputText;
    return this;
  }

   /**
   * Input text string
   * @return inputText
  **/
  @ApiModelProperty(value = "Input text string")
  public String getInputText() {
    return inputText;
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosRequest posRequest = (PosRequest) o;
    return Objects.equals(this.inputText, posRequest.inputText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosRequest {\n");
    
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
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

