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
import com.cloudmersive.client.model.GeolocateResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IP address intelligence result
 */
@ApiModel(description = "IP address intelligence result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-29T18:18:24.393-07:00")
public class IPIntelligenceResponse {
  @SerializedName("IsBot")
  private Boolean isBot = null;

  @SerializedName("IsTorNode")
  private Boolean isTorNode = null;

  @SerializedName("IsThreat")
  private Boolean isThreat = null;

  @SerializedName("IsEU")
  private Boolean isEU = null;

  @SerializedName("Location")
  private GeolocateResponse location = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("CurrencyName")
  private String currencyName = null;

  @SerializedName("RegionArea")
  private String regionArea = null;

  @SerializedName("SubregionArea")
  private String subregionArea = null;

  public IPIntelligenceResponse isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

   /**
   * True if the IP address is a known bot, otherwise false
   * @return isBot
  **/
  @ApiModelProperty(value = "True if the IP address is a known bot, otherwise false")
  public Boolean isIsBot() {
    return isBot;
  }

  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  public IPIntelligenceResponse isTorNode(Boolean isTorNode) {
    this.isTorNode = isTorNode;
    return this;
  }

   /**
   * True if the IP address is a known Tor exit node, otherwise false
   * @return isTorNode
  **/
  @ApiModelProperty(value = "True if the IP address is a known Tor exit node, otherwise false")
  public Boolean isIsTorNode() {
    return isTorNode;
  }

  public void setIsTorNode(Boolean isTorNode) {
    this.isTorNode = isTorNode;
  }

  public IPIntelligenceResponse isThreat(Boolean isThreat) {
    this.isThreat = isThreat;
    return this;
  }

   /**
   * True if the IP address is a known threat IP, otherwise false
   * @return isThreat
  **/
  @ApiModelProperty(value = "True if the IP address is a known threat IP, otherwise false")
  public Boolean isIsThreat() {
    return isThreat;
  }

  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }

  public IPIntelligenceResponse isEU(Boolean isEU) {
    this.isEU = isEU;
    return this;
  }

   /**
   * True if the IP address is in the European Union, otherwise false
   * @return isEU
  **/
  @ApiModelProperty(value = "True if the IP address is in the European Union, otherwise false")
  public Boolean isIsEU() {
    return isEU;
  }

  public void setIsEU(Boolean isEU) {
    this.isEU = isEU;
  }

  public IPIntelligenceResponse location(GeolocateResponse location) {
    this.location = location;
    return this;
  }

   /**
   * Returns the location of the IP address
   * @return location
  **/
  @ApiModelProperty(value = "Returns the location of the IP address")
  public GeolocateResponse getLocation() {
    return location;
  }

  public void setLocation(GeolocateResponse location) {
    this.location = location;
  }

  public IPIntelligenceResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO 4217 currency code for the IP address location
   * @return currencyCode
  **/
  @ApiModelProperty(value = "ISO 4217 currency code for the IP address location")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public IPIntelligenceResponse currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

   /**
   * Name of the currency in English
   * @return currencyName
  **/
  @ApiModelProperty(value = "Name of the currency in English")
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public IPIntelligenceResponse regionArea(String regionArea) {
    this.regionArea = regionArea;
    return this;
  }

   /**
   * Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania
   * @return regionArea
  **/
  @ApiModelProperty(value = "Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania")
  public String getRegionArea() {
    return regionArea;
  }

  public void setRegionArea(String regionArea) {
    this.regionArea = regionArea;
  }

  public IPIntelligenceResponse subregionArea(String subregionArea) {
    this.subregionArea = subregionArea;
    return this;
  }

   /**
   * Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,
   * @return subregionArea
  **/
  @ApiModelProperty(value = "Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,")
  public String getSubregionArea() {
    return subregionArea;
  }

  public void setSubregionArea(String subregionArea) {
    this.subregionArea = subregionArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPIntelligenceResponse ipIntelligenceResponse = (IPIntelligenceResponse) o;
    return Objects.equals(this.isBot, ipIntelligenceResponse.isBot) &&
        Objects.equals(this.isTorNode, ipIntelligenceResponse.isTorNode) &&
        Objects.equals(this.isThreat, ipIntelligenceResponse.isThreat) &&
        Objects.equals(this.isEU, ipIntelligenceResponse.isEU) &&
        Objects.equals(this.location, ipIntelligenceResponse.location) &&
        Objects.equals(this.currencyCode, ipIntelligenceResponse.currencyCode) &&
        Objects.equals(this.currencyName, ipIntelligenceResponse.currencyName) &&
        Objects.equals(this.regionArea, ipIntelligenceResponse.regionArea) &&
        Objects.equals(this.subregionArea, ipIntelligenceResponse.subregionArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBot, isTorNode, isThreat, isEU, location, currencyCode, currencyName, regionArea, subregionArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPIntelligenceResponse {\n");
    
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    isTorNode: ").append(toIndentedString(isTorNode)).append("\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    isEU: ").append(toIndentedString(isEU)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    regionArea: ").append(toIndentedString(regionArea)).append("\n");
    sb.append("    subregionArea: ").append(toIndentedString(subregionArea)).append("\n");
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

