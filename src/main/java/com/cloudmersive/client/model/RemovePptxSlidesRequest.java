/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Input to a Remove PowerPoint PPTX Presentation Slides request
 */
@ApiModel(description = "Input to a Remove PowerPoint PPTX Presentation Slides request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:48.871-07:00")
public class RemovePptxSlidesRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("StartDeleteSlideNumber")
  private Integer startDeleteSlideNumber = null;

  @SerializedName("EndDeleteSlideNumber")
  private Integer endDeleteSlideNumber = null;

  public RemovePptxSlidesRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public RemovePptxSlidesRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public RemovePptxSlidesRequest startDeleteSlideNumber(Integer startDeleteSlideNumber) {
    this.startDeleteSlideNumber = startDeleteSlideNumber;
    return this;
  }

   /**
   * Slide number (1-based) to start deleting slides; inclusive
   * @return startDeleteSlideNumber
  **/
  @ApiModelProperty(value = "Slide number (1-based) to start deleting slides; inclusive")
  public Integer getStartDeleteSlideNumber() {
    return startDeleteSlideNumber;
  }

  public void setStartDeleteSlideNumber(Integer startDeleteSlideNumber) {
    this.startDeleteSlideNumber = startDeleteSlideNumber;
  }

  public RemovePptxSlidesRequest endDeleteSlideNumber(Integer endDeleteSlideNumber) {
    this.endDeleteSlideNumber = endDeleteSlideNumber;
    return this;
  }

   /**
   * Slide number (1-based) to stop deleting slides; inclusive
   * @return endDeleteSlideNumber
  **/
  @ApiModelProperty(value = "Slide number (1-based) to stop deleting slides; inclusive")
  public Integer getEndDeleteSlideNumber() {
    return endDeleteSlideNumber;
  }

  public void setEndDeleteSlideNumber(Integer endDeleteSlideNumber) {
    this.endDeleteSlideNumber = endDeleteSlideNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovePptxSlidesRequest removePptxSlidesRequest = (RemovePptxSlidesRequest) o;
    return Arrays.equals(this.inputFileBytes, removePptxSlidesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removePptxSlidesRequest.inputFileUrl) &&
        Objects.equals(this.startDeleteSlideNumber, removePptxSlidesRequest.startDeleteSlideNumber) &&
        Objects.equals(this.endDeleteSlideNumber, removePptxSlidesRequest.endDeleteSlideNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, startDeleteSlideNumber, endDeleteSlideNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovePptxSlidesRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    startDeleteSlideNumber: ").append(toIndentedString(startDeleteSlideNumber)).append("\n");
    sb.append("    endDeleteSlideNumber: ").append(toIndentedString(endDeleteSlideNumber)).append("\n");
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

