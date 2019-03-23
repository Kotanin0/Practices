package test.java.practices;

import main.java.practices.PracticesDemo;
import org.junit.Test;

import static org.junit.Assert.*;

public class PracticesDemoTest {

    @Test
    public void bai() {
        assertEquals(10, PracticesDemo.bai(5));
    }
}