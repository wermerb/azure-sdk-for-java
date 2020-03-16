/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.storage.v2019_06_01.AzureEntityResource;

/**
 * The ImmutabilityPolicy property of a blob container, including Id, resource
 * name, resource type, Etag.
 */
@JsonFlatten
public class ImmutabilityPolicyInner extends AzureEntityResource {
    /**
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "properties.immutabilityPeriodSinceCreationInDays")
    private Integer immutabilityPeriodSinceCreationInDays;

    /**
     * The ImmutabilityPolicy state of a blob container, possible values
     * include: Locked and Unlocked. Possible values include: 'Locked',
     * 'Unlocked'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyState state;

    /**
     * This property can only be changed for unlocked time-based retention
     * policies. When enabled, new blocks can be written to an append blob
     * while maintaining immutability protection and compliance. Only new
     * blocks can be added and any existing blocks cannot be modified or
     * deleted. This property cannot be changed with ExtendImmutabilityPolicy
     * API.
     */
    @JsonProperty(value = "properties.allowProtectedAppendWrites")
    private Boolean allowProtectedAppendWrites;

    /**
     * Get the immutability period for the blobs in the container since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutability period for the blobs in the container since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked. Possible values include: 'Locked', 'Unlocked'.
     *
     * @return the state value
     */
    public ImmutabilityPolicyState state() {
        return this.state;
    }

    /**
     * Get this property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @return the allowProtectedAppendWrites value
     */
    public Boolean allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    /**
     * Set this property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API.
     *
     * @param allowProtectedAppendWrites the allowProtectedAppendWrites value to set
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        return this;
    }

}
