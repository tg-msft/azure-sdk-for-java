// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.recoveryservices.models.PrivateLinkResources;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourcesTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResources model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"he\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"jtxukcdm\",\"name\":\"rcryuanzwuxzdxta\",\"type\":\"lhmwhfpmrqobm\"},{\"properties\":{\"groupId\":\"knryrtihfxtij\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"gnwzsymglzufc\",\"name\":\"kohdbiha\",\"type\":\"fhfcb\"},{\"properties\":{\"groupId\":\"a\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"xqhabi\",\"name\":\"ikxwc\",\"type\":\"yscnpqxu\"},{\"properties\":{\"groupId\":\"y\",\"requiredMembers\":[],\"requiredZoneNames\":[]},\"id\":\"b\",\"name\":\"rkxvdum\",\"type\":\"rtfw\"}],\"nextLink\":\"k\"}")
                .toObject(PrivateLinkResources.class);
        Assertions.assertEquals("k", model.nextLink());
    }

    @Test
    public void testSerialize() {
        PrivateLinkResources model =
            new PrivateLinkResources()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner()))
                .withNextLink("k");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResources.class);
        Assertions.assertEquals("k", model.nextLink());
    }
}
