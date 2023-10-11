import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equalsIgnoreCase("Вячеслав")) {
                System.out.println("Привет, " + input.substring(0, 1).toUpperCase() +
                        input.substring(1));
            } else
                System.out.println("Нет такого имени");
        }
    }
}
