package practices;

/**
 * 九九の答えを表示する関数 showKuku を作成しなさい
 *
 * 引数：整数
 * 返却：以下のように、数字を半角スペースで区切ったもの
 *
 * 　例）引数を1にした場合の出力は「1 2 3 4 5 6 7 8 9」
 */

import org.junit.Test;
import main.java.practices.Practice006;
import static org.junit.Assert.assertEquals;

public class Practice006Test {

    @Test
    public void showKuku() {
        assertEquals("5の段は[5 10 15 20 25 30 35 40 45]","5 10 15 20 25 30 35 40 45", Practice006.showKuku(5));
        assertEquals("1の段は[1 2 3 4 5 6 7 8 9]","1 2 3 4 5 6 7 8 9", Practice006.showKuku(1));
    }

    //割り切れない場合の例外処理
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Practice006.showKuku(0);
        Practice006.showKuku(-1);
        Practice006.showKuku(10);
    }
}