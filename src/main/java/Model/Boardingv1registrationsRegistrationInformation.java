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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * Boardingv1registrationsRegistrationInformation
 */

public class Boardingv1registrationsRegistrationInformation {
  @SerializedName("boardingRegistrationId")
  private String boardingRegistrationId = null;

  @SerializedName("submitTimeUtc")
  private LocalDate submitTimeUtc = null;

  /**
   * The status of Registration request Possible Values:   - &#39;PROCESSING&#39;: This status is for Registrations that are still in Progress, you can get the latest status by calling the GET endpoint using the Registration Id   - &#39;SUCCESS&#39;: This status is for Registrations that were successfull on every step of the on boarding process.   - &#39;FAILURE&#39;: This status is for Registrations that fail before the Organization was created; please refer to the details section in the reponse for more information.   - &#39;PARTIAL&#39;: This status is for Registrations that created the Organization successfully but fail in at least on step while configuring it; please refer to the details section in the response for more information. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSING("PROCESSING"),
    
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE"),
    
    PARTIAL("PARTIAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("boardingPackageId")
  private String boardingPackageId = null;

  /**
   * Determines the boarding flow for this registration. Possible Values:   - &#39;ENTERPRISE&#39;   - &#39;SMB&#39;   - &#39;ADDPRODUCT&#39; 
   */
  @JsonAdapter(BoardingFlowEnum.Adapter.class)
  public enum BoardingFlowEnum {
    ENTERPRISE("ENTERPRISE"),
    
    SMB("SMB"),
    
    ADDPRODUCT("ADDPRODUCT");

    private String value;

    BoardingFlowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BoardingFlowEnum fromValue(String text) {
      for (BoardingFlowEnum b : BoardingFlowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BoardingFlowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BoardingFlowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BoardingFlowEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BoardingFlowEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("boardingFlow")
  private BoardingFlowEnum boardingFlow = null;

  /**
   * In case mode is not provided the API will use COMPLETE as default Possible Values:   - &#39;COMPLETE&#39;   - &#39;PARTIAL&#39; 
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    COMPLETE("COMPLETE"),
    
    PARTIAL("PARTIAL");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("salesRepId")
  private String salesRepId = null;

   /**
   * Get boardingRegistrationId
   * @return boardingRegistrationId
  **/
  @ApiModelProperty(example = "1234124", value = "")
  public String getBoardingRegistrationId() {
    return boardingRegistrationId;
  }

   /**
   * Time of request in UTC. &#x60;Format: YYYY-MM-DDThh:mm:ssZ&#x60;  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(example = "2019-06-11T22:47:57.000Z", value = "Time of request in UTC. `Format: YYYY-MM-DDThh:mm:ssZ`  Example 2016-08-11T22:47:57Z equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The T separates the date and the time. The Z indicates UTC. ")
  public LocalDate getSubmitTimeUtc() {
    return submitTimeUtc;
  }

   /**
   * The status of Registration request Possible Values:   - &#39;PROCESSING&#39;: This status is for Registrations that are still in Progress, you can get the latest status by calling the GET endpoint using the Registration Id   - &#39;SUCCESS&#39;: This status is for Registrations that were successfull on every step of the on boarding process.   - &#39;FAILURE&#39;: This status is for Registrations that fail before the Organization was created; please refer to the details section in the reponse for more information.   - &#39;PARTIAL&#39;: This status is for Registrations that created the Organization successfully but fail in at least on step while configuring it; please refer to the details section in the response for more information. 
   * @return status
  **/
  @ApiModelProperty(value = "The status of Registration request Possible Values:   - 'PROCESSING': This status is for Registrations that are still in Progress, you can get the latest status by calling the GET endpoint using the Registration Id   - 'SUCCESS': This status is for Registrations that were successfull on every step of the on boarding process.   - 'FAILURE': This status is for Registrations that fail before the Organization was created; please refer to the details section in the reponse for more information.   - 'PARTIAL': This status is for Registrations that created the Organization successfully but fail in at least on step while configuring it; please refer to the details section in the response for more information. ")
  public StatusEnum getStatus() {
    return status;
  }

  public Boardingv1registrationsRegistrationInformation boardingPackageId(String boardingPackageId) {
    this.boardingPackageId = boardingPackageId;
    return this;
  }

   /**
   * Get boardingPackageId
   * @return boardingPackageId
  **/
  @ApiModelProperty(example = "1004001", value = "")
  public String getBoardingPackageId() {
    return boardingPackageId;
  }

  public void setBoardingPackageId(String boardingPackageId) {
    this.boardingPackageId = boardingPackageId;
  }

  public Boardingv1registrationsRegistrationInformation boardingFlow(BoardingFlowEnum boardingFlow) {
    this.boardingFlow = boardingFlow;
    return this;
  }

   /**
   * Determines the boarding flow for this registration. Possible Values:   - &#39;ENTERPRISE&#39;   - &#39;SMB&#39;   - &#39;ADDPRODUCT&#39; 
   * @return boardingFlow
  **/
  @ApiModelProperty(value = "Determines the boarding flow for this registration. Possible Values:   - 'ENTERPRISE'   - 'SMB'   - 'ADDPRODUCT' ")
  public BoardingFlowEnum getBoardingFlow() {
    return boardingFlow;
  }

  public void setBoardingFlow(BoardingFlowEnum boardingFlow) {
    this.boardingFlow = boardingFlow;
  }

  public Boardingv1registrationsRegistrationInformation mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * In case mode is not provided the API will use COMPLETE as default Possible Values:   - &#39;COMPLETE&#39;   - &#39;PARTIAL&#39; 
   * @return mode
  **/
  @ApiModelProperty(value = "In case mode is not provided the API will use COMPLETE as default Possible Values:   - 'COMPLETE'   - 'PARTIAL' ")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public Boardingv1registrationsRegistrationInformation salesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
    return this;
  }

   /**
   * Get salesRepId
   * @return salesRepId
  **/
  @ApiModelProperty(example = "Rep1", value = "")
  public String getSalesRepId() {
    return salesRepId;
  }

  public void setSalesRepId(String salesRepId) {
    this.salesRepId = salesRepId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boardingv1registrationsRegistrationInformation boardingv1registrationsRegistrationInformation = (Boardingv1registrationsRegistrationInformation) o;
    return Objects.equals(this.boardingRegistrationId, boardingv1registrationsRegistrationInformation.boardingRegistrationId) &&
        Objects.equals(this.submitTimeUtc, boardingv1registrationsRegistrationInformation.submitTimeUtc) &&
        Objects.equals(this.status, boardingv1registrationsRegistrationInformation.status) &&
        Objects.equals(this.boardingPackageId, boardingv1registrationsRegistrationInformation.boardingPackageId) &&
        Objects.equals(this.boardingFlow, boardingv1registrationsRegistrationInformation.boardingFlow) &&
        Objects.equals(this.mode, boardingv1registrationsRegistrationInformation.mode) &&
        Objects.equals(this.salesRepId, boardingv1registrationsRegistrationInformation.salesRepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardingRegistrationId, submitTimeUtc, status, boardingPackageId, boardingFlow, mode, salesRepId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Boardingv1registrationsRegistrationInformation {\n");
    
    sb.append("    boardingRegistrationId: ").append(toIndentedString(boardingRegistrationId)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    boardingPackageId: ").append(toIndentedString(boardingPackageId)).append("\n");
    sb.append("    boardingFlow: ").append(toIndentedString(boardingFlow)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    salesRepId: ").append(toIndentedString(salesRepId)).append("\n");
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

