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
import org.threeten.bp.OffsetDateTime;

/**
 * Name and value pair for a custom-defined DOCX metadata property
 */
@ApiModel(description = "Name and value pair for a custom-defined DOCX metadata property")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-04T21:44:29.559-07:00")
public class DocxMetadataCustomProperty {
  @SerializedName("PropertyName")
  private String propertyName = null;

  @SerializedName("PropertyDataType")
  private String propertyDataType = null;

  @SerializedName("StringValue")
  private String stringValue = null;

  @SerializedName("IntegerValue")
  private Long integerValue = null;

  @SerializedName("DoubleValue")
  private Double doubleValue = null;

  @SerializedName("DateValue")
  private OffsetDateTime dateValue = null;

  public DocxMetadataCustomProperty propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Name of the property
   * @return propertyName
  **/
  @ApiModelProperty(value = "Name of the property")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public DocxMetadataCustomProperty propertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
    return this;
  }

   /**
   * Data type of the property; possible values are \&quot;string\&quot;, \&quot;integer\&quot;, \&quot;double\&quot; or \&quot;date\&quot;
   * @return propertyDataType
  **/
  @ApiModelProperty(value = "Data type of the property; possible values are \"string\", \"integer\", \"double\" or \"date\"")
  public String getPropertyDataType() {
    return propertyDataType;
  }

  public void setPropertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
  }

  public DocxMetadataCustomProperty stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * If the property is of a string data type, then provides the string value if available
   * @return stringValue
  **/
  @ApiModelProperty(value = "If the property is of a string data type, then provides the string value if available")
  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public DocxMetadataCustomProperty integerValue(Long integerValue) {
    this.integerValue = integerValue;
    return this;
  }

   /**
   * If the property is of a integer data type, then provides the integer value if available
   * @return integerValue
  **/
  @ApiModelProperty(value = "If the property is of a integer data type, then provides the integer value if available")
  public Long getIntegerValue() {
    return integerValue;
  }

  public void setIntegerValue(Long integerValue) {
    this.integerValue = integerValue;
  }

  public DocxMetadataCustomProperty doubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

   /**
   * If the property is of a double floating point data type, then provides the double value if available
   * @return doubleValue
  **/
  @ApiModelProperty(value = "If the property is of a double floating point data type, then provides the double value if available")
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }

  public DocxMetadataCustomProperty dateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
    return this;
  }

   /**
   * If the property is of a date time data type, then provides the date time value if available
   * @return dateValue
  **/
  @ApiModelProperty(value = "If the property is of a date time data type, then provides the date time value if available")
  public OffsetDateTime getDateValue() {
    return dateValue;
  }

  public void setDateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxMetadataCustomProperty docxMetadataCustomProperty = (DocxMetadataCustomProperty) o;
    return Objects.equals(this.propertyName, docxMetadataCustomProperty.propertyName) &&
        Objects.equals(this.propertyDataType, docxMetadataCustomProperty.propertyDataType) &&
        Objects.equals(this.stringValue, docxMetadataCustomProperty.stringValue) &&
        Objects.equals(this.integerValue, docxMetadataCustomProperty.integerValue) &&
        Objects.equals(this.doubleValue, docxMetadataCustomProperty.doubleValue) &&
        Objects.equals(this.dateValue, docxMetadataCustomProperty.dateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, propertyDataType, stringValue, integerValue, doubleValue, dateValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxMetadataCustomProperty {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyDataType: ").append(toIndentedString(propertyDataType)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    integerValue: ").append(toIndentedString(integerValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
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

