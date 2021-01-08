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
 * Result of getting a file type icon from a file extension
 */
@ApiModel(description = "Result of getting a file type icon from a file extension")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-07T19:09:00.148-08:00")
public class GetFileTypeIconResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Icon")
  private byte[] icon = null;

  @SerializedName("Extension")
  private String extension = null;

  public GetFileTypeIconResult successful(Boolean successful) {
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

  public GetFileTypeIconResult icon(byte[] icon) {
    this.icon = icon;
    return this;
  }

   /**
   * PNG icon as a byte array
   * @return icon
  **/
  @ApiModelProperty(value = "PNG icon as a byte array")
  public byte[] getIcon() {
    return icon;
  }

  public void setIcon(byte[] icon) {
    this.icon = icon;
  }

  public GetFileTypeIconResult extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension used for the icon
   * @return extension
  **/
  @ApiModelProperty(value = "Extension used for the icon")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFileTypeIconResult getFileTypeIconResult = (GetFileTypeIconResult) o;
    return Objects.equals(this.successful, getFileTypeIconResult.successful) &&
        Arrays.equals(this.icon, getFileTypeIconResult.icon) &&
        Objects.equals(this.extension, getFileTypeIconResult.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, Arrays.hashCode(icon), extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFileTypeIconResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

