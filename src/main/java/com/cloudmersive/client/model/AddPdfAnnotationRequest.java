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
import com.cloudmersive.client.model.PdfAnnotation;
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
 * Request to add annotations to a PDF
 */
@ApiModel(description = "Request to add annotations to a PDF")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-19T19:58:38.824Z")
public class AddPdfAnnotationRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("AnnotationsToAdd")
  private List<PdfAnnotation> annotationsToAdd = null;

  public AddPdfAnnotationRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Input file contents bytes for the file to modify
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Input file contents bytes for the file to modify")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public AddPdfAnnotationRequest annotationsToAdd(List<PdfAnnotation> annotationsToAdd) {
    this.annotationsToAdd = annotationsToAdd;
    return this;
  }

  public AddPdfAnnotationRequest addAnnotationsToAddItem(PdfAnnotation annotationsToAddItem) {
    if (this.annotationsToAdd == null) {
      this.annotationsToAdd = new ArrayList<PdfAnnotation>();
    }
    this.annotationsToAdd.add(annotationsToAddItem);
    return this;
  }

   /**
   * Annotations to add to the PDF file
   * @return annotationsToAdd
  **/
  @ApiModelProperty(value = "Annotations to add to the PDF file")
  public List<PdfAnnotation> getAnnotationsToAdd() {
    return annotationsToAdd;
  }

  public void setAnnotationsToAdd(List<PdfAnnotation> annotationsToAdd) {
    this.annotationsToAdd = annotationsToAdd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPdfAnnotationRequest addPdfAnnotationRequest = (AddPdfAnnotationRequest) o;
    return Arrays.equals(this.inputFileBytes, addPdfAnnotationRequest.inputFileBytes) &&
        Objects.equals(this.annotationsToAdd, addPdfAnnotationRequest.annotationsToAdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), annotationsToAdd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPdfAnnotationRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    annotationsToAdd: ").append(toIndentedString(annotationsToAdd)).append("\n");
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

