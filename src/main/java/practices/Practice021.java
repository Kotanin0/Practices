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
        System.out.println(janken());
        // ここはご自由にお使いください
    }

    public static String janken() {

        //変数定義

        int guu = 0;
        int choki = 0;
        int pa = 0;

        int x = 0;
        double heikin = 0.0;

        int n = 1;
        int j = 0;

        double guuheikin = 0.0;
        double chokiheikin = 0.0;
        double paheikin = 0.0;

        //じゃんけんをやらせて、全体の平均が10％やってもらう。

        do{

            //じゃんけんを開始

            Random ransu = new Random();
            int[] janken = {0, 1, 2};
            n++;

            guuheikin = (double) guu / n;
            chokiheikin = (double) choki / n;
            paheikin = (double) pa / n;
            heikin = (guuheikin + chokiheikin + paheikin) / (double) 3;

            //繰り返し

            for (; j < n; j++) {
                x = janken[ransu.nextInt(3)];


                //じゃんけんぶんき

                switch (x) {
                    case 0:
                        guu += 1;
                        break;
                    case 1:
                        choki += 1;
                        break;
                    case 2:
                        pa += 1;
                        break;
                }
            }
        }while(heikin < 0.3);

        return "グー：" + guu + "回（" + guuheikin + "%）\n" + "チョキ：" + choki + "回（" + chokiheikin + "%）\n" + "パー：" + pa + "回（" + paheikin + "%）\n" + "合計：" + n + "回（100%）";
    }
}


