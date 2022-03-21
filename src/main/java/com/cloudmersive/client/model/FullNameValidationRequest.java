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
 * Request to validate a full name string
 */
@ApiModel(description = "Request to validate a full name string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-20T11:07:19.408-07:00")
public class FullNameValidationRequest {
  @SerializedName("FullNameString")
  private String fullNameString = null;

  public FullNameValidationRequest fullNameString(String fullNameString) {
    this.fullNameString = fullNameString;
    return this;
  }

   /**
   * Full name to process as a free-form string; supports many components such as First Name, Middle Name, Last Name, Title, Nickname, Suffix, and Display Name
   * @return fullNameString
  **/
  @ApiModelProperty(value = "Full name to process as a free-form string; supports many components such as First Name, Middle Name, Last Name, Title, Nickname, Suffix, and Display Name")
  public String getFullNameString() {
    return fullNameString;
  }

  public void setFullNameString(String fullNameString) {
    this.fullNameString = fullNameString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullNameValidationRequest fullNameValidationRequest = (FullNameValidationRequest) o;
    return Objects.equals(this.fullNameString, fullNameValidationRequest.fullNameString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullNameString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullNameValidationRequest {\n");
    
    sb.append("    fullNameString: ").append(toIndentedString(fullNameString)).append("\n");
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

