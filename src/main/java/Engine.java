import currencies.*;

public enum Engine {
    INSTANCE;
    public double run(double fromAmount, CurrencyType currencyFromType, CurrencyType currencyToType) {
        CurrencyConverter cc = new CurrencyConverter(fromAmount);
        return cc.convert(currencyFromType, currencyToType);
    }
}