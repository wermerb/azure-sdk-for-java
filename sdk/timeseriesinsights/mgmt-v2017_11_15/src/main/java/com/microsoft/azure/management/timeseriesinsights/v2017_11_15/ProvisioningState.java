/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProvisioningState.
 */
public enum ProvisioningState {
    /** Enum value Accepted. */
    ACCEPTED("Accepted"),

    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Updating. */
    UPDATING("Updating"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Deleting. */
    DELETING("Deleting");

    /** The actual serialized value for a ProvisioningState instance. */
    private String value;

    ProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static ProvisioningState fromString(String value) {
        ProvisioningState[] items = ProvisioningState.values();
        for (ProvisioningState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
