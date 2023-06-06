import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Вы ввели строку: " + getString());
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
