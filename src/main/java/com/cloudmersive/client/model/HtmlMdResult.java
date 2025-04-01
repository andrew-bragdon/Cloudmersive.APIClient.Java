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
 * Result from converting a Markdown file to HTML
 */
@ApiModel(description = "Result from converting a Markdown file to HTML")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:43:18.332-07:00")
public class HtmlMdResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Html")
  private String html = null;

  public HtmlMdResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public HtmlMdResult html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Resulting HTML from the conversion
   * @return html
  **/
  @ApiModelProperty(value = "Resulting HTML from the conversion")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlMdResult htmlMdResult = (HtmlMdResult) o;
    return Objects.equals(this.successful, htmlMdResult.successful) &&
        Objects.equals(this.html, htmlMdResult.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlMdResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

