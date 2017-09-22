/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import com.microsoft.rest.RestProxy;
import fixtures.http.HttpRetrys;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.DELETE;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.HEAD;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PATCH;
import com.microsoft.rest.annotations.POST;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRetrys.
 */
public class HttpRetrysImpl implements HttpRetrys {
    /** The RestProxy service to perform REST calls. */
    private HttpRetrysService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpRetrys.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpRetrysImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpRetrysService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpRetrys to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface HttpRetrysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys head408" })
        @HEAD("http/retry/408")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> head408();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys put500" })
        @PUT("http/retry/500")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> put500(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys patch500" })
        @PATCH("http/retry/500")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> patch500(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys get502" })
        @GET("http/retry/502")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> get502();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys post503" })
        @POST("http/retry/503")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> post503(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys delete503" })
        @DELETE("http/retry/503")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> delete503(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys put504" })
        @PUT("http/retry/504")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> put504(@BodyParam Boolean booleanValue);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpRetrys patch504" })
        @PATCH("http/retry/504")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> patch504(@BodyParam Boolean booleanValue);

    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void head408() {
        head408Async().toBlocking().value();
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head408Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head408Async(), serviceCallback);
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> head408Async() {
        return service.head408();
    }


    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void put500() {
        put500Async().toBlocking().value();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put500Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put500Async(), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> put500Async() {
        final Boolean booleanValue = null;
        return service.put500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void put500(Boolean booleanValue) {
        put500Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put500Async(booleanValue), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> put500Async(Boolean booleanValue) {
        return service.put500(booleanValue);
    }


    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void patch500() {
        patch500Async().toBlocking().value();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch500Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch500Async(), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> patch500Async() {
        final Boolean booleanValue = null;
        return service.patch500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void patch500(Boolean booleanValue) {
        patch500Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch500Async(booleanValue), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> patch500Async(Boolean booleanValue) {
        return service.patch500(booleanValue);
    }


    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void get502() {
        get502Async().toBlocking().value();
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> get502Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(get502Async(), serviceCallback);
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> get502Async() {
        return service.get502();
    }


    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void post503() {
        post503Async().toBlocking().value();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> post503Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(post503Async(), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> post503Async() {
        final Boolean booleanValue = null;
        return service.post503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void post503(Boolean booleanValue) {
        post503Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> post503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(post503Async(booleanValue), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> post503Async(Boolean booleanValue) {
        return service.post503(booleanValue);
    }


    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete503() {
        delete503Async().toBlocking().value();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> delete503Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(delete503Async(), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> delete503Async() {
        final Boolean booleanValue = null;
        return service.delete503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete503(Boolean booleanValue) {
        delete503Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> delete503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(delete503Async(booleanValue), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> delete503Async(Boolean booleanValue) {
        return service.delete503(booleanValue);
    }


    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void put504() {
        put504Async().toBlocking().value();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put504Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put504Async(), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> put504Async() {
        final Boolean booleanValue = null;
        return service.put504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void put504(Boolean booleanValue) {
        put504Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put504Async(booleanValue), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> put504Async(Boolean booleanValue) {
        return service.put504(booleanValue);
    }


    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void patch504() {
        patch504Async().toBlocking().value();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch504Async(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch504Async(), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> patch504Async() {
        final Boolean booleanValue = null;
        return service.patch504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void patch504(Boolean booleanValue) {
        patch504Async(booleanValue).toBlocking().value();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch504Async(booleanValue), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> patch504Async(Boolean booleanValue) {
        return service.patch504(booleanValue);
    }


}
