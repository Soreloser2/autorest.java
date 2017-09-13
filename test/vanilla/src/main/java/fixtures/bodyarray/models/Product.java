/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyarray.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Product model.
 */
public class Product {
    /**
     * The integer property.
     */
    @JsonProperty(value = "integer")
    private Integer integer;

    /**
     * The stringProperty property.
     */
    @JsonProperty(value = "string")
    private String stringProperty;

    /**
     * Get the integer value.
     *
     * @return the integer value
     */
    public Integer integer() {
        return this.integer;
    }

    /**
     * Set the integer value.
     *
     * @param integer the integer value to set
     * @return the Product object itself.
     */
    public Product withInteger(Integer integer) {
        this.integer = integer;
        return this;
    }

    /**
     * Get the stringProperty value.
     *
     * @return the stringProperty value
     */
    public String stringProperty() {
        return this.stringProperty;
    }

    /**
     * Set the stringProperty value.
     *
     * @param stringProperty the stringProperty value to set
     * @return the Product object itself.
     */
    public Product withStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
        return this;
    }

}