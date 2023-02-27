import java.util.Scanner;

public class Main {

    public static long delPart(double d) {
        return (long) d;
    }


    public static String compare(double a, double b) {
        double result = a - b;
        String text;
        if (Math.abs(result) < 0.000000000000001) {
           text = "Числа равны";
        } else if (result < 0) {
            text = "Число " + b + " больше числа " + a + " на " + Math.abs(result);
        } else {
            text = "Число " + a + " больше числа " + b + " на " + Math.abs(result);
        }
        return text;
    }
    public static long round(double c) {
        return Math.round(c);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            String oneLine = "Операции:"
                    + System.lineSeparator() + "1. Сравнить"
                    + System.lineSeparator() + "2. Округлить"
                    + System.lineSeparator() + "3. Отбросить дробную часть";
            System.out.println(oneLine);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите первое число");
                        double a = scanner.nextDouble();
                        System.out.println("Введите второе число");
                        double b = scanner.nextDouble();
                        System.out.println(compare(a, b));
                        break;
                    case 2:
                        System.out.println("Введите число для округения");
                        double c = scanner.nextDouble();
                        System.out.println(round(c));
                        break;
                    case 3:
                        System.out.println("Введите число, у которого необходимо отбросить дробную часть");
                        double d = scanner.nextDouble();
                        System.out.println(delPart(d));
                        break;
                    default:
                        System.out.println("Такого числа нет в списке");
                }
                break;
            }
        } while (true);
    }
}
