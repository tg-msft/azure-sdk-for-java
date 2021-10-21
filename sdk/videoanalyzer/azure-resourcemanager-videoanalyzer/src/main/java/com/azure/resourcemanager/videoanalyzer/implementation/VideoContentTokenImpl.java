// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoContentTokenInner;
import com.azure.resourcemanager.videoanalyzer.models.VideoContentToken;
import java.time.OffsetDateTime;

public final class VideoContentTokenImpl implements VideoContentToken {
    private VideoContentTokenInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    VideoContentTokenImpl(
        VideoContentTokenInner innerObject,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public String token() {
        return this.innerModel().token();
    }

    public VideoContentTokenInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}