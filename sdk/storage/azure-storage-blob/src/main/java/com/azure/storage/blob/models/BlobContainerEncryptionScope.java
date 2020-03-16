// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for create operation.
 */
@JacksonXmlRootElement(localName = "blob-container-encryption-scope")
@Fluent
public final class BlobContainerEncryptionScope {
    /*
     * Optional.  Version 2019-07-07 and later.  Specifies the default
     * encryption scope to set on the container and use for all future writes.
     */
    @JsonProperty(value = "defaultEncryptionScope")
    private String defaultEncryptionScope;

    /*
     * Optional.  Version 2019-07-07 and newer.  If true, prevents any request
     * from specifying a different encryption scope than the scope set on the
     * container.
     */
    @JsonProperty(value = "encryptionScopeOverridePrevented")
    private boolean encryptionScopeOverridePrevented;

    /**
     * Get the defaultEncryptionScope property: Optional.  Version 2019-07-07
     * and later.  Specifies the default encryption scope to set on the
     * container and use for all future writes.
     *
     * @return the defaultEncryptionScope value.
     */
    public String getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }

    /**
     * Set the defaultEncryptionScope property: Optional.  Version 2019-07-07
     * and later.  Specifies the default encryption scope to set on the
     * container and use for all future writes.
     *
     * @param defaultEncryptionScope the defaultEncryptionScope value to set.
     * @return the BlobContainerEncryptionScope object itself.
     */
    public BlobContainerEncryptionScope setDefaultEncryptionScope(String defaultEncryptionScope) {
        this.defaultEncryptionScope = defaultEncryptionScope;
        return this;
    }

    /**
     * Get the encryptionScopeOverridePrevented property: Optional.  Version
     * 2019-07-07 and newer.  If true, prevents any request from specifying a
     * different encryption scope than the scope set on the container.
     *
     * @return the encryptionScopeOverridePrevented value.
     */
    public boolean isEncryptionScopeOverridePrevented() {
        return this.encryptionScopeOverridePrevented;
    }

    /**
     * Set the encryptionScopeOverridePrevented property: Optional.  Version
     * 2019-07-07 and newer.  If true, prevents any request from specifying a
     * different encryption scope than the scope set on the container.
     *
     * @param encryptionScopeOverridePrevented the
     * encryptionScopeOverridePrevented value to set.
     * @return the BlobContainerEncryptionScope object itself.
     */
    public BlobContainerEncryptionScope setEncryptionScopeOverridePrevented(Boolean encryptionScopeOverridePrevented) {
        this.encryptionScopeOverridePrevented = encryptionScopeOverridePrevented;
        return this;
    }
}
