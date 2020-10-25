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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Word tagged in a POS tag
 */
@ApiModel(description = "Word tagged in a POS tag")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-25T00:32:23.901-07:00")
public class PosTaggedWord {
  @SerializedName("Word")
  private Object word = null;

  @SerializedName("Tag")
  private Object tag = null;

  public PosTaggedWord word(Object word) {
    this.word = word;
    return this;
  }

   /**
   * Word that was tagged
   * @return word
  **/
  @ApiModelProperty(value = "Word that was tagged")
  public Object getWord() {
    return word;
  }

  public void setWord(Object word) {
    this.word = word;
  }

  public PosTaggedWord tag(Object tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Penn Treebank tag applied to the word
   * @return tag
  **/
  @ApiModelProperty(value = "Penn Treebank tag applied to the word")
  public Object getTag() {
    return tag;
  }

  public void setTag(Object tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PosTaggedWord posTaggedWord = (PosTaggedWord) o;
    return Objects.equals(this.word, posTaggedWord.word) &&
        Objects.equals(this.tag, posTaggedWord.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosTaggedWord {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

