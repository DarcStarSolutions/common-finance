package org.darcstarsolutions.finance.common.instruments;

import org.darcstarsolutions.finance.common.ISIN;
import org.darcstarsolutions.finance.common.Instrument;
import org.darcstarsolutions.finance.common.Maturing;
import org.darcstarsolutions.finance.common.PayoutPeriod;
import org.joda.time.LocalDate;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public interface Bond extends MaturingInstrument {

    public BondType getBondType();

    public void setBondType(BondType bondType);

    public PayoutPeriod getPayoutPeriod();

    public void setPayoutPeriod(PayoutPeriod payoutPeriod);

    public BigDecimal getBondDuration();

    public void setBondDuration(BigDecimal bondDuration);

    public BigDecimal getMacaulayDuration();

    public void setMacaulayDuration(BigDecimal macaulayDuration);

    public BigDecimal getInterestRate();

    public void setInterestRate(BigDecimal interestRate);


}
