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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.S4sError;
import io.swagger.client.model.CustomerBill;
import io.swagger.client.model.CustomerPlan;
import io.swagger.client.model.Plan;
import io.swagger.client.model.PricingTableFull;
import io.swagger.client.model.PricingTable2Full;
import io.swagger.client.model.PricingConf;
import io.swagger.client.model.PricingUiConf;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SsPricingApi
 */
public class SsPricingApiTest {

    private final SsPricingApi api = new SsPricingApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillCloseTest() throws ApiException {
        String customerId = null;
        String customerBillId = null;
        // CustomerBill response = api.customerBillClose(customerId, customerBillId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillGetTest() throws ApiException {
        String customerId = null;
        String customerBillId = null;
        // CustomerBill response = api.customerBillGet(customerId, customerBillId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillInitGetTest() throws ApiException {
        String customerId = null;
        String billId = null;
        String customerPlanId = null;
        // CustomerBill response = api.customerBillInitGet(customerId, billId, customerPlanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillInitPostTest() throws ApiException {
        String customerId = null;
        String billId = null;
        String customerPlanId = null;
        // CustomerBill response = api.customerBillInitPost(customerId, billId, customerPlanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillOrGetTest() throws ApiException {
        String customerId = null;
        // CustomerBill response = api.customerBillOrGet(customerId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerBillValuesTest() throws ApiException {
        String customerId = null;
        Integer page = null;
        Integer numberPerPage = null;
        // api.customerBillValues(customerId, page, numberPerPage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerHistoryPlanValuesTest() throws ApiException {
        String customerId = null;
        Integer page = null;
        Integer numberPerPage = null;
        // api.customerHistoryPlanValues(customerId, page, numberPerPage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new Product to a Customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanAddTest() throws ApiException {
        String customerId = null;
        CustomerPlan customerPlan = null;
        // CustomerPlan response = api.customerPlanAdd(customerId, customerPlan);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanAddCheckTest() throws ApiException {
        String customerId = null;
        CustomerPlan customerPlan = null;
        // CustomerPlan response = api.customerPlanAddCheck(customerId, customerPlan);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanCloseTest() throws ApiException {
        String customerId = null;
        String customerPlanId = null;
        // String response = api.customerPlanClose(customerId, customerPlanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanFamilyTest() throws ApiException {
        String customerId = null;
        String family = null;
        // CustomerPlan response = api.customerPlanFamily(customerId, family);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a certain 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanGetTest() throws ApiException {
        String customerId = null;
        String customerPlanId = null;
        // CustomerPlan response = api.customerPlanGet(customerId, customerPlanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all Products Customers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanGetAllTest() throws ApiException {
        String customerId = null;
        // List<String> response = api.customerPlanGetAll(customerId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanPayTest() throws ApiException {
        String customerId = null;
        String customerPlanId = null;
        String customerBillId = null;
        String whenPay = null;
        // String response = api.customerPlanPay(customerId, customerPlanId, customerBillId, whenPay);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all the actual customerPlanId for the planId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanPlanTest() throws ApiException {
        String customerId = null;
        String planId = null;
        // Plan response = api.customerPlanPlan(customerId, planId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerPlanValuesTest() throws ApiException {
        String customerId = null;
        Integer page = null;
        Integer numberPerPage = null;
        // api.customerPlanValues(customerId, page, numberPerPage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the actual pricing configuration, usefull for dynamic create a pricing table
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingTest() throws ApiException {
        String currency = null;
        String onlyPanId = null;
        // PricingTableFull response = api.pricing(currency, onlyPanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricing2Test() throws ApiException {
        String currency = null;
        String onlyPanId = null;
        // PricingTable2Full response = api.pricing2(currency, onlyPanId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingConfigGetTest() throws ApiException {
        // PricingConf response = api.pricingConfigGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingConfigPutTest() throws ApiException {
        PricingConf a = null;
        // String response = api.pricingConfigPut(a);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingUiConfTest() throws ApiException {
        // PricingUiConf response = api.pricingUiConf();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingUiConfigGetTest() throws ApiException {
        // PricingUiConf response = api.pricingUiConfigGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pricingUiConfigPutTest() throws ApiException {
        PricingUiConf a = null;
        // String response = api.pricingUiConfigPut(a);

        // TODO: test validations
    }
    
}
