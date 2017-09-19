import currencies.*;

public class Engine {

    public double run(double fromAmount, String fromType, String toType) {
        switch (fromType.toLowerCase()) {
            case "australian":
                return getConversionAmount(new AustralianDollar(fromAmount), toType);

            case "canadian":
                return getConversionAmount(new CanadianDollar(fromAmount), toType);

            case "chineseyr":
                return getConversionAmount(new ChineseYR(fromAmount), toType);

            case "euro":
                return getConversionAmount(new Euro(fromAmount), toType);

            case "franc":
                return getConversionAmount(new Franc(fromAmount), toType);

            case "pound":
                return getConversionAmount(new Pound(fromAmount), toType);

            case "ringgit":
                return getConversionAmount(new Ringgit(fromAmount), toType);

            case "rupee":
                return getConversionAmount(new Rupee(fromAmount), toType);

            case "singapore":
                return getConversionAmount(new SingaporeDollar(fromAmount), toType);

            case "us":
                return getConversionAmount(new USDollar(fromAmount), toType);

            case "yen":
                return getConversionAmount(new Yen(fromAmount), toType);

            default:
                System.out.println(fromType + " is an invalid base currency!");
                return -1;
        }
    }

    private double getConversionAmount(Currency fromType, String toType) {
        switch (toType.toLowerCase()) {
            case "australian":
                return fromType.toAustralianDollar();

            case "canadian":
                return fromType.toCanadianDollar();

            case "chineseyr":
                return fromType.toChineseYR();

            case "euro":
                return fromType.toEuro();

            case "franc":
                return fromType.toFranc();

            case "pound":
                return fromType.toPounds();

            case "ringgit":
                return fromType.toRinggit();

            case "rupee":
                return fromType.toRupee();

            case "singapore":
                return fromType.toSingaporeDollar();

            case "us":
                return fromType.toUSDollar();

            case "yen":
                return fromType.toYen();

            default:
                System.out.println(toType + " is an invalid conversion currency!");
                return -1;
        }
    }

}