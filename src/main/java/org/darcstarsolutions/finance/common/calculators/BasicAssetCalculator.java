package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Asset;
import org.darcstarsolutions.finance.common.AssetFactory;
import org.darcstarsolutions.finance.common.CompoundingType;

/**
 * Created by tetn on 10/15/14.
 */
public class BasicAssetCalculator<U extends Asset> extends AbstractAssetCalculator<Asset, U> {

    private static BasicAssetCalculator INSTANCE;

    public static BasicAssetCalculator getInstance(AssetFactory<? extends Asset> assetFactory){
        if(INSTANCE == null){
            INSTANCE = new BasicAssetCalculator(assetFactory);
        }
        return INSTANCE;
    }

    protected BasicAssetCalculator(AssetFactory<U> assetFactory) {
        super(assetFactory);
        setCompoundingType(CompoundingType.SIMPLE);
    }
}
