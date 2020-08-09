/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
import com.cloudmersive.client.model.RephrasedSentence;
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
 * Output of a text rephrasing operation
 */
@ApiModel(description = "Output of a text rephrasing operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-08T23:35:35.377-07:00")
public class RephraseResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("RephrasedResults")
  private List<RephrasedSentence> rephrasedResults = null;

  @SerializedName("SentenceCount")
  private Integer sentenceCount = null;

  public RephraseResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the language detection operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the language detection operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public RephraseResponse rephrasedResults(List<RephrasedSentence> rephrasedResults) {
    this.rephrasedResults = rephrasedResults;
    return this;
  }

  public RephraseResponse addRephrasedResultsItem(RephrasedSentence rephrasedResultsItem) {
    if (this.rephrasedResults == null) {
      this.rephrasedResults = new ArrayList<RephrasedSentence>();
    }
    this.rephrasedResults.add(rephrasedResultsItem);
    return this;
  }

   /**
   * Results of the rephrasing, paraphrasing operation, in the order of the input sentences
   * @return rephrasedResults
  **/
  @ApiModelProperty(value = "Results of the rephrasing, paraphrasing operation, in the order of the input sentences")
  public List<RephrasedSentence> getRephrasedResults() {
    return rephrasedResults;
  }

  public void setRephrasedResults(List<RephrasedSentence> rephrasedResults) {
    this.rephrasedResults = rephrasedResults;
  }

  public RephraseResponse sentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @ApiModelProperty(value = "Number of sentences in input text")
  public Integer getSentenceCount() {
    return sentenceCount;
  }

  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RephraseResponse rephraseResponse = (RephraseResponse) o;
    return Objects.equals(this.successful, rephraseResponse.successful) &&
        Objects.equals(this.rephrasedResults, rephraseResponse.rephrasedResults) &&
        Objects.equals(this.sentenceCount, rephraseResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, rephrasedResults, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RephraseResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    rephrasedResults: ").append(toIndentedString(rephrasedResults)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

