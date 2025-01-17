// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CatalogCollationType. */
public final class CatalogCollationType extends ExpandableStringEnum<CatalogCollationType> {
    /** Static value DATABASE_DEFAULT for CatalogCollationType. */
    public static final CatalogCollationType DATABASE_DEFAULT = fromString("DATABASE_DEFAULT");

    /** Static value SQL_Latin1_General_CP1_CI_AS for CatalogCollationType. */
    public static final CatalogCollationType SQL_LATIN1_GENERAL_CP1_CI_AS = fromString("SQL_Latin1_General_CP1_CI_AS");

    /**
     * Creates or finds a CatalogCollationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CatalogCollationType.
     */
    @JsonCreator
    public static CatalogCollationType fromString(String name) {
        return fromString(name, CatalogCollationType.class);
    }

    /**
     * Gets known CatalogCollationType values.
     *
     * @return known CatalogCollationType values.
     */
    public static Collection<CatalogCollationType> values() {
        return values(CatalogCollationType.class);
    }
}
