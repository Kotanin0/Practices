package practices;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 *
 * 引数：整数
 *
 * 返却：以下の文字列のいずれか
 * 　60点以上：合格
 * 　59点以下：不合格
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice004Test {
    @Test
    public void showResult(){
        //58,59,60,61を試験
        assertEquals("58点は不合格","不合格",Practice004.showResult(58));
        assertEquals("59点は不合格","不合格",Practice004.showResult(58));
        assertEquals("60点は合格","合格",Practice004.showResult(60));
        assertEquals("61点は合格","合格",Practice004.showResult(61));
    }
}