package org.darcstarsolutions.finance.common;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public interface Maturing extends Temporal {

    public BigDecimal getYieldAtMaturity();

    public void setYieldAtMaturity(BigDecimal yieldAtMaturity);

    public LocalDate getMaturityDate();

    void setMaturityDate(LocalDate maturityDate);


}
