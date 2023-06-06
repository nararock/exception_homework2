import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        getNumber();
    }

    public static void getNumber() {
        float number = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Введите дробное число:");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Неправильно введенный формат данных");
            }
        }
        System.out.println("Введенное число: " + number);
    }
}
