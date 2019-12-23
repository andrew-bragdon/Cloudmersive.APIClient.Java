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
import com.cloudmersive.client.model.PolygonPoint;
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
 * Polygon instance to draw on an image
 */
@ApiModel(description = "Polygon instance to draw on an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-22T18:37:53.703-08:00")
public class DrawPolygonInstance {
  @SerializedName("BorderColor")
  private String borderColor = null;

  @SerializedName("BorderWidth")
  private Double borderWidth = null;

  @SerializedName("FillColor")
  private String fillColor = null;

  @SerializedName("Points")
  private List<PolygonPoint> points = null;

  public DrawPolygonInstance borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.
   * @return borderColor
  **/
  @ApiModelProperty(value = "Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.")
  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public DrawPolygonInstance borderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

   /**
   * Width in pixels of the border.  Pass in 0 to draw a polygon with no border
   * @return borderWidth
  **/
  @ApiModelProperty(value = "Width in pixels of the border.  Pass in 0 to draw a polygon with no border")
  public Double getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public DrawPolygonInstance fillColor(String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

   /**
   * Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the polygon.
   * @return fillColor
  **/
  @ApiModelProperty(value = "Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the polygon.")
  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public DrawPolygonInstance points(List<PolygonPoint> points) {
    this.points = points;
    return this;
  }

  public DrawPolygonInstance addPointsItem(PolygonPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<PolygonPoint>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Points (vertices) which comprise the polygon; valid polygons must have at least 3 points
   * @return points
  **/
  @ApiModelProperty(value = "Points (vertices) which comprise the polygon; valid polygons must have at least 3 points")
  public List<PolygonPoint> getPoints() {
    return points;
  }

  public void setPoints(List<PolygonPoint> points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawPolygonInstance drawPolygonInstance = (DrawPolygonInstance) o;
    return Objects.equals(this.borderColor, drawPolygonInstance.borderColor) &&
        Objects.equals(this.borderWidth, drawPolygonInstance.borderWidth) &&
        Objects.equals(this.fillColor, drawPolygonInstance.fillColor) &&
        Objects.equals(this.points, drawPolygonInstance.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, borderWidth, fillColor, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawPolygonInstance {\n");
    
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

