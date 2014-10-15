package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/15/14.
 */
public interface AssetCalculator<T extends Asset> {

    public <U extends T> U add(U asset1, U asset2);

    public <U extends T> U subtract(U asset1, U asset2);

    public <U extends T> U negate(U asset);


}
