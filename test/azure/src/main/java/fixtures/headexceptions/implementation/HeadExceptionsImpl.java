/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.headexceptions.HeadExceptions;
import java.io.IOException;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined in
 * HeadExceptions.
 */
public class HeadExceptionsImpl implements HeadExceptions {
    /** The RestProxy service to perform REST calls. */
    private HeadExceptionsService service;
    /** The service client containing this operation class. */
    private AutoRestHeadExceptionTestServiceImpl client;

    /**
     * Initializes an instance of HeadExceptionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HeadExceptionsImpl(AutoRestHeadExceptionTestServiceImpl client) {
        this.service = AzureProxy.create(HeadExceptionsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HeadExceptions to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface HeadExceptionsService {
        @Headers({ "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head200" })
        @HEAD("http/success/200")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head200(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head204" })
        @HEAD("http/success/204")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head204(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "x-ms-logging-context: fixtures.headexceptions.HeadExceptions head404" })
        @HEAD("http/success/404")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<RestResponse<Void, Void>> head404(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void head200() {
        head200Async().toBlocking().value();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head200Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> head200WithRestResponseAsync() {
        return service.head200(this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> head200Async() {
        return head200WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void head204() {
        head204Async().toBlocking().value();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head204Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> head204WithRestResponseAsync() {
        return service.head204(this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> head204Async() {
        return head204WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void head404() {
        head404Async().toBlocking().value();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head404Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> head404WithRestResponseAsync() {
        return service.head404(this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<Void> head404Async() {
        return head404WithRestResponseAsync()
            .map(new Func1<RestResponse<Void, Void>, Void>() { public Void call(RestResponse<Void, Void> restResponse) { return restResponse.body(); } });
        }


}
