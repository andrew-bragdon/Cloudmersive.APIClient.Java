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
import com.cloudmersive.client.model.ConvertedPngPage;
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
 * Result of converting a Keynote input to a PNG array
 */
@ApiModel(description = "Result of converting a Keynote input to a PNG array")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T19:56:33.707-07:00")
public class KeynoteToPngResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PngResultPages")
  private List<ConvertedPngPage> pngResultPages = null;

  public KeynoteToPngResult successful(Boolean successful) {
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

  public KeynoteToPngResult pngResultPages(List<ConvertedPngPage> pngResultPages) {
    this.pngResultPages = pngResultPages;
    return this;
  }

  public KeynoteToPngResult addPngResultPagesItem(ConvertedPngPage pngResultPagesItem) {
    if (this.pngResultPages == null) {
      this.pngResultPages = new ArrayList<ConvertedPngPage>();
    }
    this.pngResultPages.add(pngResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return pngResultPages
  **/
  @ApiModelProperty(value = "Array of converted pages")
  public List<ConvertedPngPage> getPngResultPages() {
    return pngResultPages;
  }

  public void setPngResultPages(List<ConvertedPngPage> pngResultPages) {
    this.pngResultPages = pngResultPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeynoteToPngResult keynoteToPngResult = (KeynoteToPngResult) o;
    return Objects.equals(this.successful, keynoteToPngResult.successful) &&
        Objects.equals(this.pngResultPages, keynoteToPngResult.pngResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pngResultPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeynoteToPngResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pngResultPages: ").append(toIndentedString(pngResultPages)).append("\n");
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

