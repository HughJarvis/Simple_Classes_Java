import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCalculator {


    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(8, 2);
    }


    @Test
    public void canAdd(){
       assertEquals(10, calculator.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(6, calculator.subtract(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(), 0.01);
    }
}


