package org.darcstarsolutions.finance.common.factories;

import org.darcstarsolutions.finance.common.ISIN;
import org.darcstarsolutions.finance.common.assets.RealAsset;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by tetn on 10/15/14.
 */
public class RealAssetFactoryTest {

    private RealAssetFactory factory;
    private RealAsset asset1;
    private RealAsset asset2;

    @Before
    public void setUp() throws Exception {
        factory = RealAssetFactory.getInstance();
        asset1 = factory.createNewAsset("One", new ISIN("111111111111"));
        asset1.setDescription("Description");
        asset2 = factory.createNewAsset("Two", new ISIN("222222222222"));
        asset2.setDescription("Description2");
        asset2.setId(BigInteger.TEN);
        asset2.setPrice(BigDecimal.TEN);
        asset2.setQuantity(BigDecimal.TEN);
    }

    @After
    public void tearDown() throws Exception {
        factory = null;
        asset1 = null;
        asset2 = null;
    }

    @Test
    public void testExistence() throws Exception {
        assertNotNull(factory);
    }

    @Test
    public void testCreateDefaultAsset() throws Exception {
        RealAsset testRealAsset = factory.createDefaultAsset();
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo("DEFAULT"));
        assertThat(testRealAsset.getISIN(), equalTo(ISIN.DUMMY));
        assertThat(testRealAsset.getDescription(), equalTo(""));
        assertThat(testRealAsset.getId(), equalTo(BigInteger.ZERO));
        assertThat(testRealAsset.getPrice(), equalTo(BigDecimal.ZERO));
        assertThat(testRealAsset.getQuantity(), equalTo(BigDecimal.ZERO));
        assertThat(testRealAsset.getValue(), equalTo(BigDecimal.ZERO));
    }

    @Test
    public void testGetAsset() throws Exception {
        RealAsset testRealAsset = factory.getAsset(asset1);
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo(asset1.getName()));
        assertThat(testRealAsset.getISIN(), equalTo(asset1.getISIN()));
        assertThat(testRealAsset.getDescription(), equalTo(asset1.getDescription()));
        assertThat(testRealAsset.getId(), equalTo(BigInteger.ZERO));
        assertThat(testRealAsset.getPrice(), equalTo(BigDecimal.ZERO));
        assertThat(testRealAsset.getQuantity(), equalTo(BigDecimal.ZERO));
        assertThat(testRealAsset.getValue(), equalTo(BigDecimal.ZERO));
    }

    @Test
    public void testCopyAsset() throws Exception {
        RealAsset testRealAsset = factory.copyAsset(asset2);
        assertNotNull(testRealAsset);
        assertThat(testRealAsset.getName(), equalTo(asset2.getName()));
        assertThat(testRealAsset.getISIN(), equalTo(asset2.getISIN()));
        assertThat(testRealAsset.getDescription(), equalTo(asset2.getDescription()));
        assertThat(testRealAsset.getId(), equalTo(BigInteger.ZERO));
        assertThat(testRealAsset.getPrice(), equalTo(asset2.getPrice()));
        assertThat(testRealAsset.getQuantity(), equalTo(asset2.getQuantity()));
        assertThat(testRealAsset.getValue(), equalTo(asset2.getValue()));
    }
}
