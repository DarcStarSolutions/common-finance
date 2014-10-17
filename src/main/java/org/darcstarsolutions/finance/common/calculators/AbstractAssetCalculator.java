package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.*;

/**
 * Created by tetn on 10/15/14.
 */
public abstract class AbstractAssetCalculator<T extends Asset, U extends T> implements AssetCalculator<T, U> {

    private AssetFactory<U> assetFactory;

    private CompoundingType compoundingType;

    private CompoundingPeriod compoundingPeriod;

    protected AbstractAssetCalculator(AssetFactory<U> assetFactory) {
        this(assetFactory, CompoundingType.SIMPLE, CompoundingPeriod.ANNUAL);
    }

    protected AbstractAssetCalculator(AssetFactory<U> assetFactory, CompoundingType compoundingType, CompoundingPeriod compoundingPeriod) {
        setAssetFactory(assetFactory);
        setCompoundingPeriod(compoundingPeriod);
        setCompoundingType(compoundingType);
    }


    @Override
    public AssetFactory<U> getAssetFactory() {
        return assetFactory;
    }

    @Override
    public void setAssetFactory(AssetFactory<U> assetFactory) {
        this.assetFactory = assetFactory;
    }

    public CompoundingType getCompoundingType() {
        return compoundingType;
    }

    public void setCompoundingType(CompoundingType compoundingType) {
        this.compoundingType = compoundingType;
    }

    @Override
    public CompoundingPeriod getCompoundingPeriod() {
        return compoundingPeriod;
    }

    @Override
    public void setCompoundingPeriod(CompoundingPeriod compoundingPeriod) {
        this.compoundingPeriod = compoundingPeriod;
    }

}
