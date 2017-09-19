public class Main {
    public static void main(String[] args) {        
        Utilities utils = new Utilities();
        Engine engine = new Engine();
        System.out.println("Welcome to my currency conversion");

        double fromAmount = utils.getDoubleInput("How much moneys?");
        String fromType = utils.getStringInput("What type of currency are we converting from");
        String toType = utils.getStringInput("What type of currency are we converting to");
        double toAmount = engine.run(fromAmount, fromType, toType);

        System.out.format("Converted from [ %s ] to [ %s ]", fromType, toType);
        System.out.format("Converted [ %s %s ] to\n[ %s %s ]", fromAmount, fromType, toAmount, toType);
    }

}