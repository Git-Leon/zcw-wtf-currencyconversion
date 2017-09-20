package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class Euro extends ForeignCurrency {
    public Euro(double amount) {
        super(CurrencyType.EURO, amount);
    }
}
