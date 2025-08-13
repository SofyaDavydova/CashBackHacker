package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {

    @Test

    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        assertEquals(expected, service.remain(900));
    }

    @Test
    public void shouldReturn300WhenAmount700() {
        CashbackHackService service = new CashbackHackService();
        int expected = 300;
        assertEquals(expected, service.remain(700));
    }

    @Test
    public void shouldReturn1WhenAmount999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        assertEquals(expected, service.remain(999));
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(expected, service.remain(1));
    }

    @Test
    public void shouldReturn999WhenAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(expected, service.remain(1001));
    }

    @Test
    public void shouldReturn999WhenAmount3001() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        assertEquals(expected, service.remain(3001));
    }

    @Test
    public void shouldReturn1WhenAmount2999() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        assertEquals(expected, service.remain(2999));
    }

    @Test
    public void shouldReturn1000WhenAmount0() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        assertEquals(expected, service.remain(0));
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(expected, service.remain(1000));
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        assertEquals(expected, service.remain(2000));
    }
}
