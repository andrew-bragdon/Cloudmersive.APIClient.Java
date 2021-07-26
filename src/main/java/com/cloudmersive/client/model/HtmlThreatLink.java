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
 * Threat assessment for a hyperlink URL
 */
@ApiModel(description = "Threat assessment for a hyperlink URL")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-25T19:53:24.676-07:00")
public class HtmlThreatLink {
  @SerializedName("LinkUrl")
  private String linkUrl = null;

  @SerializedName("ThreatLevel")
  private String threatLevel = null;

  public HtmlThreatLink linkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * URL of the link
   * @return linkUrl
  **/
  @ApiModelProperty(value = "URL of the link")
  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public HtmlThreatLink threatLevel(String threatLevel) {
    this.threatLevel = threatLevel;
    return this;
  }

   /**
   * Threat assessment level; possible values are None, Low, Medium and High
   * @return threatLevel
  **/
  @ApiModelProperty(value = "Threat assessment level; possible values are None, Low, Medium and High")
  public String getThreatLevel() {
    return threatLevel;
  }

  public void setThreatLevel(String threatLevel) {
    this.threatLevel = threatLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlThreatLink htmlThreatLink = (HtmlThreatLink) o;
    return Objects.equals(this.linkUrl, htmlThreatLink.linkUrl) &&
        Objects.equals(this.threatLevel, htmlThreatLink.threatLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUrl, threatLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlThreatLink {\n");
    
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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

