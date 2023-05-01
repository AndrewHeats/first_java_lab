package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest extends Bank {
    Bank bank = new Bank(8, "10:00-21:00", 25, false, 1996);

    @Test
    public void testCalculateConstructionPrice() {
        assertEquals(15625.0, bank.caclucateConstructionPrice(), 0.001);
    }
}
