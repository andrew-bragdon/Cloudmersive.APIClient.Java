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
 * Result of base 64 detection
 */
@ApiModel(description = "Result of base 64 detection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-25T19:53:24.676-07:00")
public class Base64DetectResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("IsBase64Encoded")
  private Boolean isBase64Encoded = null;

  public Base64DetectResponse successful(Boolean successful) {
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

  public Base64DetectResponse isBase64Encoded(Boolean isBase64Encoded) {
    this.isBase64Encoded = isBase64Encoded;
    return this;
  }

   /**
   * True if the input string is base 64 encoded, false otherwise
   * @return isBase64Encoded
  **/
  @ApiModelProperty(value = "True if the input string is base 64 encoded, false otherwise")
  public Boolean isIsBase64Encoded() {
    return isBase64Encoded;
  }

  public void setIsBase64Encoded(Boolean isBase64Encoded) {
    this.isBase64Encoded = isBase64Encoded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DetectResponse base64DetectResponse = (Base64DetectResponse) o;
    return Objects.equals(this.successful, base64DetectResponse.successful) &&
        Objects.equals(this.isBase64Encoded, base64DetectResponse.isBase64Encoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, isBase64Encoded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DetectResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    isBase64Encoded: ").append(toIndentedString(isBase64Encoded)).append("\n");
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

