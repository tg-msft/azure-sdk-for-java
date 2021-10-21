// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list skus operation response. */
@Immutable
public final class SkuListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuListInner.class);

    /*
     * The list of skus available for the resource.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Sku> value;

    /*
     * The URL the client should use to fetch the next page (per server side
     * paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of skus available for the resource.
     *
     * @return the value value.
     */
    public List<Sku> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}