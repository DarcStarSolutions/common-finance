package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public abstract class AbstractInstrumentCalculator<T extends Instrument, U extends T> extends AbstractAssetCalculator<T, U> implements InstrumentCalculator<T, U> {

    protected AbstractInstrumentCalculator(AssetFactory<U> assetFactory) {
        this(assetFactory, CompoundingType.SIMPLE, CompoundingPeriod.ANNUAL);
    }

    protected AbstractInstrumentCalculator(AssetFactory<U> assetFactory, CompoundingType compoundingType, CompoundingPeriod compoundingPeriod) {
        super(assetFactory, compoundingType, compoundingPeriod);
    }


    @Override
    public U determineParType(U instrument) {
        U newInstrument = getAssetFactory().copyAsset(instrument);
        BigDecimal parValue = newInstrument.getParValue();
        BigDecimal marketValue = newInstrument.getMarketValue();
        ParType parType = determineParType(parValue, marketValue);
        newInstrument.setParType(parType);
        return newInstrument;
    }

    protected ParType determineParType(BigDecimal parValue, BigDecimal marketValue) {
        ParType parType = ParType.NONE;
        if (!(parValue.equals(Instrument.NO_PAR_VALUE))&&(!marketValue.equals(Instrument.NO_FACE_VALUE))){
            int comparison = parValue.compareTo(marketValue);
            if(comparison==0){
                parType = ParType.AT;
            }else if(comparison < 0){
                parType = ParType.BELOW;
            }
            else {
                parType = ParType.ABOVE;
            }
        } return parType;
    }

    @Override
    public U calculateYield(U instrument) {
        U newInstrument = getAssetFactory().copyAsset(instrument);
        BigDecimal faceValue = newInstrument.getFaceValue();
        BigDecimal marketValue = newInstrument.getMarketValue();
        BigDecimal priceDifference = faceValue.subtract(marketValue);
        BigDecimal yield = priceDifference.divide(faceValue);
        newInstrument.setYield(yield);
        return newInstrument;
    }

    @Override
    public U calculateParValue(U instrument) {
        U newInstrument = getAssetFactory().copyAsset(instrument);
        BigDecimal parValue = calculateInstrumentSpecificParValue(instrument);
        newInstrument.setParValue(parValue);
        return newInstrument;
    }

    protected abstract BigDecimal calculateInstrumentSpecificParValue(U instrument);

    @Override
    public U calculateNetPresentValue(U instrument) {
        U newInstrument = getAssetFactory().copyAsset(instrument);
        BigDecimal faceValue = newInstrument.getFaceValue();
        BigDecimal marketValue = newInstrument.getMarketValue();
        BigDecimal priceDifference = faceValue.subtract(marketValue);
        BigDecimal yield = priceDifference.divide(faceValue);
        newInstrument.setYield(yield);
        return newInstrument;
    }

    protected abstract BigDecimal calculateInstrumentSpecificNetPresentValue(U instrument);


    @Override
    public U calculateParValueAndDetermineParType(U instrument) {
        U newInstrument = calculateParValue(instrument);
        BigDecimal parValue = newInstrument.getParValue();
        BigDecimal marketValue = newInstrument.getMarketValue();
        ParType parType = determineParType(parValue, marketValue);
        newInstrument.setParType(parType);
        return newInstrument;
    }

}
