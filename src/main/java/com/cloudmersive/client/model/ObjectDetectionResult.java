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
import com.cloudmersive.client.model.DetectedObject;
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
 * Result of detecting objects in an image
 */
@ApiModel(description = "Result of detecting objects in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-26T13:02:11.089-07:00")
public class ObjectDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Objects")
  private List<DetectedObject> objects = null;

  @SerializedName("ObjectCount")
  private Integer objectCount = null;

  public ObjectDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @ApiModelProperty(value = "Was the image processed successfully?")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ObjectDetectionResult objects(List<DetectedObject> objects) {
    this.objects = objects;
    return this;
  }

  public ObjectDetectionResult addObjectsItem(DetectedObject objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<DetectedObject>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Array of objects detected in the scene
   * @return objects
  **/
  @ApiModelProperty(value = "Array of objects detected in the scene")
  public List<DetectedObject> getObjects() {
    return objects;
  }

  public void setObjects(List<DetectedObject> objects) {
    this.objects = objects;
  }

  public ObjectDetectionResult objectCount(Integer objectCount) {
    this.objectCount = objectCount;
    return this;
  }

   /**
   * Number of objects detected in the scene
   * @return objectCount
  **/
  @ApiModelProperty(value = "Number of objects detected in the scene")
  public Integer getObjectCount() {
    return objectCount;
  }

  public void setObjectCount(Integer objectCount) {
    this.objectCount = objectCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetectionResult objectDetectionResult = (ObjectDetectionResult) o;
    return Objects.equals(this.successful, objectDetectionResult.successful) &&
        Objects.equals(this.objects, objectDetectionResult.objects) &&
        Objects.equals(this.objectCount, objectDetectionResult.objectCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, objects, objectCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    objectCount: ").append(toIndentedString(objectCount)).append("\n");
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

