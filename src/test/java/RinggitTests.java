import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class RinggitTests extends CurrencyTest {

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 8.94, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 8.94, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 8.94, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 8.94, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 8.94, 2.02);
    }

    @Test
    public void toPound() {
        engineTest("pound", 8.94, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest("ringgit", 8.94, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 8.94, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 8.94, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 8.94, 2.86);
    }

    @Test
    public void toYen() {
        engineTest("yen", 8.94, 231.68);
    }

    public void engineTest(String toRate, double amount, double expectedValue) {
        double toAmount = super.engine.run(amount, "ringgit", toRate);
        assertEquals(expectedValue, toAmount, 0);
    }
}
