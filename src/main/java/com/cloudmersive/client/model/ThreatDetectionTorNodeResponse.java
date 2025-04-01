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
 * Result of performing a Tor node check on an IP address
 */
@ApiModel(description = "Result of performing a Tor node check on an IP address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:07:56.783-07:00")
public class ThreatDetectionTorNodeResponse {
  @SerializedName("IsTorNode")
  private Boolean isTorNode = null;

  public ThreatDetectionTorNodeResponse isTorNode(Boolean isTorNode) {
    this.isTorNode = isTorNode;
    return this;
  }

   /**
   * True if the input IP address is a Tor exit node, false otherwise
   * @return isTorNode
  **/
  @ApiModelProperty(value = "True if the input IP address is a Tor exit node, false otherwise")
  public Boolean isIsTorNode() {
    return isTorNode;
  }

  public void setIsTorNode(Boolean isTorNode) {
    this.isTorNode = isTorNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatDetectionTorNodeResponse threatDetectionTorNodeResponse = (ThreatDetectionTorNodeResponse) o;
    return Objects.equals(this.isTorNode, threatDetectionTorNodeResponse.isTorNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isTorNode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatDetectionTorNodeResponse {\n");
    
    sb.append("    isTorNode: ").append(toIndentedString(isTorNode)).append("\n");
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

