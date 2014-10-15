package org.darcstarsolutions.finance.common;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public interface Instrument extends Asset {

    public static final BigDecimal NO_PAR_VALUE = BigDecimal.ZERO;
    public static final BigDecimal NO_FACE_VALUE = BigDecimal.ZERO;

    BigDecimal getYield();

    void setYield(BigDecimal yield);

    BigDecimal getParValue();

    void setParValue(BigDecimal parValue);

    BigDecimal getFaceValue();

    void setFaceValue(BigDecimal faceValue);
}
