import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AustralianTests.class,
        CanadianTests.class,
        PoundTests.class,
        USTests.class,
        YenTests.class,
        EuroTests.class,
        FrancTests.class,
        RinggitTests.class,
        RupeeTests.class,
        SingaporeTests.class
})

public class TestSuite {
    // the class remains empty,
    // used only as a holder for the above annotations
}