/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.RestProxy;
import fixtures.bodycomplex.Basics;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.QueryParam;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.Validator;
import fixtures.bodycomplex.models.Basic;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Basics.
 */
public class BasicsImpl implements Basics {
    /** The RestProxy service to perform REST calls. */
    private BasicsService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Basics.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BasicsImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(BasicsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Basics to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface BasicsService {
        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics getValid" })
        @GET("complex/basic/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Basic> getValid();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics putValid" })
        @PUT("complex/basic/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putValid(@BodyParam("application/json; charset=utf-8") Basic complexBody, @QueryParam("api-version") String apiVersion);

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics getInvalid" })
        @GET("complex/basic/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Basic> getInvalid();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics getEmpty" })
        @GET("complex/basic/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Basic> getEmpty();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics getNull" })
        @GET("complex/basic/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Basic> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Basics getNotProvided" })
        @GET("complex/basic/notprovided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Basic> getNotProvided();

    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Basic object if successful.
     */
    public Basic getValid() {
        return getValidAsync().toBlocking().value();
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Basic> getValidAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Basic object
     */
    public Single<Basic> getValidAsync() {
        return service.getValid();
    }


    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putValid(Basic complexBody) {
        putValidAsync(complexBody).toBlocking().value();
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(Basic complexBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putValidAsync(Basic complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody, this.client.apiVersion());
    }


    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Basic object if successful.
     */
    public Basic getInvalid() {
        return getInvalidAsync().toBlocking().value();
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Basic> getInvalidAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Basic object
     */
    public Single<Basic> getInvalidAsync() {
        return service.getInvalid();
    }


    /**
     * Get a basic complex type that is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Basic object if successful.
     */
    public Basic getEmpty() {
        return getEmptyAsync().toBlocking().value();
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Basic> getEmptyAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type that is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Basic object
     */
    public Single<Basic> getEmptyAsync() {
        return service.getEmpty();
    }


    /**
     * Get a basic complex type whose properties are null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Basic object if successful.
     */
    public Basic getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Basic> getNullAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Basic object
     */
    public Single<Basic> getNullAsync() {
        return service.getNull();
    }


    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Basic object if successful.
     */
    public Basic getNotProvided() {
        return getNotProvidedAsync().toBlocking().value();
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Basic> getNotProvidedAsync(final ServiceCallback<Basic> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Basic object
     */
    public Single<Basic> getNotProvidedAsync() {
        return service.getNotProvided();
    }


}
