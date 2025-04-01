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
import com.cloudmersive.client.model.RephrasedSentenceOption;
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
 * One input sentence and associated rephrasing results
 */
@ApiModel(description = "One input sentence and associated rephrasing results")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T10:24:53.251-07:00")
public class RephrasedSentence {
  @SerializedName("SentenceIndex")
  private Integer sentenceIndex = null;

  @SerializedName("OriginalSentenceText")
  private String originalSentenceText = null;

  @SerializedName("Rephrasings")
  private List<RephrasedSentenceOption> rephrasings = null;

  public RephrasedSentence sentenceIndex(Integer sentenceIndex) {
    this.sentenceIndex = sentenceIndex;
    return this;
  }

   /**
   * Index of the sentence, 1-based, ordered
   * @return sentenceIndex
  **/
  @ApiModelProperty(value = "Index of the sentence, 1-based, ordered")
  public Integer getSentenceIndex() {
    return sentenceIndex;
  }

  public void setSentenceIndex(Integer sentenceIndex) {
    this.sentenceIndex = sentenceIndex;
  }

  public RephrasedSentence originalSentenceText(String originalSentenceText) {
    this.originalSentenceText = originalSentenceText;
    return this;
  }

   /**
   * Original input sentence text
   * @return originalSentenceText
  **/
  @ApiModelProperty(value = "Original input sentence text")
  public String getOriginalSentenceText() {
    return originalSentenceText;
  }

  public void setOriginalSentenceText(String originalSentenceText) {
    this.originalSentenceText = originalSentenceText;
  }

  public RephrasedSentence rephrasings(List<RephrasedSentenceOption> rephrasings) {
    this.rephrasings = rephrasings;
    return this;
  }

  public RephrasedSentence addRephrasingsItem(RephrasedSentenceOption rephrasingsItem) {
    if (this.rephrasings == null) {
      this.rephrasings = new ArrayList<RephrasedSentenceOption>();
    }
    this.rephrasings.add(rephrasingsItem);
    return this;
  }

   /**
   * Rephrasing text options, candidates of the original input sentence, in order - with best candidate first
   * @return rephrasings
  **/
  @ApiModelProperty(value = "Rephrasing text options, candidates of the original input sentence, in order - with best candidate first")
  public List<RephrasedSentenceOption> getRephrasings() {
    return rephrasings;
  }

  public void setRephrasings(List<RephrasedSentenceOption> rephrasings) {
    this.rephrasings = rephrasings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RephrasedSentence rephrasedSentence = (RephrasedSentence) o;
    return Objects.equals(this.sentenceIndex, rephrasedSentence.sentenceIndex) &&
        Objects.equals(this.originalSentenceText, rephrasedSentence.originalSentenceText) &&
        Objects.equals(this.rephrasings, rephrasedSentence.rephrasings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentenceIndex, originalSentenceText, rephrasings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RephrasedSentence {\n");
    
    sb.append("    sentenceIndex: ").append(toIndentedString(sentenceIndex)).append("\n");
    sb.append("    originalSentenceText: ").append(toIndentedString(originalSentenceText)).append("\n");
    sb.append("    rephrasings: ").append(toIndentedString(rephrasings)).append("\n");
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

