package practices;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 *
 * 引数：整数
 *
 * 返却：以下の文字列のいずれか
 * 　80点以上：優
 * 　70-79点：良
 * 　60-69点：可
 * 　59点以下：不可
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Practice005Test {
    @Test
    public void showResult() {
        int kYuu = 80;//"優"になる点数
        int kRyou = 70;//"良"になる点数
        int kKa = 60;//"可"になる点数、Ka未満は"不可"

        //expected = "優"
        assertEquals("優",Practice005.showResult(kYuu+1));
        assertEquals("優",Practice005.showResult(kYuu));
        //expected = "良"
        assertEquals("良",Practice005.showResult(kYuu-1));
        assertEquals("良",Practice005.showResult(kRyou));
        assertEquals("良",Practice005.showResult(kRyou+1));
        //expected = "可"
        assertEquals("可",Practice005.showResult(kRyou-1));
        assertEquals("可",Practice005.showResult(kKa));
        assertEquals("可",Practice005.showResult(kKa+1));
        //expected = "不可"
        assertEquals("不可",Practice005.showResult(kKa-1));
    }
}