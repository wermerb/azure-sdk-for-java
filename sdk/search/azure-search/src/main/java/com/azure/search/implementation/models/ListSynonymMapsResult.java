// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.models.SynonymMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response from a List SynonymMaps request. If successful, it includes the
 * full definitions of all synonym maps.
 */
@Fluent
public final class ListSynonymMapsResult {
    /*
     * The synonym maps in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SynonymMap> synonymMaps;

    /**
     * Get the synonymMaps property: The synonym maps in the Search service.
     *
     * @return the synonymMaps value.
     */
    public List<SynonymMap> getSynonymMaps() {
        return this.synonymMaps;
    }
}
