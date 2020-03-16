/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Minimum fields that must be present in any type of validation request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = ValidationInputRequest.class)
@JsonTypeName("ValidationInputRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ValidateCreateOrderLimit", value = CreateOrderLimitForSubscriptionValidationRequest.class),
    @JsonSubTypes.Type(name = "ValidateDataDestinationDetails", value = DataDestinationDetailsValidationRequest.class),
    @JsonSubTypes.Type(name = "ValidatePreferences", value = PreferencesValidationRequest.class),
    @JsonSubTypes.Type(name = "ValidateSkuAvailability", value = SkuAvailabilityValidationRequest.class),
    @JsonSubTypes.Type(name = "ValidateSubscriptionIsAllowedToCreateJob", value = SubscriptionIsAllowedToCreateJobValidationRequest.class),
    @JsonSubTypes.Type(name = "ValidateAddress", value = ValidateAddress.class)
})
public class ValidationInputRequest {
}
