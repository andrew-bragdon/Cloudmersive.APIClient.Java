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
import com.cloudmersive.client.model.DocxFooter;
import com.cloudmersive.client.model.DocxHeader;
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
 * Result of running a Get-Tables command
 */
@ApiModel(description = "Result of running a Get-Tables command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-01T16:39:14.898-08:00")
public class GetDocxHeadersAndFootersResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Headers")
  private List<DocxHeader> headers = null;

  @SerializedName("Footers")
  private List<DocxFooter> footers = null;

  public GetDocxHeadersAndFootersResponse successful(Boolean successful) {
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

  public GetDocxHeadersAndFootersResponse headers(List<DocxHeader> headers) {
    this.headers = headers;
    return this;
  }

  public GetDocxHeadersAndFootersResponse addHeadersItem(DocxHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<DocxHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public List<DocxHeader> getHeaders() {
    return headers;
  }

  public void setHeaders(List<DocxHeader> headers) {
    this.headers = headers;
  }

  public GetDocxHeadersAndFootersResponse footers(List<DocxFooter> footers) {
    this.footers = footers;
    return this;
  }

  public GetDocxHeadersAndFootersResponse addFootersItem(DocxFooter footersItem) {
    if (this.footers == null) {
      this.footers = new ArrayList<DocxFooter>();
    }
    this.footers.add(footersItem);
    return this;
  }

   /**
   * Get footers
   * @return footers
  **/
  @ApiModelProperty(value = "")
  public List<DocxFooter> getFooters() {
    return footers;
  }

  public void setFooters(List<DocxFooter> footers) {
    this.footers = footers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxHeadersAndFootersResponse getDocxHeadersAndFootersResponse = (GetDocxHeadersAndFootersResponse) o;
    return Objects.equals(this.successful, getDocxHeadersAndFootersResponse.successful) &&
        Objects.equals(this.headers, getDocxHeadersAndFootersResponse.headers) &&
        Objects.equals(this.footers, getDocxHeadersAndFootersResponse.footers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, headers, footers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxHeadersAndFootersResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    footers: ").append(toIndentedString(footers)).append("\n");
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

