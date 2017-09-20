import currencies.CurrencyType;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public abstract class CurrencyTest {
    protected final Engine engine = Engine.INSTANCE;
    private final CurrencyType currencyType;
    public CurrencyTest(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public abstract void toAustralianDollar();

    public abstract void toCanadianDollar();

    public abstract void toChineseYR();

    public abstract void toEuro();

    public abstract void toFranc();

    public abstract void toPound();

    public abstract void toRinggit();

    public abstract void toRupee();

    public abstract void toUSDollar();

    public abstract void toSingaporeDollar();

    public abstract void toYen();

    @Deprecated // TODO - get rid of this shit
    public final void engineTest(String toType, double fromAmount, double expectedValue) {

    }

    public final void engineTest(CurrencyType toType, double fromAmount, double expectedValue) {
        double toAmount = engine.run(fromAmount, currencyType, toType);
        assertEquals(toAmount, expectedValue, 0);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}
