// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elastic.ElasticManager;
import com.azure.resourcemanager.elastic.models.LogRules;
import com.azure.resourcemanager.elastic.models.MonitoringTagRules;
import com.azure.resourcemanager.elastic.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class TagRulesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"logRules\":{\"sendAadLogs\":false,\"sendSubscriptionLogs\":true,\"sendActivityLogs\":true,\"filteringTags\":[]}},\"id\":\"vmeueci\",\"name\":\"yhz\",\"type\":\"euojgjrwju\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ElasticManager manager =
            ElasticManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        MonitoringTagRules response =
            manager
                .tagRules()
                .define("urqhaka")
                .withExistingMonitor("bnbbeldawkz", "ali")
                .withProperties(
                    new MonitoringTagRulesProperties()
                        .withProvisioningState(ProvisioningState.SUCCEEDED)
                        .withLogRules(
                            new LogRules()
                                .withSendAadLogs(true)
                                .withSendSubscriptionLogs(false)
                                .withSendActivityLogs(true)
                                .withFilteringTags(Arrays.asList())))
                .create();

        Assertions.assertEquals(ProvisioningState.SUCCEEDED, response.properties().provisioningState());
        Assertions.assertEquals(false, response.properties().logRules().sendAadLogs());
        Assertions.assertEquals(true, response.properties().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(true, response.properties().logRules().sendActivityLogs());
    }
}
