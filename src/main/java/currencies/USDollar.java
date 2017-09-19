package currencies;

import java.util.HashMap;

public class USDollar extends Currency {
    private HashMap<String, Double> rateMap = new HashMap<String, Double>();

    public USDollar(double amount) {
        super(1.0, amount);

        rateMap.put("australian", 1.35);
        rateMap.put("canadian", 1.32);
        rateMap.put("chineseYR", 6.92);
        rateMap.put("euro", .94);
        rateMap.put("franc", 1.01);
        rateMap.put("pound", 0.82);
        rateMap.put("ringgit", 4.47);
        rateMap.put("rupee", 68.32);
        rateMap.put("singapore", 1.43);
        rateMap.put("us", 1.0);
        rateMap.put("yen", 115.84);
    }

    public double toAustralianDollar() {
        return convert(this.rateMap.get("australian"));
    }

    public double toCanadianDollar() {
        return convert(this.rateMap.get("canadian"));
    }

    public double toChineseYR() {
        return convert(this.rateMap.get("chineseYR"));
    }

    public double toEuro() {
        return convert(this.rateMap.get("euro"));
    }

    public double toFranc() {
        return convert(this.rateMap.get("franc"));
    }

    public double toPounds() {
        return convert(this.rateMap.get("pound"));
    }

    public double toUSDollar() {
        return convert(this.rateMap.get("us"));
    }

    public double toRinggit() {
        return convert(this.rateMap.get("ringgit"));
    }

    public double toRupee() {
        return convert(this.rateMap.get("rupee"));
    }

    public double toSingaporeDollar() {
        return convert(this.rateMap.get("singapore"));
    }

    public double toYen() {
        return convert(this.rateMap.get("yen"));
    }

    public double convert(double dynamicRate) {
        return (this.amount * dynamicRate) / this.rate;
    }
}