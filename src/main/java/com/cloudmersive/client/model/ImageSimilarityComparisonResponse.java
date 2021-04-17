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
 * Result of performing an image similarity operation
 */
@ApiModel(description = "Result of performing an image similarity operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-16T22:06:05.717-07:00")
public class ImageSimilarityComparisonResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("AreImagesSimilar")
  private Boolean areImagesSimilar = null;

  @SerializedName("ImageSimilarityScore")
  private Double imageSimilarityScore = null;

  public ImageSimilarityComparisonResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ImageSimilarityComparisonResponse areImagesSimilar(Boolean areImagesSimilar) {
    this.areImagesSimilar = areImagesSimilar;
    return this;
  }

   /**
   * True if images are similar, false otherwise
   * @return areImagesSimilar
  **/
  @ApiModelProperty(value = "True if images are similar, false otherwise")
  public Boolean isAreImagesSimilar() {
    return areImagesSimilar;
  }

  public void setAreImagesSimilar(Boolean areImagesSimilar) {
    this.areImagesSimilar = areImagesSimilar;
  }

  public ImageSimilarityComparisonResponse imageSimilarityScore(Double imageSimilarityScore) {
    this.imageSimilarityScore = imageSimilarityScore;
    return this;
  }

   /**
   * Similarity score between 0.0 and 1.0, with 1.0 meaning highly similar and 0.0 meaning highly dissimilar
   * @return imageSimilarityScore
  **/
  @ApiModelProperty(value = "Similarity score between 0.0 and 1.0, with 1.0 meaning highly similar and 0.0 meaning highly dissimilar")
  public Double getImageSimilarityScore() {
    return imageSimilarityScore;
  }

  public void setImageSimilarityScore(Double imageSimilarityScore) {
    this.imageSimilarityScore = imageSimilarityScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSimilarityComparisonResponse imageSimilarityComparisonResponse = (ImageSimilarityComparisonResponse) o;
    return Objects.equals(this.successful, imageSimilarityComparisonResponse.successful) &&
        Objects.equals(this.areImagesSimilar, imageSimilarityComparisonResponse.areImagesSimilar) &&
        Objects.equals(this.imageSimilarityScore, imageSimilarityComparisonResponse.imageSimilarityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, areImagesSimilar, imageSimilarityScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSimilarityComparisonResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    areImagesSimilar: ").append(toIndentedString(areImagesSimilar)).append("\n");
    sb.append("    imageSimilarityScore: ").append(toIndentedString(imageSimilarityScore)).append("\n");
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

