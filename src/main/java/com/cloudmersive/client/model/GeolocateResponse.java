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
 * Geolocation result
 */
@ApiModel(description = "Geolocation result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-25T21:09:18.690-08:00")
public class GeolocateResponse {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("RegionCode")
  private String regionCode = null;

  @SerializedName("RegionName")
  private String regionName = null;

  @SerializedName("ZipCode")
  private String zipCode = null;

  @SerializedName("TimezoneStandardName")
  private String timezoneStandardName = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public GeolocateResponse countryCode(String countryCode) {
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

  public GeolocateResponse countryName(String countryName) {
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

  public GeolocateResponse city(String city) {
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

  public GeolocateResponse regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * State/region code of IP address
   * @return regionCode
  **/
  @ApiModelProperty(value = "State/region code of IP address")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public GeolocateResponse regionName(String regionName) {
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

  public GeolocateResponse zipCode(String zipCode) {
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

  public GeolocateResponse timezoneStandardName(String timezoneStandardName) {
    this.timezoneStandardName = timezoneStandardName;
    return this;
  }

   /**
   * Timezone of IP address
   * @return timezoneStandardName
  **/
  @ApiModelProperty(value = "Timezone of IP address")
  public String getTimezoneStandardName() {
    return timezoneStandardName;
  }

  public void setTimezoneStandardName(String timezoneStandardName) {
    this.timezoneStandardName = timezoneStandardName;
  }

  public GeolocateResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of IP address
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude of IP address")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public GeolocateResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of IP address
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude of IP address")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeolocateResponse geolocateResponse = (GeolocateResponse) o;
    return Objects.equals(this.countryCode, geolocateResponse.countryCode) &&
        Objects.equals(this.countryName, geolocateResponse.countryName) &&
        Objects.equals(this.city, geolocateResponse.city) &&
        Objects.equals(this.regionCode, geolocateResponse.regionCode) &&
        Objects.equals(this.regionName, geolocateResponse.regionName) &&
        Objects.equals(this.zipCode, geolocateResponse.zipCode) &&
        Objects.equals(this.timezoneStandardName, geolocateResponse.timezoneStandardName) &&
        Objects.equals(this.latitude, geolocateResponse.latitude) &&
        Objects.equals(this.longitude, geolocateResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, countryName, city, regionCode, regionName, zipCode, timezoneStandardName, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocateResponse {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    timezoneStandardName: ").append(toIndentedString(timezoneStandardName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

