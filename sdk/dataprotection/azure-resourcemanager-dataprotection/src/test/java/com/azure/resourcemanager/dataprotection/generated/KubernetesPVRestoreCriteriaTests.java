// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.KubernetesPVRestoreCriteria;
import org.junit.jupiter.api.Assertions;

public final class KubernetesPVRestoreCriteriaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesPVRestoreCriteria model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"KubernetesPVRestoreCriteria\",\"name\":\"hw\",\"storageClassName\":\"oldweyuqdu\"}")
                .toObject(KubernetesPVRestoreCriteria.class);
        Assertions.assertEquals("hw", model.name());
        Assertions.assertEquals("oldweyuqdu", model.storageClassName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesPVRestoreCriteria model =
            new KubernetesPVRestoreCriteria().withName("hw").withStorageClassName("oldweyuqdu");
        model = BinaryData.fromObject(model).toObject(KubernetesPVRestoreCriteria.class);
        Assertions.assertEquals("hw", model.name());
        Assertions.assertEquals("oldweyuqdu", model.storageClassName());
    }
}
