package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class SingaporeDollar extends ForeignCurrency {
    public SingaporeDollar(double amount) {
        super(CurrencyType.SINGAPORE, amount);
    }
}
