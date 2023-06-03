/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Output of a hate speech analysis operation
 */
@ApiModel(description = "Output of a hate speech analysis operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-03T15:48:55.997-07:00")
public class HateSpeechAnalysisResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("HateSpeechScoreResult")
  private Double hateSpeechScoreResult = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public HateSpeechAnalysisResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the profanity detection operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the profanity detection operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public HateSpeechAnalysisResponse hateSpeechScoreResult(Double hateSpeechScoreResult) {
    this.hateSpeechScoreResult = hateSpeechScoreResult;
    return this;
  }

   /**
   * Hate speech classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being hate speech language, while scores close to 1.0 have a high probability of being hate speech language.  Values above 0.8 have a very high probability of being hate speech.
   * @return hateSpeechScoreResult
  **/
  @ApiModelProperty(value = "Hate speech classification score between 0.0 and 1.0 where scores closer to zero have a low probability of being hate speech language, while scores close to 1.0 have a high probability of being hate speech language.  Values above 0.8 have a very high probability of being hate speech.")
  public Double getHateSpeechScoreResult() {
    return hateSpeechScoreResult;
  }

  public void setHateSpeechScoreResult(Double hateSpeechScoreResult) {
    this.hateSpeechScoreResult = hateSpeechScoreResult;
  }

  public HateSpeechAnalysisResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @ApiModelProperty(value = "Number of sentences in input text")
  public Integer getSentenceCount() {
    return sentenceCount;
  }

  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateSpeechAnalysisResponse hateSpeechAnalysisResponse = (HateSpeechAnalysisResponse) o;
    return Objects.equals(this.successful, hateSpeechAnalysisResponse.successful) &&
        Objects.equals(this.hateSpeechScoreResult, hateSpeechAnalysisResponse.hateSpeechScoreResult) &&
        Objects.equals(this.sentenceCount, hateSpeechAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, hateSpeechScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateSpeechAnalysisResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    hateSpeechScoreResult: ").append(toIndentedString(hateSpeechScoreResult)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

