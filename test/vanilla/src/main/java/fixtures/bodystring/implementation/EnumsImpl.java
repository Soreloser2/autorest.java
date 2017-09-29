/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.microsoft.rest.RestProxy;
import fixtures.bodystring.Enums;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PUT;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.Validator;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Enums.
 */
public class EnumsImpl implements Enums {
    /** The RestProxy service to perform REST calls. */
    private EnumsService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of Enums.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public EnumsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(EnumsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Enums to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface EnumsService {
        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getNotExpandable" })
        @GET("string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Colors> getNotExpandable();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putNotExpandable" })
        @PUT("string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putNotExpandable(@BodyParam("application/json; charset=utf-8") Colors stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getReferenced" })
        @GET("string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Colors> getReferenced();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putReferenced" })
        @PUT("string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putReferenced(@BodyParam("application/json; charset=utf-8") Colors enumStringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getReferencedConstant" })
        @GET("string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RefColorConstant> getReferencedConstant();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putReferencedConstant" })
        @PUT("string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putReferencedConstant(@BodyParam("application/json; charset=utf-8") RefColorConstant enumStringBody);

    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    public Colors getNotExpandable() {
        return getNotExpandableAsync().toBlocking().value();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Colors> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback) {
        return ServiceFuture.fromBody(getNotExpandableAsync(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    public Single<Colors> getNotExpandableAsync() {
        return service.getNotExpandable();
    }


    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putNotExpandable(Colors stringBody) {
        putNotExpandableAsync(stringBody).toBlocking().value();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNotExpandableAsync(stringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putNotExpandableAsync(Colors stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putNotExpandable(stringBody);
    }


    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    public Colors getReferenced() {
        return getReferencedAsync().toBlocking().value();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Colors> getReferencedAsync(final ServiceCallback<Colors> serviceCallback) {
        return ServiceFuture.fromBody(getReferencedAsync(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Colors object
     */
    public Single<Colors> getReferencedAsync() {
        return service.getReferenced();
    }


    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putReferenced(Colors enumStringBody) {
        putReferencedAsync(enumStringBody).toBlocking().value();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putReferencedAsync(Colors enumStringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putReferencedAsync(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putReferencedAsync(Colors enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        return service.putReferenced(enumStringBody);
    }


    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefColorConstant object if successful.
     */
    public RefColorConstant getReferencedConstant() {
        return getReferencedConstantAsync().toBlocking().value();
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RefColorConstant> getReferencedConstantAsync(final ServiceCallback<RefColorConstant> serviceCallback) {
        return ServiceFuture.fromBody(getReferencedConstantAsync(), serviceCallback);
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefColorConstant object
     */
    public Single<RefColorConstant> getReferencedConstantAsync() {
        return service.getReferencedConstant();
    }


    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putReferencedConstant(RefColorConstant enumStringBody) {
        putReferencedConstantAsync(enumStringBody).toBlocking().value();
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putReferencedConstantAsync(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    public Single<Void> putReferencedConstantAsync(RefColorConstant enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        Validator.validate(enumStringBody);
        return service.putReferencedConstant(enumStringBody);
    }


}
