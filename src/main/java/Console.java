import java.util.Scanner;
public class Console {
    public Console() {
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