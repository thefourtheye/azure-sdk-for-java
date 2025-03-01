// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.OperationInner;
import com.azure.resourcemanager.avs.models.OperationProperties;
import com.azure.resourcemanager.avs.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"smy\",\"display\":{\"provider\":\"dtmlxhekuksjt\",\"resource\":\"kc\",\"operation\":\"parcry\",\"description\":\"nzwuxzd\"},\"isDataAction\":false,\"origin\":\"rlhm\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[],\"metricSpecifications\":[]}}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
        Assertions.assertEquals("rlhm", model.origin());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withIsDataAction(false)
                .withOrigin("rlhm")
                .withProperties(
                    new OperationProperties()
                        .withServiceSpecification(
                            new ServiceSpecification()
                                .withLogSpecifications(Arrays.asList())
                                .withMetricSpecifications(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals(false, model.isDataAction());
        Assertions.assertEquals("rlhm", model.origin());
    }
}
