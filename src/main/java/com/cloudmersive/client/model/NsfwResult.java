/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
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
import com.cloudmersive.client.model.NsfwScannedFrame;
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
 * The result of scanning a video file for NSFW content
 */
@ApiModel(description = "The result of scanning a video file for NSFW content")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-26T21:01:28.154-07:00")
public class NsfwResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("HighestClassificationResult")
  private String highestClassificationResult = null;

  @SerializedName("HighestScore")
  private Double highestScore = null;

  @SerializedName("TotalRacyFrames")
  private Integer totalRacyFrames = null;

  @SerializedName("TotalNsfwFrames")
  private Integer totalNsfwFrames = null;

  @SerializedName("TotalFrames")
  private Integer totalFrames = null;

  @SerializedName("NsfwScannedFrames")
  private List<NsfwScannedFrame> nsfwScannedFrames = null;

  public NsfwResult successful(Boolean successful) {
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

  public NsfwResult highestClassificationResult(String highestClassificationResult) {
    this.highestClassificationResult = highestClassificationResult;
    return this;
  }

   /**
   * The highest NSFW classification of the video
   * @return highestClassificationResult
  **/
  @ApiModelProperty(value = "The highest NSFW classification of the video")
  public String getHighestClassificationResult() {
    return highestClassificationResult;
  }

  public void setHighestClassificationResult(String highestClassificationResult) {
    this.highestClassificationResult = highestClassificationResult;
  }

  public NsfwResult highestScore(Double highestScore) {
    this.highestScore = highestScore;
    return this;
  }

   /**
   * The highest NSFW score out of all frames scanned
   * @return highestScore
  **/
  @ApiModelProperty(value = "The highest NSFW score out of all frames scanned")
  public Double getHighestScore() {
    return highestScore;
  }

  public void setHighestScore(Double highestScore) {
    this.highestScore = highestScore;
  }

  public NsfwResult totalRacyFrames(Integer totalRacyFrames) {
    this.totalRacyFrames = totalRacyFrames;
    return this;
  }

   /**
   * The total number of potentially \&quot;racy\&quot; frames.
   * @return totalRacyFrames
  **/
  @ApiModelProperty(value = "The total number of potentially \"racy\" frames.")
  public Integer getTotalRacyFrames() {
    return totalRacyFrames;
  }

  public void setTotalRacyFrames(Integer totalRacyFrames) {
    this.totalRacyFrames = totalRacyFrames;
  }

  public NsfwResult totalNsfwFrames(Integer totalNsfwFrames) {
    this.totalNsfwFrames = totalNsfwFrames;
    return this;
  }

   /**
   * The total number of frames with high probability of NSFW.
   * @return totalNsfwFrames
  **/
  @ApiModelProperty(value = "The total number of frames with high probability of NSFW.")
  public Integer getTotalNsfwFrames() {
    return totalNsfwFrames;
  }

  public void setTotalNsfwFrames(Integer totalNsfwFrames) {
    this.totalNsfwFrames = totalNsfwFrames;
  }

  public NsfwResult totalFrames(Integer totalFrames) {
    this.totalFrames = totalFrames;
    return this;
  }

   /**
   * The total number of frames scanned
   * @return totalFrames
  **/
  @ApiModelProperty(value = "The total number of frames scanned")
  public Integer getTotalFrames() {
    return totalFrames;
  }

  public void setTotalFrames(Integer totalFrames) {
    this.totalFrames = totalFrames;
  }

  public NsfwResult nsfwScannedFrames(List<NsfwScannedFrame> nsfwScannedFrames) {
    this.nsfwScannedFrames = nsfwScannedFrames;
    return this;
  }

  public NsfwResult addNsfwScannedFramesItem(NsfwScannedFrame nsfwScannedFramesItem) {
    if (this.nsfwScannedFrames == null) {
      this.nsfwScannedFrames = new ArrayList<NsfwScannedFrame>();
    }
    this.nsfwScannedFrames.add(nsfwScannedFramesItem);
    return this;
  }

   /**
   * The NSFW scanning results for each frame
   * @return nsfwScannedFrames
  **/
  @ApiModelProperty(value = "The NSFW scanning results for each frame")
  public List<NsfwScannedFrame> getNsfwScannedFrames() {
    return nsfwScannedFrames;
  }

  public void setNsfwScannedFrames(List<NsfwScannedFrame> nsfwScannedFrames) {
    this.nsfwScannedFrames = nsfwScannedFrames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsfwResult nsfwResult = (NsfwResult) o;
    return Objects.equals(this.successful, nsfwResult.successful) &&
        Objects.equals(this.highestClassificationResult, nsfwResult.highestClassificationResult) &&
        Objects.equals(this.highestScore, nsfwResult.highestScore) &&
        Objects.equals(this.totalRacyFrames, nsfwResult.totalRacyFrames) &&
        Objects.equals(this.totalNsfwFrames, nsfwResult.totalNsfwFrames) &&
        Objects.equals(this.totalFrames, nsfwResult.totalFrames) &&
        Objects.equals(this.nsfwScannedFrames, nsfwResult.nsfwScannedFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, highestClassificationResult, highestScore, totalRacyFrames, totalNsfwFrames, totalFrames, nsfwScannedFrames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsfwResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    highestClassificationResult: ").append(toIndentedString(highestClassificationResult)).append("\n");
    sb.append("    highestScore: ").append(toIndentedString(highestScore)).append("\n");
    sb.append("    totalRacyFrames: ").append(toIndentedString(totalRacyFrames)).append("\n");
    sb.append("    totalNsfwFrames: ").append(toIndentedString(totalNsfwFrames)).append("\n");
    sb.append("    totalFrames: ").append(toIndentedString(totalFrames)).append("\n");
    sb.append("    nsfwScannedFrames: ").append(toIndentedString(nsfwScannedFrames)).append("\n");
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

