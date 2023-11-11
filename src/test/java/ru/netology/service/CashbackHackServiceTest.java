package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void cashback900() {

        CashbackHackService service = new CashbackHackService();

            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            assertEquals(expected, actual);
        }

    @Test
    public void cashback0() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void cashback_500() {

        CashbackHackService service = new CashbackHackService();

        int amount = -500;

        int actual = service.remain(amount);
        int expected = 1500;

        assertEquals(expected, actual);
    }

    @Test
    public void cashback1500() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void cashback1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    }
