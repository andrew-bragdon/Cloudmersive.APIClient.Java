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
 * HTTP header to add to the HTTP request
 */
@ApiModel(description = "HTTP header to add to the HTTP request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:24:57.900-07:00")
public class HttpOrchestrationHeader {
  @SerializedName("HeaderName")
  private String headerName = null;

  @SerializedName("HeaderValue")
  private String headerValue = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpOrchestrationHeader headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Name of the HTTP header, e.g. \&quot;Content-Type\&quot;
   * @return headerName
  **/
  @ApiModelProperty(value = "Name of the HTTP header, e.g. \"Content-Type\"")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public HttpOrchestrationHeader headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Value of the HTTP header
   * @return headerValue
  **/
  @ApiModelProperty(value = "Value of the HTTP header")
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }

  public HttpOrchestrationHeader useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
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
    HttpOrchestrationHeader httpOrchestrationHeader = (HttpOrchestrationHeader) o;
    return Objects.equals(this.headerName, httpOrchestrationHeader.headerName) &&
        Objects.equals(this.headerValue, httpOrchestrationHeader.headerValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpOrchestrationHeader.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue, useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationHeader {\n");
    
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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

