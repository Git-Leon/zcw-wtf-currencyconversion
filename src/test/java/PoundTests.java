import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class PoundTests extends CurrencyTest {
    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 1.64, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 1.64, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 1.64, 2.02);
    }
    @Test
    public void toRinggit() {
        engineTest("ringgit", 1.64, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 1.64, 136.64);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 1.64, 2.86);
    }





    @Test
    public void toYen() {
        engineTest("yen", 1.64, 231.68);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 1.64, 2);
    }

    @Test
    public void toPound() {
        engineTest("pound", 1.64, 1.64);
    }

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 1.64, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 1.64, 2.64);
    }

    public void engineTest(String toType, double fromAmount, double expectedValue) {
        double toAmount = engine.run(fromAmount, "pound", toType);
        assertEquals(toAmount, expectedValue, 0);
    }
}
