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
import org.threeten.bp.OffsetDateTime;

/**
 * Result of a WHOIS operation
 */
@ApiModel(description = "Result of a WHOIS operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-19T15:21:48.649-07:00")
public class WhoisResponse {
  @SerializedName("ValidDomain")
  private Boolean validDomain = null;

  @SerializedName("WhoisServer")
  private String whoisServer = null;

  @SerializedName("RawTextRecord")
  private String rawTextRecord = null;

  @SerializedName("CreatedDt")
  private OffsetDateTime createdDt = null;

  public WhoisResponse validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain is valid, false if it is not
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain is valid, false if it is not")
  public Boolean isValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }

  public WhoisResponse whoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
    return this;
  }

   /**
   * Server used to lookup WHOIS information (may change based on lookup).
   * @return whoisServer
  **/
  @ApiModelProperty(value = "Server used to lookup WHOIS information (may change based on lookup).")
  public String getWhoisServer() {
    return whoisServer;
  }

  public void setWhoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
  }

  public WhoisResponse rawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
    return this;
  }

   /**
   * WHOIS raw text record
   * @return rawTextRecord
  **/
  @ApiModelProperty(value = "WHOIS raw text record")
  public String getRawTextRecord() {
    return rawTextRecord;
  }

  public void setRawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
  }

  public WhoisResponse createdDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
    return this;
  }

   /**
   * Creation date for the record
   * @return createdDt
  **/
  @ApiModelProperty(value = "Creation date for the record")
  public OffsetDateTime getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhoisResponse whoisResponse = (WhoisResponse) o;
    return Objects.equals(this.validDomain, whoisResponse.validDomain) &&
        Objects.equals(this.whoisServer, whoisResponse.whoisServer) &&
        Objects.equals(this.rawTextRecord, whoisResponse.rawTextRecord) &&
        Objects.equals(this.createdDt, whoisResponse.createdDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain, whoisServer, rawTextRecord, createdDt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoisResponse {\n");
    
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    whoisServer: ").append(toIndentedString(whoisServer)).append("\n");
    sb.append("    rawTextRecord: ").append(toIndentedString(rawTextRecord)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
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

