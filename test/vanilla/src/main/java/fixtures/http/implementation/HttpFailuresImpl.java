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
import fixtures.http.HttpFailures;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.RestException;
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
 * in HttpFailures.
 */
public class HttpFailuresImpl implements HttpFailures {
    /** The RestProxy service to perform REST calls. */
    private HttpFailuresService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpFailures.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpFailuresImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpFailuresService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpFailures to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface HttpFailuresService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpFailures getEmptyError" })
        @GET("http/failure/emptybody/error")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Boolean> getEmptyError();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpFailures getNoModelError" })
        @GET("http/failure/nomodel/error")
        @ExpectedResponses({200})
        Single<Boolean> getNoModelError();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.http.HttpFailures getNoModelEmpty" })
        @GET("http/failure/nomodel/empty")
        @ExpectedResponses({200})
        Single<Boolean> getNoModelEmpty();

    }

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getEmptyError() {
        return getEmptyErrorAsync().toBlocking().value();
    }

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getEmptyErrorAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyErrorAsync(), serviceCallback);
    }

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> getEmptyErrorAsync() {
        return service.getEmptyError();
    }


    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getNoModelError() {
        return getNoModelErrorAsync().toBlocking().value();
    }

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getNoModelErrorAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNoModelErrorAsync(), serviceCallback);
    }

    /**
     * Get empty error form server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> getNoModelErrorAsync() {
        return service.getNoModelError();
    }


    /**
     * Get empty response from server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the boolean object if successful.
     */
    public boolean getNoModelEmpty() {
        return getNoModelEmptyAsync().toBlocking().value();
    }

    /**
     * Get empty response from server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Boolean> getNoModelEmptyAsync(final ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(getNoModelEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty response from server.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Boolean object
     */
    public Single<Boolean> getNoModelEmptyAsync() {
        return service.getNoModelEmpty();
    }


}
