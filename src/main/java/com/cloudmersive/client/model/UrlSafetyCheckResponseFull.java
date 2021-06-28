/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of checking a URL for safety threats
 */
@ApiModel(description = "Result of checking a URL for safety threats")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-27T17:49:11.835-07:00")
public class UrlSafetyCheckResponseFull {
  @SerializedName("CleanURL")
  private Boolean cleanURL = null;

  @SerializedName("ThreatType")
  private String threatType = null;

  public UrlSafetyCheckResponseFull cleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
    return this;
  }

   /**
   * True if the URL is clean, false if it is at risk of containing a safety threat or attack
   * @return cleanURL
  **/
  @ApiModelProperty(value = "True if the URL is clean, false if it is at risk of containing a safety threat or attack")
  public Boolean isCleanURL() {
    return cleanURL;
  }

  public void setCleanURL(Boolean cleanURL) {
    this.cleanURL = cleanURL;
  }

  public UrlSafetyCheckResponseFull threatType(String threatType) {
    this.threatType = threatType;
    return this;
  }

   /**
   * Threat type identified, if any; possible values are \&quot;ForcedDownload\&quot;, \&quot;VirusesAndMalware\&quot;, \&quot;Phishing\&quot;
   * @return threatType
  **/
  @ApiModelProperty(value = "Threat type identified, if any; possible values are \"ForcedDownload\", \"VirusesAndMalware\", \"Phishing\"")
  public String getThreatType() {
    return threatType;
  }

  public void setThreatType(String threatType) {
    this.threatType = threatType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSafetyCheckResponseFull urlSafetyCheckResponseFull = (UrlSafetyCheckResponseFull) o;
    return Objects.equals(this.cleanURL, urlSafetyCheckResponseFull.cleanURL) &&
        Objects.equals(this.threatType, urlSafetyCheckResponseFull.threatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanURL, threatType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSafetyCheckResponseFull {\n");
    
    sb.append("    cleanURL: ").append(toIndentedString(cleanURL)).append("\n");
    sb.append("    threatType: ").append(toIndentedString(threatType)).append("\n");
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

