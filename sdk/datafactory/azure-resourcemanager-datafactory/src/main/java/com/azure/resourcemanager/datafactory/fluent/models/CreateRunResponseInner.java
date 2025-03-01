// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body with a run identifier. */
@Fluent
public final class CreateRunResponseInner {
    /*
     * Identifier of a run.
     */
    @JsonProperty(value = "runId", required = true)
    private String runId;

    /** Creates an instance of CreateRunResponseInner class. */
    public CreateRunResponseInner() {
    }

    /**
     * Get the runId property: Identifier of a run.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the runId property: Identifier of a run.
     *
     * @param runId the runId value to set.
     * @return the CreateRunResponseInner object itself.
     */
    public CreateRunResponseInner withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property runId in model CreateRunResponseInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateRunResponseInner.class);
}
