package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class CanadianDollar extends ForeignCurrency {
    public CanadianDollar(double amount) {
        super(CurrencyType.CANADIAN, amount);
    }
}
