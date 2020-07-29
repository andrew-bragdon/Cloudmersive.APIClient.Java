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
import com.cloudmersive.client.model.Timezone;
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
 * Result of performing a country validation operation
 */
@ApiModel(description = "Result of performing a country validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-28T19:47:51.374-07:00")
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

  @SerializedName("IsEuropeanUnionMember")
  private Boolean isEuropeanUnionMember = null;

  @SerializedName("Timezones")
  private List<Timezone> timezones = null;

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

  public ValidateCountryResponse isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
    return this;
  }

   /**
   * True if this country is currently a member of the European Union (EU), false otherwise
   * @return isEuropeanUnionMember
  **/
  @ApiModelProperty(value = "True if this country is currently a member of the European Union (EU), false otherwise")
  public Boolean isIsEuropeanUnionMember() {
    return isEuropeanUnionMember;
  }

  public void setIsEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
  }

  public ValidateCountryResponse timezones(List<Timezone> timezones) {
    this.timezones = timezones;
    return this;
  }

  public ValidateCountryResponse addTimezonesItem(Timezone timezonesItem) {
    if (this.timezones == null) {
      this.timezones = new ArrayList<Timezone>();
    }
    this.timezones.add(timezonesItem);
    return this;
  }

   /**
   * Time zones (IANA/Olsen) in the country
   * @return timezones
  **/
  @ApiModelProperty(value = "Time zones (IANA/Olsen) in the country")
  public List<Timezone> getTimezones() {
    return timezones;
  }

  public void setTimezones(List<Timezone> timezones) {
    this.timezones = timezones;
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
        Objects.equals(this.threeLetterCode, validateCountryResponse.threeLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, validateCountryResponse.isEuropeanUnionMember) &&
        Objects.equals(this.timezones, validateCountryResponse.timezones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countryFullName, isOTwoLetterCode, fiPSTwoLetterCode, threeLetterCode, isEuropeanUnionMember, timezones);
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
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
    sb.append("    timezones: ").append(toIndentedString(timezones)).append("\n");
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

