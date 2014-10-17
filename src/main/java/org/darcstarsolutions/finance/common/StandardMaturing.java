package org.darcstarsolutions.finance.common;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public class StandardMaturing extends StandardTemporal implements Maturing {

    private LocalDate maturityDate;
    private BigDecimal yieldAtMaturity;

    public StandardMaturing(LocalDate issueDate, LocalDate maturityDate) {
        super(issueDate);
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
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    @Override
    public void setMaturityDate(LocalDate maturityDate){
        this.maturityDate = maturityDate;
    }

}
