/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Response from an OCR to text operation.  Includes the confience rating and converted text result.
 */
@ApiModel(description = "Response from an OCR to text operation.  Includes the confience rating and converted text result.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-02T23:11:18.494-07:00")
public class ImageToTextResponse {
  @SerializedName("MeanConfidenceLevel")
  private Float meanConfidenceLevel = null;

  @SerializedName("TextResult")
  private String textResult = null;

  public ImageToTextResponse meanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
    return this;
  }

   /**
   * Confidence level rating of the OCR operation; ratings above 80% are strong.
   * @return meanConfidenceLevel
  **/
  @ApiModelProperty(value = "Confidence level rating of the OCR operation; ratings above 80% are strong.")
  public Float getMeanConfidenceLevel() {
    return meanConfidenceLevel;
  }

  public void setMeanConfidenceLevel(Float meanConfidenceLevel) {
    this.meanConfidenceLevel = meanConfidenceLevel;
  }

  public ImageToTextResponse textResult(String textResult) {
    this.textResult = textResult;
    return this;
  }

   /**
   * Converted text string from the image input.
   * @return textResult
  **/
  @ApiModelProperty(value = "Converted text string from the image input.")
  public String getTextResult() {
    return textResult;
  }

  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToTextResponse imageToTextResponse = (ImageToTextResponse) o;
    return Objects.equals(this.meanConfidenceLevel, imageToTextResponse.meanConfidenceLevel) &&
        Objects.equals(this.textResult, imageToTextResponse.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meanConfidenceLevel, textResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToTextResponse {\n");
    
    sb.append("    meanConfidenceLevel: ").append(toIndentedString(meanConfidenceLevel)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

