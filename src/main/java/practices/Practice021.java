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
            int te1 = random.nextInt(3);
            //System.out.println(te1);
            if (te1 == 0) {
                guCount++;
                totalCount++;
            }
            if (te1 == 1) {
                choCount++;
                totalCount++;
            }
            if (te1 == 2) {
                paCount++;
                totalCount++;
            }
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

//じゃんけんするとき
//int p2;
//if (te1 == 0 && te2 == 0) {
//guCount = guCount + 2;
//totalCount = totalCount + 2;
//if (te1 == 1 && te2 == 1) {
//chokiCount = chokiCount + 2;
//totalCount = totalCount + 2;

//if (te1 == 2 && te2 == 2) {
//paCount = paCount + 2;
//totalCount = totalCount + 2;
//int te2 = random.nextInt(3);
//        switch (te2) {
//            case 0:
//                p2 = gu;
//                break;
//            case 1:
//                p2 = choki;
//                break;
//            case 2:
//                p2 = pa;
//                break;
//        }