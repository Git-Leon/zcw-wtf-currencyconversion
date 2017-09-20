import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class SingaporeTests extends CurrencyTest {
    public SingaporeTests() {
        super(SINGAPORE);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 2.86, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 2.86, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 2.86, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 2.86, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 2.86, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 2.86, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 2.86, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 2.86, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 2.86, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 2.86, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 2.86, 231.68);
    }
}