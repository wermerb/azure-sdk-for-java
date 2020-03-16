/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyListResponse;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyResource;

class AccessPoliciesImpl extends WrapperImpl<AccessPoliciesInner> implements AccessPolicies {
    private final TimeSeriesInsightsManager manager;

    AccessPoliciesImpl(TimeSeriesInsightsManager manager) {
        super(manager.inner().accessPolicies());
        this.manager = manager;
    }

    public TimeSeriesInsightsManager manager() {
        return this.manager;
    }

    @Override
    public AccessPolicyResourceImpl define(String name) {
        return wrapModel(name);
    }

    private AccessPolicyResourceImpl wrapModel(AccessPolicyResourceInner inner) {
        return  new AccessPolicyResourceImpl(inner, manager());
    }

    private AccessPolicyResourceImpl wrapModel(String name) {
        return new AccessPolicyResourceImpl(name, this.manager());
    }

    @Override
    public Observable<AccessPolicyListResponse> listByEnvironmentAsync(String resourceGroupName, String environmentName) {
        AccessPoliciesInner client = this.inner();
        return client.listByEnvironmentAsync(resourceGroupName, environmentName)
        .map(new Func1<AccessPolicyListResponseInner, AccessPolicyListResponse>() {
            @Override
            public AccessPolicyListResponse call(AccessPolicyListResponseInner inner) {
                return new AccessPolicyListResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AccessPolicyResource> getAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        AccessPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, environmentName, accessPolicyName)
        .flatMap(new Func1<AccessPolicyResourceInner, Observable<AccessPolicyResource>>() {
            @Override
            public Observable<AccessPolicyResource> call(AccessPolicyResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AccessPolicyResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String environmentName, String accessPolicyName) {
        AccessPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, environmentName, accessPolicyName).toCompletable();
    }

}
