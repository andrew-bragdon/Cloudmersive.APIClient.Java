/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Definition of a form field for OCR data extraction from images
 */
@ApiModel(description = "Definition of a form field for OCR data extraction from images")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-18T23:02:38.635-07:00")
public class FormFieldDefinition {
  @SerializedName("FieldID")
  private String fieldID = null;

  @SerializedName("LeftAnchor")
  private String leftAnchor = null;

  @SerializedName("TopAnchor")
  private String topAnchor = null;

  @SerializedName("AnchorMode")
  private String anchorMode = null;

  @SerializedName("DataType")
  private String dataType = null;

  @SerializedName("TargetDigitCount")
  private Integer targetDigitCount = null;

  @SerializedName("MinimumCharacterCount")
  private Integer minimumCharacterCount = null;

  @SerializedName("AllowNumericDigits")
  private Boolean allowNumericDigits = null;

  @SerializedName("VerticalAlignmentType")
  private String verticalAlignmentType = null;

  @SerializedName("HorizontalAlignmentType")
  private String horizontalAlignmentType = null;

  @SerializedName("TargetFieldWidth_Relative")
  private Double targetFieldWidthRelative = null;

  @SerializedName("TargetFieldHeight_Relative")
  private Double targetFieldHeightRelative = null;

  @SerializedName("Ignore")
  private List<String> ignore = null;

  public FormFieldDefinition fieldID(String fieldID) {
    this.fieldID = fieldID;
    return this;
  }

   /**
   * Get fieldID
   * @return fieldID
  **/
  @ApiModelProperty(value = "")
  public String getFieldID() {
    return fieldID;
  }

  public void setFieldID(String fieldID) {
    this.fieldID = fieldID;
  }

  public FormFieldDefinition leftAnchor(String leftAnchor) {
    this.leftAnchor = leftAnchor;
    return this;
  }

   /**
   * Get leftAnchor
   * @return leftAnchor
  **/
  @ApiModelProperty(value = "")
  public String getLeftAnchor() {
    return leftAnchor;
  }

  public void setLeftAnchor(String leftAnchor) {
    this.leftAnchor = leftAnchor;
  }

  public FormFieldDefinition topAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
    return this;
  }

   /**
   * Get topAnchor
   * @return topAnchor
  **/
  @ApiModelProperty(value = "")
  public String getTopAnchor() {
    return topAnchor;
  }

  public void setTopAnchor(String topAnchor) {
    this.topAnchor = topAnchor;
  }

  public FormFieldDefinition anchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
    return this;
  }

   /**
   * Get anchorMode
   * @return anchorMode
  **/
  @ApiModelProperty(value = "")
  public String getAnchorMode() {
    return anchorMode;
  }

  public void setAnchorMode(String anchorMode) {
    this.anchorMode = anchorMode;
  }

  public FormFieldDefinition dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public FormFieldDefinition targetDigitCount(Integer targetDigitCount) {
    this.targetDigitCount = targetDigitCount;
    return this;
  }

   /**
   * Get targetDigitCount
   * @return targetDigitCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTargetDigitCount() {
    return targetDigitCount;
  }

  public void setTargetDigitCount(Integer targetDigitCount) {
    this.targetDigitCount = targetDigitCount;
  }

  public FormFieldDefinition minimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
    return this;
  }

   /**
   * Get minimumCharacterCount
   * @return minimumCharacterCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumCharacterCount() {
    return minimumCharacterCount;
  }

  public void setMinimumCharacterCount(Integer minimumCharacterCount) {
    this.minimumCharacterCount = minimumCharacterCount;
  }

  public FormFieldDefinition allowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
    return this;
  }

   /**
   * Get allowNumericDigits
   * @return allowNumericDigits
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowNumericDigits() {
    return allowNumericDigits;
  }

  public void setAllowNumericDigits(Boolean allowNumericDigits) {
    this.allowNumericDigits = allowNumericDigits;
  }

  public FormFieldDefinition verticalAlignmentType(String verticalAlignmentType) {
    this.verticalAlignmentType = verticalAlignmentType;
    return this;
  }

   /**
   * Get verticalAlignmentType
   * @return verticalAlignmentType
  **/
  @ApiModelProperty(value = "")
  public String getVerticalAlignmentType() {
    return verticalAlignmentType;
  }

  public void setVerticalAlignmentType(String verticalAlignmentType) {
    this.verticalAlignmentType = verticalAlignmentType;
  }

  public FormFieldDefinition horizontalAlignmentType(String horizontalAlignmentType) {
    this.horizontalAlignmentType = horizontalAlignmentType;
    return this;
  }

   /**
   * Get horizontalAlignmentType
   * @return horizontalAlignmentType
  **/
  @ApiModelProperty(value = "")
  public String getHorizontalAlignmentType() {
    return horizontalAlignmentType;
  }

  public void setHorizontalAlignmentType(String horizontalAlignmentType) {
    this.horizontalAlignmentType = horizontalAlignmentType;
  }

  public FormFieldDefinition targetFieldWidthRelative(Double targetFieldWidthRelative) {
    this.targetFieldWidthRelative = targetFieldWidthRelative;
    return this;
  }

   /**
   * Get targetFieldWidthRelative
   * @return targetFieldWidthRelative
  **/
  @ApiModelProperty(value = "")
  public Double getTargetFieldWidthRelative() {
    return targetFieldWidthRelative;
  }

  public void setTargetFieldWidthRelative(Double targetFieldWidthRelative) {
    this.targetFieldWidthRelative = targetFieldWidthRelative;
  }

  public FormFieldDefinition targetFieldHeightRelative(Double targetFieldHeightRelative) {
    this.targetFieldHeightRelative = targetFieldHeightRelative;
    return this;
  }

   /**
   * Get targetFieldHeightRelative
   * @return targetFieldHeightRelative
  **/
  @ApiModelProperty(value = "")
  public Double getTargetFieldHeightRelative() {
    return targetFieldHeightRelative;
  }

  public void setTargetFieldHeightRelative(Double targetFieldHeightRelative) {
    this.targetFieldHeightRelative = targetFieldHeightRelative;
  }

  public FormFieldDefinition ignore(List<String> ignore) {
    this.ignore = ignore;
    return this;
  }

  public FormFieldDefinition addIgnoreItem(String ignoreItem) {
    if (this.ignore == null) {
      this.ignore = new ArrayList<String>();
    }
    this.ignore.add(ignoreItem);
    return this;
  }

   /**
   * Get ignore
   * @return ignore
  **/
  @ApiModelProperty(value = "")
  public List<String> getIgnore() {
    return ignore;
  }

  public void setIgnore(List<String> ignore) {
    this.ignore = ignore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldDefinition formFieldDefinition = (FormFieldDefinition) o;
    return Objects.equals(this.fieldID, formFieldDefinition.fieldID) &&
        Objects.equals(this.leftAnchor, formFieldDefinition.leftAnchor) &&
        Objects.equals(this.topAnchor, formFieldDefinition.topAnchor) &&
        Objects.equals(this.anchorMode, formFieldDefinition.anchorMode) &&
        Objects.equals(this.dataType, formFieldDefinition.dataType) &&
        Objects.equals(this.targetDigitCount, formFieldDefinition.targetDigitCount) &&
        Objects.equals(this.minimumCharacterCount, formFieldDefinition.minimumCharacterCount) &&
        Objects.equals(this.allowNumericDigits, formFieldDefinition.allowNumericDigits) &&
        Objects.equals(this.verticalAlignmentType, formFieldDefinition.verticalAlignmentType) &&
        Objects.equals(this.horizontalAlignmentType, formFieldDefinition.horizontalAlignmentType) &&
        Objects.equals(this.targetFieldWidthRelative, formFieldDefinition.targetFieldWidthRelative) &&
        Objects.equals(this.targetFieldHeightRelative, formFieldDefinition.targetFieldHeightRelative) &&
        Objects.equals(this.ignore, formFieldDefinition.ignore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldID, leftAnchor, topAnchor, anchorMode, dataType, targetDigitCount, minimumCharacterCount, allowNumericDigits, verticalAlignmentType, horizontalAlignmentType, targetFieldWidthRelative, targetFieldHeightRelative, ignore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldDefinition {\n");
    
    sb.append("    fieldID: ").append(toIndentedString(fieldID)).append("\n");
    sb.append("    leftAnchor: ").append(toIndentedString(leftAnchor)).append("\n");
    sb.append("    topAnchor: ").append(toIndentedString(topAnchor)).append("\n");
    sb.append("    anchorMode: ").append(toIndentedString(anchorMode)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    targetDigitCount: ").append(toIndentedString(targetDigitCount)).append("\n");
    sb.append("    minimumCharacterCount: ").append(toIndentedString(minimumCharacterCount)).append("\n");
    sb.append("    allowNumericDigits: ").append(toIndentedString(allowNumericDigits)).append("\n");
    sb.append("    verticalAlignmentType: ").append(toIndentedString(verticalAlignmentType)).append("\n");
    sb.append("    horizontalAlignmentType: ").append(toIndentedString(horizontalAlignmentType)).append("\n");
    sb.append("    targetFieldWidthRelative: ").append(toIndentedString(targetFieldWidthRelative)).append("\n");
    sb.append("    targetFieldHeightRelative: ").append(toIndentedString(targetFieldHeightRelative)).append("\n");
    sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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

