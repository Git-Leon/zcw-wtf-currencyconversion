import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class YenTests extends CurrencyTest {

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 231.68, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 231.68, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 231.68, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 231.68, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 231.68, 2.02);
    }

    @Test
    public void toPound() {
        engineTest("pound", 231.68, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest("ringgit", 231.68, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 231.68, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 231.68, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 231.68, 2.86);
    }

    @Test
    public void toYen() {
        engineTest("yen", 231.68, 231.68);
    }

    public void engineTest(String toType, double fromAmount, double expectedValue) {
        double toAmount = engine.run(fromAmount, "yen", toType);
        assertEquals(toAmount, expectedValue, 0);
    }
}
