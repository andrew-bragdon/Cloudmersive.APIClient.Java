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
import com.cloudmersive.client.model.PersonWithGender;
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
 * Result from classifying the Gender of people in an image
 */
@ApiModel(description = "Result from classifying the Gender of people in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-15T18:41:23.795-07:00")
public class GenderDetectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("PersonWithGender")
  private List<PersonWithGender> personWithGender = null;

  @SerializedName("PeopleIdentified")
  private Integer peopleIdentified = null;

  public GenderDetectionResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public GenderDetectionResult personWithGender(List<PersonWithGender> personWithGender) {
    this.personWithGender = personWithGender;
    return this;
  }

  public GenderDetectionResult addPersonWithGenderItem(PersonWithGender personWithGenderItem) {
    if (this.personWithGender == null) {
      this.personWithGender = new ArrayList<PersonWithGender>();
    }
    this.personWithGender.add(personWithGenderItem);
    return this;
  }

   /**
   * People in the image annotated with gender information
   * @return personWithGender
  **/
  @ApiModelProperty(value = "People in the image annotated with gender information")
  public List<PersonWithGender> getPersonWithGender() {
    return personWithGender;
  }

  public void setPersonWithGender(List<PersonWithGender> personWithGender) {
    this.personWithGender = personWithGender;
  }

  public GenderDetectionResult peopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
    return this;
  }

   /**
   * Number of people identified in the image with a gender
   * @return peopleIdentified
  **/
  @ApiModelProperty(value = "Number of people identified in the image with a gender")
  public Integer getPeopleIdentified() {
    return peopleIdentified;
  }

  public void setPeopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderDetectionResult genderDetectionResult = (GenderDetectionResult) o;
    return Objects.equals(this.successful, genderDetectionResult.successful) &&
        Objects.equals(this.personWithGender, genderDetectionResult.personWithGender) &&
        Objects.equals(this.peopleIdentified, genderDetectionResult.peopleIdentified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, personWithGender, peopleIdentified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDetectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    personWithGender: ").append(toIndentedString(personWithGender)).append("\n");
    sb.append("    peopleIdentified: ").append(toIndentedString(peopleIdentified)).append("\n");
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

