package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

public class Yen extends ForeignCurrency {
    public Yen(double amount) {
        super(CurrencyType.YEN, amount);
    }
}