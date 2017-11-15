/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodyfile.Files;
import fixtures.bodyfile.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined in
 * Files.
 */
public class FilesImpl implements Files {
    /** The RestProxy service to perform REST calls. */
    private FilesService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFileServiceImpl client;

    /**
     * Initializes an instance of Files.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public FilesImpl(AutoRestSwaggerBATFileServiceImpl client) {
        this.service = RestProxy.create(FilesService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Files to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface FilesService {
        @Headers({ "x-ms-logging-context: fixtures.bodyfile.Files getFile" })
        @GET("files/stream/nonempty")
        // @Streaming not supported by RestProxy
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, InputStream>> getFile();

        @Headers({ "x-ms-logging-context: fixtures.bodyfile.Files getFileLarge" })
        @GET("files/stream/verylarge")
        // @Streaming not supported by RestProxy
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, InputStream>> getFileLarge();

        @Headers({ "x-ms-logging-context: fixtures.bodyfile.Files getEmptyFile" })
        @GET("files/stream/empty")
        // @Streaming not supported by RestProxy
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, InputStream>> getEmptyFile();

    }

    /**
     * Get file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    public InputStream getFile() {
        return getFileAsync().toBlocking().value();
    }

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InputStream> getFileAsync(ServiceCallback<InputStream> serviceCallback) {
        return ServiceFuture.fromBody(getFileAsync(), serviceCallback);
    }

    /**
     * Get file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<RestResponse<Void, InputStream>> getFileWithRestResponseAsync() {
        return service.getFile();
    }

    /**
     * Get file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<InputStream> getFileAsync() {
        return getFileWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, InputStream>, InputStream>() { public InputStream call(RestResponse<Void, InputStream> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get a large file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    public InputStream getFileLarge() {
        return getFileLargeAsync().toBlocking().value();
    }

    /**
     * Get a large file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InputStream> getFileLargeAsync(ServiceCallback<InputStream> serviceCallback) {
        return ServiceFuture.fromBody(getFileLargeAsync(), serviceCallback);
    }

    /**
     * Get a large file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<RestResponse<Void, InputStream>> getFileLargeWithRestResponseAsync() {
        return service.getFileLarge();
    }

    /**
     * Get a large file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<InputStream> getFileLargeAsync() {
        return getFileLargeWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, InputStream>, InputStream>() { public InputStream call(RestResponse<Void, InputStream> restResponse) { return restResponse.body(); } });
        }


    /**
     * Get empty file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    public InputStream getEmptyFile() {
        return getEmptyFileAsync().toBlocking().value();
    }

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InputStream> getEmptyFileAsync(ServiceCallback<InputStream> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyFileAsync(), serviceCallback);
    }

    /**
     * Get empty file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<RestResponse<Void, InputStream>> getEmptyFileWithRestResponseAsync() {
        return service.getEmptyFile();
    }

    /**
     * Get empty file.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<InputStream> getEmptyFileAsync() {
        return getEmptyFileWithRestResponseAsync()
            .map(new Func1<RestResponse<Void, InputStream>, InputStream>() { public InputStream call(RestResponse<Void, InputStream> restResponse) { return restResponse.body(); } });
        }


}
