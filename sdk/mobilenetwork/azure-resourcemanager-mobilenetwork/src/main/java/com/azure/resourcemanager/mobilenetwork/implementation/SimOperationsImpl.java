// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SimOperationsClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.EncryptedSimUploadList;
import com.azure.resourcemanager.mobilenetwork.models.SimDeleteList;
import com.azure.resourcemanager.mobilenetwork.models.SimOperations;
import com.azure.resourcemanager.mobilenetwork.models.SimUploadList;

public final class SimOperationsImpl implements SimOperations {
    private static final ClientLogger LOGGER = new ClientLogger(SimOperationsImpl.class);

    private final SimOperationsClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SimOperationsImpl(
        SimOperationsClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AsyncOperationStatus bulkUpload(String resourceGroupName, String simGroupName, SimUploadList parameters) {
        AsyncOperationStatusInner inner = this.serviceClient().bulkUpload(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUpload(
        String resourceGroupName, String simGroupName, SimUploadList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUpload(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkDelete(String resourceGroupName, String simGroupName, SimDeleteList parameters) {
        AsyncOperationStatusInner inner = this.serviceClient().bulkDelete(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkDelete(
        String resourceGroupName, String simGroupName, SimDeleteList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkDelete(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUploadEncrypted(
        String resourceGroupName, String simGroupName, EncryptedSimUploadList parameters) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUploadEncrypted(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUploadEncrypted(
        String resourceGroupName, String simGroupName, EncryptedSimUploadList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUploadEncrypted(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SimOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}
