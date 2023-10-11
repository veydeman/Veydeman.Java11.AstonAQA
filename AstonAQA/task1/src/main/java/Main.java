import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите число: ");
                BigDecimal input = new Scanner(System.in).nextBigDecimal();
                if (input.compareTo(BigDecimal.valueOf(7)) > 0) {
                    System.out.println("Привет");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Неверный тип или формат введенных данных");
            }
        }
    }
}
