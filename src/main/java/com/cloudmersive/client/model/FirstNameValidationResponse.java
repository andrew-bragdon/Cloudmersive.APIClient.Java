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
 * Result of a first name validation operation
 */
@ApiModel(description = "Result of a first name validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-25T00:32:19.497-07:00")
public class FirstNameValidationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ValidationResult")
  private String validationResult = null;

  public FirstNameValidationResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the validation operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the validation operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FirstNameValidationResponse validationResult(String validationResult) {
    this.validationResult = validationResult;
    return this;
  }

   /**
   * Possible values are: ValidFirstName, ValidUnknownFirstName, InvalidSpamInput, InvalidCharacters, InvalidEmpty
   * @return validationResult
  **/
  @ApiModelProperty(value = "Possible values are: ValidFirstName, ValidUnknownFirstName, InvalidSpamInput, InvalidCharacters, InvalidEmpty")
  public String getValidationResult() {
    return validationResult;
  }

  public void setValidationResult(String validationResult) {
    this.validationResult = validationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstNameValidationResponse firstNameValidationResponse = (FirstNameValidationResponse) o;
    return Objects.equals(this.successful, firstNameValidationResponse.successful) &&
        Objects.equals(this.validationResult, firstNameValidationResponse.validationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, validationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstNameValidationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
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

