// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationSecurityGroups Delete. */
public final class ApplicationSecurityGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ApplicationSecurityGroupDelete.json
     */
    /**
     * Sample code: Delete application security group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteApplicationSecurityGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationSecurityGroups()
            .delete("rg1", "test-asg", Context.NONE);
    }
}