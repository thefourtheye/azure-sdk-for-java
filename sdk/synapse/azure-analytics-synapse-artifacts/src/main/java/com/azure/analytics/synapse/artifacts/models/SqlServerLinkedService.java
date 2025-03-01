// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SQL Server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServer")
@JsonFlatten
@Fluent
public class SqlServerLinkedService extends LinkedService {
    /*
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * The on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * The on-premises Windows authentication password.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * Sql always encrypted properties.
     */
    @JsonProperty(value = "typeProperties.alwaysEncryptedSettings")
    private SqlAlwaysEncryptedProperties alwaysEncryptedSettings;

    /** Creates an instance of SqlServerLinkedService class. */
    public SqlServerLinkedService() {}

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the userName property: The on-premises Windows authentication user name. Type: string (or Expression with
     * resultType string).
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The on-premises Windows authentication user name. Type: string (or Expression with
     * resultType string).
     *
     * @param userName the userName value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The on-premises Windows authentication password.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The on-premises Windows authentication password.
     *
     * @param password the password value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the alwaysEncryptedSettings property: Sql always encrypted properties.
     *
     * @return the alwaysEncryptedSettings value.
     */
    public SqlAlwaysEncryptedProperties getAlwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings;
    }

    /**
     * Set the alwaysEncryptedSettings property: Sql always encrypted properties.
     *
     * @param alwaysEncryptedSettings the alwaysEncryptedSettings value to set.
     * @return the SqlServerLinkedService object itself.
     */
    public SqlServerLinkedService setAlwaysEncryptedSettings(SqlAlwaysEncryptedProperties alwaysEncryptedSettings) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlServerLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
