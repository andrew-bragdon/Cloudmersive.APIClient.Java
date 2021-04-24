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
 * Result of performing an SQL Injection protection operation
 */
@ApiModel(description = "Result of performing an SQL Injection protection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-24T10:26:08.607-07:00")
public class SqlInjectionDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainedSqlInjectionAttack")
  private Boolean containedSqlInjectionAttack = null;

  @SerializedName("OriginalInput")
  private String originalInput = null;

  public SqlInjectionDetectionResult successful(Boolean successful) {
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

  public SqlInjectionDetectionResult containedSqlInjectionAttack(Boolean containedSqlInjectionAttack) {
    this.containedSqlInjectionAttack = containedSqlInjectionAttack;
    return this;
  }

   /**
   * True if the input contained SQL Injection attacks, false otherwise
   * @return containedSqlInjectionAttack
  **/
  @ApiModelProperty(value = "True if the input contained SQL Injection attacks, false otherwise")
  public Boolean isContainedSqlInjectionAttack() {
    return containedSqlInjectionAttack;
  }

  public void setContainedSqlInjectionAttack(Boolean containedSqlInjectionAttack) {
    this.containedSqlInjectionAttack = containedSqlInjectionAttack;
  }

  public SqlInjectionDetectionResult originalInput(String originalInput) {
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
    SqlInjectionDetectionResult sqlInjectionDetectionResult = (SqlInjectionDetectionResult) o;
    return Objects.equals(this.successful, sqlInjectionDetectionResult.successful) &&
        Objects.equals(this.containedSqlInjectionAttack, sqlInjectionDetectionResult.containedSqlInjectionAttack) &&
        Objects.equals(this.originalInput, sqlInjectionDetectionResult.originalInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedSqlInjectionAttack, originalInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlInjectionDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedSqlInjectionAttack: ").append(toIndentedString(containedSqlInjectionAttack)).append("\n");
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

