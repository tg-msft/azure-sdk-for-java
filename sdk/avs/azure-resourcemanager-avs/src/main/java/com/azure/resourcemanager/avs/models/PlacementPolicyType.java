// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** placement policy type. */
public final class PlacementPolicyType extends ExpandableStringEnum<PlacementPolicyType> {
    /** Static value VmVm for PlacementPolicyType. */
    public static final PlacementPolicyType VM_VM = fromString("VmVm");

    /** Static value VmHost for PlacementPolicyType. */
    public static final PlacementPolicyType VM_HOST = fromString("VmHost");

    /**
     * Creates or finds a PlacementPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PlacementPolicyType.
     */
    @JsonCreator
    public static PlacementPolicyType fromString(String name) {
        return fromString(name, PlacementPolicyType.class);
    }

    /**
     * Gets known PlacementPolicyType values.
     *
     * @return known PlacementPolicyType values.
     */
    public static Collection<PlacementPolicyType> values() {
        return values(PlacementPolicyType.class);
    }
}
