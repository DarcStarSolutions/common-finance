package org.darcstarsolutions.finance.common;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tetn on 10/15/14.
 */
public abstract class AbstractAsset implements Asset{

    private String name;
    private BigInteger id;
    private String description;
    private ISIN isin;
    private BigDecimal price;
    private BigDecimal quantity;
    private BigDecimal value;

    protected AbstractAsset(String name, ISIN isin) {
        this.isin = isin;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public ISIN getISIN() {
        return isin;
    }

    public void setISIN(ISIN isin) {
        this.isin = isin;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public BigDecimal getValue() {
        setValue(getPrice().multiply(getQuantity()));
        return value;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean sameAsset(Asset asset) {
        Class<?> clazz = getClass();
        return asset.getClass().equals(clazz) && getISIN().equals(asset.getISIN());
    }

    @Override
    public int compareTo(Asset o) {
        return getValue().compareTo(o.getValue());
    }
}
