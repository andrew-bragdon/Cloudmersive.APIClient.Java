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
 * Individual hyperlink in an HTML File
 */
@ApiModel(description = "Individual hyperlink in an HTML File")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-18T00:43:11.127-07:00")
public class HtmlHyperlink {
  @SerializedName("Anchortext")
  private String anchortext = null;

  @SerializedName("Url")
  private String url = null;

  public HtmlHyperlink anchortext(String anchortext) {
    this.anchortext = anchortext;
    return this;
  }

   /**
   * Anchor text of the hyperlink, e.g. Click Here
   * @return anchortext
  **/
  @ApiModelProperty(value = "Anchor text of the hyperlink, e.g. Click Here")
  public String getAnchortext() {
    return anchortext;
  }

  public void setAnchortext(String anchortext) {
    this.anchortext = anchortext;
  }

  public HtmlHyperlink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the hyperlink; fully-qualified if possible, otherwise relative
   * @return url
  **/
  @ApiModelProperty(value = "URL of the hyperlink; fully-qualified if possible, otherwise relative")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlHyperlink htmlHyperlink = (HtmlHyperlink) o;
    return Objects.equals(this.anchortext, htmlHyperlink.anchortext) &&
        Objects.equals(this.url, htmlHyperlink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchortext, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlHyperlink {\n");
    
    sb.append("    anchortext: ").append(toIndentedString(anchortext)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

