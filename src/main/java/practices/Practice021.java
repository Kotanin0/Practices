package practices;

import java.util.Random;

/**
 * ランダムで「グー」「チョキ」「パー」のいずれかを出力する関数
 * janken
 * を作成しなさい
 * <p>
 * また、作成したjankenメソッドの実行結果として、それぞれの手がすべて30%台で均等になるまで
 * 関数を実行し、その実行回数とそれぞれの手の回数、確率を出力しなさい
 * <p>
 * 出力例）
 * グー：N回（M%）
 * チョキ：：N回（M%）
 * パー：：N回（M%）
 * 合計：N回（100%）
 */

public class Practice021 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        janken();
    }

    public static String janken() {
        String result = "";
        int goo = 0;
        int cyo = 0;
        int par = 0;
        int n = 1000; // 試行回数
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(99) % 3) {
                case 0:
                    goo += 1;
                    break;
                case 1:
                    cyo += 1;
                    break;
                case 2:
                    par += 1;
                    break;
            }
        }
        String br = System.getProperty("line.separator"); // 改行コード指定
        result = "グー：" + goo + "回（" + goo * 100 / n + "％）" + br
                + "チョキ：" + cyo + "回（" + cyo * 100 / n + "％）" + br
                + "パー：" + par + "回（" + par * 100 / n + "％）" + br
                + "合計：" + n + "回（" + n * 100 / n + "％）";

        System.out.println(result);

        return result;
    }

}
