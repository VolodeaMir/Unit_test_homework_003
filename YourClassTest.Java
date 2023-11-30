import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YourTestClassTest {

    @Test
    public void testEvenOddNumberEven() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    public void testEvenOddNumberOdd() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.evenOddNumber(7);
        assertFalse(result);
    }

    // Другие тесты, например, проверка на 0, отрицательные числа и т.д.
}
