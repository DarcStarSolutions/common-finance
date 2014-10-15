package org.darcstarsolutions.finance.common;

/**
 * Created by mharris021 on 10/15/14.
 */
public interface AssetFactory<T extends Asset> {
    T createDefaultAsset();

    T getAsset(T asset);

    T copyAsset(T asset);
}
