public class Main {
    public static void main(String[] args) {        
        Console console = new Console();
        Engine engine = new Engine();
        System.out.println("Welcome to my currency conversion");

        double fromAmount = console.getDoubleInput("How much moneys?");
        String fromType = console.getStringInput("What type of currency are we converting from");
        String toType = console.getStringInput("What type of currency are we converting to");
        double toAmount = engine.run(fromAmount, fromType, toType);

        System.out.format("Converted from [ %s ] to [ %s ]", fromType, toType);
        System.out.format("Converted [ %s %s ] to\n[ %s %s ]", fromAmount, fromType, toAmount, toType);
    }

}