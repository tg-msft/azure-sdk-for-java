// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the delete operation. */
public final class SubAccountsDeleteResponse extends ResponseBase<SubAccountsDeleteHeaders, Void> {
    /**
     * Creates an instance of SubAccountsDeleteResponse.
     *
     * @param request the request which resulted in this SubAccountsDeleteResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SubAccountsDeleteResponse(
        HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, SubAccountsDeleteHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}