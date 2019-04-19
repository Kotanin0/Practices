package practices;

import java.util.Arrays;
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
        for (int i = 1; i <= 10; i++) {
            System.out.println("----" + i + "回目----");
            System.out.println(janken());
        }
    }

    public static String janken() {
        int[] listJanken = new int[3]; //{rock.paper,scissor}
        Random rand = new Random();

        while (!isJankenThirtypPercent(listJanken)) {
            listJanken[rand.nextInt(3)] += 1;
        }
        int sum = Arrays.stream(listJanken).sum();

        String br = System.getProperty("line.separator");
        return "グー："    + listJanken[0] + "回（" + (listJanken[0] * 100 / sum) + "％）" + br +
                "チョキ：" + listJanken[1] + "回（" + (listJanken[1] * 100 / sum) + "％）" + br +
                "パー："   + listJanken[1] + "回（" + (listJanken[2] * 100 / sum) + "％）" + br +
                "合計："   +           sum + "回（" +                         100 + "％）";
    }

    //それぞれの手がすべて30%台で均等でないとtrueをかえす
    public static boolean isJankenThirtypPercent(int[] listJanken) {
        int sum = Arrays.stream(listJanken).sum();
        if (sum == 0) return false;

        for (int x : listJanken) {
            if (x * 10 / sum != 3) return false;
        }
        return true;
    }
}
