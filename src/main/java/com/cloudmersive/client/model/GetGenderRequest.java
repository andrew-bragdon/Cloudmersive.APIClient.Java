/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Request to get the gender from a first name
 */
@ApiModel(description = "Request to get the gender from a first name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-28T19:47:51.374-07:00")
public class GetGenderRequest {
  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  public GetGenderRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Input first name (given name) to get the gender of
   * @return firstName
  **/
  @ApiModelProperty(value = "Input first name (given name) to get the gender of")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public GetGenderRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional; the country for this name, possible values are \&quot;US\&quot;, \&quot;LY\&quot;, \&quot;NI\&quot;, \&quot;TT\&quot;, \&quot;MK\&quot;, \&quot;KZ\&quot;, \&quot;BO\&quot;, \&quot;UG\&quot;, \&quot;TZ\&quot;, \&quot;CL\&quot;, \&quot;SI\&quot;, \&quot;MA\&quot;, \&quot;RW\&quot;, \&quot;VN\&quot;, \&quot;AW\&quot;, \&quot;CY\&quot;, \&quot;BH\&quot;, \&quot;SG\&quot;, \&quot;ZA\&quot;, \&quot;MU\&quot;, \&quot;BR\&quot;, \&quot;TN\&quot;, \&quot;KH\&quot;, \&quot;US\&quot;, \&quot;TH\&quot;, \&quot;TW\&quot;, \&quot;UY\&quot;, \&quot;DO\&quot;, \&quot;CO\&quot;, \&quot;UA\&quot;, \&quot;QA\&quot;, \&quot;BY\&quot;, \&quot;SN\&quot;, \&quot;SD\&quot;, \&quot;FJ\&quot;, \&quot;LB\&quot;, \&quot;BE\&quot;, \&quot;ML\&quot;, \&quot;LV\&quot;, \&quot;FR\&quot;, \&quot;TM\&quot;, \&quot;NG\&quot;, \&quot;EC\&quot;, \&quot;NO\&quot;, \&quot;SL\&quot;, \&quot;CR\&quot;, \&quot;PA\&quot;, \&quot;GE\&quot;, \&quot;CH\&quot;, \&quot;KR\&quot;, \&quot;RS\&quot;, \&quot;ZM\&quot;, \&quot;FI\&quot;, \&quot;BF\&quot;, \&quot;MC\&quot;, \&quot;AU\&quot;, \&quot;GA\&quot;, \&quot;LS\&quot;, \&quot;RU\&quot;, \&quot;IN\&quot;, \&quot;SE\&quot;, \&quot;LK\&quot;, \&quot;BZ\&quot;, \&quot;MX\&quot;, \&quot;GH\&quot;, \&quot;AF\&quot;, \&quot;TJ\&quot;, \&quot;BN\&quot;, \&quot;DZ\&quot;, \&quot;CM\&quot;, \&quot;GR\&quot;, \&quot;MD\&quot;, \&quot;HN\&quot;, \&quot;AT\&quot;, \&quot;NZ\&quot;, \&quot;SV\&quot;, \&quot;GW\&quot;, \&quot;NA\&quot;, \&quot;AR\&quot;, \&quot;MZ\&quot;, \&quot;PK\&quot;, \&quot;MN\&quot;, \&quot;IQ\&quot;, \&quot;BW\&quot;, \&quot;VE\&quot;, \&quot;PT\&quot;, \&quot;BS\&quot;, \&quot;AL\&quot;, \&quot;TG\&quot;, \&quot;ID\&quot;, \&quot;ET\&quot;, \&quot;CF\&quot;, \&quot;JP\&quot;, \&quot;BB\&quot;, \&quot;PH\&quot;, \&quot;CU\&quot;, \&quot;BD\&quot;, \&quot;AO\&quot;, \&quot;SM\&quot;, \&quot;LC\&quot;, \&quot;ME\&quot;, \&quot;RO\&quot;,  DANIL\&quot;O\&quot;\&quot;, \&quot;ES\&quot;, \&quot;EE\&quot;, \&quot;IL\&quot;, \&quot;ZW\&quot;, \&quot;SY\&quot;, \&quot;MW\&quot;, \&quot;LU\&quot;, \&quot;IR\&quot;, \&quot;SC\&quot;, \&quot;NL\&quot;, \&quot;JO\&quot;, \&quot;AM\&quot;, \&quot;DE\&quot;, \&quot;GL\&quot;, \&quot;OM\&quot;, \&quot;DK\&quot;, \&quot;HR\&quot;, \&quot;LI\&quot;, \&quot;TD\&quot;, \&quot;KM\&quot;, \&quot;BA\&quot;, \&quot;GM\&quot;, \&quot;GD\&quot;, \&quot;CA\&quot;, \&quot;CZ\&quot;, \&quot;MR\&quot;, \&quot;ST\&quot;, \&quot;IS\&quot;, \&quot;LR\&quot;, \&quot;IE\&quot;, \&quot;VC\&quot;, \&quot;AE\&quot;, \&quot;KG\&quot;, \&quot;DJ\&quot;, \&quot;TR\&quot;, \&quot;KE\&quot;, \&quot;NE\&quot;, \&quot;UZ\&quot;, \&quot;CN\&quot;, \&quot;GQ\&quot;, \&quot;SK\&quot;, \&quot;BJ\&quot;, \&quot;MG\&quot;, \&quot;BT\&quot;, \&quot;EG\&quot;, \&quot;PL\&quot;, \&quot;IT\&quot;, \&quot;SA\&quot;, \&quot;MY\&quot;, \&quot;CI\&quot;, \&quot;AG\&quot;, \&quot;AD\&quot;, \&quot;KS\&quot;, \&quot;HU\&quot;, \&quot;CG\&quot;, \&quot;KP\&quot;, \&quot;DM\&quot;, \&quot;GN\&quot;, \&quot;GT\&quot;, \&quot;NP\&quot;, \&quot;JM\&quot;, \&quot;LA\&quot;, \&quot;GB\&quot;, \&quot;BG\&quot;, \&quot;HT\&quot;, \&quot;PE\&quot;, \&quot;AZ\&quot;, \&quot;LT\&quot;, \&quot;SZ\&quot;, \&quot;PY\&quot;, \&quot;MT\&quot;, \&quot;VA\&quot;
   * @return countryCode
  **/
  @ApiModelProperty(value = "Optional; the country for this name, possible values are \"US\", \"LY\", \"NI\", \"TT\", \"MK\", \"KZ\", \"BO\", \"UG\", \"TZ\", \"CL\", \"SI\", \"MA\", \"RW\", \"VN\", \"AW\", \"CY\", \"BH\", \"SG\", \"ZA\", \"MU\", \"BR\", \"TN\", \"KH\", \"US\", \"TH\", \"TW\", \"UY\", \"DO\", \"CO\", \"UA\", \"QA\", \"BY\", \"SN\", \"SD\", \"FJ\", \"LB\", \"BE\", \"ML\", \"LV\", \"FR\", \"TM\", \"NG\", \"EC\", \"NO\", \"SL\", \"CR\", \"PA\", \"GE\", \"CH\", \"KR\", \"RS\", \"ZM\", \"FI\", \"BF\", \"MC\", \"AU\", \"GA\", \"LS\", \"RU\", \"IN\", \"SE\", \"LK\", \"BZ\", \"MX\", \"GH\", \"AF\", \"TJ\", \"BN\", \"DZ\", \"CM\", \"GR\", \"MD\", \"HN\", \"AT\", \"NZ\", \"SV\", \"GW\", \"NA\", \"AR\", \"MZ\", \"PK\", \"MN\", \"IQ\", \"BW\", \"VE\", \"PT\", \"BS\", \"AL\", \"TG\", \"ID\", \"ET\", \"CF\", \"JP\", \"BB\", \"PH\", \"CU\", \"BD\", \"AO\", \"SM\", \"LC\", \"ME\", \"RO\",  DANIL\"O\"\", \"ES\", \"EE\", \"IL\", \"ZW\", \"SY\", \"MW\", \"LU\", \"IR\", \"SC\", \"NL\", \"JO\", \"AM\", \"DE\", \"GL\", \"OM\", \"DK\", \"HR\", \"LI\", \"TD\", \"KM\", \"BA\", \"GM\", \"GD\", \"CA\", \"CZ\", \"MR\", \"ST\", \"IS\", \"LR\", \"IE\", \"VC\", \"AE\", \"KG\", \"DJ\", \"TR\", \"KE\", \"NE\", \"UZ\", \"CN\", \"GQ\", \"SK\", \"BJ\", \"MG\", \"BT\", \"EG\", \"PL\", \"IT\", \"SA\", \"MY\", \"CI\", \"AG\", \"AD\", \"KS\", \"HU\", \"CG\", \"KP\", \"DM\", \"GN\", \"GT\", \"NP\", \"JM\", \"LA\", \"GB\", \"BG\", \"HT\", \"PE\", \"AZ\", \"LT\", \"SZ\", \"PY\", \"MT\", \"VA\"")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGenderRequest getGenderRequest = (GetGenderRequest) o;
    return Objects.equals(this.firstName, getGenderRequest.firstName) &&
        Objects.equals(this.countryCode, getGenderRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGenderRequest {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

