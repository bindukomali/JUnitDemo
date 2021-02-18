package com.valuemomentum.training.testing.JUnitDemo;

import static org.junit.Assert.assertEquals;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 

public class CalculatorTest {
    private Calculator calc;

     @Before
    public void setUp() throws Exception{
        calc=new Calculator();
     }
     
    @After
    public void tearDown() throws Exception{
        calc=null;
    }

 

    @Test
    public void testAdd() {
        double result = calc.add(10.5,20.32);
        assertEquals(30.82,result,0);
    }

 
}