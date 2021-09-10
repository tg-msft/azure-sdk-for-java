// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.Configuration;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsConfigPendingRestart;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsDynamicConfig;
import com.azure.resourcemanager.mysqlflexibleserver.models.IsReadOnly;

public final class ConfigurationImpl implements Configuration {
    private ConfigurationInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    ConfigurationImpl(
        ConfigurationInner innerObject, com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String value() {
        return this.innerModel().value();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String defaultValue() {
        return this.innerModel().defaultValue();
    }

    public String dataType() {
        return this.innerModel().dataType();
    }

    public String allowedValues() {
        return this.innerModel().allowedValues();
    }

    public ConfigurationSource source() {
        return this.innerModel().source();
    }

    public IsReadOnly isReadOnly() {
        return this.innerModel().isReadOnly();
    }

    public IsConfigPendingRestart isConfigPendingRestart() {
        return this.innerModel().isConfigPendingRestart();
    }

    public IsDynamicConfig isDynamicConfig() {
        return this.innerModel().isDynamicConfig();
    }

    public ConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}