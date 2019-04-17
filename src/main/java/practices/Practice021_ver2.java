package practices;

import java.util.Random;

/**
 * ランダムで「グー」「チョキ」「パー」のいずれかを出力する関数
 * janken
 * を作成しなさい
 *
 * また、作成したjankenメソッドの実行結果として、それぞれの手がすべて30%台で均等になるまで
 * 関数を実行し、その実行回数とそれぞれの手の回数、確率を出力しなさい
 *
 * 出力例）
 * グー：N回（M%）
 * チョキ：N回（M%）
 * パー：N回（M%）
 * 合計：N回（100%）
 *
 */

public class Practice021_ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(janken());
    }

    public static String janken() {
        int guCount = 0; int choCount = 0 ; int paCount = 0;
        Random random = new Random();
        double count=0 ; double rJ ;
        double guRatio = 0   ; double choRatio = 0  ;double paRatio =0 ;
        while(!(isRange(guRatio) && isRange(choRatio) && isRange(paRatio) )) {
            count++;
            rJ = random.nextInt(3);
            if (rJ == 0) {
                guCount += 1;
            } else if (rJ == 1) {
                choCount += 1;
            } else {
                paCount += 1;
            }
            guRatio = guCount / count;
            choRatio = choCount / count;
            paRatio = paCount / count;
        }

        int totalRatioPrint = (int)(count/count * 100);
        return "グー：" + guCount+ "回"+ " (" + Math.round(guRatio * 100) + "%) \r\n" + "チョキ：" + choCount+ "回"+ " (" + Math.round(choRatio * 100) + "%) \r\n" + "パー：" + paCount+ "回"+ " (" + Math.round(paRatio*100) + "%) \r\n"+"合計：" + Math.round(count) + "回"+ " (" + totalRatioPrint + "%) ";
    }

    public static boolean isRange(double ratio){
        return 0.3 <= ratio && 0.4 > ratio;
    }


}
