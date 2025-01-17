// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.AdministratorType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Properties of a active directory administrator. */
@Fluent
public final class AdministratorProperties {
    /*
     * Type of the sever administrator.
     */
    @JsonProperty(value = "administratorType", required = true)
    private AdministratorType administratorType;

    /*
     * Login name of the server administrator.
     */
    @JsonProperty(value = "login", required = true)
    private String login;

    /*
     * SID (object ID) of the server administrator.
     */
    @JsonProperty(value = "sid", required = true)
    private UUID sid;

    /*
     * Tenant ID of the administrator.
     */
    @JsonProperty(value = "tenantId")
    private UUID tenantId;

    /*
     * Azure Active Directory only Authentication enabled.
     */
    @JsonProperty(value = "azureADOnlyAuthentication")
    private Boolean azureADOnlyAuthentication;

    /**
     * Get the administratorType property: Type of the sever administrator.
     *
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: Type of the sever administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withAdministratorType(AdministratorType administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login property: Login name of the server administrator.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: Login name of the server administrator.
     *
     * @param login the login value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid property: SID (object ID) of the server administrator.
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the sid property: SID (object ID) of the server administrator.
     *
     * @param sid the sid value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID of the administrator.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID of the administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (administratorType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorType in model AdministratorProperties"));
        }
        if (login() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property login in model AdministratorProperties"));
        }
        if (sid() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sid in model AdministratorProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdministratorProperties.class);
}
