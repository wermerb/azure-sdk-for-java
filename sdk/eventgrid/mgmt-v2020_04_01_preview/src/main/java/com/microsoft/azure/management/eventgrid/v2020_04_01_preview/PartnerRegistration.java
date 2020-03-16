/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.EventGridManager;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation.PartnerRegistrationInner;

/**
 * Type representing PartnerRegistration.
 */
public interface PartnerRegistration extends HasInner<PartnerRegistrationInner>, Resource, GroupableResourceCore<EventGridManager, PartnerRegistrationInner>, HasResourceGroup, Refreshable<PartnerRegistration>, Updatable<PartnerRegistration.Update>, HasManager<EventGridManager> {
    /**
     * @return the authorizedAzureSubscriptionIds value.
     */
    List<String> authorizedAzureSubscriptionIds();

    /**
     * @return the logoUri value.
     */
    String logoUri();

    /**
     * @return the partnerName value.
     */
    String partnerName();

    /**
     * @return the partnerResourceTypeDescription value.
     */
    String partnerResourceTypeDescription();

    /**
     * @return the partnerResourceTypeDisplayName value.
     */
    String partnerResourceTypeDisplayName();

    /**
     * @return the partnerResourceTypeName value.
     */
    String partnerResourceTypeName();

    /**
     * @return the provisioningState value.
     */
    PartnerRegistrationProvisioningState provisioningState();

    /**
     * @return the setupUri value.
     */
    String setupUri();

    /**
     * @return the visibilityState value.
     */
    PartnerRegistrationVisibilityState visibilityState();

    /**
     * The entirety of the PartnerRegistration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PartnerRegistration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PartnerRegistration definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PartnerRegistration definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the partnerregistration definition allowing to specify AuthorizedAzureSubscriptionIds.
         */
        interface WithAuthorizedAzureSubscriptionIds {
            /**
             * Specifies authorizedAzureSubscriptionIds.
             * @param authorizedAzureSubscriptionIds List of Azure subscription Ids that are authorized to create a partner namespace
 associated with this partner registration. This is an optional property. Creating
 partner namespaces is always permitted under the same Azure subscription as the one used
 for creating the partner registration
             * @return the next definition stage
             */
            WithCreate withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify LogoUri.
         */
        interface WithLogoUri {
            /**
             * Specifies logoUri.
             * @param logoUri URI of the logo
             * @return the next definition stage
             */
            WithCreate withLogoUri(String logoUri);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify PartnerName.
         */
        interface WithPartnerName {
            /**
             * Specifies partnerName.
             * @param partnerName Official name of the partner name. For example: "Contoso"
             * @return the next definition stage
             */
            WithCreate withPartnerName(String partnerName);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify PartnerResourceTypeDescription.
         */
        interface WithPartnerResourceTypeDescription {
            /**
             * Specifies partnerResourceTypeDescription.
             * @param partnerResourceTypeDescription Description of the partner resource type
             * @return the next definition stage
             */
            WithCreate withPartnerResourceTypeDescription(String partnerResourceTypeDescription);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify PartnerResourceTypeDisplayName.
         */
        interface WithPartnerResourceTypeDisplayName {
            /**
             * Specifies partnerResourceTypeDisplayName.
             * @param partnerResourceTypeDisplayName Display name of the partner resource type
             * @return the next definition stage
             */
            WithCreate withPartnerResourceTypeDisplayName(String partnerResourceTypeDisplayName);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify PartnerResourceTypeName.
         */
        interface WithPartnerResourceTypeName {
            /**
             * Specifies partnerResourceTypeName.
             * @param partnerResourceTypeName Name of the partner resource type
             * @return the next definition stage
             */
            WithCreate withPartnerResourceTypeName(String partnerResourceTypeName);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify SetupUri.
         */
        interface WithSetupUri {
            /**
             * Specifies setupUri.
             * @param setupUri URI of the partner website that can be used by Azure customers to setup Event Grid
 integration on an event source
             * @return the next definition stage
             */
            WithCreate withSetupUri(String setupUri);
        }

        /**
         * The stage of the partnerregistration definition allowing to specify VisibilityState.
         */
        interface WithVisibilityState {
            /**
             * Specifies visibilityState.
             * @param visibilityState Visibility state of the partner registration. Possible values include: 'Hidden', 'PublicPreview', 'GenerallyAvailable'
             * @return the next definition stage
             */
            WithCreate withVisibilityState(PartnerRegistrationVisibilityState visibilityState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PartnerRegistration>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAuthorizedAzureSubscriptionIds, DefinitionStages.WithLogoUri, DefinitionStages.WithPartnerName, DefinitionStages.WithPartnerResourceTypeDescription, DefinitionStages.WithPartnerResourceTypeDisplayName, DefinitionStages.WithPartnerResourceTypeName, DefinitionStages.WithSetupUri, DefinitionStages.WithVisibilityState {
        }
    }
    /**
     * The template for a PartnerRegistration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PartnerRegistration>, Resource.UpdateWithTags<Update>, UpdateStages.WithAuthorizedAzureSubscriptionIds, UpdateStages.WithLogoUri, UpdateStages.WithPartnerTopicTypeDescription, UpdateStages.WithPartnerTopicTypeDisplayName, UpdateStages.WithPartnerTopicTypeName, UpdateStages.WithSetupUri {
    }

    /**
     * Grouping of PartnerRegistration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the partnerregistration update allowing to specify AuthorizedAzureSubscriptionIds.
         */
        interface WithAuthorizedAzureSubscriptionIds {
            /**
             * Specifies authorizedAzureSubscriptionIds.
             * @param authorizedAzureSubscriptionIds List of IDs of Azure AD applications that are authorized to create a partner namespace
 associated with this partner registration. This is an optional property. Creating
 partner namespaces is always permitted under the same Azure subscription as the one used
 for creating the partner registration
             * @return the next update stage
             */
            Update withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds);
        }

        /**
         * The stage of the partnerregistration update allowing to specify LogoUri.
         */
        interface WithLogoUri {
            /**
             * Specifies logoUri.
             * @param logoUri URI of the partner logo
             * @return the next update stage
             */
            Update withLogoUri(String logoUri);
        }

        /**
         * The stage of the partnerregistration update allowing to specify PartnerTopicTypeDescription.
         */
        interface WithPartnerTopicTypeDescription {
            /**
             * Specifies partnerTopicTypeDescription.
             * @param partnerTopicTypeDescription Description of the partner topic type
             * @return the next update stage
             */
            Update withPartnerTopicTypeDescription(String partnerTopicTypeDescription);
        }

        /**
         * The stage of the partnerregistration update allowing to specify PartnerTopicTypeDisplayName.
         */
        interface WithPartnerTopicTypeDisplayName {
            /**
             * Specifies partnerTopicTypeDisplayName.
             * @param partnerTopicTypeDisplayName Display name of the partner topic type
             * @return the next update stage
             */
            Update withPartnerTopicTypeDisplayName(String partnerTopicTypeDisplayName);
        }

        /**
         * The stage of the partnerregistration update allowing to specify PartnerTopicTypeName.
         */
        interface WithPartnerTopicTypeName {
            /**
             * Specifies partnerTopicTypeName.
             * @param partnerTopicTypeName Name of the partner topic type
             * @return the next update stage
             */
            Update withPartnerTopicTypeName(String partnerTopicTypeName);
        }

        /**
         * The stage of the partnerregistration update allowing to specify SetupUri.
         */
        interface WithSetupUri {
            /**
             * Specifies setupUri.
             * @param setupUri URI of the partner website that can be used by Azure customers to setup Event Grid
 integration on an event source
             * @return the next update stage
             */
            Update withSetupUri(String setupUri);
        }

    }
}
