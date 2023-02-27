import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MainTests {

    @Test
    public void delPartTest () {
        double d = 2.354;
        long expected = (long) 2.354;

        long result = (long) d;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void compareTest () {
        double a = 2.35;
        double b = 1.28;
        String result;
        String expected = "Число 2.35 больше числа 1.28 на 1.07";

        double subtraction = a - b;
        if (Math.abs(subtraction) < 0.000000000000001) {
            result = "Числа равны";
        } else if (subtraction < 0) {
            result = "Число " + b + " больше числа " + a + " на " + Math.abs(subtraction);
        } else {
            result ="Число " + a + " больше числа " + b + " на " + Math.abs(subtraction);
        }

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void roundTest () {
        double c = 1.44;
        int expected = 1;

        long result = Math.round(c);

        Assertions.assertEquals(expected, result);
    }
}
