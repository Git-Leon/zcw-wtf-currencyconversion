package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class AustralianDollar extends ForeignCurrency {
    public AustralianDollar(double amount) {
        super(CurrencyType.AUSTRALIAN, amount);
    }
}
