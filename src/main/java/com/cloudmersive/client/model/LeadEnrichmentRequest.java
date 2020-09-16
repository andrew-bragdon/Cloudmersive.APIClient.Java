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
 * Input lead contact; fill in known fields to extend them with matched field values
 */
@ApiModel(description = "Input lead contact; fill in known fields to extend them with matched field values")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-15T18:41:07.918-07:00")
public class LeadEnrichmentRequest {
  @SerializedName("ContactBusinessEmail")
  private String contactBusinessEmail = null;

  @SerializedName("ContactFirstName")
  private String contactFirstName = null;

  @SerializedName("ContactLastName")
  private String contactLastName = null;

  @SerializedName("CompanyName")
  private String companyName = null;

  @SerializedName("CompanyDomainName")
  private String companyDomainName = null;

  @SerializedName("CompanyHouseNumber")
  private String companyHouseNumber = null;

  @SerializedName("CompanyStreet")
  private String companyStreet = null;

  @SerializedName("CompanyCity")
  private String companyCity = null;

  @SerializedName("CompanyStateOrProvince")
  private String companyStateOrProvince = null;

  @SerializedName("CompanyPostalCode")
  private String companyPostalCode = null;

  @SerializedName("CompanyCountry")
  private String companyCountry = null;

  @SerializedName("CompanyCountryCode")
  private String companyCountryCode = null;

  @SerializedName("CompanyTelephone")
  private String companyTelephone = null;

  @SerializedName("CompanyVATNumber")
  private String companyVATNumber = null;

  public LeadEnrichmentRequest contactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
    return this;
  }

   /**
   * The person&#39;s business email address for the lead
   * @return contactBusinessEmail
  **/
  @ApiModelProperty(value = "The person's business email address for the lead")
  public String getContactBusinessEmail() {
    return contactBusinessEmail;
  }

  public void setContactBusinessEmail(String contactBusinessEmail) {
    this.contactBusinessEmail = contactBusinessEmail;
  }

  public LeadEnrichmentRequest contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * The person&#39;s first name for the lead
   * @return contactFirstName
  **/
  @ApiModelProperty(value = "The person's first name for the lead")
  public String getContactFirstName() {
    return contactFirstName;
  }

  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }

  public LeadEnrichmentRequest contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * The person&#39;s last name for the lead
   * @return contactLastName
  **/
  @ApiModelProperty(value = "The person's last name for the lead")
  public String getContactLastName() {
    return contactLastName;
  }

  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }

  public LeadEnrichmentRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company for the lead
   * @return companyName
  **/
  @ApiModelProperty(value = "Name of the company for the lead")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public LeadEnrichmentRequest companyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
    return this;
  }

   /**
   * Domain name / website for the lead
   * @return companyDomainName
  **/
  @ApiModelProperty(value = "Domain name / website for the lead")
  public String getCompanyDomainName() {
    return companyDomainName;
  }

  public void setCompanyDomainName(String companyDomainName) {
    this.companyDomainName = companyDomainName;
  }

  public LeadEnrichmentRequest companyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
    return this;
  }

   /**
   * House number of the address of the company for the lead
   * @return companyHouseNumber
  **/
  @ApiModelProperty(value = "House number of the address of the company for the lead")
  public String getCompanyHouseNumber() {
    return companyHouseNumber;
  }

  public void setCompanyHouseNumber(String companyHouseNumber) {
    this.companyHouseNumber = companyHouseNumber;
  }

  public LeadEnrichmentRequest companyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
    return this;
  }

   /**
   * Street name of the address of the company for the lead
   * @return companyStreet
  **/
  @ApiModelProperty(value = "Street name of the address of the company for the lead")
  public String getCompanyStreet() {
    return companyStreet;
  }

  public void setCompanyStreet(String companyStreet) {
    this.companyStreet = companyStreet;
  }

  public LeadEnrichmentRequest companyCity(String companyCity) {
    this.companyCity = companyCity;
    return this;
  }

   /**
   * City of the address of the company for the lead
   * @return companyCity
  **/
  @ApiModelProperty(value = "City of the address of the company for the lead")
  public String getCompanyCity() {
    return companyCity;
  }

  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }

  public LeadEnrichmentRequest companyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
    return this;
  }

   /**
   * State or Province of the address of the company for the lead
   * @return companyStateOrProvince
  **/
  @ApiModelProperty(value = "State or Province of the address of the company for the lead")
  public String getCompanyStateOrProvince() {
    return companyStateOrProvince;
  }

  public void setCompanyStateOrProvince(String companyStateOrProvince) {
    this.companyStateOrProvince = companyStateOrProvince;
  }

  public LeadEnrichmentRequest companyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
    return this;
  }

   /**
   * Postal Code of the address of the company for the lead
   * @return companyPostalCode
  **/
  @ApiModelProperty(value = "Postal Code of the address of the company for the lead")
  public String getCompanyPostalCode() {
    return companyPostalCode;
  }

  public void setCompanyPostalCode(String companyPostalCode) {
    this.companyPostalCode = companyPostalCode;
  }

  public LeadEnrichmentRequest companyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
    return this;
  }

   /**
   * Country of the address of the company for the lead
   * @return companyCountry
  **/
  @ApiModelProperty(value = "Country of the address of the company for the lead")
  public String getCompanyCountry() {
    return companyCountry;
  }

  public void setCompanyCountry(String companyCountry) {
    this.companyCountry = companyCountry;
  }

  public LeadEnrichmentRequest companyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
    return this;
  }

   /**
   * Country Code (2-letter ISO 3166-1) of the address of the company for the lead
   * @return companyCountryCode
  **/
  @ApiModelProperty(value = "Country Code (2-letter ISO 3166-1) of the address of the company for the lead")
  public String getCompanyCountryCode() {
    return companyCountryCode;
  }

  public void setCompanyCountryCode(String companyCountryCode) {
    this.companyCountryCode = companyCountryCode;
  }

  public LeadEnrichmentRequest companyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
    return this;
  }

   /**
   * Telephone of the company office for the lead
   * @return companyTelephone
  **/
  @ApiModelProperty(value = "Telephone of the company office for the lead")
  public String getCompanyTelephone() {
    return companyTelephone;
  }

  public void setCompanyTelephone(String companyTelephone) {
    this.companyTelephone = companyTelephone;
  }

  public LeadEnrichmentRequest companyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
    return this;
  }

   /**
   * VAT number of the company for the lead
   * @return companyVATNumber
  **/
  @ApiModelProperty(value = "VAT number of the company for the lead")
  public String getCompanyVATNumber() {
    return companyVATNumber;
  }

  public void setCompanyVATNumber(String companyVATNumber) {
    this.companyVATNumber = companyVATNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadEnrichmentRequest leadEnrichmentRequest = (LeadEnrichmentRequest) o;
    return Objects.equals(this.contactBusinessEmail, leadEnrichmentRequest.contactBusinessEmail) &&
        Objects.equals(this.contactFirstName, leadEnrichmentRequest.contactFirstName) &&
        Objects.equals(this.contactLastName, leadEnrichmentRequest.contactLastName) &&
        Objects.equals(this.companyName, leadEnrichmentRequest.companyName) &&
        Objects.equals(this.companyDomainName, leadEnrichmentRequest.companyDomainName) &&
        Objects.equals(this.companyHouseNumber, leadEnrichmentRequest.companyHouseNumber) &&
        Objects.equals(this.companyStreet, leadEnrichmentRequest.companyStreet) &&
        Objects.equals(this.companyCity, leadEnrichmentRequest.companyCity) &&
        Objects.equals(this.companyStateOrProvince, leadEnrichmentRequest.companyStateOrProvince) &&
        Objects.equals(this.companyPostalCode, leadEnrichmentRequest.companyPostalCode) &&
        Objects.equals(this.companyCountry, leadEnrichmentRequest.companyCountry) &&
        Objects.equals(this.companyCountryCode, leadEnrichmentRequest.companyCountryCode) &&
        Objects.equals(this.companyTelephone, leadEnrichmentRequest.companyTelephone) &&
        Objects.equals(this.companyVATNumber, leadEnrichmentRequest.companyVATNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactBusinessEmail, contactFirstName, contactLastName, companyName, companyDomainName, companyHouseNumber, companyStreet, companyCity, companyStateOrProvince, companyPostalCode, companyCountry, companyCountryCode, companyTelephone, companyVATNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadEnrichmentRequest {\n");
    
    sb.append("    contactBusinessEmail: ").append(toIndentedString(contactBusinessEmail)).append("\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyDomainName: ").append(toIndentedString(companyDomainName)).append("\n");
    sb.append("    companyHouseNumber: ").append(toIndentedString(companyHouseNumber)).append("\n");
    sb.append("    companyStreet: ").append(toIndentedString(companyStreet)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyStateOrProvince: ").append(toIndentedString(companyStateOrProvince)).append("\n");
    sb.append("    companyPostalCode: ").append(toIndentedString(companyPostalCode)).append("\n");
    sb.append("    companyCountry: ").append(toIndentedString(companyCountry)).append("\n");
    sb.append("    companyCountryCode: ").append(toIndentedString(companyCountryCode)).append("\n");
    sb.append("    companyTelephone: ").append(toIndentedString(companyTelephone)).append("\n");
    sb.append("    companyVATNumber: ").append(toIndentedString(companyVATNumber)).append("\n");
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

