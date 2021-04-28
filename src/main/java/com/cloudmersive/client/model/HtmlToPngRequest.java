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
 * Details of the HTML to PNG request
 */
@ApiModel(description = "Details of the HTML to PNG request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:48.137-07:00")
public class HtmlToPngRequest {
  @SerializedName("Html")
  private String html = null;

  @SerializedName("ExtraLoadingWait")
  private Integer extraLoadingWait = null;

  @SerializedName("ScreenshotWidth")
  private Integer screenshotWidth = null;

  @SerializedName("ScreenshotHeight")
  private Integer screenshotHeight = null;

  public HtmlToPngRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * HTML to render to PNG (screenshot)
   * @return html
  **/
  @ApiModelProperty(value = "HTML to render to PNG (screenshot)")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public HtmlToPngRequest extraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).
   * @return extraLoadingWait
  **/
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites. Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 30000 milliseconds (30 seconds).")
  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }

  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }

  public HtmlToPngRequest screenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
    return this;
  }

   /**
   * Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot
   * @return screenshotWidth
  **/
  @ApiModelProperty(value = "Optional: Width of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot")
  public Integer getScreenshotWidth() {
    return screenshotWidth;
  }

  public void setScreenshotWidth(Integer screenshotWidth) {
    this.screenshotWidth = screenshotWidth;
  }

  public HtmlToPngRequest screenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
    return this;
  }

   /**
   * Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot
   * @return screenshotHeight
  **/
  @ApiModelProperty(value = "Optional: Height of the screenshot in pixels; supply 0 to default to 1280 x 1024, supply -1 to measure the full screen height of the page and attempt to take a screen-height screenshot")
  public Integer getScreenshotHeight() {
    return screenshotHeight;
  }

  public void setScreenshotHeight(Integer screenshotHeight) {
    this.screenshotHeight = screenshotHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlToPngRequest htmlToPngRequest = (HtmlToPngRequest) o;
    return Objects.equals(this.html, htmlToPngRequest.html) &&
        Objects.equals(this.extraLoadingWait, htmlToPngRequest.extraLoadingWait) &&
        Objects.equals(this.screenshotWidth, htmlToPngRequest.screenshotWidth) &&
        Objects.equals(this.screenshotHeight, htmlToPngRequest.screenshotHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, extraLoadingWait, screenshotWidth, screenshotHeight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlToPngRequest {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    screenshotWidth: ").append(toIndentedString(screenshotWidth)).append("\n");
    sb.append("    screenshotHeight: ").append(toIndentedString(screenshotHeight)).append("\n");
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

