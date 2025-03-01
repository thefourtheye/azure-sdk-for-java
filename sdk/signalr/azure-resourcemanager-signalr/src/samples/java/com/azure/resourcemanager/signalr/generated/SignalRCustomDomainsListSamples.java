// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalRCustomDomains List. */
public final class SignalRCustomDomainsListSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/stable/2023-02-01/examples/SignalRCustomDomains_List.json
     */
    /**
     * Sample code: SignalRCustomDomains_List.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRCustomDomainsList(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager.signalRCustomDomains().list("myResourceGroup", "mySignalRService", com.azure.core.util.Context.NONE);
    }
}
