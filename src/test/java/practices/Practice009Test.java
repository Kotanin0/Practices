package practices;

/**
 * フィボナッチ数列を表示する関数 showFibonacci を作成しなさい
 *
 * 引数：整数
 * 返却：その整数以下で終了するフィボナッチ数列
 *
 * 　例）引数：50
 * 　　　返却：0 1 1 2 3 5 8 13 21 34
 */


import org.junit.Test;
import main.java.practices.Practice009;
import static org.junit.Assert.assertEquals;

public class Practice009Test {

    @Test
    public void showFibonacci() {
        assertEquals("引数:2 返り値:0 1 1 2 3 5 8 13 21 34","0 1 1 2 3 5 8 13 21 34",Practice009.showFibonacci(50));
        assertEquals("引数:2 返り値:0 1 1 2","0 1 1 2",Practice009.showFibonacci(2));
        assertEquals("引数:0 返り値：0","0",Practice009.showFibonacci(0));
    }

    //負の数は受け付けません
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Practice009.showFibonacci(-1);
    }
}