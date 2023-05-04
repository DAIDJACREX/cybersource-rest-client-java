/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches;
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
 * PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList
 */

public class PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList {
  @SerializedName("matches")
  private List<PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches> matches = null;

  public PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList matches(List<PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches> matches) {
    this.matches = matches;
    return this;
  }

  public PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList addMatchesItem(PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches> getMatches() {
    return matches;
  }

  public void setMatches(List<PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchListMatches> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList ptsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList = (PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList) o;
    return Objects.equals(this.matches, ptsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseWatchlistScreeningInformationWatchList {\n");
    
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
