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
 * Result of performing a Bot check on an IP address
 */
@ApiModel(description = "Result of performing a Bot check on an IP address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-01T16:40:12.576-08:00")
public class ThreatDetectionBotCheckResponse {
  @SerializedName("IsBot")
  private Boolean isBot = null;

  public ThreatDetectionBotCheckResponse isBot(Boolean isBot) {
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
    ThreatDetectionBotCheckResponse threatDetectionBotCheckResponse = (ThreatDetectionBotCheckResponse) o;
    return Objects.equals(this.isBot, threatDetectionBotCheckResponse.isBot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatDetectionBotCheckResponse {\n");
    
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

