import java.util.Scanner;
public class Utilities {
    public Utilities() {
    }

    public double getDoubleInput(String prompt) {
        String stringAmount = getStringInput(prompt);
        double doubleAmount = Double.parseDouble(stringAmount);
        return doubleAmount;
    }

    public String getStringInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        String out = scanner.nextLine();
        return out;
    }
}