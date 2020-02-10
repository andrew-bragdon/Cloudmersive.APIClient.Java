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
import com.cloudmersive.client.model.DocxSection;
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
 * Result of running a Get-Sections command
 */
@ApiModel(description = "Result of running a Get-Sections command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-09T19:06:16.441-08:00")
public class GetDocxSectionsResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Sections")
  private List<DocxSection> sections = null;

  public GetDocxSectionsResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GetDocxSectionsResponse sections(List<DocxSection> sections) {
    this.sections = sections;
    return this;
  }

  public GetDocxSectionsResponse addSectionsItem(DocxSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<DocxSection>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Sections in the DOCX document
   * @return sections
  **/
  @ApiModelProperty(value = "Sections in the DOCX document")
  public List<DocxSection> getSections() {
    return sections;
  }

  public void setSections(List<DocxSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxSectionsResponse getDocxSectionsResponse = (GetDocxSectionsResponse) o;
    return Objects.equals(this.successful, getDocxSectionsResponse.successful) &&
        Objects.equals(this.sections, getDocxSectionsResponse.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, sections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxSectionsResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

