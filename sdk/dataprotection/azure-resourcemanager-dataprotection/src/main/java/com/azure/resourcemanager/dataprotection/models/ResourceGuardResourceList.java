// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of ResourceGuard resources. */
@Fluent
public final class ResourceGuardResourceList extends DppTrackedResourceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceGuardResourceList.class);

    /*
     * List of resources.
     */
    @JsonProperty(value = "value")
    private List<ResourceGuardResourceInner> value;

    /**
     * Get the value property: List of resources.
     *
     * @return the value value.
     */
    public List<ResourceGuardResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources.
     *
     * @param value the value value to set.
     * @return the ResourceGuardResourceList object itself.
     */
    public ResourceGuardResourceList withValue(List<ResourceGuardResourceInner> value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceGuardResourceList withNextLink(String nextLink) {
        super.withNextLink(nextLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}