package currencies.concretecurrencies;

import currencies.CurrencyType;
import currencies.ForeignCurrency;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class ChineseYR extends ForeignCurrency {
    public ChineseYR(double amount) {
        super(CurrencyType.CHINESE_YR, amount);
    }
}
