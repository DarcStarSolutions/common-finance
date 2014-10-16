package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/16/14.
 */
public enum CompoundingPeriod {
    ANNUAL (1),
    SEMI_ANNUAL (2),
    QUARTERLY (4),
    MONTHLY (12),
    WEEKLY (52),
    DAILY (360),
    DAILY_LEAP_YEAR (364),
    DAILY_NO_LEAP (365),
    DAILY_360 (360),
    MONTHLY_30_DAY (30),
    PERENNIAL (-1);

    private final int value;

    CompoundingPeriod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
