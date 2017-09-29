/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.subscriptionidapiversion.implementation;

import fixtures.subscriptionidapiversion.Groups;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.annotations.ExpectedResponses;
import com.microsoft.rest.annotations.GET;
import com.microsoft.rest.annotations.HeaderParam;
import com.microsoft.rest.annotations.Headers;
import com.microsoft.rest.annotations.Host;
import com.microsoft.rest.annotations.PathParam;
import com.microsoft.rest.annotations.QueryParam;
import com.microsoft.rest.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.http.HttpClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.subscriptionidapiversion.models.ErrorException;
import fixtures.subscriptionidapiversion.models.SampleResourceGroup;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;
import com.microsoft.azure.AzureProxy;

/**
 * An instance of this class provides access to all the operations defined
 * in Groups.
 */
public class GroupsImpl implements Groups {
    /** The RestProxy service to perform REST calls. */
    private GroupsService service;
    /** The service client containing this operation class. */
    private MicrosoftAzureTestUrlImpl client;

    /**
     * Initializes an instance of GroupsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public GroupsImpl(MicrosoftAzureTestUrlImpl client) {
        this.service = AzureProxy.create(GroupsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Groups to be
     * used by RestProxy to perform REST calls.
     */
    @Host("https://management.azure.com/")
    interface GroupsService {
        @Headers({ "x-ms-logging-context: fixtures.subscriptionidapiversion.Groups getSampleResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200})
        Single<SampleResourceGroup> getSampleResourceGroup(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SampleResourceGroup object if successful.
     */
    public SampleResourceGroup getSampleResourceGroup(String resourceGroupName) {
        return getSampleResourceGroupAsync(resourceGroupName).toBlocking().value();
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SampleResourceGroup> getSampleResourceGroupAsync(String resourceGroupName, final ServiceCallback<SampleResourceGroup> serviceCallback) {
        return ServiceFuture.fromBody(getSampleResourceGroupAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SampleResourceGroup object
     */
    public Single<SampleResourceGroup> getSampleResourceGroupAsync(String resourceGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSampleResourceGroup(this.client.subscriptionId(), resourceGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


}
