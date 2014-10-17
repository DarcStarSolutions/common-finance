package org.darcstarsolutions.finance.common;

import org.joda.time.LocalDate;

/**
 * Created by tetn on 10/16/14.
 */
public class StandardTemporal implements Temporal {


    private LocalDate issueDate;

    public StandardTemporal(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public LocalDate getIssueDate() {
        return issueDate;
    }

    @Override
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

}
