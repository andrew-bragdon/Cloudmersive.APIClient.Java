/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.model.DrawRectangleInstance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to draw one or more rectangles on a base image
 */
@ApiModel(description = "Request to draw one or more rectangles on a base image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-22T19:40:38.440-07:00")
public class DrawRectangleRequest {
  @SerializedName("BaseImageBytes")
  private byte[] baseImageBytes = null;

  @SerializedName("BaseImageUrl")
  private String baseImageUrl = null;

  @SerializedName("RectanglesToDraw")
  private List<DrawRectangleInstance> rectanglesToDraw = null;

  public DrawRectangleRequest baseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
    return this;
  }

   /**
   * Image to draw rectangles on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
   * @return baseImageBytes
  **/
  @ApiModelProperty(value = "Image to draw rectangles on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL")
  public byte[] getBaseImageBytes() {
    return baseImageBytes;
  }

  public void setBaseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
  }

  public DrawRectangleRequest baseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
    return this;
  }

   /**
   * Image to draw rectangles on, as an HTTP or HTTPS fully-qualified URL
   * @return baseImageUrl
  **/
  @ApiModelProperty(value = "Image to draw rectangles on, as an HTTP or HTTPS fully-qualified URL")
  public String getBaseImageUrl() {
    return baseImageUrl;
  }

  public void setBaseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
  }

  public DrawRectangleRequest rectanglesToDraw(List<DrawRectangleInstance> rectanglesToDraw) {
    this.rectanglesToDraw = rectanglesToDraw;
    return this;
  }

  public DrawRectangleRequest addRectanglesToDrawItem(DrawRectangleInstance rectanglesToDrawItem) {
    if (this.rectanglesToDraw == null) {
      this.rectanglesToDraw = new ArrayList<DrawRectangleInstance>();
    }
    this.rectanglesToDraw.add(rectanglesToDrawItem);
    return this;
  }

   /**
   * Rectangles to draw on the image.  Rectangles are drawn in index order.
   * @return rectanglesToDraw
  **/
  @ApiModelProperty(value = "Rectangles to draw on the image.  Rectangles are drawn in index order.")
  public List<DrawRectangleInstance> getRectanglesToDraw() {
    return rectanglesToDraw;
  }

  public void setRectanglesToDraw(List<DrawRectangleInstance> rectanglesToDraw) {
    this.rectanglesToDraw = rectanglesToDraw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawRectangleRequest drawRectangleRequest = (DrawRectangleRequest) o;
    return Arrays.equals(this.baseImageBytes, drawRectangleRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawRectangleRequest.baseImageUrl) &&
        Objects.equals(this.rectanglesToDraw, drawRectangleRequest.rectanglesToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, rectanglesToDraw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawRectangleRequest {\n");
    
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    rectanglesToDraw: ").append(toIndentedString(rectanglesToDraw)).append("\n");
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

