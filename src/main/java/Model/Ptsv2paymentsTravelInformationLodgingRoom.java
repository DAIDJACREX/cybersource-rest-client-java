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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTravelInformationLodgingRoom
 */

public class Ptsv2paymentsTravelInformationLodgingRoom {
  @SerializedName("dailyRate")
  private String dailyRate = null;

  @SerializedName("numberOfNights")
  private Integer numberOfNights = null;

  public Ptsv2paymentsTravelInformationLodgingRoom dailyRate(String dailyRate) {
    this.dailyRate = dailyRate;
    return this;
  }

   /**
   * Daily cost of the room. 
   * @return dailyRate
  **/
  @ApiModelProperty(value = "Daily cost of the room. ")
  public String getDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(String dailyRate) {
    this.dailyRate = dailyRate;
  }

  public Ptsv2paymentsTravelInformationLodgingRoom numberOfNights(Integer numberOfNights) {
    this.numberOfNights = numberOfNights;
    return this;
  }

   /**
   * Number of nights billed at the rate specified by &#x60;travelInformation.lodging.room[].dailyRate&#x60;. 
   * minimum: 1
   * maximum: 9999
   * @return numberOfNights
  **/
  @ApiModelProperty(value = "Number of nights billed at the rate specified by `travelInformation.lodging.room[].dailyRate`. ")
  public Integer getNumberOfNights() {
    return numberOfNights;
  }

  public void setNumberOfNights(Integer numberOfNights) {
    this.numberOfNights = numberOfNights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationLodgingRoom ptsv2paymentsTravelInformationLodgingRoom = (Ptsv2paymentsTravelInformationLodgingRoom) o;
    return Objects.equals(this.dailyRate, ptsv2paymentsTravelInformationLodgingRoom.dailyRate) &&
        Objects.equals(this.numberOfNights, ptsv2paymentsTravelInformationLodgingRoom.numberOfNights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyRate, numberOfNights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationLodgingRoom {\n");
    
    sb.append("    dailyRate: ").append(toIndentedString(dailyRate)).append("\n");
    sb.append("    numberOfNights: ").append(toIndentedString(numberOfNights)).append("\n");
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

