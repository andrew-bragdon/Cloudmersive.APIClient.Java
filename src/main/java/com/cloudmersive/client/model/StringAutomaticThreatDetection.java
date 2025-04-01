/*
 * securityapi
 * The security APIs help you detect and block security threats.
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
 * Result of performing an Insecure Deserialization JSON protection operation
 */
@ApiModel(description = "Result of performing an Insecure Deserialization JSON protection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:07:56.783-07:00")
public class StringAutomaticThreatDetection {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("CleanResult")
  private Boolean cleanResult = null;

  @SerializedName("ContainedJsonInsecureDeserializationAttack")
  private Boolean containedJsonInsecureDeserializationAttack = null;

  @SerializedName("ContainedXssThreat")
  private Boolean containedXssThreat = null;

  @SerializedName("ContainedXxeThreat")
  private Boolean containedXxeThreat = null;

  @SerializedName("ContainedSqlInjectionThreat")
  private Boolean containedSqlInjectionThreat = null;

  @SerializedName("ContainedSsrfThreat")
  private Boolean containedSsrfThreat = null;

  @SerializedName("IsXML")
  private Boolean isXML = null;

  @SerializedName("IsJSON")
  private Boolean isJSON = null;

  @SerializedName("IsURL")
  private Boolean isURL = null;

  @SerializedName("OriginalInput")
  private String originalInput = null;

  public StringAutomaticThreatDetection successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public StringAutomaticThreatDetection cleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * Get cleanResult
   * @return cleanResult
  **/
  @ApiModelProperty(value = "")
  public Boolean isCleanResult() {
    return cleanResult;
  }

  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }

  public StringAutomaticThreatDetection containedJsonInsecureDeserializationAttack(Boolean containedJsonInsecureDeserializationAttack) {
    this.containedJsonInsecureDeserializationAttack = containedJsonInsecureDeserializationAttack;
    return this;
  }

   /**
   * True if the input contained Insecure Deserialization JSON, false otherwise
   * @return containedJsonInsecureDeserializationAttack
  **/
  @ApiModelProperty(value = "True if the input contained Insecure Deserialization JSON, false otherwise")
  public Boolean isContainedJsonInsecureDeserializationAttack() {
    return containedJsonInsecureDeserializationAttack;
  }

  public void setContainedJsonInsecureDeserializationAttack(Boolean containedJsonInsecureDeserializationAttack) {
    this.containedJsonInsecureDeserializationAttack = containedJsonInsecureDeserializationAttack;
  }

  public StringAutomaticThreatDetection containedXssThreat(Boolean containedXssThreat) {
    this.containedXssThreat = containedXssThreat;
    return this;
  }

   /**
   * True if the input contained XSS attack, false otherwise
   * @return containedXssThreat
  **/
  @ApiModelProperty(value = "True if the input contained XSS attack, false otherwise")
  public Boolean isContainedXssThreat() {
    return containedXssThreat;
  }

  public void setContainedXssThreat(Boolean containedXssThreat) {
    this.containedXssThreat = containedXssThreat;
  }

  public StringAutomaticThreatDetection containedXxeThreat(Boolean containedXxeThreat) {
    this.containedXxeThreat = containedXxeThreat;
    return this;
  }

   /**
   * True if the input contained XXE attack, false otherwise
   * @return containedXxeThreat
  **/
  @ApiModelProperty(value = "True if the input contained XXE attack, false otherwise")
  public Boolean isContainedXxeThreat() {
    return containedXxeThreat;
  }

  public void setContainedXxeThreat(Boolean containedXxeThreat) {
    this.containedXxeThreat = containedXxeThreat;
  }

  public StringAutomaticThreatDetection containedSqlInjectionThreat(Boolean containedSqlInjectionThreat) {
    this.containedSqlInjectionThreat = containedSqlInjectionThreat;
    return this;
  }

   /**
   * True if the input contained SQL Injection attack, false otherwise
   * @return containedSqlInjectionThreat
  **/
  @ApiModelProperty(value = "True if the input contained SQL Injection attack, false otherwise")
  public Boolean isContainedSqlInjectionThreat() {
    return containedSqlInjectionThreat;
  }

  public void setContainedSqlInjectionThreat(Boolean containedSqlInjectionThreat) {
    this.containedSqlInjectionThreat = containedSqlInjectionThreat;
  }

  public StringAutomaticThreatDetection containedSsrfThreat(Boolean containedSsrfThreat) {
    this.containedSsrfThreat = containedSsrfThreat;
    return this;
  }

   /**
   * True if the input contained an Server-Side Request Forgery (SSRF) URL attack, false otherwise
   * @return containedSsrfThreat
  **/
  @ApiModelProperty(value = "True if the input contained an Server-Side Request Forgery (SSRF) URL attack, false otherwise")
  public Boolean isContainedSsrfThreat() {
    return containedSsrfThreat;
  }

  public void setContainedSsrfThreat(Boolean containedSsrfThreat) {
    this.containedSsrfThreat = containedSsrfThreat;
  }

  public StringAutomaticThreatDetection isXML(Boolean isXML) {
    this.isXML = isXML;
    return this;
  }

   /**
   * True if the input string is XML, false otherwise
   * @return isXML
  **/
  @ApiModelProperty(value = "True if the input string is XML, false otherwise")
  public Boolean isIsXML() {
    return isXML;
  }

  public void setIsXML(Boolean isXML) {
    this.isXML = isXML;
  }

  public StringAutomaticThreatDetection isJSON(Boolean isJSON) {
    this.isJSON = isJSON;
    return this;
  }

   /**
   * True if the input string is JSON, false otherwise
   * @return isJSON
  **/
  @ApiModelProperty(value = "True if the input string is JSON, false otherwise")
  public Boolean isIsJSON() {
    return isJSON;
  }

  public void setIsJSON(Boolean isJSON) {
    this.isJSON = isJSON;
  }

  public StringAutomaticThreatDetection isURL(Boolean isURL) {
    this.isURL = isURL;
    return this;
  }

   /**
   * True if the input string is a URL, false otherwise
   * @return isURL
  **/
  @ApiModelProperty(value = "True if the input string is a URL, false otherwise")
  public Boolean isIsURL() {
    return isURL;
  }

  public void setIsURL(Boolean isURL) {
    this.isURL = isURL;
  }

  public StringAutomaticThreatDetection originalInput(String originalInput) {
    this.originalInput = originalInput;
    return this;
  }

   /**
   * Original input string
   * @return originalInput
  **/
  @ApiModelProperty(value = "Original input string")
  public String getOriginalInput() {
    return originalInput;
  }

  public void setOriginalInput(String originalInput) {
    this.originalInput = originalInput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringAutomaticThreatDetection stringAutomaticThreatDetection = (StringAutomaticThreatDetection) o;
    return Objects.equals(this.successful, stringAutomaticThreatDetection.successful) &&
        Objects.equals(this.cleanResult, stringAutomaticThreatDetection.cleanResult) &&
        Objects.equals(this.containedJsonInsecureDeserializationAttack, stringAutomaticThreatDetection.containedJsonInsecureDeserializationAttack) &&
        Objects.equals(this.containedXssThreat, stringAutomaticThreatDetection.containedXssThreat) &&
        Objects.equals(this.containedXxeThreat, stringAutomaticThreatDetection.containedXxeThreat) &&
        Objects.equals(this.containedSqlInjectionThreat, stringAutomaticThreatDetection.containedSqlInjectionThreat) &&
        Objects.equals(this.containedSsrfThreat, stringAutomaticThreatDetection.containedSsrfThreat) &&
        Objects.equals(this.isXML, stringAutomaticThreatDetection.isXML) &&
        Objects.equals(this.isJSON, stringAutomaticThreatDetection.isJSON) &&
        Objects.equals(this.isURL, stringAutomaticThreatDetection.isURL) &&
        Objects.equals(this.originalInput, stringAutomaticThreatDetection.originalInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cleanResult, containedJsonInsecureDeserializationAttack, containedXssThreat, containedXxeThreat, containedSqlInjectionThreat, containedSsrfThreat, isXML, isJSON, isURL, originalInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringAutomaticThreatDetection {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    containedJsonInsecureDeserializationAttack: ").append(toIndentedString(containedJsonInsecureDeserializationAttack)).append("\n");
    sb.append("    containedXssThreat: ").append(toIndentedString(containedXssThreat)).append("\n");
    sb.append("    containedXxeThreat: ").append(toIndentedString(containedXxeThreat)).append("\n");
    sb.append("    containedSqlInjectionThreat: ").append(toIndentedString(containedSqlInjectionThreat)).append("\n");
    sb.append("    containedSsrfThreat: ").append(toIndentedString(containedSsrfThreat)).append("\n");
    sb.append("    isXML: ").append(toIndentedString(isXML)).append("\n");
    sb.append("    isJSON: ").append(toIndentedString(isJSON)).append("\n");
    sb.append("    isURL: ").append(toIndentedString(isURL)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
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

