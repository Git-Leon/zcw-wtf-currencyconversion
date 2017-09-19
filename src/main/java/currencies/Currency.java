package currencies;

public abstract class Currency {
    protected double rate;
    protected double amount;

    public Currency(double rate, double amount) {
        this.rate = rate;
        this.amount = amount;
    }

    public abstract double toAustralianDollar();

    public abstract double toCanadianDollar();

    public abstract double toChineseYR();

    public abstract double toEuro();

    public abstract double toFranc();

    public abstract double toPounds();

    public abstract double toUSDollar();

    public abstract double toRinggit();

    public abstract double toRupee();

    public abstract double toSingaporeDollar();

    public abstract double toYen();
}