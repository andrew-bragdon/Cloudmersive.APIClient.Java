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
import com.cloudmersive.client.model.ExifValue;
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
 * Result of running a get-info operation on an image
 */
@ApiModel(description = "Result of running a get-info operation on an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-18T23:23:18.353-07:00")
public class GetImageInfoResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ColorSpace")
  private String colorSpace = null;

  @SerializedName("ColorType")
  private String colorType = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("CompressionLevel")
  private Integer compressionLevel = null;

  @SerializedName("ImageHashSignature")
  private String imageHashSignature = null;

  @SerializedName("HasTransparency")
  private Boolean hasTransparency = null;

  @SerializedName("MimeType")
  private String mimeType = null;

  @SerializedName("ImageFormat")
  private String imageFormat = null;

  @SerializedName("DPIUnit")
  private String dpIUnit = null;

  @SerializedName("DPI")
  private Double DPI = null;

  @SerializedName("ColorCount")
  private Integer colorCount = null;

  @SerializedName("BitDepth")
  private Integer bitDepth = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("ExifProfileName")
  private String exifProfileName = null;

  @SerializedName("ExifValues")
  private List<ExifValue> exifValues = null;

  public GetImageInfoResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetImageInfoResult colorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

   /**
   * Color space of the image
   * @return colorSpace
  **/
  @ApiModelProperty(value = "Color space of the image")
  public String getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }

  public GetImageInfoResult colorType(String colorType) {
    this.colorType = colorType;
    return this;
  }

   /**
   * Color type of the image
   * @return colorType
  **/
  @ApiModelProperty(value = "Color type of the image")
  public String getColorType() {
    return colorType;
  }

  public void setColorType(String colorType) {
    this.colorType = colorType;
  }

  public GetImageInfoResult width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the image
   * @return width
  **/
  @ApiModelProperty(value = "Width in pixels of the image")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public GetImageInfoResult height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the image
   * @return height
  **/
  @ApiModelProperty(value = "Height in pixels of the image")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public GetImageInfoResult compressionLevel(Integer compressionLevel) {
    this.compressionLevel = compressionLevel;
    return this;
  }

   /**
   * Compression level value from 0 (lowest quality) to 100 (highest quality)
   * @return compressionLevel
  **/
  @ApiModelProperty(value = "Compression level value from 0 (lowest quality) to 100 (highest quality)")
  public Integer getCompressionLevel() {
    return compressionLevel;
  }

  public void setCompressionLevel(Integer compressionLevel) {
    this.compressionLevel = compressionLevel;
  }

  public GetImageInfoResult imageHashSignature(String imageHashSignature) {
    this.imageHashSignature = imageHashSignature;
    return this;
  }

   /**
   * SHA256 hash signature of the image
   * @return imageHashSignature
  **/
  @ApiModelProperty(value = "SHA256 hash signature of the image")
  public String getImageHashSignature() {
    return imageHashSignature;
  }

  public void setImageHashSignature(String imageHashSignature) {
    this.imageHashSignature = imageHashSignature;
  }

  public GetImageInfoResult hasTransparency(Boolean hasTransparency) {
    this.hasTransparency = hasTransparency;
    return this;
  }

   /**
   * True if the image contains transparency, otherwise false
   * @return hasTransparency
  **/
  @ApiModelProperty(value = "True if the image contains transparency, otherwise false")
  public Boolean isHasTransparency() {
    return hasTransparency;
  }

  public void setHasTransparency(Boolean hasTransparency) {
    this.hasTransparency = hasTransparency;
  }

  public GetImageInfoResult mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIME type of the image format
   * @return mimeType
  **/
  @ApiModelProperty(value = "MIME type of the image format")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public GetImageInfoResult imageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Image format
   * @return imageFormat
  **/
  @ApiModelProperty(value = "Image format")
  public String getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }

  public GetImageInfoResult dpIUnit(String dpIUnit) {
    this.dpIUnit = dpIUnit;
    return this;
  }

   /**
   * Units of the DPI measurement; can be either in Inches or Centimeters
   * @return dpIUnit
  **/
  @ApiModelProperty(value = "Units of the DPI measurement; can be either in Inches or Centimeters")
  public String getDpIUnit() {
    return dpIUnit;
  }

  public void setDpIUnit(String dpIUnit) {
    this.dpIUnit = dpIUnit;
  }

  public GetImageInfoResult DPI(Double DPI) {
    this.DPI = DPI;
    return this;
  }

   /**
   * DPI (pixels per unit, e.g. pixels per inch) of the image
   * @return DPI
  **/
  @ApiModelProperty(value = "DPI (pixels per unit, e.g. pixels per inch) of the image")
  public Double getDPI() {
    return DPI;
  }

  public void setDPI(Double DPI) {
    this.DPI = DPI;
  }

  public GetImageInfoResult colorCount(Integer colorCount) {
    this.colorCount = colorCount;
    return this;
  }

   /**
   * Unique colors in the image
   * @return colorCount
  **/
  @ApiModelProperty(value = "Unique colors in the image")
  public Integer getColorCount() {
    return colorCount;
  }

  public void setColorCount(Integer colorCount) {
    this.colorCount = colorCount;
  }

  public GetImageInfoResult bitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
    return this;
  }

   /**
   * Bit depth of the image
   * @return bitDepth
  **/
  @ApiModelProperty(value = "Bit depth of the image")
  public Integer getBitDepth() {
    return bitDepth;
  }

  public void setBitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
  }

  public GetImageInfoResult comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment string in the image
   * @return comment
  **/
  @ApiModelProperty(value = "Comment string in the image")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public GetImageInfoResult exifProfileName(String exifProfileName) {
    this.exifProfileName = exifProfileName;
    return this;
  }

   /**
   * Name of the EXIF profile used
   * @return exifProfileName
  **/
  @ApiModelProperty(value = "Name of the EXIF profile used")
  public String getExifProfileName() {
    return exifProfileName;
  }

  public void setExifProfileName(String exifProfileName) {
    this.exifProfileName = exifProfileName;
  }

  public GetImageInfoResult exifValues(List<ExifValue> exifValues) {
    this.exifValues = exifValues;
    return this;
  }

  public GetImageInfoResult addExifValuesItem(ExifValue exifValuesItem) {
    if (this.exifValues == null) {
      this.exifValues = new ArrayList<ExifValue>();
    }
    this.exifValues.add(exifValuesItem);
    return this;
  }

   /**
   * EXIF tags and values embedded in the image
   * @return exifValues
  **/
  @ApiModelProperty(value = "EXIF tags and values embedded in the image")
  public List<ExifValue> getExifValues() {
    return exifValues;
  }

  public void setExifValues(List<ExifValue> exifValues) {
    this.exifValues = exifValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImageInfoResult getImageInfoResult = (GetImageInfoResult) o;
    return Objects.equals(this.successful, getImageInfoResult.successful) &&
        Objects.equals(this.colorSpace, getImageInfoResult.colorSpace) &&
        Objects.equals(this.colorType, getImageInfoResult.colorType) &&
        Objects.equals(this.width, getImageInfoResult.width) &&
        Objects.equals(this.height, getImageInfoResult.height) &&
        Objects.equals(this.compressionLevel, getImageInfoResult.compressionLevel) &&
        Objects.equals(this.imageHashSignature, getImageInfoResult.imageHashSignature) &&
        Objects.equals(this.hasTransparency, getImageInfoResult.hasTransparency) &&
        Objects.equals(this.mimeType, getImageInfoResult.mimeType) &&
        Objects.equals(this.imageFormat, getImageInfoResult.imageFormat) &&
        Objects.equals(this.dpIUnit, getImageInfoResult.dpIUnit) &&
        Objects.equals(this.DPI, getImageInfoResult.DPI) &&
        Objects.equals(this.colorCount, getImageInfoResult.colorCount) &&
        Objects.equals(this.bitDepth, getImageInfoResult.bitDepth) &&
        Objects.equals(this.comment, getImageInfoResult.comment) &&
        Objects.equals(this.exifProfileName, getImageInfoResult.exifProfileName) &&
        Objects.equals(this.exifValues, getImageInfoResult.exifValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, colorSpace, colorType, width, height, compressionLevel, imageHashSignature, hasTransparency, mimeType, imageFormat, dpIUnit, DPI, colorCount, bitDepth, comment, exifProfileName, exifValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImageInfoResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    compressionLevel: ").append(toIndentedString(compressionLevel)).append("\n");
    sb.append("    imageHashSignature: ").append(toIndentedString(imageHashSignature)).append("\n");
    sb.append("    hasTransparency: ").append(toIndentedString(hasTransparency)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    dpIUnit: ").append(toIndentedString(dpIUnit)).append("\n");
    sb.append("    DPI: ").append(toIndentedString(DPI)).append("\n");
    sb.append("    colorCount: ").append(toIndentedString(colorCount)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    exifProfileName: ").append(toIndentedString(exifProfileName)).append("\n");
    sb.append("    exifValues: ").append(toIndentedString(exifValues)).append("\n");
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

