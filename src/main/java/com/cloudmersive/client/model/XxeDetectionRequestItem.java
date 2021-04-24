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
import java.util.ArrayList;
import java.util.List;

/**
 * Individual item to detect for XXE
 */
@ApiModel(description = "Individual item to detect for XXE")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:08.607-07:00")
public class XxeDetectionRequestItem {
  @SerializedName("InputText")
  private String inputText = null;

  @SerializedName("AllowInternetUrls")
  private Boolean allowInternetUrls = null;

  @SerializedName("KnownSafeUrls")
  private List<String> knownSafeUrls = null;

  @SerializedName("KnownUnsafeUrls")
  private List<String> knownUnsafeUrls = null;

  public XxeDetectionRequestItem inputText(String inputText) {
    this.inputText = inputText;
    return this;
  }

   /**
   * Individual input text item to protect from XXE
   * @return inputText
  **/
  @ApiModelProperty(value = "Individual input text item to protect from XXE")
  public String getInputText() {
    return inputText;
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }

  public XxeDetectionRequestItem allowInternetUrls(Boolean allowInternetUrls) {
    this.allowInternetUrls = allowInternetUrls;
    return this;
  }

   /**
   * Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
   * @return allowInternetUrls
  **/
  @ApiModelProperty(value = "Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.")
  public Boolean isAllowInternetUrls() {
    return allowInternetUrls;
  }

  public void setAllowInternetUrls(Boolean allowInternetUrls) {
    this.allowInternetUrls = allowInternetUrls;
  }

  public XxeDetectionRequestItem knownSafeUrls(List<String> knownSafeUrls) {
    this.knownSafeUrls = knownSafeUrls;
    return this;
  }

  public XxeDetectionRequestItem addKnownSafeUrlsItem(String knownSafeUrlsItem) {
    if (this.knownSafeUrls == null) {
      this.knownSafeUrls = new ArrayList<String>();
    }
    this.knownSafeUrls.add(knownSafeUrlsItem);
    return this;
  }

   /**
   * Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
   * @return knownSafeUrls
  **/
  @ApiModelProperty(value = "Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.")
  public List<String> getKnownSafeUrls() {
    return knownSafeUrls;
  }

  public void setKnownSafeUrls(List<String> knownSafeUrls) {
    this.knownSafeUrls = knownSafeUrls;
  }

  public XxeDetectionRequestItem knownUnsafeUrls(List<String> knownUnsafeUrls) {
    this.knownUnsafeUrls = knownUnsafeUrls;
    return this;
  }

  public XxeDetectionRequestItem addKnownUnsafeUrlsItem(String knownUnsafeUrlsItem) {
    if (this.knownUnsafeUrls == null) {
      this.knownUnsafeUrls = new ArrayList<String>();
    }
    this.knownUnsafeUrls.add(knownUnsafeUrlsItem);
    return this;
  }

   /**
   * Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
   * @return knownUnsafeUrls
  **/
  @ApiModelProperty(value = "Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.")
  public List<String> getKnownUnsafeUrls() {
    return knownUnsafeUrls;
  }

  public void setKnownUnsafeUrls(List<String> knownUnsafeUrls) {
    this.knownUnsafeUrls = knownUnsafeUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XxeDetectionRequestItem xxeDetectionRequestItem = (XxeDetectionRequestItem) o;
    return Objects.equals(this.inputText, xxeDetectionRequestItem.inputText) &&
        Objects.equals(this.allowInternetUrls, xxeDetectionRequestItem.allowInternetUrls) &&
        Objects.equals(this.knownSafeUrls, xxeDetectionRequestItem.knownSafeUrls) &&
        Objects.equals(this.knownUnsafeUrls, xxeDetectionRequestItem.knownUnsafeUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText, allowInternetUrls, knownSafeUrls, knownUnsafeUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XxeDetectionRequestItem {\n");
    
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
    sb.append("    allowInternetUrls: ").append(toIndentedString(allowInternetUrls)).append("\n");
    sb.append("    knownSafeUrls: ").append(toIndentedString(knownSafeUrls)).append("\n");
    sb.append("    knownUnsafeUrls: ").append(toIndentedString(knownUnsafeUrls)).append("\n");
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

