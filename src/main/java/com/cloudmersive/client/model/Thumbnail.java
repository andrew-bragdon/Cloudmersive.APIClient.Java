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
 * Result of converting a single document page to a PNG thumbnail
 */
@ApiModel(description = "Result of converting a single document page to a PNG thumbnail")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-07T15:45:36.234-08:00")
public class Thumbnail {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Content")
  private byte[] content = null;

  public Thumbnail index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Index of this thumbnail
   * @return index
  **/
  @ApiModelProperty(value = "Index of this thumbnail")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Thumbnail content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * A PNG thumbnail of the document page
   * @return content
  **/
  @ApiModelProperty(value = "A PNG thumbnail of the document page")
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
    Thumbnail thumbnail = (Thumbnail) o;
    return Objects.equals(this.index, thumbnail.index) &&
        Arrays.equals(this.content, thumbnail.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thumbnail {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

