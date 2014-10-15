package org.darcstarsolutions.finance.common;

import java.math.BigDecimal;

/**
 * Created by mharris021 on 10/15/14.
 */
public class AbstractInstrument extends AbstractAsset implements Instrument {

    private BigDecimal yield;
    private BigDecimal parValue;
    private BigDecimal faceValue;

    protected AbstractInstrument(String name, ISIN isin) {
        super(name, isin);
    }

    @Override
    public BigDecimal getYield() {
        return yield;
    }

    @Override
    public void setYield(BigDecimal yield) {
        this.yield = yield;
    }

    @Override
    public BigDecimal getParValue() {
        return parValue;
    }

    @Override
    public void setParValue(BigDecimal parValue) {
        this.parValue = parValue;
    }

    @Override
    public BigDecimal getFaceValue() {
        return faceValue;
    }

    @Override
    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }
}
