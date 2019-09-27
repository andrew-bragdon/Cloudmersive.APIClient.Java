/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
 * Matching product for the input barcode
 */
@ApiModel(description = "Matching product for the input barcode")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T18:41:34.711-07:00")
public class ProductMatch {
  @SerializedName("EAN")
  private String EAN = null;

  @SerializedName("Title")
  private String title = null;

  public ProductMatch EAN(String EAN) {
    this.EAN = EAN;
    return this;
  }

   /**
   * EAN code for the product
   * @return EAN
  **/
  @ApiModelProperty(value = "EAN code for the product")
  public String getEAN() {
    return EAN;
  }

  public void setEAN(String EAN) {
    this.EAN = EAN;
  }

  public ProductMatch title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the product
   * @return title
  **/
  @ApiModelProperty(value = "Title of the product")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMatch productMatch = (ProductMatch) o;
    return Objects.equals(this.EAN, productMatch.EAN) &&
        Objects.equals(this.title, productMatch.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EAN, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMatch {\n");
    
    sb.append("    EAN: ").append(toIndentedString(EAN)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

