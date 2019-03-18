import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(8, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(15, 5));
    }
}
