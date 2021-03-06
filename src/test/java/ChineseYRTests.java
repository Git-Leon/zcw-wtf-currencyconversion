import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by latashawatson on 1/16/17.
 */
public class ChineseYRTests extends CurrencyTest {
    @Test
    public void toChineseYR() {
        engineTest("chineseyr", 13.84, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest("euro", 13.84, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest("franc", 13.84, 2.02);
    }
    @Test
    public void toRinggit() {
        engineTest("ringgit", 13.84, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest("rupee", 13.84, 136.64);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest("singapore", 13.84, 2.86);
    }




    @Test
    public void toYen() {
        engineTest("yen", 13.84, 231.68);
    }

    @Test
    public void toUSDollar() {
        engineTest("us", 13.84, 2);
    }

    @Test
    public void toPound() {
        engineTest("pound", 13.84, 1.64);
    }

    @Test
    public void toAustralianDollar() {
        engineTest("australian", 13.84, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest("canadian", 13.84, 2.64);
    }

    @Override
    public void engineTest(String toType, double fromAmount, double expectedValue) {
        double toAmount = super.engine.run(fromAmount, "chineseyr", toType);
        assertEquals(toAmount, expectedValue, 0);
    }
}
