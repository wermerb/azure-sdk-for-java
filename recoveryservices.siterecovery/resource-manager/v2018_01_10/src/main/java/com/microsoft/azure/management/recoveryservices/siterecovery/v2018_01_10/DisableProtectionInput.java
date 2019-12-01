/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disable protection input.
 */
public class DisableProtectionInput {
    /**
     * Disable protection input properties.
     */
    @JsonProperty(value = "properties")
    private DisableProtectionInputProperties properties;

    /**
     * Get disable protection input properties.
     *
     * @return the properties value
     */
    public DisableProtectionInputProperties properties() {
        return this.properties;
    }

    /**
     * Set disable protection input properties.
     *
     * @param properties the properties value to set
     * @return the DisableProtectionInput object itself.
     */
    public DisableProtectionInput withProperties(DisableProtectionInputProperties properties) {
        this.properties = properties;
        return this;
    }

}