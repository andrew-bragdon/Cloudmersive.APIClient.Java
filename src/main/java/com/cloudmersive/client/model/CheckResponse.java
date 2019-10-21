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
 * Result of a validation operation
 */
@ApiModel(description = "Result of a validation operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-20T19:53:03.371-07:00")
public class CheckResponse {
  @SerializedName("ValidDomain")
  private Boolean validDomain = null;

  public CheckResponse validDomain(Boolean validDomain) {
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain name was valid, false if it is not
   * @return validDomain
  **/
  @ApiModelProperty(value = "True if the domain name was valid, false if it is not")
  public Boolean isValidDomain() {
    return validDomain;
  }

  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResponse checkResponse = (CheckResponse) o;
    return Objects.equals(this.validDomain, checkResponse.validDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResponse {\n");
    
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
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

