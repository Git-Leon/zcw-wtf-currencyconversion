import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class RinggitTests extends CurrencyTest {

    public RinggitTests() {
        super(RINGGIT);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 8.94, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 8.94, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 8.94, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 8.94, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 8.94, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 8.94, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 8.94, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 8.94, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 8.94, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 8.94, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 8.94, 231.68);
    }
}
