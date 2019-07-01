package practices;

import java.util.Random;

/**
 * 試験の点数を入力し、対応する結果を表示する関数 showResult を作成しなさい
 * 試験の仕様は以下とする
 * <p>
 * 引数：整数
 * <p>
 * 返却：以下の文字列のいずれか
 * 　80点以上：c
 * 　70-79点：良
 * 　60-69点：可
 * 　59点以下：不可
 */

public class Practice005 {
    public static void main(String[] args) {

        Random random = new Random();

        for(int i = 1 ; i <= 10 ; i++) {
            int score = random.nextInt(100);
            // ここはご自由にお使いください
            System.out.println(score);
            System.out.println(showResult(score));
        }


    }

    // 試験の結果を返却する
    public static String showResult(int n) {

        if (n >= 80) return "優";
        else if (n >= 70) return "良";
        else if (n >= 60) return "良";
        else return "不可";

    }

}
