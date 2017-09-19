package currencies;

/**
 * Created by Chris on 9/19/2017.
 */
public enum CurrencyType {
    AUSTRALIAN(1.35),
    CANADIAN(1.32),
    CHINESE_YR(6.92),
    EURO(.94),
    FRANC(1.01),
    POUND(0.82),
    RINGGIT(4.47),
    RUPEE(68.32),
    SINGAPORE(1.43),
    US(1.0),
    YEN(115.84);
    private final double value;

    CurrencyType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
