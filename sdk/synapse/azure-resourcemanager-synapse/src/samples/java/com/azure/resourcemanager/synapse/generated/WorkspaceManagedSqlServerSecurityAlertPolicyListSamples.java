// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for WorkspaceManagedSqlServerSecurityAlertPolicy List. */
public final class WorkspaceManagedSqlServerSecurityAlertPolicyListSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-06-01/examples/ListWorkspaceManagedSqlServerSecurityAlertPolicies.json
     */
    /**
     * Sample code: Get workspace managed sql server's security alert policy.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void getWorkspaceManagedSqlServerSSecurityAlertPolicy(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.workspaceManagedSqlServerSecurityAlertPolicies().list("wsg-7398", "testWorkspace", Context.NONE);
    }
}