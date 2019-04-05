package practices;
/**
 * 入力された整数を2進数に変換する関数 getBinary を作成しなさい
 *
 * 引数：整数
 * 返却：2進数の文字列
 *
 * 　例）引数：18
 * 　　　返却：10010
 *
 */

import org.junit.Test;
import main.java.practices.Practice010;
import static org.junit.Assert.assertEquals;

public class Practice010Test {

    @Test
    public void getBinary() {
        //テスト１＿例題通り
        assertEquals("引数:18 返り値:10010","10010",Practice010.getBinary(18));
        //テスト３＿０
        assertEquals("引数:0 返り値:0","0",Practice010.getBinary(0));
    }

    //負の数は受け付けないはず
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Practice010.getBinary(-1);
    }
}