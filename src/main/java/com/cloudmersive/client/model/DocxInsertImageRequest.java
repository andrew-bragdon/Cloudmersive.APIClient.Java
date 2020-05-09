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
import com.cloudmersive.client.model.DocxImage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to set-footer command
 */
@ApiModel(description = "Input to set-footer command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T22:37:15.396-07:00")
public class DocxInsertImageRequest {
  @SerializedName("InputDocumentFileBytes")
  private byte[] inputDocumentFileBytes = null;

  @SerializedName("InputDocumentFileUrl")
  private String inputDocumentFileUrl = null;

  @SerializedName("InputImageFileBytes")
  private byte[] inputImageFileBytes = null;

  @SerializedName("InputImageFileUrl")
  private String inputImageFileUrl = null;

  @SerializedName("ImageToAdd")
  private DocxImage imageToAdd = null;

  @SerializedName("InsertPlacement")
  private String insertPlacement = null;

  @SerializedName("InsertPath")
  private String insertPath = null;

  @SerializedName("WidthInEMUs")
  private Long widthInEMUs = null;

  @SerializedName("HeightInEMUs")
  private Long heightInEMUs = null;

  public DocxInsertImageRequest inputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    this.inputDocumentFileBytes = inputDocumentFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputDocumentFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputDocumentFileBytes() {
    return inputDocumentFileBytes;
  }

  public void setInputDocumentFileBytes(byte[] inputDocumentFileBytes) {
    this.inputDocumentFileBytes = inputDocumentFileBytes;
  }

  public DocxInsertImageRequest inputDocumentFileUrl(String inputDocumentFileUrl) {
    this.inputDocumentFileUrl = inputDocumentFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputDocumentFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputDocumentFileUrl() {
    return inputDocumentFileUrl;
  }

  public void setInputDocumentFileUrl(String inputDocumentFileUrl) {
    this.inputDocumentFileUrl = inputDocumentFileUrl;
  }

  public DocxInsertImageRequest inputImageFileBytes(byte[] inputImageFileBytes) {
    this.inputImageFileBytes = inputImageFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input image file to operate on; if you supply this value do not supply InputImageFileUrl or ImageToAdd.
   * @return inputImageFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input image file to operate on; if you supply this value do not supply InputImageFileUrl or ImageToAdd.")
  public byte[] getInputImageFileBytes() {
    return inputImageFileBytes;
  }

  public void setInputImageFileBytes(byte[] inputImageFileBytes) {
    this.inputImageFileBytes = inputImageFileBytes;
  }

  public DocxInsertImageRequest inputImageFileUrl(String inputImageFileUrl) {
    this.inputImageFileUrl = inputImageFileUrl;
    return this;
  }

   /**
   * Optional: URL of an image file to operate on as input; if you supply this value do not supply InputImageFileBytes or ImageToAdd.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputImageFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of an image file to operate on as input; if you supply this value do not supply InputImageFileBytes or ImageToAdd.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputImageFileUrl() {
    return inputImageFileUrl;
  }

  public void setInputImageFileUrl(String inputImageFileUrl) {
    this.inputImageFileUrl = inputImageFileUrl;
  }

  public DocxInsertImageRequest imageToAdd(DocxImage imageToAdd) {
    this.imageToAdd = imageToAdd;
    return this;
  }

   /**
   * Optional: Image to add; if you supply in this object, do not supply InputImageFileBytes or InputImageFileUrl.
   * @return imageToAdd
  **/
  @ApiModelProperty(value = "Optional: Image to add; if you supply in this object, do not supply InputImageFileBytes or InputImageFileUrl.")
  public DocxImage getImageToAdd() {
    return imageToAdd;
  }

  public void setImageToAdd(DocxImage imageToAdd) {
    this.imageToAdd = imageToAdd;
  }

  public DocxInsertImageRequest insertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
    return this;
  }

   /**
   * Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)
   * @return insertPlacement
  **/
  @ApiModelProperty(value = "Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)")
  public String getInsertPlacement() {
    return insertPlacement;
  }

  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }

  public DocxInsertImageRequest insertPath(String insertPath) {
    this.insertPath = insertPath;
    return this;
  }

   /**
   * Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject
   * @return insertPath
  **/
  @ApiModelProperty(value = "Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject")
  public String getInsertPath() {
    return insertPath;
  }

  public void setInsertPath(String insertPath) {
    this.insertPath = insertPath;
  }

  public DocxInsertImageRequest widthInEMUs(Long widthInEMUs) {
    this.widthInEMUs = widthInEMUs;
    return this;
  }

   /**
   * Optional: The width of the image in EMUs
   * @return widthInEMUs
  **/
  @ApiModelProperty(value = "Optional: The width of the image in EMUs")
  public Long getWidthInEMUs() {
    return widthInEMUs;
  }

  public void setWidthInEMUs(Long widthInEMUs) {
    this.widthInEMUs = widthInEMUs;
  }

  public DocxInsertImageRequest heightInEMUs(Long heightInEMUs) {
    this.heightInEMUs = heightInEMUs;
    return this;
  }

   /**
   * Optional: The height of the image in EMUs
   * @return heightInEMUs
  **/
  @ApiModelProperty(value = "Optional: The height of the image in EMUs")
  public Long getHeightInEMUs() {
    return heightInEMUs;
  }

  public void setHeightInEMUs(Long heightInEMUs) {
    this.heightInEMUs = heightInEMUs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxInsertImageRequest docxInsertImageRequest = (DocxInsertImageRequest) o;
    return Arrays.equals(this.inputDocumentFileBytes, docxInsertImageRequest.inputDocumentFileBytes) &&
        Objects.equals(this.inputDocumentFileUrl, docxInsertImageRequest.inputDocumentFileUrl) &&
        Arrays.equals(this.inputImageFileBytes, docxInsertImageRequest.inputImageFileBytes) &&
        Objects.equals(this.inputImageFileUrl, docxInsertImageRequest.inputImageFileUrl) &&
        Objects.equals(this.imageToAdd, docxInsertImageRequest.imageToAdd) &&
        Objects.equals(this.insertPlacement, docxInsertImageRequest.insertPlacement) &&
        Objects.equals(this.insertPath, docxInsertImageRequest.insertPath) &&
        Objects.equals(this.widthInEMUs, docxInsertImageRequest.widthInEMUs) &&
        Objects.equals(this.heightInEMUs, docxInsertImageRequest.heightInEMUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputDocumentFileBytes), inputDocumentFileUrl, Arrays.hashCode(inputImageFileBytes), inputImageFileUrl, imageToAdd, insertPlacement, insertPath, widthInEMUs, heightInEMUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxInsertImageRequest {\n");
    
    sb.append("    inputDocumentFileBytes: ").append(toIndentedString(inputDocumentFileBytes)).append("\n");
    sb.append("    inputDocumentFileUrl: ").append(toIndentedString(inputDocumentFileUrl)).append("\n");
    sb.append("    inputImageFileBytes: ").append(toIndentedString(inputImageFileBytes)).append("\n");
    sb.append("    inputImageFileUrl: ").append(toIndentedString(inputImageFileUrl)).append("\n");
    sb.append("    imageToAdd: ").append(toIndentedString(imageToAdd)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    insertPath: ").append(toIndentedString(insertPath)).append("\n");
    sb.append("    widthInEMUs: ").append(toIndentedString(widthInEMUs)).append("\n");
    sb.append("    heightInEMUs: ").append(toIndentedString(heightInEMUs)).append("\n");
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

