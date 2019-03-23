package test.java.practices;

import main.java.practices.Practice002;
import org.junit.Test;

import static org.junit.Assert.*;

public class Practice002Test {

    @Test
    public void isOdd() {
        assertEquals("奇数", false, Practice002.isOdd(3));
        assertEquals("偶数", true, Practice002.isOdd(4));
        assertEquals("割り切れません", true, Practice002.isOdd(0));
    }
}