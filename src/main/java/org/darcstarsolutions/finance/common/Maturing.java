package org.darcstarsolutions.finance.common;

import org.joda.time.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public interface Maturing extends Temporal {

    public BigDecimal getYieldAtMaturity();

    public void setYieldAtMaturity(BigDecimal yieldAtMaturity);

    public LocalDate getMaturityDate();

    void setMaturityDate(LocalDate maturityDate);

    public Duration getDurationUntilMaturity();

    Duration getDurationUntilMaturity(LocalDate date);

    public Days getDaysUntilMaturity();

    Days getDaysUntilMaturity(LocalDate date);

    public Period getPeriodUntilMaturity();

    Period getPeriodUntilMaturity(LocalDate date);

    public Weeks getWeeksUntilMaturity();

    Weeks getWeeksUntilMaturity(LocalDate date);

    public Months getMonthsUntilMaturity();

    Months getMonthsUntilMaturity(LocalDate date);

    public Years getYearsUntilMaturity();

    Years getYearsUntilMaturity(LocalDate date);
}
