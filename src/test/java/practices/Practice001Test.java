package test.java.practices;

import main.java.practices.Practice001;
import org.junit.Test;

import static org.junit.Assert.*;

public class Practice001Test {

    @Test
    public void wa() {
        assertEquals("5 + 2 = 7", 7, Practice001.wa(5, 2));
        assertEquals("-5 + -2 = -7", -7, Practice001.wa(-5, -2));
        assertEquals("5 + 0 = 5", 5, Practice001.wa(5, 0));
    }

    @Test
    public void sa() {
        assertEquals("5 - 2 = 3", 3, Practice001.sa(5, 2));
        assertEquals("-5 - -2 = -3", -3, Practice001.sa(-5, -2));
        assertEquals("5 - 0 = 5", 5, Practice001.sa(5, 0));
    }

    @Test
    public void seki() {
        assertEquals("5 * 2 = 10", 10, Practice001.seki(5, 2));
        assertEquals("-5 * -2 = 10", 10, Practice001.seki(-5, -2));
        assertEquals("5 * 0 = 0", 0, Practice001.seki(5, 0));
    }

    @Test
    public void sho() {
        assertEquals("5 / 2 = 2", 2, Practice001.sho(5, 2));
        assertEquals("6 / 3 = 2", 2, Practice001.sho(6, 3));
        assertEquals("5 / 0 = ???", "割り切れません", Practice001.sho(5, 0));
    }

    @Test
    public void amari() {
        assertEquals("5 % 2 = 1", 1, Practice001.amari(5, 2));
        assertEquals("6 % 3 = 0", 0, Practice001.amari(6, 3));
        assertEquals("5 % 0 = 0", "割り切れません", Practice001.amari(5, 0));
    }
}