package practices;

import java.util.Random;

/**
 * ランダムで「グー」「チョキ」「パー」のいずれかを出力する関数
 * janken
 * を作成しなさい
 * <p>
 * また、作成したjankenメソッドの実行結果として、
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
        System.out.println(janken(100));
    }

    public static String janken(int n) {
        String[] hands = {"グー", "チョキ", "パー"};
        Random r = new Random();
        int[] count = {0, 0, 0};

        String jankenResult = "";
        int[] probability = {0, 0, 0};
        n = 1;

        while ((( probability[0]  < 30 || probability[0] > 39) || (probability[1] < 30 || probability[1] > 39) || (probability[2] < 30 || probability[2] > 39))) {
            String hand = hands[r.nextInt(3)];
            if (hand == hands[0]) {
                count[0]++;
                probability[0] = count[0] * 100 / n;
                probability[1] = count[1] * 100 / n;
                probability[2] = count[2] * 100 / n;
                n = n + 1;//++でかけるよ、かけるけどいまはこのままで
            } else if (hand == hands[1]) {
                count[1]++;
                probability[0] = count[0] * 100 / n;
                probability[1] = count[1] * 100 / n;
                probability[2] = count[2] * 100 / n;
                n = n + 1;
            } else if (hand == hands[2]) {
                count[2]++;
                probability[0] = count[0] * 100 / n;
                probability[1] = count[1] * 100 / n;
                probability[2] = count[2] * 100 / n;
                n = n + 1;
            }
        }

        String br = System.getProperty("line.separator");

        for (int j = 0; j < hands.length; j++) {
            jankenResult
                    = hands[0] + ":" + count[0] + "回（" + probability[0] + "%）" + br
                    + hands[1] + ":" + count[1] + "回（" + probability[1] + "%）" + br
                    + hands[2] + ":" + count[2] + "回（" + probability[2] + "%）";
        }
        return jankenResult;
    }
}

//        for (int i = 1; i <= n; i++) {
//                String hand = hands[r.nextInt(3)];
//                if (hand == hands[0]) {
//                count[0]++;
//                } else if(hand == hands[1]){
//                count[1]++;
//                } else if(hand == hands[2]){
//                count[2]++;
//                }
//                }
