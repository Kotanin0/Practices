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
 * チョキ：：N回（M%）
 * パー：：N回（M%）
 * 合計：N回（100%）
 *
 */

public class Practice021 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        //countして、それぞれ全体に対するカウント率が30%台になったらループ終了→whileでそれぞれ非30%を処理実行条件に？
        System.out.println(janken());
    }

    public static String janken() {

        int rockCount = 0;
        int scissorsCount = 0;
        int paperCount = 0;
        String br = System.getProperty("line.separator");
        double total =1;

        //最初はwhile文の中に入れず、下記だけにセットしていたため、それぞれの平均変数には値が反映されず悩んでいた
        double rockAve = 0;
        double scissorsAve = 0;
        double paperAve = 0;
        double totalAverage = 0;
        Random r = new Random();

            //それぞれが30%台で均等になるまで試行継続=30%台でない場合は処理継続
            while (( 0.3 > rockAve || rockAve >= 0.4 ) || ( 0.3 > scissorsAve || scissorsAve >= 0.4 ) || ( 0.3 > paperAve || paperAve >= 0.4 )){

        int ran = r.nextInt(3);
                switch (ran) {
                    case 0:
                        rockCount++;
                        break;
                    case 1:
                        scissorsCount++;
                        break;
                    case 2:
                        paperCount++;
                        break;
                    default:
                        break;
                }
                total++;
                rockAve = rockCount / total;
                scissorsAve = scissorsCount / total;
                paperAve = paperCount / total;
                totalAverage = ( rockAve + scissorsAve + paperAve) / 3;

        } return "グー：" + rockCount + "回" + "("+ Math.round(100 * rockAve) +"%)" + br
                 + "チョキ：" + scissorsCount + "回" + "("+ Math.round(100 * scissorsAve) +"%)" + br
                 + "パー：" + paperCount + "回" + "("+ Math.round(100 * paperAve) +"%)" + br
                 + "合計" + Math.round(total) + "回"+ "("+ Math.round(100 * totalAverage) +"%)" ;
    }
}







