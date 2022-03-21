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
 * VatLookupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-20T11:07:19.408-07:00")
public class VatLookupResponse {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

  @SerializedName("IsValid")
  private Boolean isValid = null;

  @SerializedName("BusinessName")
  private String businessName = null;

  @SerializedName("BusinessAddress")
  private String businessAddress = null;

  @SerializedName("BusinessBuilding")
  private String businessBuilding = null;

  @SerializedName("BusinessStreetNumber")
  private String businessStreetNumber = null;

  @SerializedName("BusinessStreet")
  private String businessStreet = null;

  @SerializedName("BusinessCity")
  private String businessCity = null;

  @SerializedName("BusinessStateOrProvince")
  private String businessStateOrProvince = null;

  @SerializedName("BusinessPostalCode")
  private String businessPostalCode = null;

  @SerializedName("BusinessCountry")
  private String businessCountry = null;

  public VatLookupResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Two-letter country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Two-letter country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public VatLookupResponse vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * VAT number
   * @return vatNumber
  **/
  @ApiModelProperty(value = "VAT number")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public VatLookupResponse isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the VAT code is valid, false otherwise
   * @return isValid
  **/
  @ApiModelProperty(value = "True if the VAT code is valid, false otherwise")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public VatLookupResponse businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the business
   * @return businessName
  **/
  @ApiModelProperty(value = "Name of the business")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public VatLookupResponse businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Business address as a single string
   * @return businessAddress
  **/
  @ApiModelProperty(value = "Business address as a single string")
  public String getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }

  public VatLookupResponse businessBuilding(String businessBuilding) {
    this.businessBuilding = businessBuilding;
    return this;
  }

   /**
   * For the business address, the name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null.
   * @return businessBuilding
  **/
  @ApiModelProperty(value = "For the business address, the name of the building, house or structure if applicable, such as \"Cloudmersive Building 2\".  This will often by null.")
  public String getBusinessBuilding() {
    return businessBuilding;
  }

  public void setBusinessBuilding(String businessBuilding) {
    this.businessBuilding = businessBuilding;
  }

  public VatLookupResponse businessStreetNumber(String businessStreetNumber) {
    this.businessStreetNumber = businessStreetNumber;
    return this;
  }

   /**
   * For the business address, the street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses.
   * @return businessStreetNumber
  **/
  @ApiModelProperty(value = "For the business address, the street number or house number of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"1600\".  This value will typically be populated for most addresses.")
  public String getBusinessStreetNumber() {
    return businessStreetNumber;
  }

  public void setBusinessStreetNumber(String businessStreetNumber) {
    this.businessStreetNumber = businessStreetNumber;
  }

  public VatLookupResponse businessStreet(String businessStreet) {
    this.businessStreet = businessStreet;
    return this;
  }

   /**
   * For the business address, the name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;.
   * @return businessStreet
  **/
  @ApiModelProperty(value = "For the business address, the name of the street or road of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"Pennsylvania Avenue NW\".")
  public String getBusinessStreet() {
    return businessStreet;
  }

  public void setBusinessStreet(String businessStreet) {
    this.businessStreet = businessStreet;
  }

  public VatLookupResponse businessCity(String businessCity) {
    this.businessCity = businessCity;
    return this;
  }

   /**
   * For the business address, the city of the address.
   * @return businessCity
  **/
  @ApiModelProperty(value = "For the business address, the city of the address.")
  public String getBusinessCity() {
    return businessCity;
  }

  public void setBusinessCity(String businessCity) {
    this.businessCity = businessCity;
  }

  public VatLookupResponse businessStateOrProvince(String businessStateOrProvince) {
    this.businessStateOrProvince = businessStateOrProvince;
    return this;
  }

   /**
   * For the business address, the state or province of the address.
   * @return businessStateOrProvince
  **/
  @ApiModelProperty(value = "For the business address, the state or province of the address.")
  public String getBusinessStateOrProvince() {
    return businessStateOrProvince;
  }

  public void setBusinessStateOrProvince(String businessStateOrProvince) {
    this.businessStateOrProvince = businessStateOrProvince;
  }

  public VatLookupResponse businessPostalCode(String businessPostalCode) {
    this.businessPostalCode = businessPostalCode;
    return this;
  }

   /**
   * For the business address, the postal code or zip code of the address.
   * @return businessPostalCode
  **/
  @ApiModelProperty(value = "For the business address, the postal code or zip code of the address.")
  public String getBusinessPostalCode() {
    return businessPostalCode;
  }

  public void setBusinessPostalCode(String businessPostalCode) {
    this.businessPostalCode = businessPostalCode;
  }

  public VatLookupResponse businessCountry(String businessCountry) {
    this.businessCountry = businessCountry;
    return this;
  }

   /**
   * For the business address, country of the address, if present in the address.  If not included in the address it will be null.
   * @return businessCountry
  **/
  @ApiModelProperty(value = "For the business address, country of the address, if present in the address.  If not included in the address it will be null.")
  public String getBusinessCountry() {
    return businessCountry;
  }

  public void setBusinessCountry(String businessCountry) {
    this.businessCountry = businessCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatLookupResponse vatLookupResponse = (VatLookupResponse) o;
    return Objects.equals(this.countryCode, vatLookupResponse.countryCode) &&
        Objects.equals(this.vatNumber, vatLookupResponse.vatNumber) &&
        Objects.equals(this.isValid, vatLookupResponse.isValid) &&
        Objects.equals(this.businessName, vatLookupResponse.businessName) &&
        Objects.equals(this.businessAddress, vatLookupResponse.businessAddress) &&
        Objects.equals(this.businessBuilding, vatLookupResponse.businessBuilding) &&
        Objects.equals(this.businessStreetNumber, vatLookupResponse.businessStreetNumber) &&
        Objects.equals(this.businessStreet, vatLookupResponse.businessStreet) &&
        Objects.equals(this.businessCity, vatLookupResponse.businessCity) &&
        Objects.equals(this.businessStateOrProvince, vatLookupResponse.businessStateOrProvince) &&
        Objects.equals(this.businessPostalCode, vatLookupResponse.businessPostalCode) &&
        Objects.equals(this.businessCountry, vatLookupResponse.businessCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, vatNumber, isValid, businessName, businessAddress, businessBuilding, businessStreetNumber, businessStreet, businessCity, businessStateOrProvince, businessPostalCode, businessCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatLookupResponse {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessBuilding: ").append(toIndentedString(businessBuilding)).append("\n");
    sb.append("    businessStreetNumber: ").append(toIndentedString(businessStreetNumber)).append("\n");
    sb.append("    businessStreet: ").append(toIndentedString(businessStreet)).append("\n");
    sb.append("    businessCity: ").append(toIndentedString(businessCity)).append("\n");
    sb.append("    businessStateOrProvince: ").append(toIndentedString(businessStateOrProvince)).append("\n");
    sb.append("    businessPostalCode: ").append(toIndentedString(businessPostalCode)).append("\n");
    sb.append("    businessCountry: ").append(toIndentedString(businessCountry)).append("\n");
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

