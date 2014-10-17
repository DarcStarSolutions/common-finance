package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Maturing;
import org.joda.time.*;

/**
 * Created by mharris021 on 10/16/14.
 */
public class MaturityCalculator {

    private final Maturing maturing;

    public MaturityCalculator(Maturing maturing) {
        this.maturing = maturing;
    }

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public Duration getDurationUntilMaturity() {
        return getDurationUntilMaturity(getCurrentDate());
    }

    public Duration getDurationUntilMaturity(LocalDate date) {
        return getPeriodUntilMaturity(date).toStandardDuration();
    }

    public Days getDaysUntilMaturity() {
        return getDaysUntilMaturity(getCurrentDate());
    }

    public Days getDaysUntilMaturity(LocalDate date) {
        return Days.daysBetween(date, maturing.getMaturityDate());
    }

    public Period getPeriodUntilMaturity() {
        return getPeriodUntilMaturity(getCurrentDate());
    }

    public Period getPeriodUntilMaturity(LocalDate date) {
        return new Period(date, maturing.getMaturityDate());
    }

    public Weeks getWeeksUntilMaturity() {
        return getWeeksUntilMaturity(getCurrentDate());
    }

    public Weeks getWeeksUntilMaturity(LocalDate date) {
        return Weeks.weeksBetween(date, maturing.getMaturityDate());
    }

    public Months getMonthsUntilMaturity() {
        return getMonthsUntilMaturity(getCurrentDate());
    }

    public Months getMonthsUntilMaturity(LocalDate date) {
        return Months.monthsBetween(date, maturing.getMaturityDate());
    }

    public Years getYearsUntilMaturity() {
        return getYearsUntilMaturity(getCurrentDate());
    }

    public Years getYearsUntilMaturity(LocalDate date) {
        return Years.yearsBetween(date, maturing.getMaturityDate());
    }

}
