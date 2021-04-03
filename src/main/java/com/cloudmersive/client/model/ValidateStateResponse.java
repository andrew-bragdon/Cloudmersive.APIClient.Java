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
 * Result of validating a state
 */
@ApiModel(description = "Result of validating a state")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-02T22:01:13.794-07:00")
public class ValidateStateResponse {
  @SerializedName("ValidState")
  private Boolean validState = null;

  @SerializedName("StateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public ValidateStateResponse validState(Boolean validState) {
    this.validState = validState;
    return this;
  }

   /**
   * True if the address is valid, false otherwise
   * @return validState
  **/
  @ApiModelProperty(value = "True if the address is valid, false otherwise")
  public Boolean isValidState() {
    return validState;
  }

  public void setValidState(Boolean validState) {
    this.validState = validState;
  }

  public ValidateStateResponse stateOrProvince(String stateOrProvince) {
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

  public ValidateStateResponse latitude(Double latitude) {
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

  public ValidateStateResponse longitude(Double longitude) {
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
    ValidateStateResponse validateStateResponse = (ValidateStateResponse) o;
    return Objects.equals(this.validState, validateStateResponse.validState) &&
        Objects.equals(this.stateOrProvince, validateStateResponse.stateOrProvince) &&
        Objects.equals(this.latitude, validateStateResponse.latitude) &&
        Objects.equals(this.longitude, validateStateResponse.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validState, stateOrProvince, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateStateResponse {\n");
    
    sb.append("    validState: ").append(toIndentedString(validState)).append("\n");
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

