// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.desktopvirtualization.models.WorkspacePatch;

/** An instance of this class provides access to all the operations defined in WorkspacesClient. */
public interface WorkspacesClient {
    /**
     * Get a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Get a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Create or update a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspace Object containing Workspace definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Workspace definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner createOrUpdate(String resourceGroupName, String workspaceName, WorkspaceInner workspace);

    /**
     * Create or update a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspace Object containing Workspace definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Workspace definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> createOrUpdateWithResponse(
        String resourceGroupName, String workspaceName, WorkspaceInner workspace, Context context);

    /**
     * Remove a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName);

    /**
     * Remove a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Update a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Workspace definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceInner update(String resourceGroupName, String workspaceName);

    /**
     * Update a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param workspace Object containing Workspace definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Workspace definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkspaceInner> updateWithResponse(
        String resourceGroupName, String workspaceName, WorkspacePatch workspace, Context context);

    /**
     * List workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspaceList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List workspaces.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspaceList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List workspaces in subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspaceList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list();

    /**
     * List workspaces in subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspaceList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkspaceInner> list(Context context);
}