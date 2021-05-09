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
import com.cloudmersive.client.model.SettingValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to update a setting
 */
@ApiModel(description = "Request to update a setting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-09T14:00:30.298-07:00")
public class UpdateSettingRequest {
  @SerializedName("BucketID")
  private String bucketID = null;

  @SerializedName("BucketSecretKey")
  private String bucketSecretKey = null;

  @SerializedName("SettingToUpdate")
  private SettingValue settingToUpdate = null;

  public UpdateSettingRequest bucketID(String bucketID) {
    this.bucketID = bucketID;
    return this;
  }

   /**
   * Get bucketID
   * @return bucketID
  **/
  @ApiModelProperty(value = "")
  public String getBucketID() {
    return bucketID;
  }

  public void setBucketID(String bucketID) {
    this.bucketID = bucketID;
  }

  public UpdateSettingRequest bucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
    return this;
  }

   /**
   * Get bucketSecretKey
   * @return bucketSecretKey
  **/
  @ApiModelProperty(value = "")
  public String getBucketSecretKey() {
    return bucketSecretKey;
  }

  public void setBucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
  }

  public UpdateSettingRequest settingToUpdate(SettingValue settingToUpdate) {
    this.settingToUpdate = settingToUpdate;
    return this;
  }

   /**
   * Get settingToUpdate
   * @return settingToUpdate
  **/
  @ApiModelProperty(value = "")
  public SettingValue getSettingToUpdate() {
    return settingToUpdate;
  }

  public void setSettingToUpdate(SettingValue settingToUpdate) {
    this.settingToUpdate = settingToUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSettingRequest updateSettingRequest = (UpdateSettingRequest) o;
    return Objects.equals(this.bucketID, updateSettingRequest.bucketID) &&
        Objects.equals(this.bucketSecretKey, updateSettingRequest.bucketSecretKey) &&
        Objects.equals(this.settingToUpdate, updateSettingRequest.settingToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketID, bucketSecretKey, settingToUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSettingRequest {\n");
    
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
    sb.append("    settingToUpdate: ").append(toIndentedString(settingToUpdate)).append("\n");
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

