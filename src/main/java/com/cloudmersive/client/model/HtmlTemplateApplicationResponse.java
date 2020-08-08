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
 * Response from an HTML template application
 */
@ApiModel(description = "Response from an HTML template application")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T14:32:54.100-07:00")
public class HtmlTemplateApplicationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FinalHtml")
  private String finalHtml = null;

  public HtmlTemplateApplicationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public HtmlTemplateApplicationResponse finalHtml(String finalHtml) {
    this.finalHtml = finalHtml;
    return this;
  }

   /**
   * Final HTML result of all operations on input
   * @return finalHtml
  **/
  @ApiModelProperty(value = "Final HTML result of all operations on input")
  public String getFinalHtml() {
    return finalHtml;
  }

  public void setFinalHtml(String finalHtml) {
    this.finalHtml = finalHtml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlTemplateApplicationResponse htmlTemplateApplicationResponse = (HtmlTemplateApplicationResponse) o;
    return Objects.equals(this.successful, htmlTemplateApplicationResponse.successful) &&
        Objects.equals(this.finalHtml, htmlTemplateApplicationResponse.finalHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, finalHtml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlTemplateApplicationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    finalHtml: ").append(toIndentedString(finalHtml)).append("\n");
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

