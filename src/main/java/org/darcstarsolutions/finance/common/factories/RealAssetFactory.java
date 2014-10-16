package org.darcstarsolutions.finance.common.factories;

import org.darcstarsolutions.finance.common.AssetFactory;
import org.darcstarsolutions.finance.common.AssetType;
import org.darcstarsolutions.finance.common.ISIN;
import org.darcstarsolutions.finance.common.assets.RealAsset;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tetn on 10/15/14.
 */
public class RealAssetFactory implements AssetFactory<RealAsset>{

    private static RealAssetFactory INSTANCE;

    protected RealAssetFactory(){

    }

    public static RealAssetFactory getInstance(){
        if(INSTANCE==null){
            INSTANCE = new RealAssetFactory();
        }
        return INSTANCE;
    }

    @Override
    public RealAsset createDefaultAsset() {
        return createNewAsset("DEFAULT", ISIN.DUMMY);
    }

    public RealAsset createNewAsset(String name, ISIN isin){
        RealAsset realAsset = new RealAsset(name, isin);
        realAsset.setId(BigInteger.ZERO);
        realAsset.setDescription("");
        realAsset.setPrice(BigDecimal.ZERO);
        realAsset.setQuantity(BigDecimal.ZERO);
        return realAsset;
    }

    @Override
    public RealAsset getAsset(RealAsset asset) {
        RealAsset realAsset = new RealAsset(asset.getName(), asset.getISIN());
        realAsset.setDescription(asset.getDescription());
        realAsset.setId(BigInteger.ZERO);
        realAsset.setPrice(BigDecimal.ZERO);
        realAsset.setQuantity(BigDecimal.ZERO);
        return realAsset;
    }

    @Override
    public RealAsset copyAsset(RealAsset asset) {
        RealAsset realAsset = new RealAsset(asset.getName(), asset.getISIN());
        realAsset.setDescription(asset.getDescription());
        realAsset.setQuantity(asset.getQuantity());
        realAsset.setPrice(asset.getPrice());
        realAsset.setMarketValue(asset.getMarketValue());
        realAsset.setId(BigInteger.ZERO);
        return realAsset;
    }
}
