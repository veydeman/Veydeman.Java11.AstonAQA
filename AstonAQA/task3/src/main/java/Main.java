import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите размер массива: ");
                int input = new Scanner(System.in).nextInt();

                int[] array = new int[input];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Введите значение элемента массива номер: " + (i + 1));
                    int element = new Scanner(System.in).nextInt();
                    array[i] = element;
                }
                System.out.println("Элементы массива, кратные 3: ");
                for (int element : array) {
                    if (element % 3 == 0) {
                        System.out.print(element + "\t");
                    }
                }
                System.out.println();
            } catch (InputMismatchException exception) {
                System.out.println("Неверный тип введенных данных");
            }
        }
    }
}
