// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceIdentityType. */
public final class ResourceIdentityType extends ExpandableStringEnum<ResourceIdentityType> {
    /** Static value SystemAssigned for ResourceIdentityType. */
    public static final ResourceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value None for ResourceIdentityType. */
    public static final ResourceIdentityType NONE = fromString("None");

    /**
     * Creates or finds a ResourceIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceIdentityType.
     */
    @JsonCreator
    public static ResourceIdentityType fromString(String name) {
        return fromString(name, ResourceIdentityType.class);
    }

    /** @return known ResourceIdentityType values. */
    public static Collection<ResourceIdentityType> values() {
        return values(ResourceIdentityType.class);
    }
}