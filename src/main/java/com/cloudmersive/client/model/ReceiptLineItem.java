/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Receipt line item, comprised of a product or item and a price (if available)
 */
@ApiModel(description = "Receipt line item, comprised of a product or item and a price (if available)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T14:32:41.091-07:00")
public class ReceiptLineItem {
  @SerializedName("ItemDescription")
  private String itemDescription = null;

  @SerializedName("ItemPrice")
  private Double itemPrice = null;

  public ReceiptLineItem itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

   /**
   * Description of the item
   * @return itemDescription
  **/
  @ApiModelProperty(value = "Description of the item")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public ReceiptLineItem itemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * Price of the item if available
   * @return itemPrice
  **/
  @ApiModelProperty(value = "Price of the item if available")
  public Double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptLineItem receiptLineItem = (ReceiptLineItem) o;
    return Objects.equals(this.itemDescription, receiptLineItem.itemDescription) &&
        Objects.equals(this.itemPrice, receiptLineItem.itemPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemDescription, itemPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptLineItem {\n");
    
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
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

