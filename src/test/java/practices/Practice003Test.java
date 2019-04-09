package practices;

/**
 * 整数値を入力し、以下の4つの分類から該当するものを表示する関数 displayText を作成しなさい
 *
 * 引数：整数
 * 返却：以下の4つの文字列のいずれか
 * 正の偶数
 * 正の奇数
 * 負の偶数
 * 負の奇数
 *
 * ※ 負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 0 は 正の偶数 であるとする。
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice003Test {

    @Test
    public void displayText() {
        assertEquals("2=正の偶数","正の偶数",Practice003.displayText(2));
        assertEquals("3＝正の奇数","正の奇数",Practice003.displayText(3));
        assertEquals("-2=負の偶数","負の偶数",Practice003.displayText(-2));
        assertEquals("-3＝負の奇数","負の奇数",Practice003.displayText(-3));

        assertEquals("0=正の偶数","正の偶数",Practice003.displayText(0));

    }
}