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
 * Result of performing a country validation operation
 */
@ApiModel(description = "Result of performing a country validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-25T21:09:18.690-08:00")
public class ValidateCountryResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CountryFullName")
  private String countryFullName = null;

  @SerializedName("ISOTwoLetterCode")
  private String isOTwoLetterCode = null;

  @SerializedName("FIPSTwoLetterCode")
  private String fiPSTwoLetterCode = null;

  @SerializedName("ThreeLetterCode")
  private String threeLetterCode = null;

  public ValidateCountryResponse successful(Boolean successful) {
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

  public ValidateCountryResponse countryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Full name of the country
   * @return countryFullName
  **/
  @ApiModelProperty(value = "Full name of the country")
  public String getCountryFullName() {
    return countryFullName;
  }

  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }

  public ValidateCountryResponse isOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }

  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }

  public ValidateCountryResponse fiPSTwoLetterCode(String fiPSTwoLetterCode) {
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
    return this;
  }

   /**
   * Two-letter FIPS 10-4 country code
   * @return fiPSTwoLetterCode
  **/
  @ApiModelProperty(value = "Two-letter FIPS 10-4 country code")
  public String getFiPSTwoLetterCode() {
    return fiPSTwoLetterCode;
  }

  public void setFiPSTwoLetterCode(String fiPSTwoLetterCode) {
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
  }

  public ValidateCountryResponse threeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
    return this;
  }

   /**
   * Three-letter ISO 3166-1 country code
   * @return threeLetterCode
  **/
  @ApiModelProperty(value = "Three-letter ISO 3166-1 country code")
  public String getThreeLetterCode() {
    return threeLetterCode;
  }

  public void setThreeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateCountryResponse validateCountryResponse = (ValidateCountryResponse) o;
    return Objects.equals(this.successful, validateCountryResponse.successful) &&
        Objects.equals(this.countryFullName, validateCountryResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, validateCountryResponse.isOTwoLetterCode) &&
        Objects.equals(this.fiPSTwoLetterCode, validateCountryResponse.fiPSTwoLetterCode) &&
        Objects.equals(this.threeLetterCode, validateCountryResponse.threeLetterCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countryFullName, isOTwoLetterCode, fiPSTwoLetterCode, threeLetterCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCountryResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    fiPSTwoLetterCode: ").append(toIndentedString(fiPSTwoLetterCode)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
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

