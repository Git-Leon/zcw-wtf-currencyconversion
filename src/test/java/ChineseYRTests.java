import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class ChineseYRTests extends CurrencyTest {
    public ChineseYRTests() {
        super(CHINESE_YR);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 13.84, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 13.84, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 13.84, 2.02);
    }
    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 13.84, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 13.84, 136.64);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 13.84, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 13.84, 231.68);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 13.84, 2);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 13.84, 1.64);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 13.84, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 13.84, 2.64);
    }
}
