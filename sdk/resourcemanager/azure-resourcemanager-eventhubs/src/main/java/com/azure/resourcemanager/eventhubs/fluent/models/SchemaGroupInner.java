// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.SchemaCompatibility;
import com.azure.resourcemanager.eventhubs.models.SchemaType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** Single item in List or Get Schema Group operation. */
@Fluent
public final class SchemaGroupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SchemaGroupInner.class);

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private SchemaGroupProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private SchemaGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the updatedAtUtc property: Exact time the Schema Group was updated.
     *
     * @return the updatedAtUtc value.
     */
    public OffsetDateTime updatedAtUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAtUtc();
    }

    /**
     * Get the createdAtUtc property: Exact time the Schema Group was created.
     *
     * @return the createdAtUtc value.
     */
    public OffsetDateTime createdAtUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAtUtc();
    }

    /**
     * Get the etag property: The ETag value.
     *
     * @return the etag value.
     */
    public UUID etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Get the groupProperties property: dictionary object for SchemaGroup group properties.
     *
     * @return the groupProperties value.
     */
    public Map<String, String> groupProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().groupProperties();
    }

    /**
     * Set the groupProperties property: dictionary object for SchemaGroup group properties.
     *
     * @param groupProperties the groupProperties value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withGroupProperties(Map<String, String> groupProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withGroupProperties(groupProperties);
        return this;
    }

    /**
     * Get the schemaCompatibility property: The schemaCompatibility property.
     *
     * @return the schemaCompatibility value.
     */
    public SchemaCompatibility schemaCompatibility() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaCompatibility();
    }

    /**
     * Set the schemaCompatibility property: The schemaCompatibility property.
     *
     * @param schemaCompatibility the schemaCompatibility value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withSchemaCompatibility(SchemaCompatibility schemaCompatibility) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withSchemaCompatibility(schemaCompatibility);
        return this;
    }

    /**
     * Get the schemaType property: The schemaType property.
     *
     * @return the schemaType value.
     */
    public SchemaType schemaType() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaType();
    }

    /**
     * Set the schemaType property: The schemaType property.
     *
     * @param schemaType the schemaType value to set.
     * @return the SchemaGroupInner object itself.
     */
    public SchemaGroupInner withSchemaType(SchemaType schemaType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SchemaGroupProperties();
        }
        this.innerProperties().withSchemaType(schemaType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}