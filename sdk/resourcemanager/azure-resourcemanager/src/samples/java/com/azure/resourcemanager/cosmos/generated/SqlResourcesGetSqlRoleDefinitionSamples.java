// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for SqlResources GetSqlRoleDefinition. */
public final class SqlResourcesGetSqlRoleDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2021-10-15/examples/CosmosDBSqlRoleDefinitionGet.json
     */
    /**
     * Sample code: CosmosDBSqlRoleDefinitionGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlRoleDefinitionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .getSqlRoleDefinitionWithResponse(
                "myRoleDefinitionId", "myResourceGroupName", "myAccountName", Context.NONE);
    }
}