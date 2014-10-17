package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Asset;

/**
 * Created by mharris021 on 10/16/14.
 */
public interface ArithmeticCalculator<T extends Asset, U extends T> {
    U add(U asset1, U asset2);

    U subtract(U asset1, U asset2);

    U negate(U asset);
}
