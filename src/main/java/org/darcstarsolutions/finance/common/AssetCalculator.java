package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/15/14.
 */
public interface AssetCalculator<T extends Asset, U extends T> {

    public AssetFactory<U> getAssetFactory();

    public void setAssetFactory(AssetFactory<U> assetFactory);

    public CompoundingType getCompoundingType();

    public void setCompoundingType(CompoundingType compoundingType);

    public U add(U asset1, U asset2);

    public  U subtract(U asset1, U asset2);

    public U negate(U asset);


}
