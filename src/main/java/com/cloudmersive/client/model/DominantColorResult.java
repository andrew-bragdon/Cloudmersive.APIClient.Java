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
import com.cloudmersive.client.model.ColorResult;
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
 * Result of performing a get dominant color operation
 */
@ApiModel(description = "Result of performing a get dominant color operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:43.969-07:00")
public class DominantColorResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("DominantColors")
  private List<ColorResult> dominantColors = null;

  public DominantColorResult successful(Boolean successful) {
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

  public DominantColorResult dominantColors(List<ColorResult> dominantColors) {
    this.dominantColors = dominantColors;
    return this;
  }

  public DominantColorResult addDominantColorsItem(ColorResult dominantColorsItem) {
    if (this.dominantColors == null) {
      this.dominantColors = new ArrayList<ColorResult>();
    }
    this.dominantColors.add(dominantColorsItem);
    return this;
  }

   /**
   * Dominant colors in the image, in order where most dominant color is in the first index position (0), the second most-dominant color is in index position 1 and so on
   * @return dominantColors
  **/
  @ApiModelProperty(value = "Dominant colors in the image, in order where most dominant color is in the first index position (0), the second most-dominant color is in index position 1 and so on")
  public List<ColorResult> getDominantColors() {
    return dominantColors;
  }

  public void setDominantColors(List<ColorResult> dominantColors) {
    this.dominantColors = dominantColors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DominantColorResult dominantColorResult = (DominantColorResult) o;
    return Objects.equals(this.successful, dominantColorResult.successful) &&
        Objects.equals(this.dominantColors, dominantColorResult.dominantColors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, dominantColors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DominantColorResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    dominantColors: ").append(toIndentedString(dominantColors)).append("\n");
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

