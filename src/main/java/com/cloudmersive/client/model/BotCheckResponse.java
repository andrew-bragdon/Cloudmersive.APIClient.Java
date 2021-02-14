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
 * Result of performing a Bot check on an IP address
 */
@ApiModel(description = "Result of performing a Bot check on an IP address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-14T11:46:44.593-08:00")
public class BotCheckResponse {
  @SerializedName("IsBot")
  private Boolean isBot = null;

  public BotCheckResponse isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

   /**
   * True if the input IP address is a Bot or Robot, false otherwise
   * @return isBot
  **/
  @ApiModelProperty(value = "True if the input IP address is a Bot or Robot, false otherwise")
  public Boolean isIsBot() {
    return isBot;
  }

  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BotCheckResponse botCheckResponse = (BotCheckResponse) o;
    return Objects.equals(this.isBot, botCheckResponse.isBot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotCheckResponse {\n");
    
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
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

