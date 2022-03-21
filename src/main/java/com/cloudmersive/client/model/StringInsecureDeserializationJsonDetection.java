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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-20T11:07:42.845-07:00")
public class StringInsecureDeserializationJsonDetection {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainedJsonInsecureDeserializationAttack")
  private Boolean containedJsonInsecureDeserializationAttack = null;

  @SerializedName("OriginalInput")
  private String originalInput = null;

  public StringInsecureDeserializationJsonDetection successful(Boolean successful) {
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

  public StringInsecureDeserializationJsonDetection containedJsonInsecureDeserializationAttack(Boolean containedJsonInsecureDeserializationAttack) {
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

  public StringInsecureDeserializationJsonDetection originalInput(String originalInput) {
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
    StringInsecureDeserializationJsonDetection stringInsecureDeserializationJsonDetection = (StringInsecureDeserializationJsonDetection) o;
    return Objects.equals(this.successful, stringInsecureDeserializationJsonDetection.successful) &&
        Objects.equals(this.containedJsonInsecureDeserializationAttack, stringInsecureDeserializationJsonDetection.containedJsonInsecureDeserializationAttack) &&
        Objects.equals(this.originalInput, stringInsecureDeserializationJsonDetection.originalInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedJsonInsecureDeserializationAttack, originalInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringInsecureDeserializationJsonDetection {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedJsonInsecureDeserializationAttack: ").append(toIndentedString(containedJsonInsecureDeserializationAttack)).append("\n");
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

