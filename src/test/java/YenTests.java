import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class YenTests extends CurrencyTest {
    public YenTests(){
        super(YEN);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN, 231.68, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN, 231.68, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR, 231.68, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO, 231.68, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC, 231.68, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND, 231.68, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT, 231.68, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 231.68, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest(US, 231.68, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE, 231.68, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN, 231.68, 231.68);
    }
}