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
 * Result of the barcode scan
 */
@ApiModel(description = "Result of the barcode scan")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-09T19:06:08.158-08:00")
public class BarcodeScanResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("BarcodeType")
  private String barcodeType = null;

  @SerializedName("RawText")
  private String rawText = null;

  public BarcodeScanResult successful(Boolean successful) {
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

  public BarcodeScanResult barcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

   /**
   * The type of the barcode; possible values are AZTEC, CODABAR, CODE_39, CODE_93, CODE_128, DATA_MATRIX, EAN_8, EAN_13, ITF, MAXICODE, PDF_417, QR_CODE, RSS_14, RSS_EXPANDED, UPC_A, UPC_E, All_1D, UPC_EAN_EXTENSION, MSI, PLESSEY, IMB
   * @return barcodeType
  **/
  @ApiModelProperty(value = "The type of the barcode; possible values are AZTEC, CODABAR, CODE_39, CODE_93, CODE_128, DATA_MATRIX, EAN_8, EAN_13, ITF, MAXICODE, PDF_417, QR_CODE, RSS_14, RSS_EXPANDED, UPC_A, UPC_E, All_1D, UPC_EAN_EXTENSION, MSI, PLESSEY, IMB")
  public String getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public BarcodeScanResult rawText(String rawText) {
    this.rawText = rawText;
    return this;
  }

   /**
   * The barcode text
   * @return rawText
  **/
  @ApiModelProperty(value = "The barcode text")
  public String getRawText() {
    return rawText;
  }

  public void setRawText(String rawText) {
    this.rawText = rawText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BarcodeScanResult barcodeScanResult = (BarcodeScanResult) o;
    return Objects.equals(this.successful, barcodeScanResult.successful) &&
        Objects.equals(this.barcodeType, barcodeScanResult.barcodeType) &&
        Objects.equals(this.rawText, barcodeScanResult.rawText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, barcodeType, rawText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeScanResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
    sb.append("    rawText: ").append(toIndentedString(rawText)).append("\n");
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

