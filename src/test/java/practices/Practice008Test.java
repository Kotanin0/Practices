package practices;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice008Test {
    @Test
    public void factorization() {
        assertEquals("2","2",Practice008.factorization(2));
        assertEquals("2 2 2 3 5","2 2 2 3 5", Practice008.factorization(120));
        assertEquals("2 2 3 5 5 67","2 2 3 5 5 67", Practice008.factorization(20100));
    }

    //2より小さい数を入れたら、例外で帰ってくる
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Practice008.factorization(1);
        Practice008.factorization(-1);
    }
}