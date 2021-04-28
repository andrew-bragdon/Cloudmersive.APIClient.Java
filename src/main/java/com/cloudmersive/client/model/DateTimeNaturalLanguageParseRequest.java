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
 * Input parameter to a date time parsing request
 */
@ApiModel(description = "Input parameter to a date time parsing request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:28.792-07:00")
public class DateTimeNaturalLanguageParseRequest {
  @SerializedName("RawDateTimeInput")
  private String rawDateTimeInput = null;

  public DateTimeNaturalLanguageParseRequest rawDateTimeInput(String rawDateTimeInput) {
    this.rawDateTimeInput = rawDateTimeInput;
    return this;
  }

   /**
   * Raw string input of a natural language-formatted date and time for parsing
   * @return rawDateTimeInput
  **/
  @ApiModelProperty(value = "Raw string input of a natural language-formatted date and time for parsing")
  public String getRawDateTimeInput() {
    return rawDateTimeInput;
  }

  public void setRawDateTimeInput(String rawDateTimeInput) {
    this.rawDateTimeInput = rawDateTimeInput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeNaturalLanguageParseRequest dateTimeNaturalLanguageParseRequest = (DateTimeNaturalLanguageParseRequest) o;
    return Objects.equals(this.rawDateTimeInput, dateTimeNaturalLanguageParseRequest.rawDateTimeInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDateTimeInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeNaturalLanguageParseRequest {\n");
    
    sb.append("    rawDateTimeInput: ").append(toIndentedString(rawDateTimeInput)).append("\n");
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

