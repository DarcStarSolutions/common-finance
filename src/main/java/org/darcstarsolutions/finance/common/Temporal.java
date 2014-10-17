package org.darcstarsolutions.finance.common;

import org.joda.time.LocalDate;

/**
 * Created by tetn on 10/16/14.
 */
public interface Temporal {

    public LocalDate getIssueDate();

    public void setIssueDate(LocalDate issueDate);

}
