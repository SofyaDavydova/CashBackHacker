package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test

    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        assertEquals(service.remain(900), expected);
    }

    @Test
    public void shouldReturn300WhenAmount700() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        assertEquals(service.remain(700), expected);
    }

    @Test
    public void shouldReturn1WhenAmount999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        assertEquals(service.remain(999), expected);
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(service.remain(1), expected);
    }

    @Test
    public void shouldReturn999WhenAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(service.remain(1001), expected);
    }

    @Test
    public void shouldReturn999WhenAmount3001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(service.remain(3001), expected);
    }

    @Test
    public void shouldReturn1WhenAmount2999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        assertEquals(service.remain(2999), expected);
    }

    @Test
    public void shouldReturn1000WhenAmount0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        assertEquals(service.remain(0), expected);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(1000), expected);
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(service.remain(2000), expected);
    }
}