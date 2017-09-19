package currencies;

/**
 * Created by leon.hunter on 1/17/2017.
 */
public class Rupee extends ForeignCurrency {
    public Rupee(double amount) {
        super(CurrencyType.RUPEE, amount);
    }
}
