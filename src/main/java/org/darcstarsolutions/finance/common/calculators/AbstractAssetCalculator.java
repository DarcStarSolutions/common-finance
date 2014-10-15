package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Asset;
import org.darcstarsolutions.finance.common.AssetCalculator;
import org.darcstarsolutions.finance.common.AssetFactory;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/15/14.
 */
public abstract class  AbstractAssetCalculator<T extends Asset> implements AssetCalculator<T> {

    private AssetFactory<T> assetFactory;

    protected AbstractAssetCalculator(AssetFactory<T> assetFactory) {
        setAssetFactory(assetFactory);
    }

    @Override
    public AssetFactory<T> getAssetFactory() {
        return assetFactory;
    }

    @Override
    public void setAssetFactory(AssetFactory<T> assetFactory) {
        this.assetFactory = assetFactory;
    }

    @Override
    public T add(T asset1, T asset2) {
        T newAsset = null;
        if(asset1.sameAsset(asset2)){
            newAsset = getAssetFactory().createDefaultAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().add(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().add(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public  T subtract(T asset1, T asset2) {
        T newAsset = null;
        if(asset1.sameAsset(asset2)){
            newAsset = getAssetFactory().createDefaultAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().subtract(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().subtract(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public T negate(T asset) {
        T newAsset = null;
        newAsset = getAssetFactory().createDefaultAsset(asset);
        newAsset.setQuantity(asset.getQuantity().negate());
        return newAsset;
    }
}
