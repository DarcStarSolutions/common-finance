package org.darcstarsolutions.finance.common.assets;

import org.darcstarsolutions.finance.common.AbstractAsset;
import org.darcstarsolutions.finance.common.ISIN;

/**
 * Created by tetn on 10/15/14.
 */
public class RealAsset extends AbstractAsset {

    public RealAsset(String name, ISIN isin) {
        super(name, isin);
    }
}
