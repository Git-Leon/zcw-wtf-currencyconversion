import org.junit.After;
import org.junit.Before;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public abstract class CurrencyTest {
    protected final Engine engine = new Engine();

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

    protected abstract void engineTest(String toType, double fromAmount, double expectedValue);

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}
