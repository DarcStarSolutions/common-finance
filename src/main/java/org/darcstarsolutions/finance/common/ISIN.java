package org.darcstarsolutions.finance.common;

import java.io.Serializable;

/**
 * Created by tetn on 10/15/14.
 */
public class ISIN implements Serializable{

    public static final ISIN DUMMY = new ISIN("000000000000");


    private final String value;

    public ISIN(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ISIN)) return false;

        ISIN isin = (ISIN) o;

        return value.equals(isin.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
