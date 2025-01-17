// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupResourceEncryptionConfigsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceEncryptionConfigExtendedResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceEncryptionConfigExtendedResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceEncryptionConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceEncryptionConfigs;

public final class BackupResourceEncryptionConfigsImpl implements BackupResourceEncryptionConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(BackupResourceEncryptionConfigsImpl.class);

    private final BackupResourceEncryptionConfigsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupResourceEncryptionConfigsImpl(
        BackupResourceEncryptionConfigsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BackupResourceEncryptionConfigExtendedResource> getWithResponse(
        String vaultName, String resourceGroupName, Context context) {
        Response<BackupResourceEncryptionConfigExtendedResourceInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupResourceEncryptionConfigExtendedResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BackupResourceEncryptionConfigExtendedResource get(String vaultName, String resourceGroupName) {
        BackupResourceEncryptionConfigExtendedResourceInner inner =
            this.serviceClient().get(vaultName, resourceGroupName);
        if (inner != null) {
            return new BackupResourceEncryptionConfigExtendedResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> updateWithResponse(
        String vaultName,
        String resourceGroupName,
        BackupResourceEncryptionConfigResource parameters,
        Context context) {
        return this.serviceClient().updateWithResponse(vaultName, resourceGroupName, parameters, context);
    }

    public void update(String vaultName, String resourceGroupName, BackupResourceEncryptionConfigResource parameters) {
        this.serviceClient().update(vaultName, resourceGroupName, parameters);
    }

    private BackupResourceEncryptionConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
