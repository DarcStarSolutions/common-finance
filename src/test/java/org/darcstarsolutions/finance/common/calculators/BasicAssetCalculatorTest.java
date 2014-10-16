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
    private RealAsset asset2;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() throws Exception {
        factory = RealAssetFactory.getInstance();
        calculator = (BasicAssetCalculator<RealAsset>)BasicAssetCalculator.getInstance(factory);
        asset1 = factory.createNewAsset("Test1", ISIN.DUMMY);
        asset1.setPrice(BigDecimal.ONE);
        asset1.setQuantity(BigDecimal.TEN);
        asset2 = factory.createNewAsset("Test1", ISIN.DUMMY);
        asset2.setPrice(BigDecimal.ONE);
        asset2.setQuantity(BigDecimal.ONE);

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
        assertNotNull(asset1);
        assertNotNull(asset2);
        assertThat(asset1.getValue(), equalTo(BigDecimal.TEN));
        assertThat(asset2.getValue(), equalTo(BigDecimal.ONE));
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
        assertThat(testRealAsset.getValue().longValue(), equalTo((long) -10));
    }


    @Test
    public void testAdding() throws Exception {
        assertNotNull(calculator);
        assertNotNull(asset1);
        RealAsset testRealAsset = calculator.add(asset1, asset2);
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo(asset1.getName()));
        assertThat(testRealAsset.getISIN(), equalTo(asset1.getISIN()));
        assertThat(testRealAsset.getQuantity(), equalTo(BigDecimal.valueOf(11)));
        assertThat(testRealAsset.getValue(), equalTo(BigDecimal.valueOf(11)));
        assertThat(testRealAsset.getPrice(), equalTo(BigDecimal.valueOf(1)));
        assertThat(testRealAsset.getValue().longValue(), equalTo((long) 11));
    }

    @Test
    public void testSubtracting() throws Exception {
        assertNotNull(calculator);
        assertNotNull(asset1);
        RealAsset testRealAsset = calculator.subtract(asset1, asset2);
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo(asset1.getName()));
        assertThat(testRealAsset.getISIN(), equalTo(asset1.getISIN()));
        assertThat(testRealAsset.getQuantity(), equalTo(BigDecimal.valueOf(9)));
        assertThat(testRealAsset.getValue(), equalTo(BigDecimal.valueOf(9)));
        assertThat(testRealAsset.getPrice(), equalTo(BigDecimal.valueOf(1)));
        assertThat(testRealAsset.getValue().longValue(), equalTo((long) 9));
    }

}
