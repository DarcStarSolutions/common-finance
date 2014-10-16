package org.darcstarsolutions.finance.common;

import org.joda.time.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public class StandardMaturity implements Maturing {

    private LocalDate maturityDate;
    private LocalDate issueDate;
    private BigDecimal yieldAtMaturity;

    public StandardMaturity(LocalDate issueDate, LocalDate maturityDate){
        setIssueDate(issueDate);
        setMaturityDate(maturityDate);
    }

    @Override
    public BigDecimal getYieldAtMaturity() {
        return yieldAtMaturity;
    }

    @Override
    public void setYieldAtMaturity(BigDecimal yieldAtMaturity) {
        this.yieldAtMaturity = yieldAtMaturity;
    }

    @Override
    public LocalDate getIssueDate() {
        return issueDate;
    }

    @Override
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    @Override
    public void setMaturityDate(LocalDate maturityDate){
        this.maturityDate = maturityDate;
    }

    @Override
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    @Override
    public LocalDate getCurrentDate(DateTimeZone dateTimeZone){
        return LocalDate.now(dateTimeZone);
    }

    @Override
    public Duration getDurationUntilMaturity() {
        return getDurationUntilMaturity(getCurrentDate());
    }

    @Override
    public Duration getDurationUntilMaturity(LocalDate date) {
        return getPeriodUntilMaturity(date).toStandardDuration();
    }


    @Override
    public Days getDaysUntilMaturity() {
        return getDaysUntilMaturity(getCurrentDate());
    }

    @Override
    public Days getDaysUntilMaturity(LocalDate date) {
        return Days.daysBetween(date, getMaturityDate());
    }

    @Override
    public Period getPeriodUntilMaturity() {
        return getPeriodUntilMaturity(getCurrentDate());
    }


    @Override
    public Period getPeriodUntilMaturity(LocalDate date) {
        return new Period(date, getMaturityDate());
    }

    @Override
    public Weeks getWeeksUntilMaturity() {
        return getWeeksUntilMaturity(getCurrentDate());
    }

    @Override
    public Weeks getWeeksUntilMaturity(LocalDate date) {
        return Weeks.weeksBetween(date, getMaturityDate());
    }

    @Override
    public Months getMonthsUntilMaturity() {
        return getMonthsUntilMaturity(getCurrentDate());
    }

    @Override
    public Months getMonthsUntilMaturity(LocalDate date) {
        return Months.monthsBetween(date, getMaturityDate());
    }

    @Override
    public Years getYearsUntilMaturity() {
        return getYearsUntilMaturity(getCurrentDate());
    }

    @Override
    public Years getYearsUntilMaturity(LocalDate date) {
        return Years.yearsBetween(date, getMaturityDate());
    }
}
