// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicefabric.models.AddOnFeatures;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeVersionsCleanupPolicy;
import com.azure.resourcemanager.servicefabric.models.AzureActiveDirectory;
import com.azure.resourcemanager.servicefabric.models.CertificateDescription;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateCommonName;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateThumbprint;
import com.azure.resourcemanager.servicefabric.models.ClusterState;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradeCadence;
import com.azure.resourcemanager.servicefabric.models.ClusterUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.DiagnosticsStorageAccountConfig;
import com.azure.resourcemanager.servicefabric.models.NodeTypeDescription;
import com.azure.resourcemanager.servicefabric.models.Notification;
import com.azure.resourcemanager.servicefabric.models.ProvisioningState;
import com.azure.resourcemanager.servicefabric.models.ReliabilityLevel;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonNames;
import com.azure.resourcemanager.servicefabric.models.SettingsSectionDescription;
import com.azure.resourcemanager.servicefabric.models.SfZonalUpgradeMode;
import com.azure.resourcemanager.servicefabric.models.UpgradeMode;
import com.azure.resourcemanager.servicefabric.models.VmssZonalUpgradeMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The cluster resource. */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * The cluster resource properties
     */
    @JsonProperty(value = "properties")
    private ClusterProperties innerProperties;

    /*
     * Azure resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClusterInner class. */
    public ClusterInner() {
    }

    /**
     * Get the innerProperties property: The cluster resource properties.
     *
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @return the addOnFeatures value.
     */
    public List<AddOnFeatures> addOnFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().addOnFeatures();
    }

    /**
     * Set the addOnFeatures property: The list of add-on features to enable in the cluster.
     *
     * @param addOnFeatures the addOnFeatures value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAddOnFeatures(List<AddOnFeatures> addOnFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAddOnFeatures(addOnFeatures);
        return this;
    }

    /**
     * Get the availableClusterVersions property: The Service Fabric runtime versions available for this cluster.
     *
     * @return the availableClusterVersions value.
     */
    public List<ClusterVersionDetails> availableClusterVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().availableClusterVersions();
    }

    /**
     * Get the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @return the azureActiveDirectory value.
     */
    public AzureActiveDirectory azureActiveDirectory() {
        return this.innerProperties() == null ? null : this.innerProperties().azureActiveDirectory();
    }

    /**
     * Set the azureActiveDirectory property: The AAD authentication settings of the cluster.
     *
     * @param azureActiveDirectory the azureActiveDirectory value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAzureActiveDirectory(AzureActiveDirectory azureActiveDirectory) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAzureActiveDirectory(azureActiveDirectory);
        return this;
    }

    /**
     * Get the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @return the certificate value.
     */
    public CertificateDescription certificate() {
        return this.innerProperties() == null ? null : this.innerProperties().certificate();
    }

    /**
     * Set the certificate property: The certificate to use for securing the cluster. The certificate provided will be
     * used for node to node security within the cluster, SSL certificate for cluster management endpoint and default
     * admin client.
     *
     * @param certificate the certificate value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificate(CertificateDescription certificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withCertificate(certificate);
        return this;
    }

    /**
     * Get the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @return the certificateCommonNames value.
     */
    public ServerCertificateCommonNames certificateCommonNames() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateCommonNames();
    }

    /**
     * Set the certificateCommonNames property: Describes a list of server certificates referenced by common name that
     * are used to secure the cluster.
     *
     * @param certificateCommonNames the certificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCertificateCommonNames(ServerCertificateCommonNames certificateCommonNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withCertificateCommonNames(certificateCommonNames);
        return this;
    }

    /**
     * Get the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateCommonNames value.
     */
    public List<ClientCertificateCommonName> clientCertificateCommonNames() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertificateCommonNames();
    }

    /**
     * Set the clientCertificateCommonNames property: The list of client certificates referenced by common name that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateCommonNames the clientCertificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateCommonNames(
        List<ClientCertificateCommonName> clientCertificateCommonNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withClientCertificateCommonNames(clientCertificateCommonNames);
        return this;
    }

    /**
     * Get the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @return the clientCertificateThumbprints value.
     */
    public List<ClientCertificateThumbprint> clientCertificateThumbprints() {
        return this.innerProperties() == null ? null : this.innerProperties().clientCertificateThumbprints();
    }

    /**
     * Set the clientCertificateThumbprints property: The list of client certificates referenced by thumbprint that are
     * allowed to manage the cluster.
     *
     * @param clientCertificateThumbprints the clientCertificateThumbprints value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClientCertificateThumbprints(
        List<ClientCertificateThumbprint> clientCertificateThumbprints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withClientCertificateThumbprints(clientCertificateThumbprints);
        return this;
    }

    /**
     * Get the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @return the clusterCodeVersion value.
     */
    public String clusterCodeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterCodeVersion();
    }

    /**
     * Set the clusterCodeVersion property: The Service Fabric runtime version of the cluster. This property can only by
     * set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new
     * clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing
     * clusters use **availableClusterVersions**.
     *
     * @param clusterCodeVersion the clusterCodeVersion value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withClusterCodeVersion(String clusterCodeVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withClusterCodeVersion(clusterCodeVersion);
        return this;
    }

    /**
     * Get the clusterEndpoint property: The Azure Resource Provider endpoint. A system service in the cluster connects
     * to this endpoint.
     *
     * @return the clusterEndpoint value.
     */
    public String clusterEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterEndpoint();
    }

    /**
     * Get the clusterId property: A service generated unique identifier for the cluster resource.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the clusterState property: The current state of the cluster.
     *
     * <p>- WaitingForNodes - Indicates that the cluster resource is created and the resource provider is waiting for
     * Service Fabric VM extension to boot up and report to it. - Deploying - Indicates that the Service Fabric runtime
     * is being installed on the VMs. Cluster resource will be in this state until the cluster boots up and system
     * services are up. - BaselineUpgrade - Indicates that the cluster is upgrading to establishes the cluster version.
     * This upgrade is automatically initiated when the cluster boots up for the first time. - UpdatingUserConfiguration
     * - Indicates that the cluster is being upgraded with the user provided configuration. - UpdatingUserCertificate -
     * Indicates that the cluster is being upgraded with the user provided certificate. - UpdatingInfrastructure -
     * Indicates that the cluster is being upgraded with the latest Service Fabric runtime version. This happens only
     * when the **upgradeMode** is set to 'Automatic'. - EnforcingClusterVersion - Indicates that cluster is on a
     * different version than expected and the cluster is being upgraded to the expected version. -
     * UpgradeServiceUnreachable - Indicates that the system service in the cluster is no longer polling the Resource
     * Provider. Clusters in this state cannot be managed by the Resource Provider. - AutoScale - Indicates that the
     * ReliabilityLevel of the cluster is being adjusted. - Ready - Indicates that the cluster is in a stable state.
     *
     * @return the clusterState value.
     */
    public ClusterState clusterState() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterState();
    }

    /**
     * Get the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @return the diagnosticsStorageAccountConfig value.
     */
    public DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().diagnosticsStorageAccountConfig();
    }

    /**
     * Set the diagnosticsStorageAccountConfig property: The storage account information for storing Service Fabric
     * diagnostic logs.
     *
     * @param diagnosticsStorageAccountConfig the diagnosticsStorageAccountConfig value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withDiagnosticsStorageAccountConfig(
        DiagnosticsStorageAccountConfig diagnosticsStorageAccountConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withDiagnosticsStorageAccountConfig(diagnosticsStorageAccountConfig);
        return this;
    }

    /**
     * Get the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @return the eventStoreServiceEnabled value.
     */
    public Boolean eventStoreServiceEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().eventStoreServiceEnabled();
    }

    /**
     * Set the eventStoreServiceEnabled property: Indicates if the event store service is enabled.
     *
     * @param eventStoreServiceEnabled the eventStoreServiceEnabled value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withEventStoreServiceEnabled(Boolean eventStoreServiceEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withEventStoreServiceEnabled(eventStoreServiceEnabled);
        return this;
    }

    /**
     * Get the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @return the fabricSettings value.
     */
    public List<SettingsSectionDescription> fabricSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().fabricSettings();
    }

    /**
     * Set the fabricSettings property: The list of custom fabric settings to configure the cluster.
     *
     * @param fabricSettings the fabricSettings value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withFabricSettings(List<SettingsSectionDescription> fabricSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withFabricSettings(fabricSettings);
        return this;
    }

    /**
     * Get the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @return the managementEndpoint value.
     */
    public String managementEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().managementEndpoint();
    }

    /**
     * Set the managementEndpoint property: The http management endpoint of the cluster.
     *
     * @param managementEndpoint the managementEndpoint value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withManagementEndpoint(String managementEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withManagementEndpoint(managementEndpoint);
        return this;
    }

    /**
     * Get the nodeTypes property: The list of node types in the cluster.
     *
     * @return the nodeTypes value.
     */
    public List<NodeTypeDescription> nodeTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeTypes();
    }

    /**
     * Set the nodeTypes property: The list of node types in the cluster.
     *
     * @param nodeTypes the nodeTypes value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNodeTypes(List<NodeTypeDescription> nodeTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withNodeTypes(nodeTypes);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the cluster resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @return the reliabilityLevel value.
     */
    public ReliabilityLevel reliabilityLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().reliabilityLevel();
    }

    /**
     * Set the reliabilityLevel property: The reliability level sets the replica set size of system services. Learn
     * about [ReliabilityLevel](https://docs.microsoft.com/azure/service-fabric/service-fabric-cluster-capacity).
     *
     * <p>- None - Run the System services with a target replica set count of 1. This should only be used for test
     * clusters. - Bronze - Run the System services with a target replica set count of 3. This should only be used for
     * test clusters. - Silver - Run the System services with a target replica set count of 5. - Gold - Run the System
     * services with a target replica set count of 7. - Platinum - Run the System services with a target replica set
     * count of 9.
     *
     * @param reliabilityLevel the reliabilityLevel value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReliabilityLevel(ReliabilityLevel reliabilityLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withReliabilityLevel(reliabilityLevel);
        return this;
    }

    /**
     * Get the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @return the reverseProxyCertificate value.
     */
    public CertificateDescription reverseProxyCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().reverseProxyCertificate();
    }

    /**
     * Set the reverseProxyCertificate property: The server certificate used by reverse proxy.
     *
     * @param reverseProxyCertificate the reverseProxyCertificate value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificate(CertificateDescription reverseProxyCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withReverseProxyCertificate(reverseProxyCertificate);
        return this;
    }

    /**
     * Get the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @return the reverseProxyCertificateCommonNames value.
     */
    public ServerCertificateCommonNames reverseProxyCertificateCommonNames() {
        return this.innerProperties() == null ? null : this.innerProperties().reverseProxyCertificateCommonNames();
    }

    /**
     * Set the reverseProxyCertificateCommonNames property: Describes a list of server certificates referenced by common
     * name that are used to secure the cluster.
     *
     * @param reverseProxyCertificateCommonNames the reverseProxyCertificateCommonNames value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withReverseProxyCertificateCommonNames(
        ServerCertificateCommonNames reverseProxyCertificateCommonNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withReverseProxyCertificateCommonNames(reverseProxyCertificateCommonNames);
        return this;
    }

    /**
     * Get the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @return the upgradeDescription value.
     */
    public ClusterUpgradePolicy upgradeDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradeDescription();
    }

    /**
     * Set the upgradeDescription property: The policy to use when upgrading the cluster.
     *
     * @param upgradeDescription the upgradeDescription value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeDescription(ClusterUpgradePolicy upgradeDescription) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradeDescription(upgradeDescription);
        return this;
    }

    /**
     * Get the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * @return the upgradeMode value.
     */
    public UpgradeMode upgradeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradeMode();
    }

    /**
     * Set the upgradeMode property: The upgrade mode of the cluster when new Service Fabric runtime version is
     * available.
     *
     * @param upgradeMode the upgradeMode value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeMode(UpgradeMode upgradeMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradeMode(upgradeMode);
        return this;
    }

    /**
     * Get the applicationTypeVersionsCleanupPolicy property: The policy used to clean up unused versions.
     *
     * @return the applicationTypeVersionsCleanupPolicy value.
     */
    public ApplicationTypeVersionsCleanupPolicy applicationTypeVersionsCleanupPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationTypeVersionsCleanupPolicy();
    }

    /**
     * Set the applicationTypeVersionsCleanupPolicy property: The policy used to clean up unused versions.
     *
     * @param applicationTypeVersionsCleanupPolicy the applicationTypeVersionsCleanupPolicy value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withApplicationTypeVersionsCleanupPolicy(
        ApplicationTypeVersionsCleanupPolicy applicationTypeVersionsCleanupPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withApplicationTypeVersionsCleanupPolicy(applicationTypeVersionsCleanupPolicy);
        return this;
    }

    /**
     * Get the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @return the vmImage value.
     */
    public String vmImage() {
        return this.innerProperties() == null ? null : this.innerProperties().vmImage();
    }

    /**
     * Set the vmImage property: The VM image VMSS has been configured with. Generic names such as Windows or Linux can
     * be used.
     *
     * @param vmImage the vmImage value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmImage(String vmImage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withVmImage(vmImage);
        return this;
    }

    /**
     * Get the sfZonalUpgradeMode property: This property controls the logical grouping of VMs in upgrade domains (UDs).
     * This property can't be modified if a node type with multiple Availability Zones is already present in the
     * cluster.
     *
     * @return the sfZonalUpgradeMode value.
     */
    public SfZonalUpgradeMode sfZonalUpgradeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().sfZonalUpgradeMode();
    }

    /**
     * Set the sfZonalUpgradeMode property: This property controls the logical grouping of VMs in upgrade domains (UDs).
     * This property can't be modified if a node type with multiple Availability Zones is already present in the
     * cluster.
     *
     * @param sfZonalUpgradeMode the sfZonalUpgradeMode value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSfZonalUpgradeMode(SfZonalUpgradeMode sfZonalUpgradeMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withSfZonalUpgradeMode(sfZonalUpgradeMode);
        return this;
    }

    /**
     * Get the vmssZonalUpgradeMode property: This property defines the upgrade mode for the virtual machine scale set,
     * it is mandatory if a node type with multiple Availability Zones is added.
     *
     * @return the vmssZonalUpgradeMode value.
     */
    public VmssZonalUpgradeMode vmssZonalUpgradeMode() {
        return this.innerProperties() == null ? null : this.innerProperties().vmssZonalUpgradeMode();
    }

    /**
     * Set the vmssZonalUpgradeMode property: This property defines the upgrade mode for the virtual machine scale set,
     * it is mandatory if a node type with multiple Availability Zones is added.
     *
     * @param vmssZonalUpgradeMode the vmssZonalUpgradeMode value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withVmssZonalUpgradeMode(VmssZonalUpgradeMode vmssZonalUpgradeMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withVmssZonalUpgradeMode(vmssZonalUpgradeMode);
        return this;
    }

    /**
     * Get the infrastructureServiceManager property: Indicates if infrastructure service manager is enabled.
     *
     * @return the infrastructureServiceManager value.
     */
    public Boolean infrastructureServiceManager() {
        return this.innerProperties() == null ? null : this.innerProperties().infrastructureServiceManager();
    }

    /**
     * Set the infrastructureServiceManager property: Indicates if infrastructure service manager is enabled.
     *
     * @param infrastructureServiceManager the infrastructureServiceManager value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withInfrastructureServiceManager(Boolean infrastructureServiceManager) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withInfrastructureServiceManager(infrastructureServiceManager);
        return this;
    }

    /**
     * Get the upgradeWave property: Indicates when new cluster runtime version upgrades will be applied after they are
     * released. By default is Wave0. Only applies when **upgradeMode** is set to 'Automatic'.
     *
     * @return the upgradeWave value.
     */
    public ClusterUpgradeCadence upgradeWave() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradeWave();
    }

    /**
     * Set the upgradeWave property: Indicates when new cluster runtime version upgrades will be applied after they are
     * released. By default is Wave0. Only applies when **upgradeMode** is set to 'Automatic'.
     *
     * @param upgradeWave the upgradeWave value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradeWave(ClusterUpgradeCadence upgradeWave) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradeWave(upgradeWave);
        return this;
    }

    /**
     * Get the upgradePauseStartTimestampUtc property: Indicates the start date and time to pause automatic runtime
     * version upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @return the upgradePauseStartTimestampUtc value.
     */
    public OffsetDateTime upgradePauseStartTimestampUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePauseStartTimestampUtc();
    }

    /**
     * Set the upgradePauseStartTimestampUtc property: Indicates the start date and time to pause automatic runtime
     * version upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @param upgradePauseStartTimestampUtc the upgradePauseStartTimestampUtc value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradePauseStartTimestampUtc(OffsetDateTime upgradePauseStartTimestampUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradePauseStartTimestampUtc(upgradePauseStartTimestampUtc);
        return this;
    }

    /**
     * Get the upgradePauseEndTimestampUtc property: Indicates the end date and time to pause automatic runtime version
     * upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @return the upgradePauseEndTimestampUtc value.
     */
    public OffsetDateTime upgradePauseEndTimestampUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePauseEndTimestampUtc();
    }

    /**
     * Set the upgradePauseEndTimestampUtc property: Indicates the end date and time to pause automatic runtime version
     * upgrades on the cluster for an specific period of time on the cluster (UTC).
     *
     * @param upgradePauseEndTimestampUtc the upgradePauseEndTimestampUtc value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUpgradePauseEndTimestampUtc(OffsetDateTime upgradePauseEndTimestampUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withUpgradePauseEndTimestampUtc(upgradePauseEndTimestampUtc);
        return this;
    }

    /**
     * Get the waveUpgradePaused property: Boolean to pause automatic runtime version upgrades to the cluster.
     *
     * @return the waveUpgradePaused value.
     */
    public Boolean waveUpgradePaused() {
        return this.innerProperties() == null ? null : this.innerProperties().waveUpgradePaused();
    }

    /**
     * Set the waveUpgradePaused property: Boolean to pause automatic runtime version upgrades to the cluster.
     *
     * @param waveUpgradePaused the waveUpgradePaused value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withWaveUpgradePaused(Boolean waveUpgradePaused) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withWaveUpgradePaused(waveUpgradePaused);
        return this;
    }

    /**
     * Get the notifications property: Indicates a list of notification channels for cluster events.
     *
     * @return the notifications value.
     */
    public List<Notification> notifications() {
        return this.innerProperties() == null ? null : this.innerProperties().notifications();
    }

    /**
     * Set the notifications property: Indicates a list of notification channels for cluster events.
     *
     * @param notifications the notifications value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withNotifications(List<Notification> notifications) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withNotifications(notifications);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
