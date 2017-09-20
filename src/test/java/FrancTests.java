import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class FrancTests extends CurrencyTest {

    public FrancTests() {
        super(FRANC);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 2.02, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 2.02, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 2.02, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 2.02, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 2.02, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 2.02, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 2.02, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 2.02, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 2.02, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 2.02, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 2.02, 231.68);
    }
}
