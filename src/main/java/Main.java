import java.util.Scanner;

public class Main {

    public static void delPart(double d) {
        long dd = (long) d;
        System.out.println(dd);
    }


    public static void compare(double a, double b) {
        double result = a - b;
        if (Math.abs(result) < 0.000000000000001) {
            System.out.println("Числа равны");
        } else if (result < 0) {
            System.out.println("Число " + b + " больше числа " + a + " на " + Math.abs(result));
        } else {
            System.out.println("Число " + a + " больше числа " + b + " на " + Math.abs(result));
        }

    }
    public static void round(double c) {
        System.out.println(Math.round(c));
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
                        compare(a, b);
                        break;
                    case 2:
                        System.out.println("Введите число для округения");
                        double c = scanner.nextDouble();
                        round(c);
                        break;
                    case 3:
                        System.out.println("Введите число, у которого необходимо отбросить дробную часть");
                        double d = scanner.nextDouble();
                        delPart(d);
                        break;
                    default:
                        System.out.println("Такого числа нет в списке");
                }
                break;
            }
        } while (true);
    }
}
