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
 * Result of validating a city
 */
@ApiModel(description = "Result of validating a city")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-18T00:42:39.170-07:00")
public class ValidateCityResponse {
  @SerializedName("ValidCity")
  private Boolean validCity = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public ValidateCityResponse validCity(Boolean validCity) {
    this.validCity = validCity;
    return this;
  }

   /**
   * True if the city is valid, false otherwise
   * @return validCity
  **/
  @ApiModelProperty(value = "True if the city is valid, false otherwise")
  public Boolean isValidCity() {
    return validCity;
  }

  public void setValidCity(Boolean validCity) {
    this.validCity = validCity;
  }

  public ValidateCityResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * If valid, City corresponding to the input postal code, such as &#39;Walnut Creek&#39;
   * @return city
  **/
  @ApiModelProperty(value = "If valid, City corresponding to the input postal code, such as 'Walnut Creek'")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidateCityResponse stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * If valid; State or province corresponding to the input state name, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "If valid; State or province corresponding to the input state name, such as 'CA' or 'California'")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public ValidateCityResponse latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees latitude of the centroid of the state, null otherwise
   * @return latitude
  **/
  @ApiModelProperty(value = "If the postal code is valid, the degrees latitude of the centroid of the state, null otherwise")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public ValidateCityResponse longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * If the postal code is valid, the degrees longitude of the centroid of the state, null otherwise
   * @return longitude
  **/
  @ApiModelProperty(value = "If the postal code is valid, the degrees longitude of the centroid of the state, null otherwise")
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
    ValidateCityResponse validateCityResponse = (ValidateCityResponse) o;
    return Objects.equals(this.validCity, validateCityResponse.validCity) &&
        Objects.equals(this.city, validateCityResponse.city) &&
        Objects.equals(this.stateOrProvince, validateCityResponse.stateOrProvince) &&
        Objects.equals(this.latitude, validateCityResponse.latitude) &&
        Objects.equals(this.longitude, validateCityResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validCity, city, stateOrProvince, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCityResponse {\n");
    
    sb.append("    validCity: ").append(toIndentedString(validCity)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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

