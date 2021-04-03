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
 * Geolocation street address result
 */
@ApiModel(description = "Geolocation street address result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-02T22:01:13.794-07:00")
public class GeolocateStreetAddressResponse {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("StreetAddress")
  private String streetAddress = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("RegionName")
  private String regionName = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  public GeolocateStreetAddressResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country code of IP address
   * @return countryCode
  **/
  @ApiModelProperty(value = "Two-letter country code of IP address")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public GeolocateStreetAddressResponse countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Country name of IP address
   * @return countryName
  **/
  @ApiModelProperty(value = "Country name of IP address")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public GeolocateStreetAddressResponse streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address of IP address
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address of IP address")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public GeolocateStreetAddressResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of IP address
   * @return city
  **/
  @ApiModelProperty(value = "City of IP address")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GeolocateStreetAddressResponse regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * State/region of IP address
   * @return regionName
  **/
  @ApiModelProperty(value = "State/region of IP address")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public GeolocateStreetAddressResponse zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Zip or postal code of IP address
   * @return zipCode
  **/
  @ApiModelProperty(value = "Zip or postal code of IP address")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeolocateStreetAddressResponse geolocateStreetAddressResponse = (GeolocateStreetAddressResponse) o;
    return Objects.equals(this.countryCode, geolocateStreetAddressResponse.countryCode) &&
        Objects.equals(this.countryName, geolocateStreetAddressResponse.countryName) &&
        Objects.equals(this.streetAddress, geolocateStreetAddressResponse.streetAddress) &&
        Objects.equals(this.city, geolocateStreetAddressResponse.city) &&
        Objects.equals(this.regionName, geolocateStreetAddressResponse.regionName) &&
        Objects.equals(this.zipCode, geolocateStreetAddressResponse.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, streetAddress, city, regionName, zipCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocateStreetAddressResponse {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

