/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.MaintenanceManager;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.ApplyUpdateInner;
import org.joda.time.DateTime;

/**
 * Type representing ApplyUpdate.
 */
public interface ApplyUpdate extends HasInner<ApplyUpdateInner>, HasManager<MaintenanceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastUpdateTime value.
     */
    DateTime lastUpdateTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the status value.
     */
    UpdateStatus status();

    /**
     * @return the type value.
     */
    String type();

}