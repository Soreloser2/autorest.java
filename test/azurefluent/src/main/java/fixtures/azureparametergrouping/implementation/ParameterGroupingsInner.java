/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.BodyParam;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.HeaderParam;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PathParam;
import com.microsoft.rest.annotations.POST;
import com.microsoft.rest.annotations.QueryParam;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import fixtures.azureparametergrouping.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in ParameterGroupings.
 */
public class ParameterGroupingsInner {
    /** The RestProxy service to perform REST calls. */
    private ParameterGroupingsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterGroupingTestServiceImpl client;

    /**
     * Initializes an instance of ParameterGroupingsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ParameterGroupingsInner(AutoRestParameterGroupingTestServiceImpl client) {
        this.service = AzureProxy.create(ParameterGroupingsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ParameterGroupings to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("https://localhost")
    interface ParameterGroupingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postRequired" })
        @POST("parameterGrouping/postRequired/{path}")
        @ExpectedResponses({200})
        Single<Void> postRequired(@PathParam("path") String path, @HeaderParam("accept-language") String acceptLanguage, @BodyParam int body, @HeaderParam("customHeader") String customHeader, @QueryParam("query") Integer query, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postOptional" })
        @POST("parameterGrouping/postOptional")
        @ExpectedResponses({200})
        Single<Void> postOptional(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("customHeader") String customHeader, @QueryParam("query") Integer query, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postMultiParamGroups" })
        @POST("parameterGrouping/postMultipleParameterGroups")
        @ExpectedResponses({200})
        Single<Void> postMultiParamGroups(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("header-one") String headerOne, @QueryParam("query-one") Integer queryOne, @HeaderParam("header-two") String headerTwo, @QueryParam("query-two") Integer queryTwo, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azureparametergrouping.ParameterGroupings postSharedParameterGroupObject" })
        @POST("parameterGrouping/sharedParameterGroupObject")
        @ExpectedResponses({200})
        Single<Void> postSharedParameterGroupObject(@HeaderParam("accept-language") String acceptLanguage, @HeaderParam("header-one") String headerOne, @QueryParam("query-one") Integer queryOne, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postRequired(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        postRequiredAsync(parameterGroupingPostRequiredParameters).toBlocking().value();
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postRequiredAsync(parameterGroupingPostRequiredParameters), serviceCallback);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postRequiredAsync(ParameterGroupingPostRequiredParametersInner parameterGroupingPostRequiredParameters) {
        if (parameterGroupingPostRequiredParameters == null) {
            throw new IllegalArgumentException("Parameter parameterGroupingPostRequiredParameters is required and cannot be null.");
        }
        Validator.validate(parameterGroupingPostRequiredParameters);
        int body = parameterGroupingPostRequiredParameters.body();
        String customHeader = parameterGroupingPostRequiredParameters.customHeader();
        Integer query = parameterGroupingPostRequiredParameters.query();
        String path = parameterGroupingPostRequiredParameters.path();
        return service.postRequired(path, this.client.acceptLanguage(), body, customHeader, query, this.client.userAgent());
    }


    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postOptional() {
        postOptionalAsync().toBlocking().value();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postOptionalAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postOptionalAsync(), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> postOptionalAsync() {
        final ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters = null;
        String customHeader = null;
        Integer query = null;
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postOptional(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        postOptionalAsync(parameterGroupingPostOptionalParameters).toBlocking().value();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postOptionalAsync(parameterGroupingPostOptionalParameters), serviceCallback);
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postOptionalAsync(ParameterGroupingPostOptionalParametersInner parameterGroupingPostOptionalParameters) {
        Validator.validate(parameterGroupingPostOptionalParameters);
        String customHeader = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeader = parameterGroupingPostOptionalParameters.customHeader();
        }
        Integer query = null;
        if (parameterGroupingPostOptionalParameters != null) {
            query = parameterGroupingPostOptionalParameters.query();
        }
        return service.postOptional(this.client.acceptLanguage(), customHeader, query, this.client.userAgent());
    }


    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postMultiParamGroups() {
        postMultiParamGroupsAsync().toBlocking().value();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMultiParamGroupsAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMultiParamGroupsAsync(), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> postMultiParamGroupsAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        String headerTwo = null;
        Integer queryTwo = null;
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postMultiParamGroups(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).toBlocking().value();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup), serviceCallback);
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postMultiParamGroupsAsync(FirstParameterGroupInner firstParameterGroup, ParameterGroupingPostMultiParamGroupsSecondParamGroupInner parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        Validator.validate(firstParameterGroup);
        Validator.validate(parameterGroupingPostMultiParamGroupsSecondParamGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        String headerTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.headerTwo();
        }
        Integer queryTwo = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwo = parameterGroupingPostMultiParamGroupsSecondParamGroup.queryTwo();
        }
        return service.postMultiParamGroups(this.client.acceptLanguage(), headerOne, queryOne, headerTwo, queryTwo, this.client.userAgent());
    }


    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postSharedParameterGroupObject() {
        postSharedParameterGroupObjectAsync().toBlocking().value();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSharedParameterGroupObjectAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSharedParameterGroupObjectAsync(), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> postSharedParameterGroupObjectAsync() {
        final FirstParameterGroupInner firstParameterGroup = null;
        String headerOne = null;
        Integer queryOne = null;
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void postSharedParameterGroupObject(FirstParameterGroupInner firstParameterGroup) {
        postSharedParameterGroupObjectAsync(firstParameterGroup).toBlocking().value();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(postSharedParameterGroupObjectAsync(firstParameterGroup), serviceCallback);
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> postSharedParameterGroupObjectAsync(FirstParameterGroupInner firstParameterGroup) {
        Validator.validate(firstParameterGroup);
        String headerOne = null;
        if (firstParameterGroup != null) {
            headerOne = firstParameterGroup.headerOne();
        }
        Integer queryOne = null;
        if (firstParameterGroup != null) {
            queryOne = firstParameterGroup.queryOne();
        }
        return service.postSharedParameterGroupObject(this.client.acceptLanguage(), headerOne, queryOne, this.client.userAgent());
    }


}
