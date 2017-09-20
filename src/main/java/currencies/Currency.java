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



    public double to(CurrencyType toType) {
        double convertedAmount;
        switch (toType) {
            case AUSTRALIAN:
                convertedAmount = toAustralianDollar();
                break;

            case CANADIAN:
                convertedAmount = toCanadianDollar();
                break;

            case CHINESE_YR:
                convertedAmount = toChineseYR();
                break;

            case EURO:
                convertedAmount = toEuro();
                break;

            case FRANC:
                convertedAmount = toFranc();
                break;

            case POUND:
                convertedAmount = toPounds();
                break;

            case RINGGIT:
                convertedAmount = toRinggit();
                break;

            case RUPEE:
                convertedAmount = toRupee();
                break;

            case SINGAPORE:
                convertedAmount = toSingaporeDollar();
                break;

            case US:
                convertedAmount = toUSDollar();
                break;

            case YEN:
                convertedAmount = toYen();
                break;

            default:
                String errorMessage = String.format("Unaccounted for enumeration [ %s ]", toType.name());
                throw new IllegalArgumentException(errorMessage);
        }
        return convertedAmount;
    }
}