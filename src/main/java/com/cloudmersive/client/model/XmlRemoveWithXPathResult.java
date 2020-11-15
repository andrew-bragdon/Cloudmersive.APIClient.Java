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
import java.util.ArrayList;
import java.util.List;

/**
 * Result of performing a filter operation on XML input using XPath
 */
@ApiModel(description = "Result of performing a filter operation on XML input using XPath")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-14T18:36:18.122-08:00")
public class XmlRemoveWithXPathResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ResultingXmlDocument")
  private String resultingXmlDocument = null;

  @SerializedName("XmlNodesRemoved")
  private List<String> xmlNodesRemoved = null;

  @SerializedName("NodesRemovedCount")
  private Integer nodesRemovedCount = null;

  public XmlRemoveWithXPathResult successful(Boolean successful) {
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

  public XmlRemoveWithXPathResult resultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
    return this;
  }

   /**
   * Resulting, modified XML document with matching nodes removed as a string
   * @return resultingXmlDocument
  **/
  @ApiModelProperty(value = "Resulting, modified XML document with matching nodes removed as a string")
  public String getResultingXmlDocument() {
    return resultingXmlDocument;
  }

  public void setResultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
  }

  public XmlRemoveWithXPathResult xmlNodesRemoved(List<String> xmlNodesRemoved) {
    this.xmlNodesRemoved = xmlNodesRemoved;
    return this;
  }

  public XmlRemoveWithXPathResult addXmlNodesRemovedItem(String xmlNodesRemovedItem) {
    if (this.xmlNodesRemoved == null) {
      this.xmlNodesRemoved = new ArrayList<String>();
    }
    this.xmlNodesRemoved.add(xmlNodesRemovedItem);
    return this;
  }

   /**
   * Matching selected XML nodes as strings
   * @return xmlNodesRemoved
  **/
  @ApiModelProperty(value = "Matching selected XML nodes as strings")
  public List<String> getXmlNodesRemoved() {
    return xmlNodesRemoved;
  }

  public void setXmlNodesRemoved(List<String> xmlNodesRemoved) {
    this.xmlNodesRemoved = xmlNodesRemoved;
  }

  public XmlRemoveWithXPathResult nodesRemovedCount(Integer nodesRemovedCount) {
    this.nodesRemovedCount = nodesRemovedCount;
    return this;
  }

   /**
   * Count of the matching results
   * @return nodesRemovedCount
  **/
  @ApiModelProperty(value = "Count of the matching results")
  public Integer getNodesRemovedCount() {
    return nodesRemovedCount;
  }

  public void setNodesRemovedCount(Integer nodesRemovedCount) {
    this.nodesRemovedCount = nodesRemovedCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlRemoveWithXPathResult xmlRemoveWithXPathResult = (XmlRemoveWithXPathResult) o;
    return Objects.equals(this.successful, xmlRemoveWithXPathResult.successful) &&
        Objects.equals(this.resultingXmlDocument, xmlRemoveWithXPathResult.resultingXmlDocument) &&
        Objects.equals(this.xmlNodesRemoved, xmlRemoveWithXPathResult.xmlNodesRemoved) &&
        Objects.equals(this.nodesRemovedCount, xmlRemoveWithXPathResult.nodesRemovedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXmlDocument, xmlNodesRemoved, nodesRemovedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlRemoveWithXPathResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXmlDocument: ").append(toIndentedString(resultingXmlDocument)).append("\n");
    sb.append("    xmlNodesRemoved: ").append(toIndentedString(xmlNodesRemoved)).append("\n");
    sb.append("    nodesRemovedCount: ").append(toIndentedString(nodesRemovedCount)).append("\n");
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

