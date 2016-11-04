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
import io.swagger.client.model.ResourceStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Model description
 */
@ApiModel(description = "Model description")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-04T14:36:36.360Z")
public class CustomerPack   {
  @SerializedName("closedTime")
  private Long closedTime = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("History")
    HISTORY("History"),
    
    @SerializedName("Closing")
    CLOSING("Closing"),
    
    @SerializedName("Enjoy")
    ENJOY("Enjoy"),
    
    @SerializedName("Creating")
    CREATING("Creating");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("resourceStatuList")
  private List<ResourceStatus> resourceStatuList = new ArrayList<ResourceStatus>();

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("expirationTimeSpan")
  private Long expirationTimeSpan = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("exactConfId")
  private String exactConfId = null;

  @SerializedName("packId")
  private String packId = null;

  @SerializedName("spent")
  private Map<String, Long> spent = new HashMap<String, Long>();

  @SerializedName("creationTime")
  private Long creationTime = null;

  public CustomerPack closedTime(Long closedTime) {
    this.closedTime = closedTime;
    return this;
  }

   /**
   * Get closedTime
   * @return closedTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClosedTime() {
    return closedTime;
  }

  public void setClosedTime(Long closedTime) {
    this.closedTime = closedTime;
  }

  public CustomerPack state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CustomerPack resourceStatuList(List<ResourceStatus> resourceStatuList) {
    this.resourceStatuList = resourceStatuList;
    return this;
  }

  public CustomerPack addResourceStatuListItem(ResourceStatus resourceStatuListItem) {
    this.resourceStatuList.add(resourceStatuListItem);
    return this;
  }

   /**
   * Get resourceStatuList
   * @return resourceStatuList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ResourceStatus> getResourceStatuList() {
    return resourceStatuList;
  }

  public void setResourceStatuList(List<ResourceStatus> resourceStatuList) {
    this.resourceStatuList = resourceStatuList;
  }

  public CustomerPack subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public CustomerPack expirationTimeSpan(Long expirationTimeSpan) {
    this.expirationTimeSpan = expirationTimeSpan;
    return this;
  }

   /**
   * Get expirationTimeSpan
   * @return expirationTimeSpan
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExpirationTimeSpan() {
    return expirationTimeSpan;
  }

  public void setExpirationTimeSpan(Long expirationTimeSpan) {
    this.expirationTimeSpan = expirationTimeSpan;
  }

  public CustomerPack customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public CustomerPack id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerPack exactConfId(String exactConfId) {
    this.exactConfId = exactConfId;
    return this;
  }

   /**
   * Get exactConfId
   * @return exactConfId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExactConfId() {
    return exactConfId;
  }

  public void setExactConfId(String exactConfId) {
    this.exactConfId = exactConfId;
  }

  public CustomerPack packId(String packId) {
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

  public CustomerPack spent(Map<String, Long> spent) {
    this.spent = spent;
    return this;
  }

  public CustomerPack putSpentItem(String key, Long spentItem) {
    this.spent.put(key, spentItem);
    return this;
  }

   /**
   * Get spent
   * @return spent
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Long> getSpent() {
    return spent;
  }

  public void setSpent(Map<String, Long> spent) {
    this.spent = spent;
  }

  public CustomerPack creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPack customerPack = (CustomerPack) o;
    return Objects.equals(this.closedTime, customerPack.closedTime) &&
        Objects.equals(this.state, customerPack.state) &&
        Objects.equals(this.resourceStatuList, customerPack.resourceStatuList) &&
        Objects.equals(this.subscriptionId, customerPack.subscriptionId) &&
        Objects.equals(this.expirationTimeSpan, customerPack.expirationTimeSpan) &&
        Objects.equals(this.customerId, customerPack.customerId) &&
        Objects.equals(this.id, customerPack.id) &&
        Objects.equals(this.exactConfId, customerPack.exactConfId) &&
        Objects.equals(this.packId, customerPack.packId) &&
        Objects.equals(this.spent, customerPack.spent) &&
        Objects.equals(this.creationTime, customerPack.creationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closedTime, state, resourceStatuList, subscriptionId, expirationTimeSpan, customerId, id, exactConfId, packId, spent, creationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPack {\n");
    
    sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    resourceStatuList: ").append(toIndentedString(resourceStatuList)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    expirationTimeSpan: ").append(toIndentedString(expirationTimeSpan)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exactConfId: ").append(toIndentedString(exactConfId)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    spent: ").append(toIndentedString(spent)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
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

