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
 * チョキ：N回（M%）
 * パー：N回（M%）
 * 合計：N回（100%）
 */

public class Practice021 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int rock = 0;
        int scissors = 0;
        int paper = 0;
        double persentRock = 0;
        double persentScissors = 0;
        double persentPaper = 0;
        for (double i = 1; i <= 1000; i++) {
            String jankenlist = janken();
            if (jankenlist.equals("グー")) {
                rock++;
            } else if (jankenlist.equals("チョキ")) {
                scissors++;
            } else {
                paper++;
            }//各種30~39%で抜けて出力するようにする
            persentRock = rock / i;
            persentScissors = scissors / i;
            persentPaper = paper / i;
            if (persentRock >= 0.3 && persentRock < 0.4 && persentScissors >= 0.3 && persentScissors < 0.4 && persentPaper >= 0.3 && persentPaper < 0.4)
                break;
        }

        int sumjanken = rock + scissors + paper;
        double persentJanken = persentRock + persentScissors + persentPaper;

        System.out.println("グー：" + rock + "回" + Math.round(persentRock * 100) + "%");
        System.out.println("チョキ：" + scissors + "回" + Math.round(persentScissors * 100) + "%");
        System.out.println("パー：" + paper + "回" + Math.round(persentPaper * 100) + "%");
        System.out.println("合計" + sumjanken + "回" + Math.round(persentJanken * 100) + "%");
    }


    public static String janken() {
        Random random = new Random();//ランダムインスタンス設定。
        String[] hands = {"グー", "チョキ", "パー"}; //"グー","チョキ", "パー"
        String hand = hands[random.nextInt(3)];
        return hand;
    }


}

