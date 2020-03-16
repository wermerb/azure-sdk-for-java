/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_11_01_preview.implementation;

import com.microsoft.azure.management.appconfiguration.v2019_11_01_preview.PrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;

class PrivateLinkResourceImpl extends IndexableRefreshableWrapperImpl<PrivateLinkResource, PrivateLinkResourceInner> implements PrivateLinkResource {
    private final AppConfigurationManager manager;
    private String resourceGroupName;
    private String configStoreName;
    private String groupName;

    PrivateLinkResourceImpl(PrivateLinkResourceInner inner,  AppConfigurationManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.configStoreName = IdParsingUtils.getValueFromIdByName(inner.id(), "configurationStores");
        this.groupName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateLinkResources");
    }

    @Override
    public AppConfigurationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<PrivateLinkResourceInner> getInnerAsync() {
        PrivateLinkResourcesInner client = this.manager().inner().privateLinkResources();
        return client.getAsync(this.resourceGroupName, this.configStoreName, this.groupName);
    }



    @Override
    public String groupId() {
        return this.inner().groupId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> requiredMembers() {
        return this.inner().requiredMembers();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
