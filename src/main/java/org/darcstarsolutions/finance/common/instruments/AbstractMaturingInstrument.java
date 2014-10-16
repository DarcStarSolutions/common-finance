package org.darcstarsolutions.finance.common.instruments;

import org.darcstarsolutions.finance.common.*;
import org.joda.time.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public class AbstractMaturingInstrument extends AbstractInstrument implements MaturingInstrument {

    private Maturing maturing;

    public AbstractMaturingInstrument(String name, ISIN isin, Maturing maturing) {
        super(name, isin);
        setMaturing(maturing);
    }

    public AbstractMaturingInstrument(String name, ISIN isin, LocalDate issueDate, LocalDate maturityDate) {
        super(name, isin);
        setMaturing(new StandardMaturity(issueDate, maturityDate));
    }

    public Maturing getMaturing() {
        return maturing;
    }

    public void setMaturing(Maturing maturing) {
        this.maturing = maturing;
    }

    @Override
    public BigDecimal getYieldAtMaturity() {
        return getMaturing().getYieldAtMaturity();
    }

    @Override
    public void setYieldAtMaturity(BigDecimal yieldAtMaturity) {
        getMaturing().setYieldAtMaturity(yieldAtMaturity);
    }

    @Override
    public LocalDate getIssueDate() {
        return getMaturing().getIssueDate();
    }

    @Override
    public void setIssueDate(LocalDate issueDate) {
        getMaturing().setIssueDate(issueDate);
    }

    @Override
    public LocalDate getMaturityDate() {
        return getMaturing().getMaturityDate();
    }

    @Override
    public void setMaturityDate(LocalDate maturityDate) {
        getMaturing().setMaturityDate(maturityDate);
    }

    @Override
    public LocalDate getCurrentDate() {
        return getMaturing().getCurrentDate();
    }

    @Override
    public LocalDate getCurrentDate(DateTimeZone dateTimeZone) {
        return getMaturing().getCurrentDate(dateTimeZone);
    }

    @Override
    public Duration getDurationUntilMaturity() {
        return getMaturing().getDurationUntilMaturity();
    }

    @Override
    public Duration getDurationUntilMaturity(LocalDate date) {
        return getMaturing().getDurationUntilMaturity(date);
    }

    @Override
    public Days getDaysUntilMaturity() {
        return getMaturing().getDaysUntilMaturity();
    }

    @Override
    public Days getDaysUntilMaturity(LocalDate date) {
        return getMaturing().getDaysUntilMaturity(date);
    }

    @Override
    public Period getPeriodUntilMaturity() {
        return getMaturing().getPeriodUntilMaturity();
    }

    @Override
    public Period getPeriodUntilMaturity(LocalDate date) {
        return getMaturing().getPeriodUntilMaturity(date);
    }

    @Override
    public Weeks getWeeksUntilMaturity() {
        return getMaturing().getWeeksUntilMaturity();
    }

    @Override
    public Weeks getWeeksUntilMaturity(LocalDate date) {
        return getMaturing().getWeeksUntilMaturity(date);
    }

    @Override
    public Months getMonthsUntilMaturity() {
        return getMaturing().getMonthsUntilMaturity();
    }

    @Override
    public Months getMonthsUntilMaturity(LocalDate date) {
        return getMaturing().getMonthsUntilMaturity(date);
    }

    @Override
    public Years getYearsUntilMaturity() {
        return getMaturing().getYearsUntilMaturity();
    }

    @Override
    public Years getYearsUntilMaturity(LocalDate date) {
        return getMaturing().getYearsUntilMaturity(date);
    }
}
