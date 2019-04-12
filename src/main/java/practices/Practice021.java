package practices;

import javax.print.DocFlavor;
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

        //

        System.out.println(janken());


        // ここはご自由にお使いください
    }

    public static String janken() {

        int n = 15000;
        Random ransu = new Random();
        String[] janken = {"ぐー", "ちょき", "ぱー"};

        int guu = 0;
        int choki = 0;
        int pa = 0;

        String x = "";
        double heikin =0.0;

        if(heikin < 0.3){
            for (int i = 0; i < n; i++) {
                x = janken[ransu.nextInt(3)];
                if (x == "ぐー") {
                    guu += 1;
                }
                if (x == "ちょき") {
                    choki += 1;
                }
                if (x == "ぱー") {
                    pa += 1;
                }
            }
        }

        double guuheikin = (double) guu / n;
        double chokiheikin = (double) choki / n;
        double paheikin = (double) pa / n;
        heikin = (guuheikin + chokiheikin + paheikin) / (double)3;

        return "グー："+ guu +"回（"+guuheikin +"%）\n" + "チョキ："+ choki +"回（"+chokiheikin +"%）\n" + "パー："+ pa +"回（"+paheikin +"%）\n" + "合計："+ n +"回（100%）";

    }

}
