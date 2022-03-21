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
 * A video file
 */
@ApiModel(description = "A video file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-20T11:07:37.795-07:00")
public class VideoFile {
  @SerializedName("VideoNumber")
  private Integer videoNumber = null;

  @SerializedName("Content")
  private byte[] content = null;

  public VideoFile videoNumber(Integer videoNumber) {
    this.videoNumber = videoNumber;
    return this;
  }

   /**
   * Sequence number of the video
   * @return videoNumber
  **/
  @ApiModelProperty(value = "Sequence number of the video")
  public Integer getVideoNumber() {
    return videoNumber;
  }

  public void setVideoNumber(Integer videoNumber) {
    this.videoNumber = videoNumber;
  }

  public VideoFile content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * The video file as a byte array
   * @return content
  **/
  @ApiModelProperty(value = "The video file as a byte array")
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
    VideoFile videoFile = (VideoFile) o;
    return Objects.equals(this.videoNumber, videoFile.videoNumber) &&
        Arrays.equals(this.content, videoFile.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoNumber, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoFile {\n");
    
    sb.append("    videoNumber: ").append(toIndentedString(videoNumber)).append("\n");
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

