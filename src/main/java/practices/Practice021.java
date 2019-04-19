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
        double totalCount = 0;
        int guCount = 0;
        int tyokiCount = 0;
        int paCount = 0;
        String result = "";
        String br = System.getProperty("line.separator");

        while ((30 > Math.round(guCount / totalCount * 100) || 39 < Math.round(guCount / totalCount * 100))
                || (30 > Math.round(tyokiCount / totalCount * 100) || 39 < Math.round(tyokiCount / totalCount * 100))
                || (30 > Math.round(paCount / totalCount * 100) || 39 < Math.round(paCount / totalCount * 100))) {

            int ransuu = rand.nextInt(3);
            switch (ransuu) {
                case 0://グーの時
                    guCount++;
                    totalCount++;
                    break;
                case 1://チョキの時
                    tyokiCount++;
                    totalCount++;
                    break;
                case 2://パーの時
                    paCount++;
                    totalCount++;
                    break;
            }

        }
        System.out.println(result = "グー：" + guCount + "回  " + Math.round(guCount / totalCount * 100) + "％" + br
                + "チョキ：" + tyokiCount + "回　" + Math.round(tyokiCount / totalCount * 100) + "％" + br
                + "パー：" + paCount + "回　" + Math.round(paCount / totalCount * 100) + "％" + br
                + "合計：" + Math.round(totalCount) + "回 " + Math.round(totalCount / totalCount * 100) + "％");
        return result;
    }

}
