import org.junit.Test;

import static currencies.CurrencyType.*;

/**
 * Created by latashawatson on 1/16/17.
 */
public class RupeeTests extends CurrencyTest {
    public RupeeTests() {
        super(RUPEE);
    }

    @Test
    public void toAustralianDollar() {
        engineTest(AUSTRALIAN,136.64, 2.7);
    }

    @Test
    public void toCanadianDollar() {
        engineTest(CANADIAN,136.64, 2.64);
    }

    @Test
    public void toChineseYR() {
        engineTest(CHINESE_YR,136.64, 13.84);
    }

    @Test
    public void toEuro() {
        engineTest(EURO,136.64, 1.88);
    }

    @Test
    public void toFranc() {
        engineTest(FRANC,136.64, 2.02);
    }

    @Test
    public void toPound() {
        engineTest(POUND,136.64, 1.64);
    }

    @Test
    public void toRinggit() {
        engineTest(RINGGIT,136.64, 8.94);
    }

    @Test
    public void toRupee() {
        engineTest(RUPEE, 136.64, 136.64);
    }

    @Test
    public void toUSDollar() {
        engineTest(US,136.64, 2);
    }

    @Test
    public void toSingaporeDollar() {
        engineTest(SINGAPORE,136.64, 2.86);
    }

    @Test
    public void toYen() {
        engineTest(YEN,136.64, 231.68);
    }
}
