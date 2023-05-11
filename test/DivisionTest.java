import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void divide(){
        Division division= new Division();
        assertEquals(division.Division(9,3),3);
    }
    @Test
    public void testDivideByZero() {
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> {
            int result = a / b;
        });
    }
    @Test
    public void testDivideWithNegativeNumbers() {
        int a = -8;
        int b = 4;
        int result = a / b;
        assertEquals(-2, result);
    }

    @Test
    public void testDivideWithDecimalNumbers() {
        double a = 9.0;
        double b = 2.0;
        double result = a / b;
        assertEquals(4.5, result, 0.01);
    }
    @Test
    public void testDivideWithOutOfRangeNumbers() {
        assertThrows(ArithmeticException.class, () -> {
            int a = 11;
            int b = 0;
            int result = a / b;
        });
    }





}