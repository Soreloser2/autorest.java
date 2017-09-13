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

import com.microsoft.rest.v2.RestProxy;
import fixtures.azurespecials.ApiVersionLocals;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionLocals.
 */
public class ApiVersionLocalsImpl implements ApiVersionLocals {
    /** The RestProxy service to perform REST calls. */
    private ApiVersionLocalsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionLocalsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionLocalsImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = RestProxy.create(ApiVersionLocalsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionLocals to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionLocalsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getMethodLocalValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/local/2.0")
        Single<Void> getMethodLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getMethodLocalNull" })
        @GET("azurespecials/apiVersion/method/string/none/query/local/null")
        Single<Void> getMethodLocalNull(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getPathLocalValid" })
        @GET("azurespecials/apiVersion/path/string/none/query/local/2.0")
        Single<Void> getPathLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionLocals getSwaggerLocalValid" })
        @GET("azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        Single<Void> getSwaggerLocalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getMethodLocalValid() {
        getMethodLocalValidAsync().toBlocking().value();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getMethodLocalValidAsync() {
        final String apiVersion = "2.0";
        return service.getMethodLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getMethodLocalNull() {
        getMethodLocalNullAsync().toBlocking().value();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalNullAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalNullAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> getMethodLocalNullAsync() {
        final String apiVersion = null;
        return service.getMethodLocalNull(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getMethodLocalNull(String apiVersion) {
        getMethodLocalNullAsync(apiVersion).toBlocking().value();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodLocalNullAsync(apiVersion), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed.
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getMethodLocalNullAsync(String apiVersion) {
        return service.getMethodLocalNull(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getPathLocalValid() {
        getPathLocalValidAsync().toBlocking().value();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getPathLocalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getPathLocalValidAsync() {
        final String apiVersion = "2.0";
        return service.getPathLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getSwaggerLocalValid() {
        getSwaggerLocalValidAsync().toBlocking().value();
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getSwaggerLocalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerLocalValidAsync(), serviceCallback);
    }

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getSwaggerLocalValidAsync() {
        final String apiVersion = "2.0";
        return service.getSwaggerLocalValid(apiVersion, this.client.acceptLanguage(), this.client.userAgent());
    }


}