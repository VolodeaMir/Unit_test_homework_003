import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YourTestClassTest {

    @Test
    public void testNumberInIntervalInside() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.numberInInterval(50);
        assertTrue(result);
    }

    @Test
    public void testNumberInIntervalOutside() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.numberInInterval(20);
        assertFalse(result);
    }

    // Другие тесты, например, граничные значения интервала и т.д.
}
