package org.darcstarsolutions.finance.common.instruments;

/**
 * Created by tetn on 10/16/14.
 */
public enum BondType {

    PERPETUAL (0, 0),
    BILL_30_DAY (1, 1.0/12.0),
    BILL_90_DAY (1, 3.0/12.0),
    BILL_6_MONTH (1, 6.0/12.0),
    BILL_9_MONTH (1, 9.0/12.0),
    BILL_1_YEAR (12, 1.0),
    NOTE_2_YEAR (24, 2.0),
    NOTE_5_YEAR (60, 5.0),
    NOTE_10_YEAR (120, 10.0),
    BOND_15_YEAR (180, 15.0),
    BOND_20_YEAR (240, 20.0),
    BOND_30_YEAR (360, 30.0),
    BOND_100_YEAR (1200, 100.0);

    private final int months;
    private final double years;

    BondType(int months, double years){
        this.months = months;
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public double getYears() {
        return years;
    }


}
