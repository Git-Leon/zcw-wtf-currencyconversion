import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class EuroTests extends CurrencyTest {

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 1.88, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 1.88, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 1.88, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 1.88, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 1.88, 2.02);
    }

    @Test
    public void toPound() {
        engineTest("pound", 1.88, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest("ringgit", 1.88, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 1.88, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 1.88, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 1.88, 2.86);
    }

    @Test
    public void toYen() {
        engineTest("yen", 1.88, 231.68);
    }

    public void engineTest(String toRate, double amount, double expectedValue) {
        double toAmount = super.engine.run(amount, "euro", toRate);
        assertEquals(expectedValue, toAmount, 0);
    }
}
