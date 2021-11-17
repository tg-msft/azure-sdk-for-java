// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for Galleries List. */
public final class GalleriesListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-07-01/examples/gallery/ListGalleriesInASubscription.json
     */
    /**
     * Sample code: List galleries in a subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listGalleriesInASubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getGalleries().list(Context.NONE);
    }
}