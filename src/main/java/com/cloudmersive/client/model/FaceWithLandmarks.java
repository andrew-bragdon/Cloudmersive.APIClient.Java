/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.model.FacePoint;
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
 * Location of one face in an image
 */
@ApiModel(description = "Location of one face in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-29T22:36:25.078-07:00")
public class FaceWithLandmarks {
  @SerializedName("LeftX")
  private Integer leftX = null;

  @SerializedName("TopY")
  private Integer topY = null;

  @SerializedName("RightX")
  private Integer rightX = null;

  @SerializedName("BottomY")
  private Integer bottomY = null;

  @SerializedName("LeftEyebrow")
  private List<FacePoint> leftEyebrow = null;

  @SerializedName("RightEyebrow")
  private List<FacePoint> rightEyebrow = null;

  @SerializedName("LeftEye")
  private List<FacePoint> leftEye = null;

  @SerializedName("RightEye")
  private List<FacePoint> rightEye = null;

  @SerializedName("BottomAndSidesOfFace")
  private List<FacePoint> bottomAndSidesOfFace = null;

  @SerializedName("NoseBridge")
  private List<FacePoint> noseBridge = null;

  @SerializedName("NoseBottom")
  private List<FacePoint> noseBottom = null;

  @SerializedName("LipsInnerOutline")
  private List<FacePoint> lipsInnerOutline = null;

  @SerializedName("LipsOuterOutline")
  private List<FacePoint> lipsOuterOutline = null;

  public FaceWithLandmarks leftX(Integer leftX) {
    this.leftX = leftX;
    return this;
  }

   /**
   * X coordinate of the left side of the face
   * @return leftX
  **/
  @ApiModelProperty(value = "X coordinate of the left side of the face")
  public Integer getLeftX() {
    return leftX;
  }

  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }

  public FaceWithLandmarks topY(Integer topY) {
    this.topY = topY;
    return this;
  }

   /**
   * Y coordinate of the top side of the face
   * @return topY
  **/
  @ApiModelProperty(value = "Y coordinate of the top side of the face")
  public Integer getTopY() {
    return topY;
  }

  public void setTopY(Integer topY) {
    this.topY = topY;
  }

  public FaceWithLandmarks rightX(Integer rightX) {
    this.rightX = rightX;
    return this;
  }

   /**
   * X coordinate of the right side of the face
   * @return rightX
  **/
  @ApiModelProperty(value = "X coordinate of the right side of the face")
  public Integer getRightX() {
    return rightX;
  }

  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }

  public FaceWithLandmarks bottomY(Integer bottomY) {
    this.bottomY = bottomY;
    return this;
  }

   /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
  **/
  @ApiModelProperty(value = "Y coordinate of the bottom side of the face")
  public Integer getBottomY() {
    return bottomY;
  }

  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }

  public FaceWithLandmarks leftEyebrow(List<FacePoint> leftEyebrow) {
    this.leftEyebrow = leftEyebrow;
    return this;
  }

  public FaceWithLandmarks addLeftEyebrowItem(FacePoint leftEyebrowItem) {
    if (this.leftEyebrow == null) {
      this.leftEyebrow = new ArrayList<FacePoint>();
    }
    this.leftEyebrow.add(leftEyebrowItem);
    return this;
  }

   /**
   * Point locations of the left eyebrow (the eyebrow cloesest to the left side of the picture)
   * @return leftEyebrow
  **/
  @ApiModelProperty(value = "Point locations of the left eyebrow (the eyebrow cloesest to the left side of the picture)")
  public List<FacePoint> getLeftEyebrow() {
    return leftEyebrow;
  }

  public void setLeftEyebrow(List<FacePoint> leftEyebrow) {
    this.leftEyebrow = leftEyebrow;
  }

  public FaceWithLandmarks rightEyebrow(List<FacePoint> rightEyebrow) {
    this.rightEyebrow = rightEyebrow;
    return this;
  }

  public FaceWithLandmarks addRightEyebrowItem(FacePoint rightEyebrowItem) {
    if (this.rightEyebrow == null) {
      this.rightEyebrow = new ArrayList<FacePoint>();
    }
    this.rightEyebrow.add(rightEyebrowItem);
    return this;
  }

   /**
   * Point locations of the right eyebrow (the eyebrow cloesest to the right side of the picture)
   * @return rightEyebrow
  **/
  @ApiModelProperty(value = "Point locations of the right eyebrow (the eyebrow cloesest to the right side of the picture)")
  public List<FacePoint> getRightEyebrow() {
    return rightEyebrow;
  }

  public void setRightEyebrow(List<FacePoint> rightEyebrow) {
    this.rightEyebrow = rightEyebrow;
  }

  public FaceWithLandmarks leftEye(List<FacePoint> leftEye) {
    this.leftEye = leftEye;
    return this;
  }

  public FaceWithLandmarks addLeftEyeItem(FacePoint leftEyeItem) {
    if (this.leftEye == null) {
      this.leftEye = new ArrayList<FacePoint>();
    }
    this.leftEye.add(leftEyeItem);
    return this;
  }

   /**
   * Point locations of the left eye (the eye closest to the left side of the picture)
   * @return leftEye
  **/
  @ApiModelProperty(value = "Point locations of the left eye (the eye closest to the left side of the picture)")
  public List<FacePoint> getLeftEye() {
    return leftEye;
  }

  public void setLeftEye(List<FacePoint> leftEye) {
    this.leftEye = leftEye;
  }

  public FaceWithLandmarks rightEye(List<FacePoint> rightEye) {
    this.rightEye = rightEye;
    return this;
  }

  public FaceWithLandmarks addRightEyeItem(FacePoint rightEyeItem) {
    if (this.rightEye == null) {
      this.rightEye = new ArrayList<FacePoint>();
    }
    this.rightEye.add(rightEyeItem);
    return this;
  }

   /**
   * Point locations of the right eye (the eye closest to the right side of the picture)
   * @return rightEye
  **/
  @ApiModelProperty(value = "Point locations of the right eye (the eye closest to the right side of the picture)")
  public List<FacePoint> getRightEye() {
    return rightEye;
  }

  public void setRightEye(List<FacePoint> rightEye) {
    this.rightEye = rightEye;
  }

  public FaceWithLandmarks bottomAndSidesOfFace(List<FacePoint> bottomAndSidesOfFace) {
    this.bottomAndSidesOfFace = bottomAndSidesOfFace;
    return this;
  }

  public FaceWithLandmarks addBottomAndSidesOfFaceItem(FacePoint bottomAndSidesOfFaceItem) {
    if (this.bottomAndSidesOfFace == null) {
      this.bottomAndSidesOfFace = new ArrayList<FacePoint>();
    }
    this.bottomAndSidesOfFace.add(bottomAndSidesOfFaceItem);
    return this;
  }

   /**
   * Point locations of the bottom and sides of the face (cheeks and chin)
   * @return bottomAndSidesOfFace
  **/
  @ApiModelProperty(value = "Point locations of the bottom and sides of the face (cheeks and chin)")
  public List<FacePoint> getBottomAndSidesOfFace() {
    return bottomAndSidesOfFace;
  }

  public void setBottomAndSidesOfFace(List<FacePoint> bottomAndSidesOfFace) {
    this.bottomAndSidesOfFace = bottomAndSidesOfFace;
  }

  public FaceWithLandmarks noseBridge(List<FacePoint> noseBridge) {
    this.noseBridge = noseBridge;
    return this;
  }

  public FaceWithLandmarks addNoseBridgeItem(FacePoint noseBridgeItem) {
    if (this.noseBridge == null) {
      this.noseBridge = new ArrayList<FacePoint>();
    }
    this.noseBridge.add(noseBridgeItem);
    return this;
  }

   /**
   * Point locations of the nose bridge (the vertical portion of the nose)
   * @return noseBridge
  **/
  @ApiModelProperty(value = "Point locations of the nose bridge (the vertical portion of the nose)")
  public List<FacePoint> getNoseBridge() {
    return noseBridge;
  }

  public void setNoseBridge(List<FacePoint> noseBridge) {
    this.noseBridge = noseBridge;
  }

  public FaceWithLandmarks noseBottom(List<FacePoint> noseBottom) {
    this.noseBottom = noseBottom;
    return this;
  }

  public FaceWithLandmarks addNoseBottomItem(FacePoint noseBottomItem) {
    if (this.noseBottom == null) {
      this.noseBottom = new ArrayList<FacePoint>();
    }
    this.noseBottom.add(noseBottomItem);
    return this;
  }

   /**
   * Point locations of the bottom (nostrils) of the nose
   * @return noseBottom
  **/
  @ApiModelProperty(value = "Point locations of the bottom (nostrils) of the nose")
  public List<FacePoint> getNoseBottom() {
    return noseBottom;
  }

  public void setNoseBottom(List<FacePoint> noseBottom) {
    this.noseBottom = noseBottom;
  }

  public FaceWithLandmarks lipsInnerOutline(List<FacePoint> lipsInnerOutline) {
    this.lipsInnerOutline = lipsInnerOutline;
    return this;
  }

  public FaceWithLandmarks addLipsInnerOutlineItem(FacePoint lipsInnerOutlineItem) {
    if (this.lipsInnerOutline == null) {
      this.lipsInnerOutline = new ArrayList<FacePoint>();
    }
    this.lipsInnerOutline.add(lipsInnerOutlineItem);
    return this;
  }

   /**
   * Point locations of the inner outline of the lips
   * @return lipsInnerOutline
  **/
  @ApiModelProperty(value = "Point locations of the inner outline of the lips")
  public List<FacePoint> getLipsInnerOutline() {
    return lipsInnerOutline;
  }

  public void setLipsInnerOutline(List<FacePoint> lipsInnerOutline) {
    this.lipsInnerOutline = lipsInnerOutline;
  }

  public FaceWithLandmarks lipsOuterOutline(List<FacePoint> lipsOuterOutline) {
    this.lipsOuterOutline = lipsOuterOutline;
    return this;
  }

  public FaceWithLandmarks addLipsOuterOutlineItem(FacePoint lipsOuterOutlineItem) {
    if (this.lipsOuterOutline == null) {
      this.lipsOuterOutline = new ArrayList<FacePoint>();
    }
    this.lipsOuterOutline.add(lipsOuterOutlineItem);
    return this;
  }

   /**
   * Point locations of the outer outline of the lips
   * @return lipsOuterOutline
  **/
  @ApiModelProperty(value = "Point locations of the outer outline of the lips")
  public List<FacePoint> getLipsOuterOutline() {
    return lipsOuterOutline;
  }

  public void setLipsOuterOutline(List<FacePoint> lipsOuterOutline) {
    this.lipsOuterOutline = lipsOuterOutline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceWithLandmarks faceWithLandmarks = (FaceWithLandmarks) o;
    return Objects.equals(this.leftX, faceWithLandmarks.leftX) &&
        Objects.equals(this.topY, faceWithLandmarks.topY) &&
        Objects.equals(this.rightX, faceWithLandmarks.rightX) &&
        Objects.equals(this.bottomY, faceWithLandmarks.bottomY) &&
        Objects.equals(this.leftEyebrow, faceWithLandmarks.leftEyebrow) &&
        Objects.equals(this.rightEyebrow, faceWithLandmarks.rightEyebrow) &&
        Objects.equals(this.leftEye, faceWithLandmarks.leftEye) &&
        Objects.equals(this.rightEye, faceWithLandmarks.rightEye) &&
        Objects.equals(this.bottomAndSidesOfFace, faceWithLandmarks.bottomAndSidesOfFace) &&
        Objects.equals(this.noseBridge, faceWithLandmarks.noseBridge) &&
        Objects.equals(this.noseBottom, faceWithLandmarks.noseBottom) &&
        Objects.equals(this.lipsInnerOutline, faceWithLandmarks.lipsInnerOutline) &&
        Objects.equals(this.lipsOuterOutline, faceWithLandmarks.lipsOuterOutline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY, leftEyebrow, rightEyebrow, leftEye, rightEye, bottomAndSidesOfFace, noseBridge, noseBottom, lipsInnerOutline, lipsOuterOutline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceWithLandmarks {\n");
    
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
    sb.append("    leftEyebrow: ").append(toIndentedString(leftEyebrow)).append("\n");
    sb.append("    rightEyebrow: ").append(toIndentedString(rightEyebrow)).append("\n");
    sb.append("    leftEye: ").append(toIndentedString(leftEye)).append("\n");
    sb.append("    rightEye: ").append(toIndentedString(rightEye)).append("\n");
    sb.append("    bottomAndSidesOfFace: ").append(toIndentedString(bottomAndSidesOfFace)).append("\n");
    sb.append("    noseBridge: ").append(toIndentedString(noseBridge)).append("\n");
    sb.append("    noseBottom: ").append(toIndentedString(noseBottom)).append("\n");
    sb.append("    lipsInnerOutline: ").append(toIndentedString(lipsInnerOutline)).append("\n");
    sb.append("    lipsOuterOutline: ").append(toIndentedString(lipsOuterOutline)).append("\n");
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

