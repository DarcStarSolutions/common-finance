package org.darcstarsolutions.finance.common;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public interface Instrument extends Asset {

    public static final BigDecimal NO_PAR_VALUE = BigDecimal.ZERO;
    public static final BigDecimal NO_FACE_VALUE = BigDecimal.ZERO;

    public BigDecimal getYield();

    public void setYield(BigDecimal yield);

    public BigDecimal getParValue();

    public void setParValue(BigDecimal parValue);

    public BigDecimal getFaceValue();

    public void setFaceValue(BigDecimal faceValue);

    ParType getParType();

    void setParType(ParType parType);
}
