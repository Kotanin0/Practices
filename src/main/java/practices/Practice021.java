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
        janken(); //メイン文でメソッドを呼び出さないと動かない。
    }

    public static String janken() {

        Random rand = new Random();
        String te = "";
        double i = 0;
        int guCount = 0;
        int tyokiCount = 0;
        int paCount = 0;
        String kotae = "";
        String br = System.getProperty("line.separator");

        while (i <= 999) {
            int ransuu = rand.nextInt(3);
            switch (ransuu) {
                case 0://グーの時
                    guCount++;
                    break;
                case 1://チョキの時
                    tyokiCount++;
                    break;
                case 2://パーの時
                    paCount++;
                    break;
            }
            i++;
        }
        System.out.println(kotae = "グー：" + guCount + "回  " + Math.round(guCount / i * 100) + "％" + br
                + "チョキ：" + tyokiCount + "回　" + Math.round(tyokiCount / i * 100) + "％" + br
                + "パー：" + paCount + "回　" + Math.round(paCount / i * 100) + "％" + br
                + "合計：" + Math.round(i) + "回 " + Math.round(i / i * 100) + "％");
        return kotae;
    }

}
