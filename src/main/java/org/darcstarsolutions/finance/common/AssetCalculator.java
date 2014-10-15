package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/15/14.
 */
public interface AssetCalculator<T extends Asset> {

    public AssetFactory<T> getAssetFactory();

    public void setAssetFactory(AssetFactory<T> assetFactory);

    public  T add(T asset1, T asset2);

    public  T subtract(T asset1, T asset2);

    public T negate(T asset);


}
