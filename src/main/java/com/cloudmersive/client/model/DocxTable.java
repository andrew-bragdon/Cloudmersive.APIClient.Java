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
import com.cloudmersive.client.model.DocxTableRow;
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
 * A table in a Word Document (DOCX) file
 */
@ApiModel(description = "A table in a Word Document (DOCX) file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T18:41:43.065-07:00")
public class DocxTable {
  @SerializedName("TableID")
  private String tableID = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Width")
  private String width = null;

  @SerializedName("WidthType")
  private String widthType = null;

  @SerializedName("TableRows")
  private List<DocxTableRow> tableRows = null;

  @SerializedName("TopBorderType")
  private String topBorderType = null;

  @SerializedName("TopBorderSize")
  private Integer topBorderSize = null;

  @SerializedName("TopBorderSpace")
  private Integer topBorderSpace = null;

  @SerializedName("TopBorderColor")
  private String topBorderColor = null;

  @SerializedName("BottomBorderType")
  private String bottomBorderType = null;

  @SerializedName("BottomBorderSize")
  private Integer bottomBorderSize = null;

  @SerializedName("BottomBorderSpace")
  private Integer bottomBorderSpace = null;

  @SerializedName("BottomBorderColor")
  private String bottomBorderColor = null;

  @SerializedName("LeftBorderType")
  private String leftBorderType = null;

  @SerializedName("LeftBorderSize")
  private Integer leftBorderSize = null;

  @SerializedName("LeftBorderSpace")
  private Integer leftBorderSpace = null;

  @SerializedName("LeftBorderColor")
  private String leftBorderColor = null;

  @SerializedName("RightBorderType")
  private String rightBorderType = null;

  @SerializedName("RightBorderSize")
  private Integer rightBorderSize = null;

  @SerializedName("RightBorderSpace")
  private Integer rightBorderSpace = null;

  @SerializedName("RightBorderColor")
  private String rightBorderColor = null;

  @SerializedName("CellHorizontalBorderType")
  private String cellHorizontalBorderType = null;

  @SerializedName("CellHorizontalBorderSize")
  private Integer cellHorizontalBorderSize = null;

  @SerializedName("CellHorizontalBorderSpace")
  private Integer cellHorizontalBorderSpace = null;

  @SerializedName("CellHorizontalBorderColor")
  private String cellHorizontalBorderColor = null;

  @SerializedName("CellVerticalBorderType")
  private String cellVerticalBorderType = null;

  @SerializedName("CellVerticalBorderSize")
  private Integer cellVerticalBorderSize = null;

  @SerializedName("CellVerticalBorderSpace")
  private Integer cellVerticalBorderSpace = null;

  @SerializedName("CellVerticalBorderColor")
  private String cellVerticalBorderColor = null;

  @SerializedName("StartBorderType")
  private String startBorderType = null;

  @SerializedName("StartBorderSize")
  private Integer startBorderSize = null;

  @SerializedName("StartBorderSpace")
  private Integer startBorderSpace = null;

  @SerializedName("StartBorderColor")
  private String startBorderColor = null;

  @SerializedName("EndBorderType")
  private String endBorderType = null;

  @SerializedName("EndBorderSize")
  private Integer endBorderSize = null;

  @SerializedName("EndBorderSpace")
  private Integer endBorderSpace = null;

  @SerializedName("EndBorderColor")
  private String endBorderColor = null;

  @SerializedName("TableIndentationMode")
  private String tableIndentationMode = null;

  @SerializedName("TableIndentationWidth")
  private Integer tableIndentationWidth = null;

  public DocxTable tableID(String tableID) {
    this.tableID = tableID;
    return this;
  }

   /**
   * The ID of the table; leave blank for new tables
   * @return tableID
  **/
  @ApiModelProperty(value = "The ID of the table; leave blank for new tables")
  public String getTableID() {
    return tableID;
  }

  public void setTableID(String tableID) {
    this.tableID = tableID;
  }

  public DocxTable path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxTable width(String width) {
    this.width = width;
    return this;
  }

   /**
   * The Width of the table, or 0 if not specified
   * @return width
  **/
  @ApiModelProperty(value = "The Width of the table, or 0 if not specified")
  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public DocxTable widthType(String widthType) {
    this.widthType = widthType;
    return this;
  }

   /**
   * The Width configuration type of the table
   * @return widthType
  **/
  @ApiModelProperty(value = "The Width configuration type of the table")
  public String getWidthType() {
    return widthType;
  }

  public void setWidthType(String widthType) {
    this.widthType = widthType;
  }

  public DocxTable tableRows(List<DocxTableRow> tableRows) {
    this.tableRows = tableRows;
    return this;
  }

  public DocxTable addTableRowsItem(DocxTableRow tableRowsItem) {
    if (this.tableRows == null) {
      this.tableRows = new ArrayList<DocxTableRow>();
    }
    this.tableRows.add(tableRowsItem);
    return this;
  }

   /**
   * Rows in the table; this is where the contents is located
   * @return tableRows
  **/
  @ApiModelProperty(value = "Rows in the table; this is where the contents is located")
  public List<DocxTableRow> getTableRows() {
    return tableRows;
  }

  public void setTableRows(List<DocxTableRow> tableRows) {
    this.tableRows = tableRows;
  }

  public DocxTable topBorderType(String topBorderType) {
    this.topBorderType = topBorderType;
    return this;
  }

   /**
   * Type for the top border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return topBorderType
  **/
  @ApiModelProperty(value = "Type for the top border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getTopBorderType() {
    return topBorderType;
  }

  public void setTopBorderType(String topBorderType) {
    this.topBorderType = topBorderType;
  }

  public DocxTable topBorderSize(Integer topBorderSize) {
    this.topBorderSize = topBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return topBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getTopBorderSize() {
    return topBorderSize;
  }

  public void setTopBorderSize(Integer topBorderSize) {
    this.topBorderSize = topBorderSize;
  }

  public DocxTable topBorderSpace(Integer topBorderSpace) {
    this.topBorderSpace = topBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return topBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getTopBorderSpace() {
    return topBorderSpace;
  }

  public void setTopBorderSpace(Integer topBorderSpace) {
    this.topBorderSpace = topBorderSpace;
  }

  public DocxTable topBorderColor(String topBorderColor) {
    this.topBorderColor = topBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return topBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getTopBorderColor() {
    return topBorderColor;
  }

  public void setTopBorderColor(String topBorderColor) {
    this.topBorderColor = topBorderColor;
  }

  public DocxTable bottomBorderType(String bottomBorderType) {
    this.bottomBorderType = bottomBorderType;
    return this;
  }

   /**
   * Type for the bottom border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return bottomBorderType
  **/
  @ApiModelProperty(value = "Type for the bottom border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getBottomBorderType() {
    return bottomBorderType;
  }

  public void setBottomBorderType(String bottomBorderType) {
    this.bottomBorderType = bottomBorderType;
  }

  public DocxTable bottomBorderSize(Integer bottomBorderSize) {
    this.bottomBorderSize = bottomBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return bottomBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getBottomBorderSize() {
    return bottomBorderSize;
  }

  public void setBottomBorderSize(Integer bottomBorderSize) {
    this.bottomBorderSize = bottomBorderSize;
  }

  public DocxTable bottomBorderSpace(Integer bottomBorderSpace) {
    this.bottomBorderSpace = bottomBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return bottomBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getBottomBorderSpace() {
    return bottomBorderSpace;
  }

  public void setBottomBorderSpace(Integer bottomBorderSpace) {
    this.bottomBorderSpace = bottomBorderSpace;
  }

  public DocxTable bottomBorderColor(String bottomBorderColor) {
    this.bottomBorderColor = bottomBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return bottomBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getBottomBorderColor() {
    return bottomBorderColor;
  }

  public void setBottomBorderColor(String bottomBorderColor) {
    this.bottomBorderColor = bottomBorderColor;
  }

  public DocxTable leftBorderType(String leftBorderType) {
    this.leftBorderType = leftBorderType;
    return this;
  }

   /**
   * Type for the left border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return leftBorderType
  **/
  @ApiModelProperty(value = "Type for the left border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getLeftBorderType() {
    return leftBorderType;
  }

  public void setLeftBorderType(String leftBorderType) {
    this.leftBorderType = leftBorderType;
  }

  public DocxTable leftBorderSize(Integer leftBorderSize) {
    this.leftBorderSize = leftBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return leftBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getLeftBorderSize() {
    return leftBorderSize;
  }

  public void setLeftBorderSize(Integer leftBorderSize) {
    this.leftBorderSize = leftBorderSize;
  }

  public DocxTable leftBorderSpace(Integer leftBorderSpace) {
    this.leftBorderSpace = leftBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return leftBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getLeftBorderSpace() {
    return leftBorderSpace;
  }

  public void setLeftBorderSpace(Integer leftBorderSpace) {
    this.leftBorderSpace = leftBorderSpace;
  }

  public DocxTable leftBorderColor(String leftBorderColor) {
    this.leftBorderColor = leftBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return leftBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getLeftBorderColor() {
    return leftBorderColor;
  }

  public void setLeftBorderColor(String leftBorderColor) {
    this.leftBorderColor = leftBorderColor;
  }

  public DocxTable rightBorderType(String rightBorderType) {
    this.rightBorderType = rightBorderType;
    return this;
  }

   /**
   * Type for the right border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return rightBorderType
  **/
  @ApiModelProperty(value = "Type for the right border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getRightBorderType() {
    return rightBorderType;
  }

  public void setRightBorderType(String rightBorderType) {
    this.rightBorderType = rightBorderType;
  }

  public DocxTable rightBorderSize(Integer rightBorderSize) {
    this.rightBorderSize = rightBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return rightBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getRightBorderSize() {
    return rightBorderSize;
  }

  public void setRightBorderSize(Integer rightBorderSize) {
    this.rightBorderSize = rightBorderSize;
  }

  public DocxTable rightBorderSpace(Integer rightBorderSpace) {
    this.rightBorderSpace = rightBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return rightBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getRightBorderSpace() {
    return rightBorderSpace;
  }

  public void setRightBorderSpace(Integer rightBorderSpace) {
    this.rightBorderSpace = rightBorderSpace;
  }

  public DocxTable rightBorderColor(String rightBorderColor) {
    this.rightBorderColor = rightBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return rightBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getRightBorderColor() {
    return rightBorderColor;
  }

  public void setRightBorderColor(String rightBorderColor) {
    this.rightBorderColor = rightBorderColor;
  }

  public DocxTable cellHorizontalBorderType(String cellHorizontalBorderType) {
    this.cellHorizontalBorderType = cellHorizontalBorderType;
    return this;
  }

   /**
   * Type for the cell horizontal border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return cellHorizontalBorderType
  **/
  @ApiModelProperty(value = "Type for the cell horizontal border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getCellHorizontalBorderType() {
    return cellHorizontalBorderType;
  }

  public void setCellHorizontalBorderType(String cellHorizontalBorderType) {
    this.cellHorizontalBorderType = cellHorizontalBorderType;
  }

  public DocxTable cellHorizontalBorderSize(Integer cellHorizontalBorderSize) {
    this.cellHorizontalBorderSize = cellHorizontalBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return cellHorizontalBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getCellHorizontalBorderSize() {
    return cellHorizontalBorderSize;
  }

  public void setCellHorizontalBorderSize(Integer cellHorizontalBorderSize) {
    this.cellHorizontalBorderSize = cellHorizontalBorderSize;
  }

  public DocxTable cellHorizontalBorderSpace(Integer cellHorizontalBorderSpace) {
    this.cellHorizontalBorderSpace = cellHorizontalBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return cellHorizontalBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getCellHorizontalBorderSpace() {
    return cellHorizontalBorderSpace;
  }

  public void setCellHorizontalBorderSpace(Integer cellHorizontalBorderSpace) {
    this.cellHorizontalBorderSpace = cellHorizontalBorderSpace;
  }

  public DocxTable cellHorizontalBorderColor(String cellHorizontalBorderColor) {
    this.cellHorizontalBorderColor = cellHorizontalBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return cellHorizontalBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getCellHorizontalBorderColor() {
    return cellHorizontalBorderColor;
  }

  public void setCellHorizontalBorderColor(String cellHorizontalBorderColor) {
    this.cellHorizontalBorderColor = cellHorizontalBorderColor;
  }

  public DocxTable cellVerticalBorderType(String cellVerticalBorderType) {
    this.cellVerticalBorderType = cellVerticalBorderType;
    return this;
  }

   /**
   * Type for the cell vertical border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return cellVerticalBorderType
  **/
  @ApiModelProperty(value = "Type for the cell vertical border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getCellVerticalBorderType() {
    return cellVerticalBorderType;
  }

  public void setCellVerticalBorderType(String cellVerticalBorderType) {
    this.cellVerticalBorderType = cellVerticalBorderType;
  }

  public DocxTable cellVerticalBorderSize(Integer cellVerticalBorderSize) {
    this.cellVerticalBorderSize = cellVerticalBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return cellVerticalBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getCellVerticalBorderSize() {
    return cellVerticalBorderSize;
  }

  public void setCellVerticalBorderSize(Integer cellVerticalBorderSize) {
    this.cellVerticalBorderSize = cellVerticalBorderSize;
  }

  public DocxTable cellVerticalBorderSpace(Integer cellVerticalBorderSpace) {
    this.cellVerticalBorderSpace = cellVerticalBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return cellVerticalBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getCellVerticalBorderSpace() {
    return cellVerticalBorderSpace;
  }

  public void setCellVerticalBorderSpace(Integer cellVerticalBorderSpace) {
    this.cellVerticalBorderSpace = cellVerticalBorderSpace;
  }

  public DocxTable cellVerticalBorderColor(String cellVerticalBorderColor) {
    this.cellVerticalBorderColor = cellVerticalBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return cellVerticalBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getCellVerticalBorderColor() {
    return cellVerticalBorderColor;
  }

  public void setCellVerticalBorderColor(String cellVerticalBorderColor) {
    this.cellVerticalBorderColor = cellVerticalBorderColor;
  }

  public DocxTable startBorderType(String startBorderType) {
    this.startBorderType = startBorderType;
    return this;
  }

   /**
   * Type for the start border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return startBorderType
  **/
  @ApiModelProperty(value = "Type for the start border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getStartBorderType() {
    return startBorderType;
  }

  public void setStartBorderType(String startBorderType) {
    this.startBorderType = startBorderType;
  }

  public DocxTable startBorderSize(Integer startBorderSize) {
    this.startBorderSize = startBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return startBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getStartBorderSize() {
    return startBorderSize;
  }

  public void setStartBorderSize(Integer startBorderSize) {
    this.startBorderSize = startBorderSize;
  }

  public DocxTable startBorderSpace(Integer startBorderSpace) {
    this.startBorderSpace = startBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return startBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getStartBorderSpace() {
    return startBorderSpace;
  }

  public void setStartBorderSpace(Integer startBorderSpace) {
    this.startBorderSpace = startBorderSpace;
  }

  public DocxTable startBorderColor(String startBorderColor) {
    this.startBorderColor = startBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return startBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getStartBorderColor() {
    return startBorderColor;
  }

  public void setStartBorderColor(String startBorderColor) {
    this.startBorderColor = startBorderColor;
  }

  public DocxTable endBorderType(String endBorderType) {
    this.endBorderType = endBorderType;
    return this;
  }

   /**
   * Type for the end border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave
   * @return endBorderType
  **/
  @ApiModelProperty(value = "Type for the end border - can be a Single, DashDotStroked, Dashed, DashSmallGap, DotDash, DotDotDash, Dotted, Double, DoubleWave, Inset, Nil, None, Outset, Thick, ThickThinLargeGap, ThickThinMediumGap, ThickThinSmallGap, ThinThickLargeGap, ThinThickMediumGap, ThinThickSmallGap, ThinThickThinLargeGap, ThinThickThinMediumGap, ThinThickThinSmallGap, ThreeDEmboss, ThreeDEngrave, Triple, Wave")
  public String getEndBorderType() {
    return endBorderType;
  }

  public void setEndBorderType(String endBorderType) {
    this.endBorderType = endBorderType;
  }

  public DocxTable endBorderSize(Integer endBorderSize) {
    this.endBorderSize = endBorderSize;
    return this;
  }

   /**
   * Width of the border in points (1/72nd of an inch)
   * @return endBorderSize
  **/
  @ApiModelProperty(value = "Width of the border in points (1/72nd of an inch)")
  public Integer getEndBorderSize() {
    return endBorderSize;
  }

  public void setEndBorderSize(Integer endBorderSize) {
    this.endBorderSize = endBorderSize;
  }

  public DocxTable endBorderSpace(Integer endBorderSpace) {
    this.endBorderSpace = endBorderSpace;
    return this;
  }

   /**
   * Spacing around the border in points (1/72nd of an inch)
   * @return endBorderSpace
  **/
  @ApiModelProperty(value = "Spacing around the border in points (1/72nd of an inch)")
  public Integer getEndBorderSpace() {
    return endBorderSpace;
  }

  public void setEndBorderSpace(Integer endBorderSpace) {
    this.endBorderSpace = endBorderSpace;
  }

  public DocxTable endBorderColor(String endBorderColor) {
    this.endBorderColor = endBorderColor;
    return this;
  }

   /**
   * HTML-style color hex value (do not include a #)
   * @return endBorderColor
  **/
  @ApiModelProperty(value = "HTML-style color hex value (do not include a #)")
  public String getEndBorderColor() {
    return endBorderColor;
  }

  public void setEndBorderColor(String endBorderColor) {
    this.endBorderColor = endBorderColor;
  }

  public DocxTable tableIndentationMode(String tableIndentationMode) {
    this.tableIndentationMode = tableIndentationMode;
    return this;
  }

   /**
   * Table indentation type
   * @return tableIndentationMode
  **/
  @ApiModelProperty(value = "Table indentation type")
  public String getTableIndentationMode() {
    return tableIndentationMode;
  }

  public void setTableIndentationMode(String tableIndentationMode) {
    this.tableIndentationMode = tableIndentationMode;
  }

  public DocxTable tableIndentationWidth(Integer tableIndentationWidth) {
    this.tableIndentationWidth = tableIndentationWidth;
    return this;
  }

   /**
   * Table indentation width
   * @return tableIndentationWidth
  **/
  @ApiModelProperty(value = "Table indentation width")
  public Integer getTableIndentationWidth() {
    return tableIndentationWidth;
  }

  public void setTableIndentationWidth(Integer tableIndentationWidth) {
    this.tableIndentationWidth = tableIndentationWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTable docxTable = (DocxTable) o;
    return Objects.equals(this.tableID, docxTable.tableID) &&
        Objects.equals(this.path, docxTable.path) &&
        Objects.equals(this.width, docxTable.width) &&
        Objects.equals(this.widthType, docxTable.widthType) &&
        Objects.equals(this.tableRows, docxTable.tableRows) &&
        Objects.equals(this.topBorderType, docxTable.topBorderType) &&
        Objects.equals(this.topBorderSize, docxTable.topBorderSize) &&
        Objects.equals(this.topBorderSpace, docxTable.topBorderSpace) &&
        Objects.equals(this.topBorderColor, docxTable.topBorderColor) &&
        Objects.equals(this.bottomBorderType, docxTable.bottomBorderType) &&
        Objects.equals(this.bottomBorderSize, docxTable.bottomBorderSize) &&
        Objects.equals(this.bottomBorderSpace, docxTable.bottomBorderSpace) &&
        Objects.equals(this.bottomBorderColor, docxTable.bottomBorderColor) &&
        Objects.equals(this.leftBorderType, docxTable.leftBorderType) &&
        Objects.equals(this.leftBorderSize, docxTable.leftBorderSize) &&
        Objects.equals(this.leftBorderSpace, docxTable.leftBorderSpace) &&
        Objects.equals(this.leftBorderColor, docxTable.leftBorderColor) &&
        Objects.equals(this.rightBorderType, docxTable.rightBorderType) &&
        Objects.equals(this.rightBorderSize, docxTable.rightBorderSize) &&
        Objects.equals(this.rightBorderSpace, docxTable.rightBorderSpace) &&
        Objects.equals(this.rightBorderColor, docxTable.rightBorderColor) &&
        Objects.equals(this.cellHorizontalBorderType, docxTable.cellHorizontalBorderType) &&
        Objects.equals(this.cellHorizontalBorderSize, docxTable.cellHorizontalBorderSize) &&
        Objects.equals(this.cellHorizontalBorderSpace, docxTable.cellHorizontalBorderSpace) &&
        Objects.equals(this.cellHorizontalBorderColor, docxTable.cellHorizontalBorderColor) &&
        Objects.equals(this.cellVerticalBorderType, docxTable.cellVerticalBorderType) &&
        Objects.equals(this.cellVerticalBorderSize, docxTable.cellVerticalBorderSize) &&
        Objects.equals(this.cellVerticalBorderSpace, docxTable.cellVerticalBorderSpace) &&
        Objects.equals(this.cellVerticalBorderColor, docxTable.cellVerticalBorderColor) &&
        Objects.equals(this.startBorderType, docxTable.startBorderType) &&
        Objects.equals(this.startBorderSize, docxTable.startBorderSize) &&
        Objects.equals(this.startBorderSpace, docxTable.startBorderSpace) &&
        Objects.equals(this.startBorderColor, docxTable.startBorderColor) &&
        Objects.equals(this.endBorderType, docxTable.endBorderType) &&
        Objects.equals(this.endBorderSize, docxTable.endBorderSize) &&
        Objects.equals(this.endBorderSpace, docxTable.endBorderSpace) &&
        Objects.equals(this.endBorderColor, docxTable.endBorderColor) &&
        Objects.equals(this.tableIndentationMode, docxTable.tableIndentationMode) &&
        Objects.equals(this.tableIndentationWidth, docxTable.tableIndentationWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableID, path, width, widthType, tableRows, topBorderType, topBorderSize, topBorderSpace, topBorderColor, bottomBorderType, bottomBorderSize, bottomBorderSpace, bottomBorderColor, leftBorderType, leftBorderSize, leftBorderSpace, leftBorderColor, rightBorderType, rightBorderSize, rightBorderSpace, rightBorderColor, cellHorizontalBorderType, cellHorizontalBorderSize, cellHorizontalBorderSpace, cellHorizontalBorderColor, cellVerticalBorderType, cellVerticalBorderSize, cellVerticalBorderSpace, cellVerticalBorderColor, startBorderType, startBorderSize, startBorderSpace, startBorderColor, endBorderType, endBorderSize, endBorderSpace, endBorderColor, tableIndentationMode, tableIndentationWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTable {\n");
    
    sb.append("    tableID: ").append(toIndentedString(tableID)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthType: ").append(toIndentedString(widthType)).append("\n");
    sb.append("    tableRows: ").append(toIndentedString(tableRows)).append("\n");
    sb.append("    topBorderType: ").append(toIndentedString(topBorderType)).append("\n");
    sb.append("    topBorderSize: ").append(toIndentedString(topBorderSize)).append("\n");
    sb.append("    topBorderSpace: ").append(toIndentedString(topBorderSpace)).append("\n");
    sb.append("    topBorderColor: ").append(toIndentedString(topBorderColor)).append("\n");
    sb.append("    bottomBorderType: ").append(toIndentedString(bottomBorderType)).append("\n");
    sb.append("    bottomBorderSize: ").append(toIndentedString(bottomBorderSize)).append("\n");
    sb.append("    bottomBorderSpace: ").append(toIndentedString(bottomBorderSpace)).append("\n");
    sb.append("    bottomBorderColor: ").append(toIndentedString(bottomBorderColor)).append("\n");
    sb.append("    leftBorderType: ").append(toIndentedString(leftBorderType)).append("\n");
    sb.append("    leftBorderSize: ").append(toIndentedString(leftBorderSize)).append("\n");
    sb.append("    leftBorderSpace: ").append(toIndentedString(leftBorderSpace)).append("\n");
    sb.append("    leftBorderColor: ").append(toIndentedString(leftBorderColor)).append("\n");
    sb.append("    rightBorderType: ").append(toIndentedString(rightBorderType)).append("\n");
    sb.append("    rightBorderSize: ").append(toIndentedString(rightBorderSize)).append("\n");
    sb.append("    rightBorderSpace: ").append(toIndentedString(rightBorderSpace)).append("\n");
    sb.append("    rightBorderColor: ").append(toIndentedString(rightBorderColor)).append("\n");
    sb.append("    cellHorizontalBorderType: ").append(toIndentedString(cellHorizontalBorderType)).append("\n");
    sb.append("    cellHorizontalBorderSize: ").append(toIndentedString(cellHorizontalBorderSize)).append("\n");
    sb.append("    cellHorizontalBorderSpace: ").append(toIndentedString(cellHorizontalBorderSpace)).append("\n");
    sb.append("    cellHorizontalBorderColor: ").append(toIndentedString(cellHorizontalBorderColor)).append("\n");
    sb.append("    cellVerticalBorderType: ").append(toIndentedString(cellVerticalBorderType)).append("\n");
    sb.append("    cellVerticalBorderSize: ").append(toIndentedString(cellVerticalBorderSize)).append("\n");
    sb.append("    cellVerticalBorderSpace: ").append(toIndentedString(cellVerticalBorderSpace)).append("\n");
    sb.append("    cellVerticalBorderColor: ").append(toIndentedString(cellVerticalBorderColor)).append("\n");
    sb.append("    startBorderType: ").append(toIndentedString(startBorderType)).append("\n");
    sb.append("    startBorderSize: ").append(toIndentedString(startBorderSize)).append("\n");
    sb.append("    startBorderSpace: ").append(toIndentedString(startBorderSpace)).append("\n");
    sb.append("    startBorderColor: ").append(toIndentedString(startBorderColor)).append("\n");
    sb.append("    endBorderType: ").append(toIndentedString(endBorderType)).append("\n");
    sb.append("    endBorderSize: ").append(toIndentedString(endBorderSize)).append("\n");
    sb.append("    endBorderSpace: ").append(toIndentedString(endBorderSpace)).append("\n");
    sb.append("    endBorderColor: ").append(toIndentedString(endBorderColor)).append("\n");
    sb.append("    tableIndentationMode: ").append(toIndentedString(tableIndentationMode)).append("\n");
    sb.append("    tableIndentationWidth: ").append(toIndentedString(tableIndentationWidth)).append("\n");
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

