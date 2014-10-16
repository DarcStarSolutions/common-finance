package org.darcstarsolutions.finance.common.assets;

import org.darcstarsolutions.finance.common.AbstractAsset;
import org.darcstarsolutions.finance.common.AssetType;
import org.darcstarsolutions.finance.common.ISIN;

/**
 * Created by tetn on 10/15/14.
 */
public class RealAsset extends AbstractAsset {

    public RealAsset(String name, ISIN isin) {
        this(name, isin, AssetType.REAL);
    }

    public RealAsset(String name, ISIN isin, AssetType assetType){
        super(name, isin, assetType);
    }
}
