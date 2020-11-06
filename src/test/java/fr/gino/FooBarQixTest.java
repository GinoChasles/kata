package fr.gino;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    public void testIsDivisiblePer3() {
        assertTrue(FooBarQix.isDivisiblePer3(3));
        assertFalse(FooBarQix.isDivisiblePer3(4));
    }

    @Test
    public void testIsDivisiblePer5() {
        assertTrue(FooBarQix.isDivisiblePer5(5));
        assertFalse(FooBarQix.isDivisiblePer5(6));
    }

    @Test
    public void testIsDivisiblePer7() {
        assertTrue(FooBarQix.isDivisiblePer7(7));
        assertFalse(FooBarQix.isDivisiblePer7(8));
    }

    @Test
    public void testConvertDivisible() {
        assertEquals("Foo", FooBarQix.convertDivisible(3));
        assertEquals("Bar", FooBarQix.convertDivisible(5));
        assertEquals("Qix", FooBarQix.convertDivisible(7));

        assertEquals(null, FooBarQix.convertDivisible(8));

        assertEquals("FooBar", FooBarQix.convertDivisible(15));
        assertEquals("FooQix", FooBarQix.convertDivisible(21));
        assertEquals("BarQix", FooBarQix.convertDivisible(35));
        assertEquals("FooBarQix", FooBarQix.convertDivisible(105));
    }

    @Test
    public void testConvertNumber() {
        assertEquals("Foo", FooBarQix.convertNumber(3));
        assertEquals("Bar", FooBarQix.convertNumber(5));
        assertEquals("Qix", FooBarQix.convertNumber(7));
        assertEquals(null, FooBarQix.convertNumber(8));
    }

    @Test
    public void testCompute() {
        assertEquals("Foo", FooBarQix.compute("6"));
        assertEquals("FooFoo", FooBarQix.compute("3"));

        assertEquals("Bar*", FooBarQix.compute("10"));
        assertEquals("BarBar", FooBarQix.compute("5"));
        assertEquals("FooBarBar", FooBarQix.compute("15"));

        assertEquals("Qix", FooBarQix.compute("14"));
        assertEquals("QixQix", FooBarQix.compute("7"));

        assertEquals("FooBarQix*Bar", FooBarQix.compute("105"));

        assertEquals("88", FooBarQix.compute("88"));

        assertEquals("FooBarQixQixFooBar", FooBarQix.compute("735"));

        assertEquals("QixFooBar8", FooBarQix.compute("7358"));
        assertEquals("BarQixFooBarBar", FooBarQix.compute("87355"));

        assertEquals("BarQix*FooBarBar", FooBarQix.compute("870355"));
    }
}
