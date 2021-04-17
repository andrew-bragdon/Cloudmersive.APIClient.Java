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
import com.cloudmersive.client.model.UrlSsrfRequestFull;
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
 * Batch operation to perform SSRF threat checks on multiple URLs
 */
@ApiModel(description = "Batch operation to perform SSRF threat checks on multiple URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-16T22:05:48.948-07:00")
public class UrlSsrfRequestBatch {
  @SerializedName("InputItems")
  private List<UrlSsrfRequestFull> inputItems = null;

  public UrlSsrfRequestBatch inputItems(List<UrlSsrfRequestFull> inputItems) {
    this.inputItems = inputItems;
    return this;
  }

  public UrlSsrfRequestBatch addInputItemsItem(UrlSsrfRequestFull inputItemsItem) {
    if (this.inputItems == null) {
      this.inputItems = new ArrayList<UrlSsrfRequestFull>();
    }
    this.inputItems.add(inputItemsItem);
    return this;
  }

   /**
   * Input URLs to check for SSRF threats
   * @return inputItems
  **/
  @ApiModelProperty(value = "Input URLs to check for SSRF threats")
  public List<UrlSsrfRequestFull> getInputItems() {
    return inputItems;
  }

  public void setInputItems(List<UrlSsrfRequestFull> inputItems) {
    this.inputItems = inputItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlSsrfRequestBatch urlSsrfRequestBatch = (UrlSsrfRequestBatch) o;
    return Objects.equals(this.inputItems, urlSsrfRequestBatch.inputItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlSsrfRequestBatch {\n");
    
    sb.append("    inputItems: ").append(toIndentedString(inputItems)).append("\n");
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

