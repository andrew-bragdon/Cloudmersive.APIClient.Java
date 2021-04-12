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
 * Individual item to protect for XSS
 */
@ApiModel(description = "Individual item to protect for XSS")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-11T18:03:37.657-07:00")
public class XssProtectionRequestItem {
  @SerializedName("InputText")
  private String inputText = null;

  public XssProtectionRequestItem inputText(String inputText) {
    this.inputText = inputText;
    return this;
  }

   /**
   * Individual input text item to protect from XSS
   * @return inputText
  **/
  @ApiModelProperty(value = "Individual input text item to protect from XSS")
  public String getInputText() {
    return inputText;
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionRequestItem xssProtectionRequestItem = (XssProtectionRequestItem) o;
    return Objects.equals(this.inputText, xssProtectionRequestItem.inputText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionRequestItem {\n");
    
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
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

