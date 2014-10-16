package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.*;

import java.math.BigDecimal;

/**
 * Created by tetn on 10/16/14.
 */
public class AbstractInstrumentCalculator<T extends Instrument, U extends T> extends AbstractAssetCalculator<T, U> implements InstrumentCalculator<T, U> {

    protected AbstractInstrumentCalculator(AssetFactory<U> assetFactory) {
        super(assetFactory);
    }

    @Override
    public U determineParType(U instrument) {
        U newInstrument = getAssetFactory().copyAsset(instrument);
        BigDecimal parValue = newInstrument.getParValue();
        BigDecimal marketValue = newInstrument.getMarketValue();
        if ((parValue!= Instrument.NO_PAR_VALUE)&&(marketValue!=Instrument.NO_FACE_VALUE)){
            int comparison = parValue.compareTo(marketValue);
            if(comparison==0){
                newInstrument.setParType(ParType.AT);
            }else if(comparison < 0){
                newInstrument.setParType(ParType.BELOW);
            }
            else {
                newInstrument.setParType(ParType.ABOVE);
            }
        }
        else {
            newInstrument.setParType(ParType.NONE);
        }
        return newInstrument;
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
        return null;
    }

    @Override
    public U calculateNetPresentValue(U instrument) {
        return null;
    }

    @Override
    public U calculateParValueAndDetermineParType(U instrument) {
        return null;
    }

    @Override
    public U add(U asset1, U asset2) {

        return null;
    }

    @Override
    public U subtract(U asset1, U asset2) {
        return null;
    }

    @Override
    public U negate(U asset) {
        return null;
    }
}
