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
import com.cloudmersive.client.model.WordPosition;
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
 * A word in a sentence
 */
@ApiModel(description = "A word in a sentence")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-01T18:06:07.315-07:00")
public class CorrectWordInSentence {
  @SerializedName("Word")
  private WordPosition word = null;

  @SerializedName("Correct")
  private Boolean correct = null;

  @SerializedName("Suggestions")
  private List<String> suggestions = null;

  public CorrectWordInSentence word(WordPosition word) {
    this.word = word;
    return this;
  }

   /**
   * Position of the word
   * @return word
  **/
  @ApiModelProperty(value = "Position of the word")
  public WordPosition getWord() {
    return word;
  }

  public void setWord(WordPosition word) {
    this.word = word;
  }

  public CorrectWordInSentence correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

   /**
   * True if the word is spelled correctly, false otherwise
   * @return correct
  **/
  @ApiModelProperty(value = "True if the word is spelled correctly, false otherwise")
  public Boolean isCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public CorrectWordInSentence suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public CorrectWordInSentence addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<String>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Suggested spelling improvements
   * @return suggestions
  **/
  @ApiModelProperty(value = "Suggested spelling improvements")
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrectWordInSentence correctWordInSentence = (CorrectWordInSentence) o;
    return Objects.equals(this.word, correctWordInSentence.word) &&
        Objects.equals(this.correct, correctWordInSentence.correct) &&
        Objects.equals(this.suggestions, correctWordInSentence.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, correct, suggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectWordInSentence {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

