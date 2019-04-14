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
 * チョキ：：N回（M%）
 * パー：：N回（M%）
 * 合計：N回（100%）
 */

public class Practice021 {
    //　イケてないかもだけどグローバル化
    static int count = 0;
    static int cntRock = 0;
    static int cntPaper = 0;
    static int cntScissors = 0;
    static double rockProbability;
    static double paperProbability;
    static double scissorsProbability;
    static final double thirty = 0.3;

    static final String br = System.getProperty("line.separator");

    public static void main(String[] args) {
        System.out.println(janken());
    }

    public static String janken() {
        //インスタンス
        Random rand = new Random();

        while (!isOverThirty()) {
            int randNum = rand.nextInt(3);
            switch (randNum) {
                case 0:
                    cntRock++;
                    break;
                case 1:
                    cntPaper++;
                    break;
                case 2:
                    cntScissors++;
                    break;
            }
            count++;
        }

        return getResultSentence();
    }

    // 全てが30％を超えているかチェックする
    public static boolean isOverThirty() {
        if (count == 0) return false;

        rockProbability = (double) cntRock / count;
        paperProbability = (double) cntPaper / count;
        scissorsProbability = (double) cntScissors / count;

        return (rockProbability >= thirty &&
                paperProbability >= thirty && scissorsProbability >= thirty);
    }

    // 解答の文を生成
    public static String getResultSentence() {
        String rock = "グー：" + cntRock + "回（" + rockProbability * 100 + "%）" + br;
        String scissors = "チョキ：" + cntScissors + "回（" + scissorsProbability * 100 + "%）" + br;
        String paper = "パー：" + cntPaper + "回（" + paperProbability * 100 + "%）" + br;
        String total = "合計：" + count + "回（100%）";
        return rock + scissors + paper + total;
    }
}
