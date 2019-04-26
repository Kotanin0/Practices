package practices;

import java.util.Random;
import java.lang.Math;

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
        //janken();
    }

    public static String janken() {

        int rock = 0;
        int paper = 0;
        int scissors = 0;

        //割合を出す用
        double rockCount = 0;
        double paperCount = 0;
        double scissorsCount = 0;

        Random random = new Random();

        //均等に振り分けられるか確認
        int x;
        for (double i = 1; i <= 1000; i++) {
            x = random.nextInt(3);
            if (x == 0) {
                rock++;
            }if (x == 1) {
                paper++;
            }if (x == 2) {
                scissors++;
            }

            rockCount = rock / i*100;
            paperCount = paper / i*100;
            scissorsCount = scissors / i*100;
            //30%台の確認
            if ((rockCount <= 0.3 && rockCount > 0.4) && (paperCount <= 0.3 && paperCount > 0.4) && (scissorsCount <= 0.3 && scissorsCount > 0.4))
                break;

        }

        //改行とトータルの値をいれる
        String br = System.getProperty("line.separator");
        int total = rock + paper + scissors;
        double totalCount = rockCount + paperCount + scissorsCount;

        System.out.println("グー：" + rock + "回" + "（" + Math.round(rockCount) + "%）" + br
                + "チョキ：" + paper + "回" + "（" + Math.round(paperCount) + "%）" + br
                + "パー：" + scissors + "回" + "（" + Math.round(scissorsCount) + "%）" + br
                + "合計:" + total + "回" + "（" + Math.round(totalCount) + "%）");
        return "";
    }

}

