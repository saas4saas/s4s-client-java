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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.S4sError;
import io.swagger.client.model.ResourcePatch;
import io.swagger.client.model.ResourcePatchResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SsResourceApi {
    private ApiClient apiClient;

    public SsResourceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SsResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for customerResourceGet */
    private com.squareup.okhttp.Call customerResourceGetCall(String customerId, String resourceid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling customerResourceGet(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling customerResourceGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/s4s-resource/customer/{customer-id}/resource/{resourceid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customer-id" + "\\}", apiClient.escapeString(customerId.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "tenantid", "token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long customerResourceGet(String customerId, String resourceid) throws ApiException {
        ApiResponse<Long> resp = customerResourceGetWithHttpInfo(customerId, resourceid);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> customerResourceGetWithHttpInfo(String customerId, String resourceid) throws ApiException {
        com.squareup.okhttp.Call call = customerResourceGetCall(customerId, resourceid, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customerResourceGetAsync(String customerId, String resourceid, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = customerResourceGetCall(customerId, resourceid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for customerResourceLimitGet */
    private com.squareup.okhttp.Call customerResourceLimitGetCall(String customerId, String resourceid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling customerResourceLimitGet(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling customerResourceLimitGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/s4s-resource/customer/{customer-id}/resource/{resourceid}/limit".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customer-id" + "\\}", apiClient.escapeString(customerId.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "tenantid", "token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long customerResourceLimitGet(String customerId, String resourceid) throws ApiException {
        ApiResponse<Long> resp = customerResourceLimitGetWithHttpInfo(customerId, resourceid);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> customerResourceLimitGetWithHttpInfo(String customerId, String resourceid) throws ApiException {
        com.squareup.okhttp.Call call = customerResourceLimitGetCall(customerId, resourceid, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customerResourceLimitGetAsync(String customerId, String resourceid, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = customerResourceLimitGetCall(customerId, resourceid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for customerResourcePatch */
    private com.squareup.okhttp.Call customerResourcePatchCall(String customerId, String resourceid, ResourcePatch value, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = value;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling customerResourcePatch(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling customerResourcePatch(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/s4s-resource/customer/{customer-id}/resource/{resourceid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customer-id" + "\\}", apiClient.escapeString(customerId.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "tenantid", "token" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Updates a resource of a customer
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param value The Operation and value to update the resource (optional)
     * @return ResourcePatchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourcePatchResult customerResourcePatch(String customerId, String resourceid, ResourcePatch value) throws ApiException {
        ApiResponse<ResourcePatchResult> resp = customerResourcePatchWithHttpInfo(customerId, resourceid, value);
        return resp.getData();
    }

    /**
     * 
     * Updates a resource of a customer
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param value The Operation and value to update the resource (optional)
     * @return ApiResponse&lt;ResourcePatchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourcePatchResult> customerResourcePatchWithHttpInfo(String customerId, String resourceid, ResourcePatch value) throws ApiException {
        com.squareup.okhttp.Call call = customerResourcePatchCall(customerId, resourceid, value, null, null);
        Type localVarReturnType = new TypeToken<ResourcePatchResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates a resource of a customer
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param value The Operation and value to update the resource (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customerResourcePatchAsync(String customerId, String resourceid, ResourcePatch value, final ApiCallback<ResourcePatchResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = customerResourcePatchCall(customerId, resourceid, value, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourcePatchResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for customerResourceProductGet */
    private com.squareup.okhttp.Call customerResourceProductGetCall(String customerId, String resourceid, String customerProductId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling customerResourceProductGet(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling customerResourceProductGet(Async)");
        }
        
        // verify the required parameter 'customerProductId' is set
        if (customerProductId == null) {
            throw new ApiException("Missing the required parameter 'customerProductId' when calling customerResourceProductGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customer-id" + "\\}", apiClient.escapeString(customerId.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()))
        .replaceAll("\\{" + "customer-product-id" + "\\}", apiClient.escapeString(customerProductId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "tenantid", "token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long customerResourceProductGet(String customerId, String resourceid, String customerProductId) throws ApiException {
        ApiResponse<Long> resp = customerResourceProductGetWithHttpInfo(customerId, resourceid, customerProductId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> customerResourceProductGetWithHttpInfo(String customerId, String resourceid, String customerProductId) throws ApiException {
        com.squareup.okhttp.Call call = customerResourceProductGetCall(customerId, resourceid, customerProductId, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customerResourceProductGetAsync(String customerId, String resourceid, String customerProductId, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = customerResourceProductGetCall(customerId, resourceid, customerProductId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for customerResourceProductLimitGet */
    private com.squareup.okhttp.Call customerResourceProductLimitGetCall(String customerId, String resourceid, String customerProductId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling customerResourceProductLimitGet(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling customerResourceProductLimitGet(Async)");
        }
        
        // verify the required parameter 'customerProductId' is set
        if (customerProductId == null) {
            throw new ApiException("Missing the required parameter 'customerProductId' when calling customerResourceProductLimitGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/s4s-resource/customer/{customer-id}/resource/{resourceid}/product/{customer-product-id}/limit".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "customer-id" + "\\}", apiClient.escapeString(customerId.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()))
        .replaceAll("\\{" + "customer-product-id" + "\\}", apiClient.escapeString(customerProductId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "tenantid", "token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long customerResourceProductLimitGet(String customerId, String resourceid, String customerProductId) throws ApiException {
        ApiResponse<Long> resp = customerResourceProductLimitGetWithHttpInfo(customerId, resourceid, customerProductId);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> customerResourceProductLimitGetWithHttpInfo(String customerId, String resourceid, String customerProductId) throws ApiException {
        com.squareup.okhttp.Call call = customerResourceProductLimitGetCall(customerId, resourceid, customerProductId, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param customerId  (required)
     * @param resourceid  (required)
     * @param customerProductId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customerResourceProductLimitGetAsync(String customerId, String resourceid, String customerProductId, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = customerResourceProductLimitGetCall(customerId, resourceid, customerProductId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}