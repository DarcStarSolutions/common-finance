package org.darcstarsolutions.finance.common.calculators

import org.darcstarsolutions.finance.common.factories.BondCalculatorFactory
import spock.lang.Specification

/**
 * Created by mharris021 on 10/29/14.
 */
class BondCalculatorSpec extends Specification {

    BondCalculator bondCalculator;
    BondCalculatorFactory bondCalculatorFactory;

    def setup() {
        bondCalculatorFactory = new BondCalculatorFactory();
        bondCalculator = BondCalculator.getInstance();
    }

    def "Calculate Coupon Payment based on Coupon Rate and Payment Periods"() {


    }
}
