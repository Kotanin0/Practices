package practices.janken;

import java.util.Arrays;

/**
 * 宣言じゃんけん
 * １：「何をだすか（グーorチョキorパー）」を宣言します。
 * ２：宣言された手を参考に、じゃんけんで何を出すかを考えます。
 * ３：手を出して、勝敗をつけます。
 * <p>
 * 得点：
 * ・宣言通りの手で勝った -> 5点
 * 　ex.「グーを出す」と宣言して、本当に「グー」を出して勝った
 * ・宣言通りの手で負けた -> -3点
 * 　ex.「グーを出す」と宣言して、本当に「グー」を出したが負けた
 * ・宣言通りの手であいこ -> 1点
 * 　ex.「グーを出す」と宣言して、本当に「グー」を出してあいこ
 * ・宣言しなかった手で勝った -> 3点
 * 　ex.「グーを出す」と宣言して、裏切って「パー」を出して勝った
 * ・宣言しなかった手で負けた -> -5点
 * 　ex.「グーを出す」と宣言して、裏切って「パー」を出して負けた
 * ・宣言しなかった手であいこ -> -1点
 * 　ex.「グーを出す」と宣言して、裏切って「パー」を出してあいこ
 *・3回連続宣言通りに手を出さなかったら、-100点
 * <p>
 * 引数と返り値：
 * グー   -> int 0
 * チョキ -> int 1
 * パー   -> int 2
 * とする。
 * クラスのつくりかた：
 * JankenTest1を参考に、JankenManを継承して、Janken<名前>というクラスを自分で作成します。ex.JankenMiyamae
 */

public class Practice201 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        //インスタンス
        JankenTest1 player1 = new JankenTest1();
        JankenTest2 player2 = new JankenTest2();

        //宣言の手
        int declareHandPlayer1;
        int declareHandPlayer2;
        //勝負の手
        int playHandPlayer1;
        int playHandPlayer2;
        //得点
        int sumPointPlayer1 = 0;
        int sumPointPlayer2 = 0;
        //勝敗
        int judgeWinner;
        //宣言を裏切った情報を保存
        int loop = 0;
        int[] loopPlayer1 = new int[3];
        int[] loopPlayer2 = new int[3];

        for (int i = 0; i < 100; i++) {
            //宣言する
            declareHandPlayer1 = player1.declare();
            declareHandPlayer2 = player2.declare();
            if (isHandBetweenZeroToToo(declareHandPlayer1)) {
                System.out.println(player1.getName() + "の宣言の手が不正です");
                break;
            }
            if (isHandBetweenZeroToToo(declareHandPlayer2)) {
                System.out.println(player2.getName() + "の宣言の手が不正です");
                break;
            }

            //勝負する
            playHandPlayer1 = player1.fight(declareHandPlayer2);
            playHandPlayer2 = player2.fight(declareHandPlayer1);
            if (isHandBetweenZeroToToo(playHandPlayer1)) {
                System.out.println(player1.getName() + "の勝負の手が不正です");
                break;
            }
            if (isHandBetweenZeroToToo(playHandPlayer2)) {
                System.out.println(player2.getName() + "の勝負の手が不正です");
                break;
            }

            //宣言を裏切った？
            loopPlayer1[loop] = declareHandPlayer1 == playHandPlayer1 ? 0 : 1;
            loopPlayer2[loop++] = declareHandPlayer2 == playHandPlayer2 ? 0 : 1;
            if (Arrays.stream(loopPlayer1).sum() == 3) {
                sumPointPlayer1 += -100;
            }
            if (Arrays.stream(loopPlayer2).sum() == 3) {
                sumPointPlayer2 += -100;
            }
            if (loop > 2) {
                loop = 0;
            }

            //得点をつける
            judgeWinner = judge(playHandPlayer1, playHandPlayer2);
            switch (judgeWinner) {
                case 0://あいこ
                    sumPointPlayer1 += declareHandPlayer1 == playHandPlayer1 ? 1 : -1;
                    sumPointPlayer2 += declareHandPlayer2 == playHandPlayer2 ? 1 : -1;
                    break;
                case 1://player1の勝ち
                    sumPointPlayer1 += declareHandPlayer1 == playHandPlayer1 ? 5 : 3;
                    sumPointPlayer2 += declareHandPlayer2 == playHandPlayer2 ? -3 : -5;
                    break;
                case 2://player2の勝ち
                    sumPointPlayer1 += declareHandPlayer1 == playHandPlayer1 ? -3 : -5;
                    sumPointPlayer2 += declareHandPlayer2 == playHandPlayer2 ? 5 : 3;
                    break;
            }
        }

        System.out.println(player1.getName() + "の点数は" + sumPointPlayer1 + "です");
        System.out.println(player2.getName() + "の点数は" + sumPointPlayer2 + "です");
        if (sumPointPlayer1 > sumPointPlayer2) {
            System.out.println(player1.getName() + "の勝ちです");
        } else if (sumPointPlayer2 > sumPointPlayer1) {
            System.out.println(player2.getName() + "の勝ちです");
        } else {
            System.out.println("勝敗がつきませんでした");
        }
    }

    public static boolean isHandBetweenZeroToToo(int n) {
        return (n < 0 || 2 < n);
    }

    //0->あいこ 1->1つめに引数側の勝ち 2->2つめの引数側の勝ち
    public static int judge(int hand1, int hand2) {
        if (hand1 == hand2) return 0;

        if (hand1 == 0) {//hand1がグーなら
            return hand2 == 1 ? 1 : 2;
        }
        if (hand1 == 1) {//hand1がチョキなら
            return hand2 == 2 ? 1 : 2;
        }
        if (hand1 == 2) {//hand1がパーなら
            return hand2 == 0 ? 1 : 2;
        }
        return 3;
    }
}
