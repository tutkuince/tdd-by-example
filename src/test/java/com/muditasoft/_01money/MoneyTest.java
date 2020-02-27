package com.muditasoft._01money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));

        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));

        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
    }

    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
