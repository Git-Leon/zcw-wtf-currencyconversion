import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class AustralianTests extends CurrencyTest {

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 2.7, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 2.7, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 2.7, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 2.7, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 2.7, 2.02);
    }

    @Test
    public void toPound() {
        engineTest("pound", 2.7, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest("ringgit", 2.7, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 2.7, 136.64);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 2.7, 2.86);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 2.7, 2);
    }

    @Test
    public void toYen() {
        engineTest("yen", 2.7, 231.68);
    }

    public void engineTest(String toType, double fromAmount, double expectedValue) {
        double toAmount = engine.run(fromAmount, "australian", toType);
        assertEquals(toAmount, expectedValue, 0);
    }
}
