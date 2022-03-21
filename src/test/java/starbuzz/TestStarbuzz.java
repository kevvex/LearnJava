package starbuzz;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Test Starbuzz")
class TestStarbuzz {

    private static final String LINE = "----------------------------------------------";
    private final static Logger LOGGER = LoggerFactory.getLogger(TestStarbuzz.class);

    @Test
    @DisplayName("Make Espresso")
    void makeEspresso() {
        Beverage espresso = new Espresso();
        LOGGER.debug(espresso.getDescription() + " $" + espresso.cost());
        Assertions.assertEquals("Espresso $1.99", espresso.getDescription() + " $" + espresso.cost());
    }

    @Test
    @DisplayName("Make Dark Roast with 2x Mocha, 1x Whip")
    void makeDarkRoastWithMochaMochaWhip() {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        assertBeverage(darkRoast, "Dark Roast, Mocha, Mocha, Whip $1.49");
    }

    @Test
    @DisplayName("Make House Blend with 1x Soy, 1x Mocha, 1x Whip")
    void makeHouseBlendWithSoyMochaWhip() {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        assertBeverage(houseBlend, "House Blend Coffee, Soy, Mocha, Whip $1.34");
    }

    private void assertBeverage(Beverage beverage, String expected) {
        LOGGER.debug(beverage.getDescription() + " $" + beverage.cost());
        Assertions.assertEquals(expected, beverage.getDescription() + " $" + beverage.cost());
    }
}
