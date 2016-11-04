/**
 * s4s-full
 * description
 *
 * OpenAPI spec version: stable
 * Contact: rui.p.oliveira@impactinglabs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PricingTablePlanCost;
import io.swagger.client.model.PricingTableResource;
import java.util.ArrayList;
import java.util.List;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class PricingTable2Plan   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("costMain")
  private PricingTablePlanCost costMain = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("requirePaymentMethod")
  private Boolean requirePaymentMethod = null;

  @SerializedName("packId")
  private String packId = null;

  /**
   * Gets or Sets typ
   */
  public enum TypEnum {
    @SerializedName("OneTimePay")
    ONETIMEPAY("OneTimePay"),
    
    @SerializedName("Subscription")
    SUBSCRIPTION("Subscription");

    private String value;

    TypEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("typ")
  private TypEnum typ = null;

  @SerializedName("resources")
  private List<PricingTableResource> resources = new ArrayList<PricingTableResource>();

  @SerializedName("costList")
  private List<PricingTablePlanCost> costList = new ArrayList<PricingTablePlanCost>();

  @SerializedName("planId")
  private String planId = null;

  @SerializedName("subscribeUrl")
  private String subscribeUrl = null;

  public PricingTable2Plan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PricingTable2Plan costMain(PricingTablePlanCost costMain) {
    this.costMain = costMain;
    return this;
  }

   /**
   * Get costMain
   * @return costMain
  **/
  @ApiModelProperty(example = "null", value = "")
  public PricingTablePlanCost getCostMain() {
    return costMain;
  }

  public void setCostMain(PricingTablePlanCost costMain) {
    this.costMain = costMain;
  }

  public PricingTable2Plan description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PricingTable2Plan requirePaymentMethod(Boolean requirePaymentMethod) {
    this.requirePaymentMethod = requirePaymentMethod;
    return this;
  }

   /**
   * Get requirePaymentMethod
   * @return requirePaymentMethod
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequirePaymentMethod() {
    return requirePaymentMethod;
  }

  public void setRequirePaymentMethod(Boolean requirePaymentMethod) {
    this.requirePaymentMethod = requirePaymentMethod;
  }

  public PricingTable2Plan packId(String packId) {
    this.packId = packId;
    return this;
  }

   /**
   * Get packId
   * @return packId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPackId() {
    return packId;
  }

  public void setPackId(String packId) {
    this.packId = packId;
  }

  public PricingTable2Plan typ(TypEnum typ) {
    this.typ = typ;
    return this;
  }

   /**
   * Get typ
   * @return typ
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypEnum getTyp() {
    return typ;
  }

  public void setTyp(TypEnum typ) {
    this.typ = typ;
  }

  public PricingTable2Plan resources(List<PricingTableResource> resources) {
    this.resources = resources;
    return this;
  }

  public PricingTable2Plan addResourcesItem(PricingTableResource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PricingTableResource> getResources() {
    return resources;
  }

  public void setResources(List<PricingTableResource> resources) {
    this.resources = resources;
  }

  public PricingTable2Plan costList(List<PricingTablePlanCost> costList) {
    this.costList = costList;
    return this;
  }

  public PricingTable2Plan addCostListItem(PricingTablePlanCost costListItem) {
    this.costList.add(costListItem);
    return this;
  }

   /**
   * Get costList
   * @return costList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PricingTablePlanCost> getCostList() {
    return costList;
  }

  public void setCostList(List<PricingTablePlanCost> costList) {
    this.costList = costList;
  }

  public PricingTable2Plan planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public PricingTable2Plan subscribeUrl(String subscribeUrl) {
    this.subscribeUrl = subscribeUrl;
    return this;
  }

   /**
   * Get subscribeUrl
   * @return subscribeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubscribeUrl() {
    return subscribeUrl;
  }

  public void setSubscribeUrl(String subscribeUrl) {
    this.subscribeUrl = subscribeUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTable2Plan pricingTable2Plan = (PricingTable2Plan) o;
    return Objects.equals(this.name, pricingTable2Plan.name) &&
        Objects.equals(this.costMain, pricingTable2Plan.costMain) &&
        Objects.equals(this.description, pricingTable2Plan.description) &&
        Objects.equals(this.requirePaymentMethod, pricingTable2Plan.requirePaymentMethod) &&
        Objects.equals(this.packId, pricingTable2Plan.packId) &&
        Objects.equals(this.typ, pricingTable2Plan.typ) &&
        Objects.equals(this.resources, pricingTable2Plan.resources) &&
        Objects.equals(this.costList, pricingTable2Plan.costList) &&
        Objects.equals(this.planId, pricingTable2Plan.planId) &&
        Objects.equals(this.subscribeUrl, pricingTable2Plan.subscribeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, costMain, description, requirePaymentMethod, packId, typ, resources, costList, planId, subscribeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTable2Plan {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costMain: ").append(toIndentedString(costMain)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requirePaymentMethod: ").append(toIndentedString(requirePaymentMethod)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    costList: ").append(toIndentedString(costList)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    subscribeUrl: ").append(toIndentedString(subscribeUrl)).append("\n");
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

