package org.darcstarsolutions.finance.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tetn on 10/15/14.
 */
public interface Asset extends Serializable, Comparable<Asset>{

    public String getName();

    public BigInteger getId();

    public String getDescription();

    public ISIN getISIN();

    public BigDecimal getPrice();

    public BigDecimal getQuantity();

    public BigDecimal getValue();

    public boolean sameAsset(Asset asset);

}
