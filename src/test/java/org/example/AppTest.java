package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void negTest()
    {
        Calculator c = new Calculator();
        assertTrue( c.Factorial(-1) >  0 );
    }
    @Test
    public void Testof10()
    {
        Calculator c = new Calculator();
        assertEquals( c.Factorial(10),  3628800 );
    }


    @Test
    public void Testof18()
    {
        Calculator c = new Calculator();
        assertTrue( c.Factorial(18) >  0 );
    }

}
