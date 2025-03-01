// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a set of certificates which are all in the same Key Vault. */
@Fluent
public final class CloudServiceVaultSecretGroup {
    /*
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     */
    @JsonProperty(value = "sourceVault")
    private SubResource sourceVault;

    /*
     * The list of key vault references in SourceVault which contain certificates.
     */
    @JsonProperty(value = "vaultCertificates")
    private List<CloudServiceVaultCertificate> vaultCertificates;

    /** Creates an instance of CloudServiceVaultSecretGroup class. */
    public CloudServiceVaultSecretGroup() {
    }

    /**
     * Get the sourceVault property: The relative URL of the Key Vault containing all of the certificates in
     * VaultCertificates.
     *
     * @return the sourceVault value.
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault property: The relative URL of the Key Vault containing all of the certificates in
     * VaultCertificates.
     *
     * @param sourceVault the sourceVault value to set.
     * @return the CloudServiceVaultSecretGroup object itself.
     */
    public CloudServiceVaultSecretGroup withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the vaultCertificates property: The list of key vault references in SourceVault which contain certificates.
     *
     * @return the vaultCertificates value.
     */
    public List<CloudServiceVaultCertificate> vaultCertificates() {
        return this.vaultCertificates;
    }

    /**
     * Set the vaultCertificates property: The list of key vault references in SourceVault which contain certificates.
     *
     * @param vaultCertificates the vaultCertificates value to set.
     * @return the CloudServiceVaultSecretGroup object itself.
     */
    public CloudServiceVaultSecretGroup withVaultCertificates(List<CloudServiceVaultCertificate> vaultCertificates) {
        this.vaultCertificates = vaultCertificates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultCertificates() != null) {
            vaultCertificates().forEach(e -> e.validate());
        }
    }
}
