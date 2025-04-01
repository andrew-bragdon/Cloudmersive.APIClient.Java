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
 * Input parameter to a country validation request
 */
@ApiModel(description = "Input parameter to a country validation request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:07:36.089-07:00")
public class GetPublicHolidaysRequest {
  @SerializedName("RawCountryInput")
  private String rawCountryInput = null;

  @SerializedName("Year")
  private Integer year = null;

  public GetPublicHolidaysRequest rawCountryInput(String rawCountryInput) {
    this.rawCountryInput = rawCountryInput;
    return this;
  }

   /**
   * Two-letter code (FIPS 10-4 or ISO 3166-1) of the country; if not specified, defaults to United States
   * @return rawCountryInput
  **/
  @ApiModelProperty(value = "Two-letter code (FIPS 10-4 or ISO 3166-1) of the country; if not specified, defaults to United States")
  public String getRawCountryInput() {
    return rawCountryInput;
  }

  public void setRawCountryInput(String rawCountryInput) {
    this.rawCountryInput = rawCountryInput;
  }

  public GetPublicHolidaysRequest year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Optional - the year in which to retrieve the holidays; if left blank (0) it will default to the current year
   * @return year
  **/
  @ApiModelProperty(value = "Optional - the year in which to retrieve the holidays; if left blank (0) it will default to the current year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPublicHolidaysRequest getPublicHolidaysRequest = (GetPublicHolidaysRequest) o;
    return Objects.equals(this.rawCountryInput, getPublicHolidaysRequest.rawCountryInput) &&
        Objects.equals(this.year, getPublicHolidaysRequest.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawCountryInput, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPublicHolidaysRequest {\n");
    
    sb.append("    rawCountryInput: ").append(toIndentedString(rawCountryInput)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

