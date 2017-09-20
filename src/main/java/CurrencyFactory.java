import currencies.*;
import currencies.concretecurrencies.*;

/**
 * Created by Chris on 9/19/2017.
 */
public class CurrencyFactory {
    private final double amount;

    public CurrencyFactory(double amount) {
        this.amount = amount;
    }

    public Currency getInstance(CurrencyType currencyType) {
        Currency currency = null;
        switch (currencyType) {
            case AUSTRALIAN:
                currency = new AustralianDollar(amount);
                break;

            case CANADIAN:
                currency = new CanadianDollar(amount);
                break;

            case CHINESE_YR:
                currency = new ChineseYR(amount);
                break;

            case EURO:
                currency = new Euro(amount);
                break;

            case FRANC:
                currency = new Franc(amount);
                break;

            case POUND:
                currency = new Pound(amount);
                break;

            case RINGGIT:
                currency = new Ringgit(amount);
                break;

            case RUPEE:
                currency = new Rupee(amount);
                break;

            case SINGAPORE:
                currency = new SingaporeDollar(amount);
                break;

            case US:
                currency = new USDollar(amount);
                break;
            case YEN:
                currency = new Yen(amount);
                break;
        }
        return currency;
    }

    @Deprecated
    public static Currency getInstance(CurrencyType currencyType, double amount) {
        return new CurrencyFactory(amount).getInstance(currencyType);
    }
}
