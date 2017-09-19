package currencies;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class ForeignCurrency extends Currency {
    private USDollar usd;

    public ForeignCurrency(double rate, double amount) {
        super(rate, amount);
        this.usd = new USDollar(toUSDollar());
    }


    public ForeignCurrency(CurrencyType currencyType, double amount) {
        // Adapter pattern
        this(currencyType.getValue(), amount);
    }

    public double toAustralianDollar() {
        return usd.toAustralianDollar();
    }

    public double toCanadianDollar() {
        return usd.toCanadianDollar();
    }

    public double toChineseYR() {
        return usd.toChineseYR();
    }

    public double toEuro() {
        return usd.toEuro();
    }

    public double toFranc() {
        return usd.toFranc();
    }

    public double toPounds() {
        return usd.toPounds();
    }

    public double toUSDollar() {
        return super.amount / super.rate;
    }

    public double toRinggit() {
        return usd.toRinggit();
    }

    public double toRupee() {
        return usd.toRupee();
    }

    public double toSingaporeDollar() {
        return usd.toSingaporeDollar();
    }

    public double toYen() {
        return usd.toYen();
    }
}
