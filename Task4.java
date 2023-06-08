import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println("Вы ввели строку: " + getString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String userString = scanner.nextLine();
        if (userString == "") {
            throw new RuntimeException("Строка не должна быть пустой!");
        }
        return userString;
    }
}
