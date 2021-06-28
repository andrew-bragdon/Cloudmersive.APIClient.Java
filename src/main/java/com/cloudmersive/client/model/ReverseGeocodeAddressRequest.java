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
 * Request to reverse geocode a Street Address
 */
@ApiModel(description = "Request to reverse geocode a Street Address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-27T17:49:11.835-07:00")
public class ReverseGeocodeAddressRequest {
  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public ReverseGeocodeAddressRequest latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude coordinate in WGS84 format
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude coordinate in WGS84 format")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public ReverseGeocodeAddressRequest longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude coordinate in WGS84 format
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude coordinate in WGS84 format")
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
    ReverseGeocodeAddressRequest reverseGeocodeAddressRequest = (ReverseGeocodeAddressRequest) o;
    return Objects.equals(this.latitude, reverseGeocodeAddressRequest.latitude) &&
        Objects.equals(this.longitude, reverseGeocodeAddressRequest.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseGeocodeAddressRequest {\n");
    
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

