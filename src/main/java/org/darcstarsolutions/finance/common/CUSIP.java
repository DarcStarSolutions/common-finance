package org.darcstarsolutions.finance.common;

import java.io.Serializable;

/**
 * Created by tetn on 10/15/14.
 */
public class CUSIP implements Serializable{



    private String value;

    public CUSIP(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CUSIP)) return false;

        CUSIP cusip = (CUSIP) o;

        if (!value.equals(cusip.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
