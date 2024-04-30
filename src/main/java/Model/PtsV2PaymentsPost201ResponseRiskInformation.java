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
import Model.PtsV2PaymentsPost201ResponseRiskInformationInfoCodes;
import Model.PtsV2PaymentsPost201ResponseRiskInformationIpAddress;
import Model.PtsV2PaymentsPost201ResponseRiskInformationProcessorResults;
import Model.PtsV2PaymentsPost201ResponseRiskInformationProfile;
import Model.PtsV2PaymentsPost201ResponseRiskInformationRules;
import Model.PtsV2PaymentsPost201ResponseRiskInformationScore;
import Model.PtsV2PaymentsPost201ResponseRiskInformationTravel;
import Model.PtsV2PaymentsPost201ResponseRiskInformationVelocity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains the result of risk assessment.
 */
@ApiModel(description = "Contains the result of risk assessment.")

public class PtsV2PaymentsPost201ResponseRiskInformation {
  @SerializedName("profile")
  private PtsV2PaymentsPost201ResponseRiskInformationProfile profile = null;

  @SerializedName("rules")
  private List<PtsV2PaymentsPost201ResponseRiskInformationRules> rules = null;

  @SerializedName("infoCodes")
  private PtsV2PaymentsPost201ResponseRiskInformationInfoCodes infoCodes = null;

  @SerializedName("velocity")
  private PtsV2PaymentsPost201ResponseRiskInformationVelocity velocity = null;

  @SerializedName("casePriority")
  private Integer casePriority = null;

  @SerializedName("localTime")
  private String localTime = null;

  @SerializedName("score")
  private PtsV2PaymentsPost201ResponseRiskInformationScore score = null;

  @SerializedName("ipAddress")
  private PtsV2PaymentsPost201ResponseRiskInformationIpAddress ipAddress = null;

  @SerializedName("providers")
  private Map<String, Map<String, String>> providers = null;

  @SerializedName("travel")
  private PtsV2PaymentsPost201ResponseRiskInformationTravel travel = null;

  @SerializedName("processorResults")
  private PtsV2PaymentsPost201ResponseRiskInformationProcessorResults processorResults = null;

  public PtsV2PaymentsPost201ResponseRiskInformation profile(PtsV2PaymentsPost201ResponseRiskInformationProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationProfile getProfile() {
    return profile;
  }

  public void setProfile(PtsV2PaymentsPost201ResponseRiskInformationProfile profile) {
    this.profile = profile;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation rules(List<PtsV2PaymentsPost201ResponseRiskInformationRules> rules) {
    this.rules = rules;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation addRulesItem(PtsV2PaymentsPost201ResponseRiskInformationRules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PtsV2PaymentsPost201ResponseRiskInformationRules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<PtsV2PaymentsPost201ResponseRiskInformationRules> getRules() {
    return rules;
  }

  public void setRules(List<PtsV2PaymentsPost201ResponseRiskInformationRules> rules) {
    this.rules = rules;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation infoCodes(PtsV2PaymentsPost201ResponseRiskInformationInfoCodes infoCodes) {
    this.infoCodes = infoCodes;
    return this;
  }

   /**
   * Get infoCodes
   * @return infoCodes
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationInfoCodes getInfoCodes() {
    return infoCodes;
  }

  public void setInfoCodes(PtsV2PaymentsPost201ResponseRiskInformationInfoCodes infoCodes) {
    this.infoCodes = infoCodes;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation velocity(PtsV2PaymentsPost201ResponseRiskInformationVelocity velocity) {
    this.velocity = velocity;
    return this;
  }

   /**
   * Get velocity
   * @return velocity
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationVelocity getVelocity() {
    return velocity;
  }

  public void setVelocity(PtsV2PaymentsPost201ResponseRiskInformationVelocity velocity) {
    this.velocity = velocity;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation casePriority(Integer casePriority) {
    this.casePriority = casePriority;
    return this;
  }

   /**
   * You receive this field only if you subscribe to the Enhanced Case Management service. The priority level ranges from 1 (highest) to 5 (lowest); the default value is 3. If you do not assign a priority to your rules or to your profiles, the default value is given to the order.  For all possible values, see the &#x60;decision_case_priority&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link). 
   * @return casePriority
  **/
  @ApiModelProperty(value = "You receive this field only if you subscribe to the Enhanced Case Management service. The priority level ranges from 1 (highest) to 5 (lowest); the default value is 3. If you do not assign a priority to your rules or to your profiles, the default value is given to the order.  For all possible values, see the `decision_case_priority` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link). ")
  public Integer getCasePriority() {
    return casePriority;
  }

  public void setCasePriority(Integer casePriority) {
    this.casePriority = casePriority;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation localTime(String localTime) {
    this.localTime = localTime;
    return this;
  }

   /**
   * The customer&#39;s local time (&#x60;hh:mm:ss&#x60;), which is calculated from the transaction request time and the customer&#39;s billing address.  For details, see the &#x60;score_time_local&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) 
   * @return localTime
  **/
  @ApiModelProperty(value = "The customer's local time (`hh:mm:ss`), which is calculated from the transaction request time and the customer's billing address.  For details, see the `score_time_local` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) ")
  public String getLocalTime() {
    return localTime;
  }

  public void setLocalTime(String localTime) {
    this.localTime = localTime;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation score(PtsV2PaymentsPost201ResponseRiskInformationScore score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationScore getScore() {
    return score;
  }

  public void setScore(PtsV2PaymentsPost201ResponseRiskInformationScore score) {
    this.score = score;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation ipAddress(PtsV2PaymentsPost201ResponseRiskInformationIpAddress ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationIpAddress getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(PtsV2PaymentsPost201ResponseRiskInformationIpAddress ipAddress) {
    this.ipAddress = ipAddress;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation providers(Map<String, Map<String, String>> providers) {
    this.providers = providers;
    return this;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation putProvidersItem(String key, Map<String, String> providersItem) {
    if (this.providers == null) {
      this.providers = new HashMap<String, Map<String, String>>();
    }
    this.providers.put(key, providersItem);
    return this;
  }

   /**
   * Name of the 3rd party provider, for example, Emailage. For all possible values, see the &#x60;decision_provider_#_name&#x60; field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** &gt; **Documentation** &gt; **Guides** &gt; _Decision Manager Using the SCMP API Developer Guide_ (PDF link).
   * @return providers
  **/
  @ApiModelProperty(value = "Name of the 3rd party provider, for example, Emailage. For all possible values, see the `decision_provider_#_name` field description in the _Decision Manager Using the SCMP API Developer Guide_ on the [CyberSource Business Center.](https://ebc2.cybersource.com/ebc2/) Click **Decision Manager** > **Documentation** > **Guides** > _Decision Manager Using the SCMP API Developer Guide_ (PDF link).")
  public Map<String, Map<String, String>> getProviders() {
    return providers;
  }

  public void setProviders(Map<String, Map<String, String>> providers) {
    this.providers = providers;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation travel(PtsV2PaymentsPost201ResponseRiskInformationTravel travel) {
    this.travel = travel;
    return this;
  }

   /**
   * Get travel
   * @return travel
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationTravel getTravel() {
    return travel;
  }

  public void setTravel(PtsV2PaymentsPost201ResponseRiskInformationTravel travel) {
    this.travel = travel;
  }

  public PtsV2PaymentsPost201ResponseRiskInformation processorResults(PtsV2PaymentsPost201ResponseRiskInformationProcessorResults processorResults) {
    this.processorResults = processorResults;
    return this;
  }

   /**
   * Get processorResults
   * @return processorResults
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseRiskInformationProcessorResults getProcessorResults() {
    return processorResults;
  }

  public void setProcessorResults(PtsV2PaymentsPost201ResponseRiskInformationProcessorResults processorResults) {
    this.processorResults = processorResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseRiskInformation ptsV2PaymentsPost201ResponseRiskInformation = (PtsV2PaymentsPost201ResponseRiskInformation) o;
    return Objects.equals(this.profile, ptsV2PaymentsPost201ResponseRiskInformation.profile) &&
        Objects.equals(this.rules, ptsV2PaymentsPost201ResponseRiskInformation.rules) &&
        Objects.equals(this.infoCodes, ptsV2PaymentsPost201ResponseRiskInformation.infoCodes) &&
        Objects.equals(this.velocity, ptsV2PaymentsPost201ResponseRiskInformation.velocity) &&
        Objects.equals(this.casePriority, ptsV2PaymentsPost201ResponseRiskInformation.casePriority) &&
        Objects.equals(this.localTime, ptsV2PaymentsPost201ResponseRiskInformation.localTime) &&
        Objects.equals(this.score, ptsV2PaymentsPost201ResponseRiskInformation.score) &&
        Objects.equals(this.ipAddress, ptsV2PaymentsPost201ResponseRiskInformation.ipAddress) &&
        Objects.equals(this.providers, ptsV2PaymentsPost201ResponseRiskInformation.providers) &&
        Objects.equals(this.travel, ptsV2PaymentsPost201ResponseRiskInformation.travel) &&
        Objects.equals(this.processorResults, ptsV2PaymentsPost201ResponseRiskInformation.processorResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, rules, infoCodes, velocity, casePriority, localTime, score, ipAddress, providers, travel, processorResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseRiskInformation {\n");
    
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    infoCodes: ").append(toIndentedString(infoCodes)).append("\n");
    sb.append("    velocity: ").append(toIndentedString(velocity)).append("\n");
    sb.append("    casePriority: ").append(toIndentedString(casePriority)).append("\n");
    sb.append("    localTime: ").append(toIndentedString(localTime)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    processorResults: ").append(toIndentedString(processorResults)).append("\n");
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

