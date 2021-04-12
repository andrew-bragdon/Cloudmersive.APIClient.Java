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
import com.cloudmersive.client.model.VideoFile;
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
 * The result of splitting a video
 */
@ApiModel(description = "The result of splitting a video")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-11T18:04:42.880-07:00")
public class SplitVideoResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Videos")
  private List<VideoFile> videos = null;

  public SplitVideoResult successful(Boolean successful) {
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

  public SplitVideoResult videos(List<VideoFile> videos) {
    this.videos = videos;
    return this;
  }

  public SplitVideoResult addVideosItem(VideoFile videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<VideoFile>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * Individual video files resulting from the split operation
   * @return videos
  **/
  @ApiModelProperty(value = "Individual video files resulting from the split operation")
  public List<VideoFile> getVideos() {
    return videos;
  }

  public void setVideos(List<VideoFile> videos) {
    this.videos = videos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitVideoResult splitVideoResult = (SplitVideoResult) o;
    return Objects.equals(this.successful, splitVideoResult.successful) &&
        Objects.equals(this.videos, splitVideoResult.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, videos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitVideoResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

