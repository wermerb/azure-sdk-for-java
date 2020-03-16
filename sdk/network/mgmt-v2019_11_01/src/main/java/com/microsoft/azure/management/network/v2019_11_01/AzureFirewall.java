/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import java.util.Map;
import com.microsoft.azure.management.network.v2019_11_01.implementation.AzureFirewallInner;

/**
 * Type representing AzureFirewall.
 */
public interface AzureFirewall extends HasInner<AzureFirewallInner>, Resource, GroupableResourceCore<NetworkManager, AzureFirewallInner>, HasResourceGroup, Refreshable<AzureFirewall>, Updatable<AzureFirewall.Update>, HasManager<NetworkManager> {
    /**
     * @return the additionalProperties value.
     */
    Map<String, String> additionalProperties();

    /**
     * @return the applicationRuleCollections value.
     */
    List<AzureFirewallApplicationRuleCollection> applicationRuleCollections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the firewallPolicy value.
     */
    SubResource firewallPolicy();

    /**
     * @return the hubIpAddresses value.
     */
    HubIPAddresses hubIpAddresses();

    /**
     * @return the ipConfigurations value.
     */
    List<AzureFirewallIPConfiguration> ipConfigurations();

    /**
     * @return the ipGroups value.
     */
    List<AzureFirewallIpGroups> ipGroups();

    /**
     * @return the managementIpConfiguration value.
     */
    AzureFirewallIPConfiguration managementIpConfiguration();

    /**
     * @return the natRuleCollections value.
     */
    List<AzureFirewallNatRuleCollection> natRuleCollections();

    /**
     * @return the networkRuleCollections value.
     */
    List<AzureFirewallNetworkRuleCollection> networkRuleCollections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    AzureFirewallSku sku();

    /**
     * @return the threatIntelMode value.
     */
    AzureFirewallThreatIntelMode threatIntelMode();

    /**
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the AzureFirewall definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AzureFirewall definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AzureFirewall definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AzureFirewall definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the azurefirewall definition allowing to specify AdditionalProperties.
         */
        interface WithAdditionalProperties {
            /**
             * Specifies additionalProperties.
             * @param additionalProperties The additional properties used to further config this azure firewall
             * @return the next definition stage
             */
            WithCreate withAdditionalProperties(Map<String, String> additionalProperties);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify ApplicationRuleCollections.
         */
        interface WithApplicationRuleCollections {
            /**
             * Specifies applicationRuleCollections.
             * @param applicationRuleCollections Collection of application rule collections used by Azure Firewall
             * @return the next definition stage
             */
            WithCreate withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify FirewallPolicy.
         */
        interface WithFirewallPolicy {
            /**
             * Specifies firewallPolicy.
             * @param firewallPolicy The firewallPolicy associated with this azure firewall
             * @return the next definition stage
             */
            WithCreate withFirewallPolicy(SubResource firewallPolicy);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configuration of the Azure Firewall resource
             * @return the next definition stage
             */
            WithCreate withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify ManagementIpConfiguration.
         */
        interface WithManagementIpConfiguration {
            /**
             * Specifies managementIpConfiguration.
             * @param managementIpConfiguration IP configuration of the Azure Firewall used for management traffic
             * @return the next definition stage
             */
            WithCreate withManagementIpConfiguration(AzureFirewallIPConfiguration managementIpConfiguration);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify NatRuleCollections.
         */
        interface WithNatRuleCollections {
            /**
             * Specifies natRuleCollections.
             * @param natRuleCollections Collection of NAT rule collections used by Azure Firewall
             * @return the next definition stage
             */
            WithCreate withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify NetworkRuleCollections.
         */
        interface WithNetworkRuleCollections {
            /**
             * Specifies networkRuleCollections.
             * @param networkRuleCollections Collection of network rule collections used by Azure Firewall
             * @return the next definition stage
             */
            WithCreate withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The Azure Firewall Resource SKU
             * @return the next definition stage
             */
            WithCreate withSku(AzureFirewallSku sku);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify ThreatIntelMode.
         */
        interface WithThreatIntelMode {
            /**
             * Specifies threatIntelMode.
             * @param threatIntelMode The operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'
             * @return the next definition stage
             */
            WithCreate withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The virtualHub to which the firewall belongs
             * @return the next definition stage
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the azurefirewall definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones A list of availability zones denoting where the resource needs to come from
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AzureFirewall>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdditionalProperties, DefinitionStages.WithApplicationRuleCollections, DefinitionStages.WithFirewallPolicy, DefinitionStages.WithIpConfigurations, DefinitionStages.WithManagementIpConfiguration, DefinitionStages.WithNatRuleCollections, DefinitionStages.WithNetworkRuleCollections, DefinitionStages.WithSku, DefinitionStages.WithThreatIntelMode, DefinitionStages.WithVirtualHub, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a AzureFirewall update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AzureFirewall>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdditionalProperties, UpdateStages.WithApplicationRuleCollections, UpdateStages.WithFirewallPolicy, UpdateStages.WithIpConfigurations, UpdateStages.WithManagementIpConfiguration, UpdateStages.WithNatRuleCollections, UpdateStages.WithNetworkRuleCollections, UpdateStages.WithSku, UpdateStages.WithThreatIntelMode, UpdateStages.WithVirtualHub, UpdateStages.WithZones {
    }

    /**
     * Grouping of AzureFirewall update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the azurefirewall update allowing to specify AdditionalProperties.
         */
        interface WithAdditionalProperties {
            /**
             * Specifies additionalProperties.
             * @param additionalProperties The additional properties used to further config this azure firewall
             * @return the next update stage
             */
            Update withAdditionalProperties(Map<String, String> additionalProperties);
        }

        /**
         * The stage of the azurefirewall update allowing to specify ApplicationRuleCollections.
         */
        interface WithApplicationRuleCollections {
            /**
             * Specifies applicationRuleCollections.
             * @param applicationRuleCollections Collection of application rule collections used by Azure Firewall
             * @return the next update stage
             */
            Update withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections);
        }

        /**
         * The stage of the azurefirewall update allowing to specify FirewallPolicy.
         */
        interface WithFirewallPolicy {
            /**
             * Specifies firewallPolicy.
             * @param firewallPolicy The firewallPolicy associated with this azure firewall
             * @return the next update stage
             */
            Update withFirewallPolicy(SubResource firewallPolicy);
        }

        /**
         * The stage of the azurefirewall update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations IP configuration of the Azure Firewall resource
             * @return the next update stage
             */
            Update withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the azurefirewall update allowing to specify ManagementIpConfiguration.
         */
        interface WithManagementIpConfiguration {
            /**
             * Specifies managementIpConfiguration.
             * @param managementIpConfiguration IP configuration of the Azure Firewall used for management traffic
             * @return the next update stage
             */
            Update withManagementIpConfiguration(AzureFirewallIPConfiguration managementIpConfiguration);
        }

        /**
         * The stage of the azurefirewall update allowing to specify NatRuleCollections.
         */
        interface WithNatRuleCollections {
            /**
             * Specifies natRuleCollections.
             * @param natRuleCollections Collection of NAT rule collections used by Azure Firewall
             * @return the next update stage
             */
            Update withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections);
        }

        /**
         * The stage of the azurefirewall update allowing to specify NetworkRuleCollections.
         */
        interface WithNetworkRuleCollections {
            /**
             * Specifies networkRuleCollections.
             * @param networkRuleCollections Collection of network rule collections used by Azure Firewall
             * @return the next update stage
             */
            Update withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections);
        }

        /**
         * The stage of the azurefirewall update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The Azure Firewall Resource SKU
             * @return the next update stage
             */
            Update withSku(AzureFirewallSku sku);
        }

        /**
         * The stage of the azurefirewall update allowing to specify ThreatIntelMode.
         */
        interface WithThreatIntelMode {
            /**
             * Specifies threatIntelMode.
             * @param threatIntelMode The operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'
             * @return the next update stage
             */
            Update withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }

        /**
         * The stage of the azurefirewall update allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
            /**
             * Specifies virtualHub.
             * @param virtualHub The virtualHub to which the firewall belongs
             * @return the next update stage
             */
            Update withVirtualHub(SubResource virtualHub);
        }

        /**
         * The stage of the azurefirewall update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones A list of availability zones denoting where the resource needs to come from
             * @return the next update stage
             */
            Update withZones(List<String> zones);
        }

    }
}
