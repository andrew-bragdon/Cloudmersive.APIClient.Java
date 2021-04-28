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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An individual frame scanned for NSFW content
 */
@ApiModel(description = "An individual frame scanned for NSFW content")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-26T21:01:28.154-07:00")
public class NsfwScannedFrame {
  @SerializedName("FrameNumber")
  private Integer frameNumber = null;

  @SerializedName("TimeStamp")
  private String timeStamp = null;

  @SerializedName("Content")
  private byte[] content = null;

  @SerializedName("ClassificationResult")
  private String classificationResult = null;

  @SerializedName("Score")
  private Double score = null;

  public NsfwScannedFrame frameNumber(Integer frameNumber) {
    this.frameNumber = frameNumber;
    return this;
  }

   /**
   * The number of the current frame
   * @return frameNumber
  **/
  @ApiModelProperty(value = "The number of the current frame")
  public Integer getFrameNumber() {
    return frameNumber;
  }

  public void setFrameNumber(Integer frameNumber) {
    this.frameNumber = frameNumber;
  }

  public NsfwScannedFrame timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * The playback time of the current frame
   * @return timeStamp
  **/
  @ApiModelProperty(value = "The playback time of the current frame")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public NsfwScannedFrame content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * The still frame in PNG format as a byte array
   * @return content
  **/
  @ApiModelProperty(value = "The still frame in PNG format as a byte array")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public NsfwScannedFrame classificationResult(String classificationResult) {
    this.classificationResult = classificationResult;
    return this;
  }

   /**
   * The NSFW classification of the still frame
   * @return classificationResult
  **/
  @ApiModelProperty(value = "The NSFW classification of the still frame")
  public String getClassificationResult() {
    return classificationResult;
  }

  public void setClassificationResult(String classificationResult) {
    this.classificationResult = classificationResult;
  }

  public NsfwScannedFrame score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * The NSFW score of the current frame
   * @return score
  **/
  @ApiModelProperty(value = "The NSFW score of the current frame")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsfwScannedFrame nsfwScannedFrame = (NsfwScannedFrame) o;
    return Objects.equals(this.frameNumber, nsfwScannedFrame.frameNumber) &&
        Objects.equals(this.timeStamp, nsfwScannedFrame.timeStamp) &&
        Arrays.equals(this.content, nsfwScannedFrame.content) &&
        Objects.equals(this.classificationResult, nsfwScannedFrame.classificationResult) &&
        Objects.equals(this.score, nsfwScannedFrame.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNumber, timeStamp, Arrays.hashCode(content), classificationResult, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsfwScannedFrame {\n");
    
    sb.append("    frameNumber: ").append(toIndentedString(frameNumber)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    classificationResult: ").append(toIndentedString(classificationResult)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

