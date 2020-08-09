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
 * A single still frame from a video
 */
@ApiModel(description = "A single still frame from a video")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T23:36:22.168-07:00")
public class StillFrame {
  @SerializedName("FrameNumber")
  private Integer frameNumber = null;

  @SerializedName("TimeStamp")
  private String timeStamp = null;

  @SerializedName("Content")
  private byte[] content = null;

  public StillFrame frameNumber(Integer frameNumber) {
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

  public StillFrame timeStamp(String timeStamp) {
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

  public StillFrame content(byte[] content) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StillFrame stillFrame = (StillFrame) o;
    return Objects.equals(this.frameNumber, stillFrame.frameNumber) &&
        Objects.equals(this.timeStamp, stillFrame.timeStamp) &&
        Arrays.equals(this.content, stillFrame.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNumber, timeStamp, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StillFrame {\n");
    
    sb.append("    frameNumber: ").append(toIndentedString(frameNumber)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

