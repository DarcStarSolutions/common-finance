package org.darcstarsolutions.finance.common.instruments;

import org.darcstarsolutions.finance.common.AbstractInstrument;
import org.darcstarsolutions.finance.common.ISIN;
import org.darcstarsolutions.finance.common.Maturing;
import org.darcstarsolutions.finance.common.StandardMaturing;
import org.joda.time.LocalDate;

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
        setMaturing(new StandardMaturing(issueDate, maturityDate));
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

}
