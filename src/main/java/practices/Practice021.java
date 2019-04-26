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
    public static void main(String[] args) {
        // ここはご自由にお使いください
        janken();
        System.out.println(janken());
    }

    public static String janken() {
        //int gu = 0;
        //int choki = 1;
        //int pa = 2;
        int guCount = 0;
        int choCount = 0;
        int paCount = 0;
        //int型にすると、無限ループ（答えはdoubleでほしいからint/intは×、int/double）
        double totalCount = 0;
        double guAnswer = 0;
        double paAnswer = 0;
        double choAnswer = 0;

        while ((30 > guAnswer || guAnswer >= 40) || (30 > paAnswer || paAnswer >= 40) || (30 > choAnswer || choAnswer >= 40)) {
            Random random = new Random();
            int hand = random.nextInt(3);
            if (hand == 0) guCount++;
            if (hand == 1) choCount++;
            if (hand == 2) paCount++;
            totalCount++;
            guAnswer = guCount / totalCount * 100;
            choAnswer = choCount / totalCount * 100;
            paAnswer = paCount / totalCount * 100;
            System.out.println(guCount);
            System.out.println(choCount);
            System.out.println(paCount);
        }
        System.out.println("グー：" + guCount + "回" + "（" + Math.round(guAnswer) + "%）"
                + "チョキ：" + choCount + "回" + "（" + Math.round(choAnswer) + "%）"
                + "パー：" + paCount + "回" + "（" + Math.round(paAnswer) + "%）"
                + "合計:" + totalCount + "回" + "(100%)");
        return " ";
    }
}