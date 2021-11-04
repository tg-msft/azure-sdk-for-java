// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TriggerBackupRequest Trigger backup request. */
@Fluent
public final class TriggerBackupRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggerBackupRequest.class);

    /*
     * AdHocBackupRuleOptions Name for the Rule of the Policy which needs to be
     * applied for this backup
     */
    @JsonProperty(value = "backupRuleOptions", required = true)
    private AdHocBackupRuleOptions backupRuleOptions;

    /**
     * Get the backupRuleOptions property: AdHocBackupRuleOptions Name for the Rule of the Policy which needs to be
     * applied for this backup.
     *
     * @return the backupRuleOptions value.
     */
    public AdHocBackupRuleOptions backupRuleOptions() {
        return this.backupRuleOptions;
    }

    /**
     * Set the backupRuleOptions property: AdHocBackupRuleOptions Name for the Rule of the Policy which needs to be
     * applied for this backup.
     *
     * @param backupRuleOptions the backupRuleOptions value to set.
     * @return the TriggerBackupRequest object itself.
     */
    public TriggerBackupRequest withBackupRuleOptions(AdHocBackupRuleOptions backupRuleOptions) {
        this.backupRuleOptions = backupRuleOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backupRuleOptions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backupRuleOptions in model TriggerBackupRequest"));
        } else {
            backupRuleOptions().validate();
        }
    }
}