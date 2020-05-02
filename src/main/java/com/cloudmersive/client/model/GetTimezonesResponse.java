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
 * Result of performing a get time zones operation
 */
@ApiModel(description = "Result of performing a get time zones operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-01T18:05:57.532-07:00")
public class GetTimezonesResponse {
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

  @SerializedName("Timezones")
  private List<Timezone> timezones = null;

  public GetTimezonesResponse successful(Boolean successful) {
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

  public GetTimezonesResponse countryFullName(String countryFullName) {
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

  public GetTimezonesResponse isOTwoLetterCode(String isOTwoLetterCode) {
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

  public GetTimezonesResponse fiPSTwoLetterCode(String fiPSTwoLetterCode) {
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

  public GetTimezonesResponse threeLetterCode(String threeLetterCode) {
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

  public GetTimezonesResponse timezones(List<Timezone> timezones) {
    this.timezones = timezones;
    return this;
  }

  public GetTimezonesResponse addTimezonesItem(Timezone timezonesItem) {
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
    GetTimezonesResponse getTimezonesResponse = (GetTimezonesResponse) o;
    return Objects.equals(this.successful, getTimezonesResponse.successful) &&
        Objects.equals(this.countryFullName, getTimezonesResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, getTimezonesResponse.isOTwoLetterCode) &&
        Objects.equals(this.fiPSTwoLetterCode, getTimezonesResponse.fiPSTwoLetterCode) &&
        Objects.equals(this.threeLetterCode, getTimezonesResponse.threeLetterCode) &&
        Objects.equals(this.timezones, getTimezonesResponse.timezones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countryFullName, isOTwoLetterCode, fiPSTwoLetterCode, threeLetterCode, timezones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimezonesResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    fiPSTwoLetterCode: ").append(toIndentedString(fiPSTwoLetterCode)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
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

