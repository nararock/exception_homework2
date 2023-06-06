public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

/**
 * Что было сделано:
 * 1. Переместила исключение Throwable в самый конец исключений, чтобы оно не
 * мешало вызову исключений, которые являются наследниками этого класса.
 * 2. Исправила индекс в выражении abc[3] = 9 на abc[1] = 9, т.к. в массиве
 * abc размерность равна 2. Хотя эту ошибку обработало бы заданное
 * исключение IndexOutOfBoundsException.
 * 3. В методе printSum заданное исключение FileNotFoundException не
 * подходит под содержание метода, т.к. метод не работает с файлами.
 * 4. NullPointerException - исключение, которое ни к чему неприменимо
 * в приведенном коде.
 */