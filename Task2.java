public class Task2 {
    public static void main(String[] args) {
        // Дано:
        // try {
        // int d = 0;
        // double catchedRes1 = intArray[8] / d;
        // System.out.println("catchedRes1 = " + catchedRes1);
        // } catch (ArithmeticException e) {
        // System.out.println("Catching exception: " + e);
        // }

        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            int d = 2;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
/**
 * Что было сделано и для чего:
 * 1. Добавила массив intArray, т.к. такой переменной не было.
 * 2. Приравняла переменную d к ненулевому значению. Непонятно нужно ли это,
 * т.к. при d=0 сработает исключение ArithmeticException и программа продолжит
 * работу.
 * 3. Привела числитель выражения double catchedRes1 = (double) intArray[8] / d
 * к double, чтоб получилось double без потери дробной части.
 * 4. Добавила исключение ArrayIndexOutOfBoundsException, т.к. массив может быть
 * задан меньше, чем 8.
 */