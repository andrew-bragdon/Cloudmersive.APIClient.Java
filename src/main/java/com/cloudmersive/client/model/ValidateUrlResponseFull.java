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
 * Result of validating a URL with full validation
 */
@ApiModel(description = "Result of validating a URL with full validation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T22:31:12.673-08:00")
public class ValidateUrlResponseFull {
  @SerializedName("ValidURL")
  private Boolean validURL = null;

  @SerializedName("Valid_Syntax")
  private Boolean validSyntax = null;

  @SerializedName("Valid_Domain")
  private Boolean validDomain = null;

  @SerializedName("Valid_Endpoint")
  private Boolean validEndpoint = null;

  @SerializedName("WellFormedURL")
  private String wellFormedURL = null;

  public ValidateUrlResponseFull validURL(Boolean validURL) {
    this.validURL = validURL;
    return this;
  }

   /**
   * True if the URL has valid syntax, a valid domain, a valid endpoint, and passes virus scan checks; false otherwise
   * @return validURL
  **/
  @ApiModelProperty(value = "True if the URL has valid syntax, a valid domain, a valid endpoint, and passes virus scan checks; false otherwise")
  public Boolean isValidURL() {
    return validURL;
  }

  public void setValidURL(Boolean validURL) {
    this.validURL = validURL;
  }

  public ValidateUrlResponseFull validSyntax(Boolean validSyntax) {
    this.validSyntax = validSyntax;
    return this;
  }

   /**
   * True if the URL has valid syntax, false otherwise
   * @return validSyntax
  **/
  @ApiModelProperty(value = "True if the URL has valid syntax, false otherwise")
  public Boolean isValidSyntax() {
    return validSyntax;
  }

  public void setValidSyntax(Boolean validSyntax) {
    this.validSyntax = validSyntax;
  }

  public ValidateUrlResponseFull validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain name is valid and exists, false otherwise
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain name is valid and exists, false otherwise")
  public Boolean isValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public ValidateUrlResponseFull validEndpoint(Boolean validEndpoint) {
    this.validEndpoint = validEndpoint;
    return this;
  }

   /**
   * True if the endpoint is up and responsive and passes a virus scan check, false otherwise
   * @return validEndpoint
  **/
  @ApiModelProperty(value = "True if the endpoint is up and responsive and passes a virus scan check, false otherwise")
  public Boolean isValidEndpoint() {
    return validEndpoint;
  }

  public void setValidEndpoint(Boolean validEndpoint) {
    this.validEndpoint = validEndpoint;
  }

  public ValidateUrlResponseFull wellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
    return this;
  }

   /**
   * Well-formed version of the URL
   * @return wellFormedURL
  **/
  @ApiModelProperty(value = "Well-formed version of the URL")
  public String getWellFormedURL() {
    return wellFormedURL;
  }

  public void setWellFormedURL(String wellFormedURL) {
    this.wellFormedURL = wellFormedURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateUrlResponseFull validateUrlResponseFull = (ValidateUrlResponseFull) o;
    return Objects.equals(this.validURL, validateUrlResponseFull.validURL) &&
        Objects.equals(this.validSyntax, validateUrlResponseFull.validSyntax) &&
        Objects.equals(this.validDomain, validateUrlResponseFull.validDomain) &&
        Objects.equals(this.validEndpoint, validateUrlResponseFull.validEndpoint) &&
        Objects.equals(this.wellFormedURL, validateUrlResponseFull.wellFormedURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validURL, validSyntax, validDomain, validEndpoint, wellFormedURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateUrlResponseFull {\n");
    
    sb.append("    validURL: ").append(toIndentedString(validURL)).append("\n");
    sb.append("    validSyntax: ").append(toIndentedString(validSyntax)).append("\n");
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    validEndpoint: ").append(toIndentedString(validEndpoint)).append("\n");
    sb.append("    wellFormedURL: ").append(toIndentedString(wellFormedURL)).append("\n");
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

