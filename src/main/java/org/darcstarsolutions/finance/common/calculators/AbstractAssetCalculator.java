package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Asset;
import org.darcstarsolutions.finance.common.AssetCalculator;
import org.darcstarsolutions.finance.common.AssetFactory;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tetn on 10/15/14.
 */
public abstract class  AbstractAssetCalculator<T extends Asset, U extends T> implements AssetCalculator<T, U> {

    private AssetFactory<U> assetFactory;

    protected AbstractAssetCalculator(AssetFactory<U> assetFactory) {
        setAssetFactory(assetFactory);
    }

    @Override
    public AssetFactory<U> getAssetFactory() {
        return assetFactory;
    }

    @Override
    public void setAssetFactory(AssetFactory<U> assetFactory) {
        this.assetFactory = assetFactory;
    }

    @Override
    public U add(U asset1, U asset2) {
        U newAsset = null;
        if(asset1.sameAsset(asset2)){
            newAsset = getAssetFactory().getAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().add(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().add(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public  U subtract(U asset1, U asset2) {
        U newAsset = null;
        if(asset1.sameAsset(asset2)){
            newAsset = getAssetFactory().getAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().subtract(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().subtract(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public U negate(U asset) {
        U newAsset = null;
        newAsset = getAssetFactory().copyAsset(asset);
        newAsset.setId(BigInteger.ZERO);
        newAsset.setQuantity(asset.getQuantity().negate());
        newAsset.setPrice(asset.getPrice());
        return newAsset;
    }
}