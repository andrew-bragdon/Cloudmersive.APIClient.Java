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
 * Representation of a file in a zip file
 */
@ApiModel(description = "Representation of a file in a zip file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-14T11:47:48.635-08:00")
public class ZipFile {
  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("FileContents")
  private byte[] fileContents = null;

  public ZipFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of this file
   * @return fileName
  **/
  @ApiModelProperty(value = "Name of this file")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ZipFile fileContents(byte[] fileContents) {
    this.fileContents = fileContents;
    return this;
  }

   /**
   * Contents of this file
   * @return fileContents
  **/
  @ApiModelProperty(value = "Contents of this file")
  public byte[] getFileContents() {
    return fileContents;
  }

  public void setFileContents(byte[] fileContents) {
    this.fileContents = fileContents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipFile zipFile = (ZipFile) o;
    return Objects.equals(this.fileName, zipFile.fileName) &&
        Arrays.equals(this.fileContents, zipFile.fileContents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, Arrays.hashCode(fileContents));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipFile {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileContents: ").append(toIndentedString(fileContents)).append("\n");
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

