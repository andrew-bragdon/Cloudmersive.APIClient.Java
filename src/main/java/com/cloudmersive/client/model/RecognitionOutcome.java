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
 * Specific recognition outcome
 */
@ApiModel(description = "Specific recognition outcome")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-15T01:01:47.022-08:00")
public class RecognitionOutcome {
  @SerializedName("ConfidenceScore")
  private Double confidenceScore = null;

  @SerializedName("Description")
  private String description = null;

  public RecognitionOutcome confidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * Scores closer to 1 are better than scores closer to 0
   * @return confidenceScore
  **/
  @ApiModelProperty(value = "Scores closer to 1 are better than scores closer to 0")
  public Double getConfidenceScore() {
    return confidenceScore;
  }

  public void setConfidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public RecognitionOutcome description(String description) {
    this.description = description;
    return this;
  }

   /**
   * English language description of the image
   * @return description
  **/
  @ApiModelProperty(value = "English language description of the image")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecognitionOutcome recognitionOutcome = (RecognitionOutcome) o;
    return Objects.equals(this.confidenceScore, recognitionOutcome.confidenceScore) &&
        Objects.equals(this.description, recognitionOutcome.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceScore, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognitionOutcome {\n");
    
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

