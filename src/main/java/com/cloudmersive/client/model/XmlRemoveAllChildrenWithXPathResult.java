/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Result of performing a remove all child nodes operation on XML input using XPath
 */
@ApiModel(description = "Result of performing a remove all child nodes operation on XML input using XPath")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-01T12:52:36.787-07:00")
public class XmlRemoveAllChildrenWithXPathResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ResultingXmlDocument")
  private String resultingXmlDocument = null;

  @SerializedName("NodesEditedCount")
  private Integer nodesEditedCount = null;

  public XmlRemoveAllChildrenWithXPathResult successful(Boolean successful) {
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

  public XmlRemoveAllChildrenWithXPathResult resultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
    return this;
  }

   /**
   * Resulting, modified XML document
   * @return resultingXmlDocument
  **/
  @ApiModelProperty(value = "Resulting, modified XML document")
  public String getResultingXmlDocument() {
    return resultingXmlDocument;
  }

  public void setResultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
  }

  public XmlRemoveAllChildrenWithXPathResult nodesEditedCount(Integer nodesEditedCount) {
    this.nodesEditedCount = nodesEditedCount;
    return this;
  }

   /**
   * Count of the matching results
   * @return nodesEditedCount
  **/
  @ApiModelProperty(value = "Count of the matching results")
  public Integer getNodesEditedCount() {
    return nodesEditedCount;
  }

  public void setNodesEditedCount(Integer nodesEditedCount) {
    this.nodesEditedCount = nodesEditedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlRemoveAllChildrenWithXPathResult xmlRemoveAllChildrenWithXPathResult = (XmlRemoveAllChildrenWithXPathResult) o;
    return Objects.equals(this.successful, xmlRemoveAllChildrenWithXPathResult.successful) &&
        Objects.equals(this.resultingXmlDocument, xmlRemoveAllChildrenWithXPathResult.resultingXmlDocument) &&
        Objects.equals(this.nodesEditedCount, xmlRemoveAllChildrenWithXPathResult.nodesEditedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXmlDocument, nodesEditedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlRemoveAllChildrenWithXPathResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXmlDocument: ").append(toIndentedString(resultingXmlDocument)).append("\n");
    sb.append("    nodesEditedCount: ").append(toIndentedString(nodesEditedCount)).append("\n");
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

