package practices;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Practice002Test {

    @Test
    public void isOdd() {
        assertEquals("奇数", false, main.java.practices.Practice002.isOdd(3));
        assertEquals("偶数", true, main.java.practices.Practice002.isOdd(4));
        assertEquals("割り切れません", true, main.java.practices.Practice002.isOdd(0));
    }
}