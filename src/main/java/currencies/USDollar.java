package currencies;

public class USDollar extends Currency {

    public USDollar(double amount) {
        super(1.0, amount);
    }

    public double toAustralianDollar() {
        return convert(CurrencyType.AUSTRALIAN);
    }

    public double toCanadianDollar() {
        return convert(CurrencyType.CANADIAN);
    }

    public double toChineseYR() {
        return convert(CurrencyType.CHINESE_YR);
    }

    public double toEuro() {
        return convert(CurrencyType.EURO);
    }

    public double toFranc() {
        return convert(CurrencyType.FRANC);
    }

    public double toPounds() {
        return convert(CurrencyType.POUND);
    }

    public double toUSDollar() {
        return convert(CurrencyType.US);
    }

    public double toRinggit() {
        return convert(CurrencyType.RINGGIT);
    }

    public double toRupee() {
        return convert(CurrencyType.RUPEE);
    }

    public double toSingaporeDollar() {
        return convert(CurrencyType.SINGAPORE);
    }

    public double toYen() {
        return convert(CurrencyType.YEN);
    }

    public double convert(CurrencyType currencyType) {
        return (this.amount * currencyType.getValue()) / this.rate;
    }
}