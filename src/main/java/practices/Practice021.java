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
        Random random = new Random();
        int jk[] = new int[3]; // じゃんけん結果
        int jkPer[] = new int[3]; // 実行確率（％、整数値）
        int i = 0; // 試行回数
        int n = 10000; // 試行上限
        boolean noEven = false; // 均等にならない
        int jkNow;
        while (jkPer[0] < 30 || jkPer[1] < 30 || jkPer[2] < 30) {
            i++;
            jkNow = random.nextInt(n) % 3;
            jk[jkNow] += 1;
            jkPer[0] = jk[0] * 100 / i;
            jkPer[1] = jk[1] * 100 / i;
            jkPer[2] = jk[2] * 100 / i;
            // 10,000回やってダメだったら、終わらせて結果発表に移る
            if (i == n) {
                noEven = true;
                break;
            }
        }

        String result = "";
        String jkWord[] = {"グー", "チョキ", "パー"};
        String br = System.getProperty("line.separator"); // 改行コード指定

        if (noEven) result += "試行回数の上限に達しましたが、結果が均等になりませんでした";

        for (int j = 0; j < 3; j++) {
            result += jkWord[j] + "：" + jk[j] + "回（" + jkPer[j] + "％）" + br;
        }
        result += "合計：" + i + "回（100％）";

        System.out.println(result);

        return result;
    }

}
