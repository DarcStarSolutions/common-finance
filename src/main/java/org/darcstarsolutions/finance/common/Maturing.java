package org.darcstarsolutions.finance.common;

import org.joda.time.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public interface Maturing {

    public BigDecimal getYieldAtMaturity();

    public void setYieldAtMaturity(BigDecimal yieldAtMaturity);

    public LocalDate getIssueDate();

    public void setIssueDate(LocalDate issueDate);

    public LocalDate getMaturityDate();

    void setMaturityDate(LocalDate maturityDate);

    public LocalDate getCurrentDate();

    public Duration getDurationUntilMaturity();

    public Days getDaysUntilMaturity();

    public Period getPeriodUntilMaturity();

    public Weeks getWeeksUntilMaturity();

    public Months getMonthsUntilMaturity();

    public Years getYearsUntilMaturity();

}
