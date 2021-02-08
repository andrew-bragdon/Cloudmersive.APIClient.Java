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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Individual match result of finding a target string in a longer text string
 */
@ApiModel(description = "Individual match result of finding a target string in a longer text string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-07T20:26:02.735-08:00")
public class FindStringMatch {
  @SerializedName("CharacterOffsetStart")
  private Integer characterOffsetStart = null;

  @SerializedName("CharacterOffsetEnd")
  private Integer characterOffsetEnd = null;

  @SerializedName("ContainingLine")
  private String containingLine = null;

  public FindStringMatch characterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
    return this;
  }

   /**
   * 0-based index of the start of the match
   * @return characterOffsetStart
  **/
  @ApiModelProperty(value = "0-based index of the start of the match")
  public Integer getCharacterOffsetStart() {
    return characterOffsetStart;
  }

  public void setCharacterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
  }

  public FindStringMatch characterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
    return this;
  }

   /**
   * 0-based index of the end of the match
   * @return characterOffsetEnd
  **/
  @ApiModelProperty(value = "0-based index of the end of the match")
  public Integer getCharacterOffsetEnd() {
    return characterOffsetEnd;
  }

  public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
  }

  public FindStringMatch containingLine(String containingLine) {
    this.containingLine = containingLine;
    return this;
  }

   /**
   * Text content of the line containing the match
   * @return containingLine
  **/
  @ApiModelProperty(value = "Text content of the line containing the match")
  public String getContainingLine() {
    return containingLine;
  }

  public void setContainingLine(String containingLine) {
    this.containingLine = containingLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringMatch findStringMatch = (FindStringMatch) o;
    return Objects.equals(this.characterOffsetStart, findStringMatch.characterOffsetStart) &&
        Objects.equals(this.characterOffsetEnd, findStringMatch.characterOffsetEnd) &&
        Objects.equals(this.containingLine, findStringMatch.containingLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterOffsetStart, characterOffsetEnd, containingLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringMatch {\n");
    
    sb.append("    characterOffsetStart: ").append(toIndentedString(characterOffsetStart)).append("\n");
    sb.append("    characterOffsetEnd: ").append(toIndentedString(characterOffsetEnd)).append("\n");
    sb.append("    containingLine: ").append(toIndentedString(containingLine)).append("\n");
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

