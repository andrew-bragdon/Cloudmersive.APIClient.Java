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
import com.cloudmersive.client.model.TaskOutputReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Query string parameter
 */
@ApiModel(description = "Query string parameter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-01T14:26:49.483-07:00")
public class HttpGetParameter {
  @SerializedName("ParameterName")
  private String parameterName = null;

  @SerializedName("ParameterValue")
  private String parameterValue = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpGetParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter
   * @return parameterName
  **/
  @ApiModelProperty(value = "Name of the parameter")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public HttpGetParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Value of the parameter
   * @return parameterValue
  **/
  @ApiModelProperty(value = "Value of the parameter")
  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }

  public HttpGetParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.
   * @return useOutputFromPreviousTask
  **/
  @ApiModelProperty(value = "Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.")
  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }

  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpGetParameter httpGetParameter = (HttpGetParameter) o;
    return Objects.equals(this.parameterName, httpGetParameter.parameterName) &&
        Objects.equals(this.parameterValue, httpGetParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpGetParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpGetParameter {\n");
    
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

