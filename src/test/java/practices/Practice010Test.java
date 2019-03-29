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

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Practice010Test {

    @Test
    public void getBinary() {
        //テスト１＿例題通り
        assertEquals("引数:18 返り値:10010","10010", main.java.practices.Practice010.getBinary(18));

        //テスト２＿負の値を入れる
        assertEquals("引数:-10 返り値:例外","例外", main.java.practices.Practice010.getBinary(-10));

        //テスト３＿０
        assertEquals("引数:0 返り値:0","0", main.java.practices.Practice010.getBinary(0));
    }
}