package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/16/14.
 */
public enum PayoutPeriod {
    ANNUAL (1),
    SEMI_ANNUAL (2),
    QUARTERLY (4),
    MONTHLY (12),
    WEEKLY (52),
    DAILY (360),
    DAILY_LEAP_YEAR (364),
    DAILY_NO_LEAP (365),
    DAILY_360 (360);

    private final int value;

    PayoutPeriod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
