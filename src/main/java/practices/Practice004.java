package practices;

import java.util.Random;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 * <p>
 * 引数：整数
 * <p>
 * 返却：以下の文字列のいずれか
 * 　60点以上：合格
 * 　59点以下：不合格
 */

public class Practice004 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(100);
            System.out.println(n);
            System.out.println(showResult(n));
        }
    }

    // 試験の結果を返却する
    public static String showResult(int n) {

        return n >= 60 ? "合格" : "不合格";
    }

}
