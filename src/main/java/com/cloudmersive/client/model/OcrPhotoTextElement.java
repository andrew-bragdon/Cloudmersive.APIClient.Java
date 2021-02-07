/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.Point;
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
 * A single text in an OCR document
 */
@ApiModel(description = "A single text in an OCR document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-07T15:45:11.175-08:00")
public class OcrPhotoTextElement {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("XLeft")
  private Integer xleft = null;

  @SerializedName("YTop")
  private Integer ytop = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("BoundingPoints")
  private List<Point> boundingPoints = null;

  @SerializedName("ConfidenceLevel")
  private Double confidenceLevel = null;

  public OcrPhotoTextElement text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of the word
   * @return text
  **/
  @ApiModelProperty(value = "Text of the word")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public OcrPhotoTextElement xleft(Integer xleft) {
    this.xleft = xleft;
    return this;
  }

   /**
   * X location of the left edge of the word in pixels
   * @return xleft
  **/
  @ApiModelProperty(value = "X location of the left edge of the word in pixels")
  public Integer getXleft() {
    return xleft;
  }

  public void setXleft(Integer xleft) {
    this.xleft = xleft;
  }

  public OcrPhotoTextElement ytop(Integer ytop) {
    this.ytop = ytop;
    return this;
  }

   /**
   * Y location of the top edge of the word in pixels
   * @return ytop
  **/
  @ApiModelProperty(value = "Y location of the top edge of the word in pixels")
  public Integer getYtop() {
    return ytop;
  }

  public void setYtop(Integer ytop) {
    this.ytop = ytop;
  }

  public OcrPhotoTextElement width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the word in pixels
   * @return width
  **/
  @ApiModelProperty(value = "Width of the word in pixels")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OcrPhotoTextElement height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the word in pixels
   * @return height
  **/
  @ApiModelProperty(value = "Height of the word in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public OcrPhotoTextElement boundingPoints(List<Point> boundingPoints) {
    this.boundingPoints = boundingPoints;
    return this;
  }

  public OcrPhotoTextElement addBoundingPointsItem(Point boundingPointsItem) {
    if (this.boundingPoints == null) {
      this.boundingPoints = new ArrayList<Point>();
    }
    this.boundingPoints.add(boundingPointsItem);
    return this;
  }

   /**
   * Points that form the bounding polygon around the text
   * @return boundingPoints
  **/
  @ApiModelProperty(value = "Points that form the bounding polygon around the text")
  public List<Point> getBoundingPoints() {
    return boundingPoints;
  }

  public void setBoundingPoints(List<Point> boundingPoints) {
    this.boundingPoints = boundingPoints;
  }

  public OcrPhotoTextElement confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy)
   * @return confidenceLevel
  **/
  @ApiModelProperty(value = "Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy)")
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPhotoTextElement ocrPhotoTextElement = (OcrPhotoTextElement) o;
    return Objects.equals(this.text, ocrPhotoTextElement.text) &&
        Objects.equals(this.xleft, ocrPhotoTextElement.xleft) &&
        Objects.equals(this.ytop, ocrPhotoTextElement.ytop) &&
        Objects.equals(this.width, ocrPhotoTextElement.width) &&
        Objects.equals(this.height, ocrPhotoTextElement.height) &&
        Objects.equals(this.boundingPoints, ocrPhotoTextElement.boundingPoints) &&
        Objects.equals(this.confidenceLevel, ocrPhotoTextElement.confidenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, xleft, ytop, width, height, boundingPoints, confidenceLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPhotoTextElement {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    xleft: ").append(toIndentedString(xleft)).append("\n");
    sb.append("    ytop: ").append(toIndentedString(ytop)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    boundingPoints: ").append(toIndentedString(boundingPoints)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
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

