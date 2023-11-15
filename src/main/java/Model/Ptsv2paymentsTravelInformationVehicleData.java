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
 * Ptsv2paymentsTravelInformationVehicleData
 */

public class Ptsv2paymentsTravelInformationVehicleData {
  @SerializedName("connectorType")
  private String connectorType = null;

  @SerializedName("chargingReasonCode")
  private String chargingReasonCode = null;

  public Ptsv2paymentsTravelInformationVehicleData connectorType(String connectorType) {
    this.connectorType = connectorType;
    return this;
  }

   /**
   * This field will contain connector type values for electric vehicle transactions.  Possible Values: 001 (AC - J1772 Type 1) 002 (AC - Mennekes - Type 2) 003 (AC - GB/T) 100 (DC - CCS1) 101 (DC - CHAdeMO) 102 (DC - CCS2) 103 (DC - GB/T) 200 (NACS – Tesla) 
   * @return connectorType
  **/
  @ApiModelProperty(value = "This field will contain connector type values for electric vehicle transactions.  Possible Values: 001 (AC - J1772 Type 1) 002 (AC - Mennekes - Type 2) 003 (AC - GB/T) 100 (DC - CCS1) 101 (DC - CHAdeMO) 102 (DC - CCS2) 103 (DC - GB/T) 200 (NACS – Tesla) ")
  public String getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }

  public Ptsv2paymentsTravelInformationVehicleData chargingReasonCode(String chargingReasonCode) {
    this.chargingReasonCode = chargingReasonCode;
    return this;
  }

   /**
   * This field will contain charging reason code values for electric vehicle transactions.  Possible Values: 010 (Other Error) 011 (Connector Lock Failure) 012 (EV Communication Error) 013 (Ground Failure) 014 (High Temperature) 015 (Internal Error) 016 (Over Current Failure) 017 (Over Voltage) 018 (Power Meter Failure) 019 (Power Switch Failure) 020 (Reader Failure) 021 (Reset Failure) 022 (Under Voltage) 023 (Weak Signal) 100 (No Error) 200 (Payment Related Error) 
   * @return chargingReasonCode
  **/
  @ApiModelProperty(value = "This field will contain charging reason code values for electric vehicle transactions.  Possible Values: 010 (Other Error) 011 (Connector Lock Failure) 012 (EV Communication Error) 013 (Ground Failure) 014 (High Temperature) 015 (Internal Error) 016 (Over Current Failure) 017 (Over Voltage) 018 (Power Meter Failure) 019 (Power Switch Failure) 020 (Reader Failure) 021 (Reset Failure) 022 (Under Voltage) 023 (Weak Signal) 100 (No Error) 200 (Payment Related Error) ")
  public String getChargingReasonCode() {
    return chargingReasonCode;
  }

  public void setChargingReasonCode(String chargingReasonCode) {
    this.chargingReasonCode = chargingReasonCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationVehicleData ptsv2paymentsTravelInformationVehicleData = (Ptsv2paymentsTravelInformationVehicleData) o;
    return Objects.equals(this.connectorType, ptsv2paymentsTravelInformationVehicleData.connectorType) &&
        Objects.equals(this.chargingReasonCode, ptsv2paymentsTravelInformationVehicleData.chargingReasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorType, chargingReasonCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationVehicleData {\n");
    
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    chargingReasonCode: ").append(toIndentedString(chargingReasonCode)).append("\n");
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
