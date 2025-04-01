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
import java.util.Arrays;
import com.cloudmersive.client.model.OcrPageResult;
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
 * Response from an OCR to text operation.  Includes the confidence rating and converted text result.
 */
@ApiModel(description = "Response from an OCR to text operation.  Includes the confidence rating and converted text result.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:43:12.369-07:00")
public class PdfToTextResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("OcrPages")
  private List<OcrPageResult> ocrPages = null;

  @SerializedName("AsyncJobID")
  private String asyncJobID = null;

  @SerializedName("AsyncJobStatus")
  private String asyncJobStatus = null;

  public PdfToTextResponse successful(Boolean successful) {
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

  public PdfToTextResponse ocrPages(List<OcrPageResult> ocrPages) {
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToTextResponse addOcrPagesItem(OcrPageResult ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<OcrPageResult>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * Page OCR results
   * @return ocrPages
  **/
  @ApiModelProperty(value = "Page OCR results")
  public List<OcrPageResult> getOcrPages() {
    return ocrPages;
  }

  public void setOcrPages(List<OcrPageResult> ocrPages) {
    this.ocrPages = ocrPages;
  }

  public PdfToTextResponse asyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
    return this;
  }

   /**
   * When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes
   * @return asyncJobID
  **/
  @ApiModelProperty(value = "When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes")
  public String getAsyncJobID() {
    return asyncJobID;
  }

  public void setAsyncJobID(String asyncJobID) {
    this.asyncJobID = asyncJobID;
  }

  public PdfToTextResponse asyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
    return this;
  }

   /**
   * Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED
   * @return asyncJobStatus
  **/
  @ApiModelProperty(value = "Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED")
  public String getAsyncJobStatus() {
    return asyncJobStatus;
  }

  public void setAsyncJobStatus(String asyncJobStatus) {
    this.asyncJobStatus = asyncJobStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToTextResponse pdfToTextResponse = (PdfToTextResponse) o;
    return Objects.equals(this.successful, pdfToTextResponse.successful) &&
        Objects.equals(this.ocrPages, pdfToTextResponse.ocrPages) &&
        Objects.equals(this.asyncJobID, pdfToTextResponse.asyncJobID) &&
        Objects.equals(this.asyncJobStatus, pdfToTextResponse.asyncJobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages, asyncJobID, asyncJobStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToTextResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
    sb.append("    asyncJobID: ").append(toIndentedString(asyncJobID)).append("\n");
    sb.append("    asyncJobStatus: ").append(toIndentedString(asyncJobStatus)).append("\n");
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

