package org.darcstarsolutions.finance.common;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/**
 * Created by tetn on 10/16/14.
 */
public interface Temporal {
    LocalDate getIssueDate();

    void setIssueDate(LocalDate issueDate);

    LocalDate getCurrentDate();

    LocalDate getCurrentDate(DateTimeZone dateTimeZone);
}
