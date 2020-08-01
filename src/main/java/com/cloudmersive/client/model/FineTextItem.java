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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Individual instance of text occuring in an image; one piece of text
 */
@ApiModel(description = "Individual instance of text occuring in an image; one piece of text")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-01T12:52:32.588-07:00")
public class FineTextItem {
  @SerializedName("TopLeftX")
  private Integer topLeftX = null;

  @SerializedName("TopLeftY")
  private Integer topLeftY = null;

  @SerializedName("TopRightX")
  private Integer topRightX = null;

  @SerializedName("TopRightY")
  private Integer topRightY = null;

  @SerializedName("BottomLeftX")
  private Integer bottomLeftX = null;

  @SerializedName("BottomLeftY")
  private Integer bottomLeftY = null;

  @SerializedName("BottomRightX")
  private Integer bottomRightX = null;

  @SerializedName("BottomRightY")
  private Integer bottomRightY = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Angle")
  private Double angle = null;

  public FineTextItem topLeftX(Integer topLeftX) {
    this.topLeftX = topLeftX;
    return this;
  }

   /**
   * X coordinate of the top/left text location; 0 represents the left edge of the input image
   * @return topLeftX
  **/
  @ApiModelProperty(value = "X coordinate of the top/left text location; 0 represents the left edge of the input image")
  public Integer getTopLeftX() {
    return topLeftX;
  }

  public void setTopLeftX(Integer topLeftX) {
    this.topLeftX = topLeftX;
  }

  public FineTextItem topLeftY(Integer topLeftY) {
    this.topLeftY = topLeftY;
    return this;
  }

   /**
   * Y coordinate of the top/left text location; 0 represents the top edge of the input image
   * @return topLeftY
  **/
  @ApiModelProperty(value = "Y coordinate of the top/left text location; 0 represents the top edge of the input image")
  public Integer getTopLeftY() {
    return topLeftY;
  }

  public void setTopLeftY(Integer topLeftY) {
    this.topLeftY = topLeftY;
  }

  public FineTextItem topRightX(Integer topRightX) {
    this.topRightX = topRightX;
    return this;
  }

   /**
   * X coordinate of the top/right text location; 0 represents the left edge of the input image
   * @return topRightX
  **/
  @ApiModelProperty(value = "X coordinate of the top/right text location; 0 represents the left edge of the input image")
  public Integer getTopRightX() {
    return topRightX;
  }

  public void setTopRightX(Integer topRightX) {
    this.topRightX = topRightX;
  }

  public FineTextItem topRightY(Integer topRightY) {
    this.topRightY = topRightY;
    return this;
  }

   /**
   * Y coordinate of the top/right text location; 0 represents the top edge of the input image
   * @return topRightY
  **/
  @ApiModelProperty(value = "Y coordinate of the top/right text location; 0 represents the top edge of the input image")
  public Integer getTopRightY() {
    return topRightY;
  }

  public void setTopRightY(Integer topRightY) {
    this.topRightY = topRightY;
  }

  public FineTextItem bottomLeftX(Integer bottomLeftX) {
    this.bottomLeftX = bottomLeftX;
    return this;
  }

   /**
   * X coordinate of the bottom/left text location; 0 represents the left edge of the input image
   * @return bottomLeftX
  **/
  @ApiModelProperty(value = "X coordinate of the bottom/left text location; 0 represents the left edge of the input image")
  public Integer getBottomLeftX() {
    return bottomLeftX;
  }

  public void setBottomLeftX(Integer bottomLeftX) {
    this.bottomLeftX = bottomLeftX;
  }

  public FineTextItem bottomLeftY(Integer bottomLeftY) {
    this.bottomLeftY = bottomLeftY;
    return this;
  }

   /**
   * Y coordinate of the bottom/left text location; 0 represents the top edge of the input image
   * @return bottomLeftY
  **/
  @ApiModelProperty(value = "Y coordinate of the bottom/left text location; 0 represents the top edge of the input image")
  public Integer getBottomLeftY() {
    return bottomLeftY;
  }

  public void setBottomLeftY(Integer bottomLeftY) {
    this.bottomLeftY = bottomLeftY;
  }

  public FineTextItem bottomRightX(Integer bottomRightX) {
    this.bottomRightX = bottomRightX;
    return this;
  }

   /**
   * X coordinate of the bottom/right text location; 0 represents the left edge of the input image
   * @return bottomRightX
  **/
  @ApiModelProperty(value = "X coordinate of the bottom/right text location; 0 represents the left edge of the input image")
  public Integer getBottomRightX() {
    return bottomRightX;
  }

  public void setBottomRightX(Integer bottomRightX) {
    this.bottomRightX = bottomRightX;
  }

  public FineTextItem bottomRightY(Integer bottomRightY) {
    this.bottomRightY = bottomRightY;
    return this;
  }

   /**
   * Y coordinate of the bottom/right text location; 0 represents the top edge of the input image
   * @return bottomRightY
  **/
  @ApiModelProperty(value = "Y coordinate of the bottom/right text location; 0 represents the top edge of the input image")
  public Integer getBottomRightY() {
    return bottomRightY;
  }

  public void setBottomRightY(Integer bottomRightY) {
    this.bottomRightY = bottomRightY;
  }

  public FineTextItem width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the text
   * @return width
  **/
  @ApiModelProperty(value = "Width in pixels of the text")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public FineTextItem height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the text
   * @return height
  **/
  @ApiModelProperty(value = "Height in pixels of the text")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public FineTextItem angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Rotation Angle in radians of the text
   * @return angle
  **/
  @ApiModelProperty(value = "Rotation Angle in radians of the text")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTextItem fineTextItem = (FineTextItem) o;
    return Objects.equals(this.topLeftX, fineTextItem.topLeftX) &&
        Objects.equals(this.topLeftY, fineTextItem.topLeftY) &&
        Objects.equals(this.topRightX, fineTextItem.topRightX) &&
        Objects.equals(this.topRightY, fineTextItem.topRightY) &&
        Objects.equals(this.bottomLeftX, fineTextItem.bottomLeftX) &&
        Objects.equals(this.bottomLeftY, fineTextItem.bottomLeftY) &&
        Objects.equals(this.bottomRightX, fineTextItem.bottomRightX) &&
        Objects.equals(this.bottomRightY, fineTextItem.bottomRightY) &&
        Objects.equals(this.width, fineTextItem.width) &&
        Objects.equals(this.height, fineTextItem.height) &&
        Objects.equals(this.angle, fineTextItem.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topLeftX, topLeftY, topRightX, topRightY, bottomLeftX, bottomLeftY, bottomRightX, bottomRightY, width, height, angle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTextItem {\n");
    
    sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
    sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
    sb.append("    topRightX: ").append(toIndentedString(topRightX)).append("\n");
    sb.append("    topRightY: ").append(toIndentedString(topRightY)).append("\n");
    sb.append("    bottomLeftX: ").append(toIndentedString(bottomLeftX)).append("\n");
    sb.append("    bottomLeftY: ").append(toIndentedString(bottomLeftY)).append("\n");
    sb.append("    bottomRightX: ").append(toIndentedString(bottomRightX)).append("\n");
    sb.append("    bottomRightY: ").append(toIndentedString(bottomRightY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

