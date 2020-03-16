// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NamedEntityRecognitionSkillLanguage.
 */
public enum NamedEntityRecognitionSkillLanguage {
    /**
     * Enum value ar.
     */
    AR("ar"),

    /**
     * Enum value cs.
     */
    CS("cs"),

    /**
     * Enum value da.
     */
    DA("da"),

    /**
     * Enum value de.
     */
    DE("de"),

    /**
     * Enum value en.
     */
    EN("en"),

    /**
     * Enum value es.
     */
    ES("es"),

    /**
     * Enum value fi.
     */
    FI("fi"),

    /**
     * Enum value fr.
     */
    FR("fr"),

    /**
     * Enum value he.
     */
    HE("he"),

    /**
     * Enum value hu.
     */
    HU("hu"),

    /**
     * Enum value it.
     */
    IT("it"),

    /**
     * Enum value ko.
     */
    KO("ko"),

    /**
     * Enum value pt-br.
     */
    PT_BR("pt-br"),

    /**
     * Enum value pt.
     */
    PT("pt");

    /**
     * The actual serialized value for a NamedEntityRecognitionSkillLanguage instance.
     */
    private final String value;

    NamedEntityRecognitionSkillLanguage(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NamedEntityRecognitionSkillLanguage instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NamedEntityRecognitionSkillLanguage object, or null if unable to parse.
     */
    @JsonCreator
    public static NamedEntityRecognitionSkillLanguage fromString(String value) {
        NamedEntityRecognitionSkillLanguage[] items = NamedEntityRecognitionSkillLanguage.values();
        for (NamedEntityRecognitionSkillLanguage item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
