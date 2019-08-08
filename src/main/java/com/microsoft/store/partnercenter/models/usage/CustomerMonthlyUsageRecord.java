// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class defines the monthly usage record of a customer for all its subscriptions.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerMonthlyUsageRecord
    extends UsageRecordBase
{
    /**
     * The spending budget allocated for the customer.
     */
    private SpendingBudget budget;

    /**
     * The percentage used out of the allocated budget.
     */
    private double percentUsed;
 
    /**
     * Gets the spending budget allocated for the customer.
     * 
     * @return The spending budget allocated for the customer.
     */
    public SpendingBudget getBudget()
    {
        return budget;
    }

    /**
     * Sets the spending budget allocated for the customer.
     * 
     * @param value The spending budget allocated for the customer.
     */
    public void setBudget(SpendingBudget value)
    {
        budget = value;
    }

    /**
     * Gets the percentage used out of the allocated budget.
     * 
     * @return The percentage used out of the allocated budget.
     */
    public double getPercentUsed()
    {
        return percentUsed;
    }

    /**
     * Sets the percentage used out of the allocated budget.
     * 
     * @param value The percentage used out of the allocated budget.
     */
    public void setPercentUsed(double value)
    {
        percentUsed = value;
    }
}