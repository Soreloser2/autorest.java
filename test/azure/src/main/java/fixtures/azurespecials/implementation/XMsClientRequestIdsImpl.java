/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import fixtures.azurespecials.XMsClientRequestIds;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.HeaderParam;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in XMsClientRequestIds.
 */
public class XMsClientRequestIdsImpl implements XMsClientRequestIds {
    /** The RestProxy service to perform REST calls. */
    private XMsClientRequestIdsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of XMsClientRequestIdsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public XMsClientRequestIdsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = AzureProxy.create(XMsClientRequestIdsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for XMsClientRequestIds to be
     * used by RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface XMsClientRequestIdsService {
        @Headers({ "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds get" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/method/")
        @ExpectedResponses({200})
        Single<Void> get(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.azurespecials.XMsClientRequestIds paramGet" })
        @GET("azurespecials/overwrite/x-ms-client-request-id/via-param/method/")
        @ExpectedResponses({200})
        Single<Void> paramGet(@HeaderParam("x-ms-client-request-id") String xMsClientRequestId, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get() {
        getAsync().toBlocking().value();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> getAsync() {
        return service.get(this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void paramGet(String xMsClientRequestId) {
        paramGetAsync(xMsClientRequestId).toBlocking().value();
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> paramGetAsync(String xMsClientRequestId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(paramGetAsync(xMsClientRequestId), serviceCallback);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> paramGetAsync(String xMsClientRequestId) {
        if (xMsClientRequestId == null) {
            throw new IllegalArgumentException("Parameter xMsClientRequestId is required and cannot be null.");
        }
        return service.paramGet(xMsClientRequestId, this.client.acceptLanguage(), this.client.userAgent());
    }


}
