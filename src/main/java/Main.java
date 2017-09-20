import currencies.CurrencyType;

public class Main {
    public static void main(String[] args) {        
        Console console = new Console();
        Engine engine = Engine.INSTANCE;
        System.out.println("Welcome to my currency conversion");

        double fromAmount = console.getDoubleInput("How much moneys?");

        System.out.println("Here is a list of the supported currencies...");
        for(CurrencyType type : CurrencyType.values()) {
            System.out.println(type.name());
        }
        String fromTypeString = console.getStringInput("What type of currency are we converting from");
        String toTypeString = console.getStringInput("What type of currency are we converting to");

        CurrencyType fromType = CurrencyType.valueOf(fromTypeString);
        CurrencyType toType = CurrencyType.valueOf(toTypeString);

        double toAmount = engine.run(fromAmount, fromType, toType);

        System.out.format("Converted from [ %s ] to [ %s ]", fromType, toType);
        System.out.format("Converted [ %s %s ] to\n[ %s %s ]", fromAmount, fromType, toAmount, toType);
    }

}