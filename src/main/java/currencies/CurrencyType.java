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

    // The exchange rate with respect to a US dollar
    private final double exchangeRate;

    CurrencyType(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
