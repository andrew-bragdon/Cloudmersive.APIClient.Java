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
 * Result of retrieving annotations from a PDF document
 */
@ApiModel(description = "Result of retrieving annotations from a PDF document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-01T16:39:14.898-08:00")
public class GetPdfAnnotationsResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Annotations")
  private List<PdfAnnotation> annotations = null;

  public GetPdfAnnotationsResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetPdfAnnotationsResult annotations(List<PdfAnnotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public GetPdfAnnotationsResult addAnnotationsItem(PdfAnnotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<PdfAnnotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Annotations in the PDF file, ordered by placement from start to finish in the document
   * @return annotations
  **/
  @ApiModelProperty(value = "Annotations in the PDF file, ordered by placement from start to finish in the document")
  public List<PdfAnnotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<PdfAnnotation> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPdfAnnotationsResult getPdfAnnotationsResult = (GetPdfAnnotationsResult) o;
    return Objects.equals(this.successful, getPdfAnnotationsResult.successful) &&
        Objects.equals(this.annotations, getPdfAnnotationsResult.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, annotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPdfAnnotationsResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

