package org.darcstarsolutions.finance.common;

import java.math.BigDecimal;

/**
 * Created by mharris021 on 10/15/14.
 */
public class AbstractInstrument extends AbstractAsset implements Instrument {

    private BigDecimal yield;
    private BigDecimal parValue;
    private BigDecimal faceValue;
    private BigDecimal netPresentValue;
    private ParType parType;

    protected AbstractInstrument(String name, ISIN isin) {
        this(name, isin, AssetType.NA);
    }

    protected AbstractInstrument(String name, ISIN isin, AssetType assetType) {
        super(name, isin, assetType);
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

    @Override
    public BigDecimal getNetPresentValue() {
        return netPresentValue;
    }

    @Override
    public void setNetPresentValue(BigDecimal netPresentValue) {
        this.netPresentValue = netPresentValue;
    }

    @Override
    public ParType getParType() {
        return parType;
    }

    @Override
    public void setParType(ParType parType) {
        this.parType = parType;
    }
}
