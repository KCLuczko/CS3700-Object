import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testWholeNumbers() {
        assertEquals(20.0, Calculator.average(10, 20, 30));
    }

    @Test
    public void testDecimalAnswer() {
        assertEquals(2.5, Calculator.average(1, 2, 3, 4));
    }

    @Test
    public void testDecimals() {
        // delta because decimals aren't always exact
        assertEquals(2.2, Calculator.average(1.5, 2.5, 2.6), 0.0001);
    }

    @Test
    public void testOneNumber() {
        assertEquals(7.0, Calculator.average(7));
    }

    @Test
    public void testNegatives() {
        assertEquals(-2.0, Calculator.average(-1, -2, -3));
    }

    @Test
    public void testMixedSigns() {
        assertEquals(0.0, Calculator.average(-5, 5));
    }

    @Test
    public void testZeros() {
        assertEquals(0.0, Calculator.average(0, 0, 0));
    }

    @Test
    public void testLotsOfNumbers() {
        // 1 through 100 averages to 50.5
        double[] nums = new double[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        assertEquals(50.5, Calculator.average(nums));
    }

    @Test
    public void testEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.average());
    }
}
