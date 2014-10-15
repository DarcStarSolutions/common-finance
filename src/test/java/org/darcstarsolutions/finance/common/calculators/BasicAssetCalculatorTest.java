package org.darcstarsolutions.finance.common.calculators;

import org.darcstarsolutions.finance.common.ISIN;
import org.darcstarsolutions.finance.common.assets.RealAsset;
import org.darcstarsolutions.finance.common.factories.RealAssetFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by tetn on 10/15/14.
 */
public class BasicAssetCalculatorTest {

    private BasicAssetCalculator<RealAsset> calculator;
    private RealAssetFactory factory;
    private RealAsset asset1;

    @Before
    public void setUp() throws Exception {
        factory = RealAssetFactory.getInstance();
        calculator = BasicAssetCalculator.getInstance(factory);
        asset1 = factory.createNewAsset("Test", ISIN.DUMMY);
        asset1.setPrice(BigDecimal.TEN);
        asset1.setQuantity(BigDecimal.ONE);
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
        factory = null;
        asset1 = null;

    }

    @Test
    public void testExistence() throws Exception {
        assertNotNull(calculator);

    }

    @Test
    public void testNegation() throws Exception {
        assertNotNull(calculator);
        assertNotNull(asset1);
        RealAsset testRealAsset = calculator.negate(asset1);
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo(asset1.getName()));
        assertThat(testRealAsset.getISIN(), equalTo(asset1.getISIN()));
        assertThat(testRealAsset.getPrice(), equalTo(asset1.getPrice()));
        assertThat(testRealAsset.getQuantity(), equalTo(asset1.getQuantity().negate()));
        assertThat(testRealAsset.getValue(), equalTo(asset1.getValue().negate()));
        assertThat(testRealAsset.getValue().longValue(), equalTo(Long.valueOf(-10)));
    }


}
