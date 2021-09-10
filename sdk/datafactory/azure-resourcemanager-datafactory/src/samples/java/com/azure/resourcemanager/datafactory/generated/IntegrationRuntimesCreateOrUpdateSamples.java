// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntime;

/** Samples for IntegrationRuntimes CreateOrUpdate. */
public final class IntegrationRuntimesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/IntegrationRuntimes_Create.json
     */
    /**
     * Sample code: IntegrationRuntimes_Create.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesCreate(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .integrationRuntimes()
            .define("exampleIntegrationRuntime")
            .withExistingFactory("exampleResourceGroup", "exampleFactoryName")
            .withProperties(new SelfHostedIntegrationRuntime().withDescription("A selfhosted integration runtime"))
            .create();
    }
}