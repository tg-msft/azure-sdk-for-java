// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.notificationhubs.models.PolicykeyResource;

/** Samples for NotificationHubs RegenerateKeys. */
public final class NotificationHubsRegenerateKeysSamples {
    /*
     * x-ms-original-file: specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/stable/2017-04-01/examples/NotificationHubs/NotificationHubAuthorizationRuleRegenrateKey.json
     */
    /**
     * Sample code: NotificationHubAuthorizationRuleRegenrateKey.
     *
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void notificationHubAuthorizationRuleRegenrateKey(
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager
            .notificationHubs()
            .regenerateKeysWithResponse(
                "5ktrial",
                "nh-sdk-ns",
                "nh-sdk-hub",
                "DefaultListenSharedAccessSignature",
                new PolicykeyResource().withPolicyKey("PrimaryKey"),
                Context.NONE);
    }
}