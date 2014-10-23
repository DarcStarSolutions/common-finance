package org.darcstarsolutions.finance.common;

/**
 * Created by tetn on 10/15/14.
 */
public interface AssetFactory<T extends Asset> {
    public T createDefaultAsset();

    public T copyAsset(T asset);

    public T getAsset(T asset1);
}
