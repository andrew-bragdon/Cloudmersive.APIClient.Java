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
 * Request to detect if input content is base 64 encoded
 */
@ApiModel(description = "Request to detect if input content is base 64 encoded")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-26T21:01:13.943-07:00")
public class Base64DetectRequest {
  @SerializedName("Base64ContentToDetect")
  private String base64ContentToDetect = null;

  public Base64DetectRequest base64ContentToDetect(String base64ContentToDetect) {
    this.base64ContentToDetect = base64ContentToDetect;
    return this;
  }

   /**
   * Input content text to detect if it is base 64 encoded
   * @return base64ContentToDetect
  **/
  @ApiModelProperty(value = "Input content text to detect if it is base 64 encoded")
  public String getBase64ContentToDetect() {
    return base64ContentToDetect;
  }

  public void setBase64ContentToDetect(String base64ContentToDetect) {
    this.base64ContentToDetect = base64ContentToDetect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DetectRequest base64DetectRequest = (Base64DetectRequest) o;
    return Objects.equals(this.base64ContentToDetect, base64DetectRequest.base64ContentToDetect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64ContentToDetect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DetectRequest {\n");
    
    sb.append("    base64ContentToDetect: ").append(toIndentedString(base64ContentToDetect)).append("\n");
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

