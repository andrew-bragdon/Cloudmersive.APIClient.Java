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
 * Result of getting the canonical URL of the input HTML document
 */
@ApiModel(description = "Result of getting the canonical URL of the input HTML document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-25T19:53:24.676-07:00")
public class HtmlGetRelCanonicalUrlResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CanonicalUrl")
  private String canonicalUrl = null;

  public HtmlGetRelCanonicalUrlResult successful(Boolean successful) {
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

  public HtmlGetRelCanonicalUrlResult canonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
    return this;
  }

   /**
   * HTML canonical URL if present
   * @return canonicalUrl
  **/
  @ApiModelProperty(value = "HTML canonical URL if present")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }

  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlGetRelCanonicalUrlResult htmlGetRelCanonicalUrlResult = (HtmlGetRelCanonicalUrlResult) o;
    return Objects.equals(this.successful, htmlGetRelCanonicalUrlResult.successful) &&
        Objects.equals(this.canonicalUrl, htmlGetRelCanonicalUrlResult.canonicalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, canonicalUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlGetRelCanonicalUrlResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
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

