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
import com.cloudmersive.client.model.OcrWordElement;
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
 * Result of an image to words-with-location OCR operation
 */
@ApiModel(description = "Result of an image to words-with-location OCR operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T22:31:25.059-08:00")
public class ImageToWordsWithLocationResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Words")
  private List<OcrWordElement> words = null;

  public ImageToWordsWithLocationResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ImageToWordsWithLocationResult words(List<OcrWordElement> words) {
    this.words = words;
    return this;
  }

  public ImageToWordsWithLocationResult addWordsItem(OcrWordElement wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<OcrWordElement>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return words
  **/
  @ApiModelProperty(value = "Word elements in the image")
  public List<OcrWordElement> getWords() {
    return words;
  }

  public void setWords(List<OcrWordElement> words) {
    this.words = words;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToWordsWithLocationResult imageToWordsWithLocationResult = (ImageToWordsWithLocationResult) o;
    return Objects.equals(this.successful, imageToWordsWithLocationResult.successful) &&
        Objects.equals(this.words, imageToWordsWithLocationResult.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToWordsWithLocationResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

