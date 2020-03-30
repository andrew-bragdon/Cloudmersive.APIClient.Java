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
 * A single word in an OCR document
 */
@ApiModel(description = "A single word in an OCR document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-29T22:36:18.551-07:00")
public class OcrWordElement {
  @SerializedName("WordText")
  private String wordText = null;

  @SerializedName("LineNumber")
  private Integer lineNumber = null;

  @SerializedName("WordNumber")
  private Integer wordNumber = null;

  @SerializedName("XLeft")
  private Integer xleft = null;

  @SerializedName("YTop")
  private Integer ytop = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("ConfidenceLevel")
  private Double confidenceLevel = null;

  @SerializedName("BlockNumber")
  private Integer blockNumber = null;

  @SerializedName("ParagraphNumber")
  private Integer paragraphNumber = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  public OcrWordElement wordText(String wordText) {
    this.wordText = wordText;
    return this;
  }

   /**
   * Text of the word
   * @return wordText
  **/
  @ApiModelProperty(value = "Text of the word")
  public String getWordText() {
    return wordText;
  }

  public void setWordText(String wordText) {
    this.wordText = wordText;
  }

  public OcrWordElement lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Line number of the word
   * @return lineNumber
  **/
  @ApiModelProperty(value = "Line number of the word")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public OcrWordElement wordNumber(Integer wordNumber) {
    this.wordNumber = wordNumber;
    return this;
  }

   /**
   * Index of the word in the line
   * @return wordNumber
  **/
  @ApiModelProperty(value = "Index of the word in the line")
  public Integer getWordNumber() {
    return wordNumber;
  }

  public void setWordNumber(Integer wordNumber) {
    this.wordNumber = wordNumber;
  }

  public OcrWordElement xleft(Integer xleft) {
    this.xleft = xleft;
    return this;
  }

   /**
   * X location of the left edge of the word in pixels
   * @return xleft
  **/
  @ApiModelProperty(value = "X location of the left edge of the word in pixels")
  public Integer getXleft() {
    return xleft;
  }

  public void setXleft(Integer xleft) {
    this.xleft = xleft;
  }

  public OcrWordElement ytop(Integer ytop) {
    this.ytop = ytop;
    return this;
  }

   /**
   * Y location of the top edge of the word in pixels
   * @return ytop
  **/
  @ApiModelProperty(value = "Y location of the top edge of the word in pixels")
  public Integer getYtop() {
    return ytop;
  }

  public void setYtop(Integer ytop) {
    this.ytop = ytop;
  }

  public OcrWordElement width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the word in pixels
   * @return width
  **/
  @ApiModelProperty(value = "Width of the word in pixels")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public OcrWordElement height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the word in pixels
   * @return height
  **/
  @ApiModelProperty(value = "Height of the word in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public OcrWordElement confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy)
   * @return confidenceLevel
  **/
  @ApiModelProperty(value = "Confidence level of the machine learning result; possible values are 0.0 (lowest accuracy) - 1.0 (highest accuracy)")
  public Double getConfidenceLevel() {
    return confidenceLevel;
  }

  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public OcrWordElement blockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Index of the containing block
   * @return blockNumber
  **/
  @ApiModelProperty(value = "Index of the containing block")
  public Integer getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
  }

  public OcrWordElement paragraphNumber(Integer paragraphNumber) {
    this.paragraphNumber = paragraphNumber;
    return this;
  }

   /**
   * Index of the containing paragraph
   * @return paragraphNumber
  **/
  @ApiModelProperty(value = "Index of the containing paragraph")
  public Integer getParagraphNumber() {
    return paragraphNumber;
  }

  public void setParagraphNumber(Integer paragraphNumber) {
    this.paragraphNumber = paragraphNumber;
  }

  public OcrWordElement pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Index of the containing page
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Index of the containing page")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrWordElement ocrWordElement = (OcrWordElement) o;
    return Objects.equals(this.wordText, ocrWordElement.wordText) &&
        Objects.equals(this.lineNumber, ocrWordElement.lineNumber) &&
        Objects.equals(this.wordNumber, ocrWordElement.wordNumber) &&
        Objects.equals(this.xleft, ocrWordElement.xleft) &&
        Objects.equals(this.ytop, ocrWordElement.ytop) &&
        Objects.equals(this.width, ocrWordElement.width) &&
        Objects.equals(this.height, ocrWordElement.height) &&
        Objects.equals(this.confidenceLevel, ocrWordElement.confidenceLevel) &&
        Objects.equals(this.blockNumber, ocrWordElement.blockNumber) &&
        Objects.equals(this.paragraphNumber, ocrWordElement.paragraphNumber) &&
        Objects.equals(this.pageNumber, ocrWordElement.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordText, lineNumber, wordNumber, xleft, ytop, width, height, confidenceLevel, blockNumber, paragraphNumber, pageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrWordElement {\n");
    
    sb.append("    wordText: ").append(toIndentedString(wordText)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    wordNumber: ").append(toIndentedString(wordNumber)).append("\n");
    sb.append("    xleft: ").append(toIndentedString(xleft)).append("\n");
    sb.append("    ytop: ").append(toIndentedString(ytop)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    paragraphNumber: ").append(toIndentedString(paragraphNumber)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

