import currencies.*;

/**
 * Created by Chris on 9/19/2017.
 */
public class CurrencyConverter {
    private final CurrencyFactory factory;

    CurrencyConverter(double amount) {
        this.factory = new CurrencyFactory(amount);
    }

    public double convert(CurrencyType currencyFromType, CurrencyType currencyToType) {
        Currency fromCurrency = factory.getInstance(currencyFromType);
        return fromCurrency.to(currencyToType);
    }

}
