package org.darcstarsolutions.finance.common;

import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.SortedMap;

/**
 * Created by tetn on 10/23/14.
 */
public interface CashFlow extends SortedMap<LocalDate, BigDecimal>, Temporal {
    public BigInteger getPeriods();

    public BigInteger getPeriodsPerYear();

    public BigDecimal getRemainingPeriods();
}
