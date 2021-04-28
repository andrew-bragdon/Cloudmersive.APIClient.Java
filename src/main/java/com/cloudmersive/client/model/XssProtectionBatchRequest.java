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
import com.cloudmersive.client.model.XssProtectionRequestItem;
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
 * Input to a batch XSS protection operation
 */
@ApiModel(description = "Input to a batch XSS protection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:28.792-07:00")
public class XssProtectionBatchRequest {
  @SerializedName("RequestItems")
  private List<XssProtectionRequestItem> requestItems = null;

  public XssProtectionBatchRequest requestItems(List<XssProtectionRequestItem> requestItems) {
    this.requestItems = requestItems;
    return this;
  }

  public XssProtectionBatchRequest addRequestItemsItem(XssProtectionRequestItem requestItemsItem) {
    if (this.requestItems == null) {
      this.requestItems = new ArrayList<XssProtectionRequestItem>();
    }
    this.requestItems.add(requestItemsItem);
    return this;
  }

   /**
   * Multiple items to protect for XSS
   * @return requestItems
  **/
  @ApiModelProperty(value = "Multiple items to protect for XSS")
  public List<XssProtectionRequestItem> getRequestItems() {
    return requestItems;
  }

  public void setRequestItems(List<XssProtectionRequestItem> requestItems) {
    this.requestItems = requestItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionBatchRequest xssProtectionBatchRequest = (XssProtectionBatchRequest) o;
    return Objects.equals(this.requestItems, xssProtectionBatchRequest.requestItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionBatchRequest {\n");
    
    sb.append("    requestItems: ").append(toIndentedString(requestItems)).append("\n");
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

