import static org.junit.Assert.*; // JUnit 4 imports
import org.junit.Before; // For setting up tests
import org.junit.Test; // For test methods

public class CalculatorTest {

    private calculator calculator;

    @Before
    public void setUp() {
        calculator = new calculator(); // Initialize the calculator before each test
    }

    @Test
    public void testAddition() {
        assertEquals("2 + 3 should equal 5", 5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals("5 - 4 should equal 1", 1, calculator.subtract(5, 4));
    }

    @Test
    public void testMultiplication() {
        assertEquals("2 * 3 should equal 6", 6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals("6 / 3 should equal 2.0", 2.0, calculator.divide(6, 3), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        // Testing that division by zero throws an exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
