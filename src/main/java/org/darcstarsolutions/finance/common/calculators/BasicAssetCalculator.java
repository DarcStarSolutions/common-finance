package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.Asset;
import org.darcstarsolutions.finance.common.AssetFactory;
import org.darcstarsolutions.finance.common.CompoundingPeriod;
import org.darcstarsolutions.finance.common.CompoundingType;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by tetn on 10/15/14.
 */
public class BasicAssetCalculator<U extends Asset> extends AbstractAssetCalculator<Asset, U> implements ArithmeticCalculator<Asset, U> {

    private static BasicAssetCalculator INSTANCE;

    protected BasicAssetCalculator(AssetFactory<U> assetFactory) {
        this(assetFactory, CompoundingType.SIMPLE, CompoundingPeriod.ANNUAL);

    }

    protected BasicAssetCalculator(AssetFactory<U> assetFactory, CompoundingType compoundingType, CompoundingPeriod compoundingPeriod) {
        super(assetFactory, compoundingType, compoundingPeriod);
    }

    @SuppressWarnings("unchecked")
    public static BasicAssetCalculator getInstance(AssetFactory<? extends Asset> assetFactory) {
        if (INSTANCE == null) {
            INSTANCE = new BasicAssetCalculator(assetFactory);
        }
        return INSTANCE;
    }

    @Override
    public U add(U asset1, U asset2) {
        U newAsset = null;
        if (asset1.sameAsset(asset2)) {
            newAsset = getAssetFactory().copyAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().add(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().add(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public U subtract(U asset1, U asset2) {
        U newAsset = null;
        if (asset1.sameAsset(asset2)) {
            newAsset = getAssetFactory().copyAsset(asset1);
            newAsset.setQuantity(asset1.getQuantity().subtract(asset2.getQuantity()));
            BigDecimal value = asset1.getValue().subtract(asset2.getValue());
            newAsset.setPrice(value.divide(newAsset.getQuantity()));
        }
        return newAsset;
    }

    @Override
    public U negate(U asset) {
        U newAsset = getAssetFactory().copyAsset(asset);
        newAsset.setId(BigInteger.ZERO);
        newAsset.setQuantity(asset.getQuantity().negate());
        newAsset.setPrice(asset.getPrice());
        return newAsset;
    }
}
