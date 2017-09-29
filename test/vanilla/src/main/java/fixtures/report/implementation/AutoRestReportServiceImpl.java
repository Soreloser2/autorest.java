/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report.implementation;

import fixtures.report.AutoRestReportService;
import com.microsoft.rest.RestProxy;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import rx.Single;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.report.models.ErrorException;
import java.io.IOException;
import java.util.Map;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AutoRestReportService class.
 */
public class AutoRestReportServiceImpl extends ServiceClient implements AutoRestReportService {
    /**
     * The Retrofit service to perform REST calls.
     */
    private AutoRestReportServiceService service;

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestReportServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     */
    public AutoRestReportServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestReportServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        initializeService();
    }

    private void initializeService() {
        service = RestProxy.create(AutoRestReportServiceService.class, restClient().baseURL(), httpClient(), serializerAdapter());
    }

    /**
     * The interface defining all the services for AutoRestReportService to be
     * used by Retrofit to perform actually REST calls.
     */
    @Host("http://localhost")
    interface AutoRestReportServiceService {
        @Headers({ "x-ms-logging-context: fixtures.report.AutoRestReportService getReport" })
        @GET("report")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Map<String, Integer>> getReport();

    }

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, Integer&gt; object if successful.
     */
    public Map<String, Integer> getReport() {
        return getReportAsync().toBlocking().value();
    }

    /**
     * Get test coverage report.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Map<String, Integer>> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        return ServiceFuture.fromBody(getReportAsync(), serviceCallback);
    }

    /**
     * Get test coverage report.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, Integer&gt; object
     */
    public Single<Map<String, Integer>> getReportAsync() {
        return service.getReport();
    }


}
