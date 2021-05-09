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
import com.cloudmersive.client.model.StillFrame;
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
 * The result of converting a video into still frames
 */
@ApiModel(description = "The result of converting a video into still frames")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-09T14:00:36.615-07:00")
public class StillFramesResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("TotalFrames")
  private Integer totalFrames = null;

  @SerializedName("StillFrames")
  private List<StillFrame> stillFrames = null;

  public StillFramesResult successful(Boolean successful) {
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

  public StillFramesResult totalFrames(Integer totalFrames) {
    this.totalFrames = totalFrames;
    return this;
  }

   /**
   * The total number of frames converted
   * @return totalFrames
  **/
  @ApiModelProperty(value = "The total number of frames converted")
  public Integer getTotalFrames() {
    return totalFrames;
  }

  public void setTotalFrames(Integer totalFrames) {
    this.totalFrames = totalFrames;
  }

  public StillFramesResult stillFrames(List<StillFrame> stillFrames) {
    this.stillFrames = stillFrames;
    return this;
  }

  public StillFramesResult addStillFramesItem(StillFrame stillFramesItem) {
    if (this.stillFrames == null) {
      this.stillFrames = new ArrayList<StillFrame>();
    }
    this.stillFrames.add(stillFramesItem);
    return this;
  }

   /**
   * Individual still frames from the conversion operation
   * @return stillFrames
  **/
  @ApiModelProperty(value = "Individual still frames from the conversion operation")
  public List<StillFrame> getStillFrames() {
    return stillFrames;
  }

  public void setStillFrames(List<StillFrame> stillFrames) {
    this.stillFrames = stillFrames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StillFramesResult stillFramesResult = (StillFramesResult) o;
    return Objects.equals(this.successful, stillFramesResult.successful) &&
        Objects.equals(this.totalFrames, stillFramesResult.totalFrames) &&
        Objects.equals(this.stillFrames, stillFramesResult.stillFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, totalFrames, stillFrames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StillFramesResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    totalFrames: ").append(toIndentedString(totalFrames)).append("\n");
    sb.append("    stillFrames: ").append(toIndentedString(stillFrames)).append("\n");
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

