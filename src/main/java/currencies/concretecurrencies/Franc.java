package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class Franc extends ForeignCurrency {
    public Franc(double amount) {
        super(CurrencyType.FRANC, amount);
    }
}
