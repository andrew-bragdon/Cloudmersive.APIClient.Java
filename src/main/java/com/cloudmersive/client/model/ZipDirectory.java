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
import com.cloudmersive.client.model.ZipDirectory;
import com.cloudmersive.client.model.ZipFile;
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
 * Representation of a directory in a zip file
 */
@ApiModel(description = "Representation of a directory in a zip file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-11T18:04:14.328-07:00")
public class ZipDirectory {
  @SerializedName("DirectoryName")
  private String directoryName = null;

  @SerializedName("DirectoriesInDirectory")
  private List<ZipDirectory> directoriesInDirectory = null;

  @SerializedName("FilesInDirectory")
  private List<ZipFile> filesInDirectory = null;

  public ZipDirectory directoryName(String directoryName) {
    this.directoryName = directoryName;
    return this;
  }

   /**
   * Name of this directory
   * @return directoryName
  **/
  @ApiModelProperty(value = "Name of this directory")
  public String getDirectoryName() {
    return directoryName;
  }

  public void setDirectoryName(String directoryName) {
    this.directoryName = directoryName;
  }

  public ZipDirectory directoriesInDirectory(List<ZipDirectory> directoriesInDirectory) {
    this.directoriesInDirectory = directoriesInDirectory;
    return this;
  }

  public ZipDirectory addDirectoriesInDirectoryItem(ZipDirectory directoriesInDirectoryItem) {
    if (this.directoriesInDirectory == null) {
      this.directoriesInDirectory = new ArrayList<ZipDirectory>();
    }
    this.directoriesInDirectory.add(directoriesInDirectoryItem);
    return this;
  }

   /**
   * Child directories contained directly in this directory
   * @return directoriesInDirectory
  **/
  @ApiModelProperty(value = "Child directories contained directly in this directory")
  public List<ZipDirectory> getDirectoriesInDirectory() {
    return directoriesInDirectory;
  }

  public void setDirectoriesInDirectory(List<ZipDirectory> directoriesInDirectory) {
    this.directoriesInDirectory = directoriesInDirectory;
  }

  public ZipDirectory filesInDirectory(List<ZipFile> filesInDirectory) {
    this.filesInDirectory = filesInDirectory;
    return this;
  }

  public ZipDirectory addFilesInDirectoryItem(ZipFile filesInDirectoryItem) {
    if (this.filesInDirectory == null) {
      this.filesInDirectory = new ArrayList<ZipFile>();
    }
    this.filesInDirectory.add(filesInDirectoryItem);
    return this;
  }

   /**
   * Child files contained directly in this directory
   * @return filesInDirectory
  **/
  @ApiModelProperty(value = "Child files contained directly in this directory")
  public List<ZipFile> getFilesInDirectory() {
    return filesInDirectory;
  }

  public void setFilesInDirectory(List<ZipFile> filesInDirectory) {
    this.filesInDirectory = filesInDirectory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDirectory zipDirectory = (ZipDirectory) o;
    return Objects.equals(this.directoryName, zipDirectory.directoryName) &&
        Objects.equals(this.directoriesInDirectory, zipDirectory.directoriesInDirectory) &&
        Objects.equals(this.filesInDirectory, zipDirectory.filesInDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryName, directoriesInDirectory, filesInDirectory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipDirectory {\n");
    
    sb.append("    directoryName: ").append(toIndentedString(directoryName)).append("\n");
    sb.append("    directoriesInDirectory: ").append(toIndentedString(directoriesInDirectory)).append("\n");
    sb.append("    filesInDirectory: ").append(toIndentedString(filesInDirectory)).append("\n");
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

