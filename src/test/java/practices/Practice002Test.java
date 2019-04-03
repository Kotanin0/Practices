package practices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice002Test {
    @Test
    public void isOdd() {
        assertEquals("奇数", false, Practice002.isOdd(3));
        assertEquals("偶数", true, Practice002.isOdd(4));
        assertEquals("割り切れないときは0を返して欲しい", 0, Practice002.isOdd(0));
    }
}