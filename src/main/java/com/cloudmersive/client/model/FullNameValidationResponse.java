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
 * Result of a full name validation operation
 */
@ApiModel(description = "Result of a full name validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-29T22:36:07.422-07:00")
public class FullNameValidationResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ValidationResult_FirstName")
  private String validationResultFirstName = null;

  @SerializedName("ValidationResult_LastName")
  private String validationResultLastName = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("MiddleName")
  private String middleName = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("NickName")
  private String nickName = null;

  @SerializedName("Suffix")
  private String suffix = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  public FullNameValidationResponse successful(Boolean successful) {
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

  public FullNameValidationResponse validationResultFirstName(String validationResultFirstName) {
    this.validationResultFirstName = validationResultFirstName;
    return this;
  }

   /**
   * Possible values are: ValidFirstName, ValidUnknownFirstName, InvalidSpamInput, InvalidCharacters, InvalidEmpty
   * @return validationResultFirstName
  **/
  @ApiModelProperty(value = "Possible values are: ValidFirstName, ValidUnknownFirstName, InvalidSpamInput, InvalidCharacters, InvalidEmpty")
  public String getValidationResultFirstName() {
    return validationResultFirstName;
  }

  public void setValidationResultFirstName(String validationResultFirstName) {
    this.validationResultFirstName = validationResultFirstName;
  }

  public FullNameValidationResponse validationResultLastName(String validationResultLastName) {
    this.validationResultLastName = validationResultLastName;
    return this;
  }

   /**
   * Possible values are: ValidLastName, ValidUnknownLastName, InvalidSpamInput, InvalidCharacters, InvalidEmpty
   * @return validationResultLastName
  **/
  @ApiModelProperty(value = "Possible values are: ValidLastName, ValidUnknownLastName, InvalidSpamInput, InvalidCharacters, InvalidEmpty")
  public String getValidationResultLastName() {
    return validationResultLastName;
  }

  public void setValidationResultLastName(String validationResultLastName) {
    this.validationResultLastName = validationResultLastName;
  }

  public FullNameValidationResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The person&#39;s title (if supplied), e.g. \&quot;Mr.\&quot; or \&quot;Ms.\&quot;
   * @return title
  **/
  @ApiModelProperty(value = "The person's title (if supplied), e.g. \"Mr.\" or \"Ms.\"")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FullNameValidationResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name (given name)
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name (given name)")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FullNameValidationResponse middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name(s); if there are multiple names they will be separated by spaces
   * @return middleName
  **/
  @ApiModelProperty(value = "The middle name(s); if there are multiple names they will be separated by spaces")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public FullNameValidationResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name (surname)
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name (surname)")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public FullNameValidationResponse nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * Nickname (if supplied)
   * @return nickName
  **/
  @ApiModelProperty(value = "Nickname (if supplied)")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public FullNameValidationResponse suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix to the name, e.g. \&quot;Jr.\&quot; or \&quot;Sr.\&quot;
   * @return suffix
  **/
  @ApiModelProperty(value = "Suffix to the name, e.g. \"Jr.\" or \"Sr.\"")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public FullNameValidationResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The full display name of the name
   * @return displayName
  **/
  @ApiModelProperty(value = "The full display name of the name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullNameValidationResponse fullNameValidationResponse = (FullNameValidationResponse) o;
    return Objects.equals(this.successful, fullNameValidationResponse.successful) &&
        Objects.equals(this.validationResultFirstName, fullNameValidationResponse.validationResultFirstName) &&
        Objects.equals(this.validationResultLastName, fullNameValidationResponse.validationResultLastName) &&
        Objects.equals(this.title, fullNameValidationResponse.title) &&
        Objects.equals(this.firstName, fullNameValidationResponse.firstName) &&
        Objects.equals(this.middleName, fullNameValidationResponse.middleName) &&
        Objects.equals(this.lastName, fullNameValidationResponse.lastName) &&
        Objects.equals(this.nickName, fullNameValidationResponse.nickName) &&
        Objects.equals(this.suffix, fullNameValidationResponse.suffix) &&
        Objects.equals(this.displayName, fullNameValidationResponse.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, validationResultFirstName, validationResultLastName, title, firstName, middleName, lastName, nickName, suffix, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullNameValidationResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    validationResultFirstName: ").append(toIndentedString(validationResultFirstName)).append("\n");
    sb.append("    validationResultLastName: ").append(toIndentedString(validationResultLastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

