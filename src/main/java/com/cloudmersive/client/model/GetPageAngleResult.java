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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of performing a get-page-angle operation
 */
@ApiModel(description = "Result of performing a get-page-angle operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-03T15:49:08.302-07:00")
public class GetPageAngleResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Angle")
  private Double angle = null;

  public GetPageAngleResult successful(Boolean successful) {
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

  public GetPageAngleResult angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Angle of the page in radians; 0 represents perfectly horizontal
   * @return angle
  **/
  @ApiModelProperty(value = "Angle of the page in radians; 0 represents perfectly horizontal")
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
    GetPageAngleResult getPageAngleResult = (GetPageAngleResult) o;
    return Objects.equals(this.successful, getPageAngleResult.successful) &&
        Objects.equals(this.angle, getPageAngleResult.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, angle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPageAngleResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

