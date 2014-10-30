package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.AssetFactory;
import org.darcstarsolutions.finance.common.CompoundingPeriod;
import org.darcstarsolutions.finance.common.CompoundingType;
import org.darcstarsolutions.finance.common.instruments.Bond;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/27/14.
 */
public class BondCalculator<U extends Bond> extends AbstractInstrumentCalculator<Bond, U> {


    protected BondCalculator(AssetFactory<U> assetFactory) {
        this(assetFactory, CompoundingType.SIMPLE, CompoundingPeriod.ANNUAL);
    }

    protected BondCalculator(AssetFactory<U> assetFactory, CompoundingType compoundingType, CompoundingPeriod compoundingPeriod) {
        super(assetFactory, compoundingType, compoundingPeriod);
    }

    @Override
    protected BigDecimal calculateInstrumentSpecificParValue(U instrument) {
        return null;
    }

    @Override
    protected BigDecimal calculateInstrumentSpecificNetPresentValue(U instrument) {
        return null;
    }

    public U calculateDuration(U bond) {
        U newResult = getAssetFactory().copyAsset(bond);
        return newResult;
    }

    public U calculateMacaulyDuration(U bond) {
        U newResult = getAssetFactory().copyAsset(bond);
        return newResult;
    }
}
