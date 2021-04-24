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
 * Individual color
 */
@ApiModel(description = "Individual color")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:42.270-07:00")
public class ColorResult {
  @SerializedName("R")
  private Integer R = null;

  @SerializedName("G")
  private Integer G = null;

  @SerializedName("B")
  private Integer B = null;

  public ColorResult R(Integer R) {
    this.R = R;
    return this;
  }

   /**
   * Red (R) channel pixel value of this color
   * @return R
  **/
  @ApiModelProperty(value = "Red (R) channel pixel value of this color")
  public Integer getR() {
    return R;
  }

  public void setR(Integer R) {
    this.R = R;
  }

  public ColorResult G(Integer G) {
    this.G = G;
    return this;
  }

   /**
   * Green (G) channel pixel value of this color
   * @return G
  **/
  @ApiModelProperty(value = "Green (G) channel pixel value of this color")
  public Integer getG() {
    return G;
  }

  public void setG(Integer G) {
    this.G = G;
  }

  public ColorResult B(Integer B) {
    this.B = B;
    return this;
  }

   /**
   * Blue (B) channel pixel value of this color
   * @return B
  **/
  @ApiModelProperty(value = "Blue (B) channel pixel value of this color")
  public Integer getB() {
    return B;
  }

  public void setB(Integer B) {
    this.B = B;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorResult colorResult = (ColorResult) o;
    return Objects.equals(this.R, colorResult.R) &&
        Objects.equals(this.G, colorResult.G) &&
        Objects.equals(this.B, colorResult.B);
  }

  @Override
  public int hashCode() {
    return Objects.hash(R, G, B);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorResult {\n");
    
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
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

