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
import com.cloudmersive.client.model.UrlSsrfResponseFull;
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
 * Result of performing SSRF threat checks on multiple URLs
 */
@ApiModel(description = "Result of performing SSRF threat checks on multiple URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-07T15:44:49.633-08:00")
public class UrlSsrfResponseBatch {
  @SerializedName("OutputItems")
  private List<UrlSsrfResponseFull> outputItems = null;

  public UrlSsrfResponseBatch outputItems(List<UrlSsrfResponseFull> outputItems) {
    this.outputItems = outputItems;
    return this;
  }

  public UrlSsrfResponseBatch addOutputItemsItem(UrlSsrfResponseFull outputItemsItem) {
    if (this.outputItems == null) {
      this.outputItems = new ArrayList<UrlSsrfResponseFull>();
    }
    this.outputItems.add(outputItemsItem);
    return this;
  }

   /**
   * Results of the operation, with indexes matched to input values
   * @return outputItems
  **/
  @ApiModelProperty(value = "Results of the operation, with indexes matched to input values")
  public List<UrlSsrfResponseFull> getOutputItems() {
    return outputItems;
  }

  public void setOutputItems(List<UrlSsrfResponseFull> outputItems) {
    this.outputItems = outputItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfResponseBatch urlSsrfResponseBatch = (UrlSsrfResponseBatch) o;
    return Objects.equals(this.outputItems, urlSsrfResponseBatch.outputItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfResponseBatch {\n");
    
    sb.append("    outputItems: ").append(toIndentedString(outputItems)).append("\n");
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

