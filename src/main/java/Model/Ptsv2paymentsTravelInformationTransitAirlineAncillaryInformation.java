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
import java.util.Arrays;
import Model.Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService;
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
 * Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation
 */

public class Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation {
  @SerializedName("ticketNumber")
  private String ticketNumber = null;

  @SerializedName("passengerName")
  private String passengerName = null;

  @SerializedName("connectedTicketNumber")
  private String connectedTicketNumber = null;

  @SerializedName("creditReasonIndicator")
  private String creditReasonIndicator = null;

  @SerializedName("service")
  private List<Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService> service = null;

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation ticketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
    return this;
  }

   /**
   * Ticket number, which consists of the carrier code, form, and serial number, without the check digit. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional field for ancillary services. 
   * @return ticketNumber
  **/
  @ApiModelProperty(value = "Ticket number, which consists of the carrier code, form, and serial number, without the check digit. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional field for ancillary services. ")
  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation passengerName(String passengerName) {
    this.passengerName = passengerName;
    return this;
  }

   /**
   * Name of the passenger. If the passenger&#39;s name is not available, this value is the cardholder&#39;s name. If neither the passenger&#39;s name nor the cardholder&#39;s name is available, this value is a description of the ancillary purchase. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional field for ancillary service. 
   * @return passengerName
  **/
  @ApiModelProperty(value = "Name of the passenger. If the passenger's name is not available, this value is the cardholder's name. If neither the passenger's name nor the cardholder's name is available, this value is a description of the ancillary purchase. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional field for ancillary service. ")
  public String getPassengerName() {
    return passengerName;
  }

  public void setPassengerName(String passengerName) {
    this.passengerName = passengerName;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation connectedTicketNumber(String connectedTicketNumber) {
    this.connectedTicketNumber = connectedTicketNumber;
    return this;
  }

   /**
   * Number for the airline ticket to which the ancillary purchase is connected.  If this purchase has a connection or relationship to another purchase such as a baggage fee for a passenger transport ticket, this field must contain the ticket number for the other purchase.  For a stand-alone purchase, the value for this field must be the same as the value for the &#x60;travelInformation.transit.airline.ancillaryInformation.ticketNumber&#x60; field. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional request field for ancillary services. 
   * @return connectedTicketNumber
  **/
  @ApiModelProperty(value = "Number for the airline ticket to which the ancillary purchase is connected.  If this purchase has a connection or relationship to another purchase such as a baggage fee for a passenger transport ticket, this field must contain the ticket number for the other purchase.  For a stand-alone purchase, the value for this field must be the same as the value for the `travelInformation.transit.airline.ancillaryInformation.ticketNumber` field. **Important** This field is required in the U.S. in order for you to qualify for either the custom payment service (CPS) or the electronic interchange reimbursement fee (EIRF) program. Format: English characters only. Optional request field for ancillary services. ")
  public String getConnectedTicketNumber() {
    return connectedTicketNumber;
  }

  public void setConnectedTicketNumber(String connectedTicketNumber) {
    this.connectedTicketNumber = connectedTicketNumber;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation creditReasonIndicator(String creditReasonIndicator) {
    this.creditReasonIndicator = creditReasonIndicator;
    return this;
  }

   /**
   * Reason for the credit. Possible values: - &#x60;A&#x60;: Cancellation of the ancillary passenger transport purchase. - &#x60;B&#x60;: Cancellation of the airline ticket and the passenger transport ancillary purchase. - &#x60;C&#x60;: Cancellation of the airline ticket. - &#x60;O&#x60;: Other. - &#x60;P&#x60;: Partial refund of the airline ticket. Format: English characters only. Optional field for ancillary services. 
   * @return creditReasonIndicator
  **/
  @ApiModelProperty(value = "Reason for the credit. Possible values: - `A`: Cancellation of the ancillary passenger transport purchase. - `B`: Cancellation of the airline ticket and the passenger transport ancillary purchase. - `C`: Cancellation of the airline ticket. - `O`: Other. - `P`: Partial refund of the airline ticket. Format: English characters only. Optional field for ancillary services. ")
  public String getCreditReasonIndicator() {
    return creditReasonIndicator;
  }

  public void setCreditReasonIndicator(String creditReasonIndicator) {
    this.creditReasonIndicator = creditReasonIndicator;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation service(List<Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService> service) {
    this.service = service;
    return this;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation addServiceItem(Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService>();
    }
    this.service.add(serviceItem);
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")
  public List<Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService> getService() {
    return service;
  }

  public void setService(List<Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformationService> service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation = (Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation) o;
    return Objects.equals(this.ticketNumber, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation.ticketNumber) &&
        Objects.equals(this.passengerName, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation.passengerName) &&
        Objects.equals(this.connectedTicketNumber, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation.connectedTicketNumber) &&
        Objects.equals(this.creditReasonIndicator, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation.creditReasonIndicator) &&
        Objects.equals(this.service, ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketNumber, passengerName, connectedTicketNumber, creditReasonIndicator, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationTransitAirlineAncillaryInformation {\n");
    
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
    sb.append("    passengerName: ").append(toIndentedString(passengerName)).append("\n");
    sb.append("    connectedTicketNumber: ").append(toIndentedString(connectedTicketNumber)).append("\n");
    sb.append("    creditReasonIndicator: ").append(toIndentedString(creditReasonIndicator)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

