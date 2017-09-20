import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class AustralianTests extends CurrencyTest {

    public AustralianTests() {
        super(AUSTRALIAN);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 2.7, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 2.7, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 2.7, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 2.7, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 2.7, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 2.7, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 2.7, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 2.7, 136.64);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 2.7, 2.86);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 2.7, 2);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 2.7, 231.68);
    }
}
