package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/16/14.
 */
public interface InstrumentCalculator<T extends Instrument, U extends T> extends AssetCalculator<T, U> {

    U determineParType(U instrument);

    U calculateYield(U instrument);

    U calculateParValue(U instrument);

    U calculateNetPresentValue(U instrument);

    U calculateParValueAndDetermineParType(U instrument);
}
