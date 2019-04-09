package practices;

import java.util.List;
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
        for(int i = 1; i <= 10; i++) {
            System.out.println("----" + i + "回目----");
            System.out.println(janken());
        }
        //テスコトード judgeThirtypPercent
        /*
        int judgeThirtypPercent1[] = {3,3,3};
        System.out.println("falseが返ってきてほしい →" + judgeThirtypPercent(judgeThirtypPercent1));
        int judgeThirtypPercent2[] = {29,29,42};
        System.out.println("trueが返ってきてほしい →" + judgeThirtypPercent(judgeThirtypPercent2));
        int judgeThirtypPercent3[] = {0,0,0};
        System.out.println("trueが返ってきてほしい →" + judgeThirtypPercent(judgeThirtypPercent3));
        */
    }

    public static String janken() {
        int[] listJanken = { 0, 0, 0}; //{rock.paper,scissor}
        Random rand = new Random();

        int x;
        while(judgeThirtypPercent(listJanken)){
            x = rand.nextInt(3);
            listJanken[x] += 1;
        }
        return printData(listJanken);
    }

    //それぞれの手がすべて30%台で均等でないとtrueをかえす
    public static boolean judgeThirtypPercent(int[] listJanken){
        int sumListJanken;
        int percentRock;
        int percentPaper;
        int percentScissor;

        sumListJanken = sumJanken(listJanken);
        if(sumListJanken == 0) return true;

        //30%台ということは30%~39%までなので、2桁目が3であるかをみればいい
        percentRock  = listJanken[0] * 10 / sumListJanken;
        percentPaper = listJanken[1] * 10 / sumListJanken;
        percentScissor = listJanken[2] * 10 / sumListJanken;
        if (percentRock == 3 && percentPaper == 3 && percentScissor == 3) {
            return false;
        } else {
            return  true;
        }
    }

    public static int sumJanken(int[] x){
        int returnSum = 0;
        for(int i = 0; i < x.length; i++){
            returnSum += x[i];
        }
        return  returnSum;
    }

    public static String printData(int[] x){
        int sumListJanken = sumJanken(x);
        String br = System.getProperty("line.separator");

        return "グー："    + x[0]          + "回（" + (x[0] * 100 / sumListJanken) + "％）" + br +
                "チョキ：" + x[1]          + "回（" + (x[1] * 100 / sumListJanken) + "％）" + br +
                "パー："   + x[1]          + "回（" + (x[2] * 100 / sumListJanken) + "％）" + br +
                "合計："   + sumListJanken + "回（" + 100                          + "％）";
    }
}
