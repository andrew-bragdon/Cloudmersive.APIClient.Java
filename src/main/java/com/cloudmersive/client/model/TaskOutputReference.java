/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * Re-use the output from a previously-completed task
 */
@ApiModel(description = "Re-use the output from a previously-completed task")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:57.900-07:00")
public class TaskOutputReference {
  @SerializedName("TaskName")
  private String taskName = null;

  @SerializedName("TargetType")
  private String targetType = null;

  public TaskOutputReference taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Name of the task to use the output from
   * @return taskName
  **/
  @ApiModelProperty(value = "Name of the task to use the output from")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public TaskOutputReference targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Type to convert the output from the referenced task to; possible values are string, binary
   * @return targetType
  **/
  @ApiModelProperty(value = "Type to convert the output from the referenced task to; possible values are string, binary")
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskOutputReference taskOutputReference = (TaskOutputReference) o;
    return Objects.equals(this.taskName, taskOutputReference.taskName) &&
        Objects.equals(this.targetType, taskOutputReference.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, targetType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskOutputReference {\n");
    
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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

