package practices;
import java.util.Random;
import java.lang.Math;

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

public class Practice021 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        janken();
    }

    public static String janken() {
        int guCount = 0; int choCount = 0 ; int paCount = 0;
//        double totalCount = 0;
        Random random = new Random();
        double count;
        double rJ ;
        double guRatio = 0; double choRatio = 0;double paRatio = 0;
        for(count = 1; count < 100000 ; count++ ) {
            rJ = random.nextInt(3);
            System.out.print("じゃんけん" + (int)count + "回目：");
            if (rJ == 0) {
                System.out.println("グー");
                guCount += 1;
                //totalCount += 1;
            } else if (rJ == 1) {
                System.out.println("チョキ");
                choCount += 1;
                //totalCount += 1;
            } else {
                System.out.println("パー");
                paCount += 1;
                //totalCount += 1;
            }
            guRatio = guCount / count;
            choRatio = choCount / count;
            paRatio = paCount / count;
            if((guRatio >= 0.3 && guRatio < 0.4) && (choRatio >= 0.3 && choRatio < 0.4) && (paRatio >= 0.3 && paRatio < 0.4)) break;

        }

        int totalRatioPrint = (int)(count/count * 100);
        System.out.println("グー：" + guCount+ "回"+ " (" + Math.round(guRatio * 100) + "%) ");
        System.out.println("チョキ：" + choCount+ "回"+ " (" + Math.round(choRatio * 100) + "%) ");
        System.out.println("パー：" + paCount+ "回"+ " (" + Math.round(paRatio*100) + "%) ");
        System.out.println("合計：" + Math.round(count) + "回"+ " (" + totalRatioPrint + "%) ");

        return "";
    }

}
