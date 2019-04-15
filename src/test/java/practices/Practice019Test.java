package practices;
/**
 * 入力された整数を 日本円（小銭のみ）で支払ったときの硬貨の枚数を出力する関数
 * coincheck
 * を作成しなさい
 *
 * 例）
 * 入力：898
 * 出力：
 * 500円＝1枚
 * 100円＝3枚
 * 50円＝1枚
 * 10円＝4枚
 * 5円＝1枚
 * 1円＝3枚
 *
 */
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class Practice019Test {
    String br = System.getProperty("line.separator");

    @Test
    public void coincheckは整数をあたえると最小の日本円貨幣枚数となるようにかえす_898円の場合(){
        String expected = "500円＝1枚" + br +
                          "100円＝3枚" + br +
                          "50円＝1枚"  + br +
                          "10円＝4枚"  + br +
                          "5円＝1枚"   + br +
                          "1円＝3枚";
        assertThat(Practice019.coincheck(898),is(expected));
    }

    @Test


    public void coincheckは整数をあたえると最小の日本円貨幣枚数となるようにかえす_99999円の場合(){
        String expected =
                         "500円＝199枚"  + br +
                         "100円＝4枚"  + br +
                         "50円＝1枚"   + br +
                         "10円＝4枚"   + br +
                         "5円＝1枚"    + br +
                         "1円＝4枚";
        assertThat(Practice019.coincheck(99999),is(expected));
    }

    @Test
    public void coincheckは引数に0以下の数字をわたすと空文字をかえす(){
        assertThat(Practice019.coincheck(0),is(""));
        assertThat(Practice019.coincheck(-1),is(""));
    }
}