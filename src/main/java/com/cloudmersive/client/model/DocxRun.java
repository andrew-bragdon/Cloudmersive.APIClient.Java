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
import com.cloudmersive.client.model.DocxText;
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
 * A content run in a Word Document (DOCX) file
 */
@ApiModel(description = "A content run in a Word Document (DOCX) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-26T21:01:13.943-07:00")
public class DocxRun {
  @SerializedName("RunIndex")
  private Integer runIndex = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("TextItems")
  private List<DocxText> textItems = null;

  @SerializedName("Bold")
  private Boolean bold = null;

  @SerializedName("Italic")
  private Boolean italic = null;

  @SerializedName("Underline")
  private String underline = null;

  @SerializedName("FontFamily")
  private String fontFamily = null;

  @SerializedName("FontSize")
  private String fontSize = null;

  public DocxRun runIndex(Integer runIndex) {
    this.runIndex = runIndex;
    return this;
  }

   /**
   * Index of the run, 0-based
   * @return runIndex
  **/
  @ApiModelProperty(value = "Index of the run, 0-based")
  public Integer getRunIndex() {
    return runIndex;
  }

  public void setRunIndex(Integer runIndex) {
    this.runIndex = runIndex;
  }

  public DocxRun path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Run object; leave blank for creation
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this Run object; leave blank for creation")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxRun textItems(List<DocxText> textItems) {
    this.textItems = textItems;
    return this;
  }

  public DocxRun addTextItemsItem(DocxText textItemsItem) {
    if (this.textItems == null) {
      this.textItems = new ArrayList<DocxText>();
    }
    this.textItems.add(textItemsItem);
    return this;
  }

   /**
   * Text items inside the run; this is where the actual text content is stored
   * @return textItems
  **/
  @ApiModelProperty(value = "Text items inside the run; this is where the actual text content is stored")
  public List<DocxText> getTextItems() {
    return textItems;
  }

  public void setTextItems(List<DocxText> textItems) {
    this.textItems = textItems;
  }

  public DocxRun bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * True to make the text bold, false otherwise
   * @return bold
  **/
  @ApiModelProperty(value = "True to make the text bold, false otherwise")
  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public DocxRun italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * True to make the text italic, false otherwise
   * @return italic
  **/
  @ApiModelProperty(value = "True to make the text italic, false otherwise")
  public Boolean isItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public DocxRun underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Underline mode for the text; possible values are: Words, Double, Thick, Dotted, DottedHeavy, Dash, DashedHeavy, DashLong, DashLongHeavy, DotDash, DashDotHeavy, DotDotDash, DashDotDotHeavy, Wave, WavyHeavy, WavyDouble, None
   * @return underline
  **/
  @ApiModelProperty(value = "Underline mode for the text; possible values are: Words, Double, Thick, Dotted, DottedHeavy, Dash, DashedHeavy, DashLong, DashLongHeavy, DotDash, DashDotHeavy, DotDotDash, DashDotDotHeavy, Wave, WavyHeavy, WavyDouble, None")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }

  public DocxRun fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font Family name for the text, e.g. \&quot;Arial\&quot; or \&quot;Times New Roman\&quot;
   * @return fontFamily
  **/
  @ApiModelProperty(value = "Font Family name for the text, e.g. \"Arial\" or \"Times New Roman\"")
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public DocxRun fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size in font points (e.g. \&quot;24\&quot;)
   * @return fontSize
  **/
  @ApiModelProperty(value = "Font size in font points (e.g. \"24\")")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxRun docxRun = (DocxRun) o;
    return Objects.equals(this.runIndex, docxRun.runIndex) &&
        Objects.equals(this.path, docxRun.path) &&
        Objects.equals(this.textItems, docxRun.textItems) &&
        Objects.equals(this.bold, docxRun.bold) &&
        Objects.equals(this.italic, docxRun.italic) &&
        Objects.equals(this.underline, docxRun.underline) &&
        Objects.equals(this.fontFamily, docxRun.fontFamily) &&
        Objects.equals(this.fontSize, docxRun.fontSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runIndex, path, textItems, bold, italic, underline, fontFamily, fontSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxRun {\n");
    
    sb.append("    runIndex: ").append(toIndentedString(runIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textItems: ").append(toIndentedString(textItems)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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

