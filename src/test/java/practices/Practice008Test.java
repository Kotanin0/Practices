package practices;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Practice008Test {

    @Test
    public void factorization() {
        assertEquals("2 2 2 3 5","2 2 2 3 5", main.java.practices.Practice008.factorization(120));
        assertEquals("2 2 3 5 5 67","2 2 3 5 5 67", main.java.practices.Practice008.factorization(20100));
    }
}