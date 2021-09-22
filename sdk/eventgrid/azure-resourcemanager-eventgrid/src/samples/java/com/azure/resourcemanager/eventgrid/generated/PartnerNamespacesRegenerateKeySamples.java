// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.PartnerNamespaceRegenerateKeyRequest;

/** Samples for PartnerNamespaces RegenerateKey. */
public final class PartnerNamespacesRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-06-01-preview/examples/PartnerNamespaces_RegenerateKey.json
     */
    /**
     * Sample code: PartnerNamespaces_RegenerateKey.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerNamespacesRegenerateKey(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerNamespaces()
            .regenerateKeyWithResponse(
                "examplerg",
                "examplePartnerNamespaceName1",
                new PartnerNamespaceRegenerateKeyRequest().withKeyName("key1"),
                Context.NONE);
    }
}