import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class FrancTests extends CurrencyTest {

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 2.02, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 2.02, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 2.02, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 2.02, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 2.02, 2.02);
    }

    @Test
    public void toPound() {
        engineTest("pound", 2.02, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest("ringgit", 2.02, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 2.02, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 2.02, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 2.02, 2.86);
    }

    @Test
    public void toYen() {
        engineTest("yen", 2.02, 231.68);
    }

    public void engineTest(String toRate, double amount, double expectedValue) {
        double toAmount = super.engine.run(amount, "franc", toRate);
        assertEquals(expectedValue, toAmount, 0);
    }
}
