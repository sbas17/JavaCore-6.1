import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void delPart() {
        double d = 2.354;
        long expected = (long) 2.354;

        long result = Main.delPart(d);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void compare() {
        double a = 2.35;
        double b = 1.28;
        String result = Main.compare(a, b);

        String expected = "Число 2.35 больше числа 1.28 на 1.07";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void round() {
        double c = 1.44;

        int expected = 1;

        long result = Main.round(c);

        Assertions.assertEquals(expected, result);
    }
}