/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StorageAutogrow.
 */
public final class StorageAutogrow extends ExpandableStringEnum<StorageAutogrow> {
    /** Static value Enabled for StorageAutogrow. */
    public static final StorageAutogrow ENABLED = fromString("Enabled");

    /** Static value Disabled for StorageAutogrow. */
    public static final StorageAutogrow DISABLED = fromString("Disabled");

    /**
     * Creates or finds a StorageAutogrow from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageAutogrow
     */
    @JsonCreator
    public static StorageAutogrow fromString(String name) {
        return fromString(name, StorageAutogrow.class);
    }

    /**
     * @return known StorageAutogrow values
     */
    public static Collection<StorageAutogrow> values() {
        return values(StorageAutogrow.class);
    }
}