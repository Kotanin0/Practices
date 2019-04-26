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
 * ・3回連続宣言通りに手を出さなかったら、-100点
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
    //宣言を裏切った情報( [ プレイヤー ][ 回数 ] ) 過去三回分の結果だけを常に保存していく
    private static int[][] arrayPlayersLiar = new int[2][3];

    public static void main(String[] args) {
        //インスタンス
        JankenTest1 player1 = new JankenTest1();
        JankenTest2 player2 = new JankenTest2();

        //宣言の手
        int[] declareHands;
        //勝負の手
        int[] playHands;
        //得点
        int[] sumPointPlayers = new int[2];
        int[] temp;

        for (int i = 0; i < 100; i++) {
            //宣言する
            declareHands = declare(player1, player2);

            //勝負する
            playHands = fight(player1, player2, declareHands);

            //裏切り判定
            temp = liar(declareHands, playHands, i);
            for (int j = 0; j < temp.length; j++) {
                sumPointPlayers[j] += temp[j];
            }

            //得点
            temp = judge(declareHands, playHands,player1,player2);
            for (int j = 0; j < temp.length; j++) {
                sumPointPlayers[j] += temp[j];
            }
        }

        System.out.println(player1.getName() + "の得点は" + sumPointPlayers[0] + "点です");
        System.out.println(player2.getName() + "の得点は" + sumPointPlayers[1] + "点です");

    }

    public static int[] liar(int[] declareHands, int[] playHands, int i) {
        int[] returnInt = new int[2];
        for (int j = 0; j < 2; j++) {
            //宣言した手を裏切ったかどうかを、ベルトコンベアのように格納していく
            arrayPlayersLiar[j][i % 3] = declareHands[j] == playHands[j] ? 0 : 1;

            //3回連続で裏切った場合
            if (Arrays.stream(arrayPlayersLiar[j]).sum() == 3) {
                returnInt[j] += -100;
            }
        }

        return returnInt;
    }

    public static int[] declare(JankenMan player1, JankenMan player2) {
        int[] returnInt = new int[2];

        returnInt[0] = player1.declare();
        returnInt[1] = player2.declare();

        return returnInt;
    }

    public static int[] fight(JankenMan player1, JankenMan player2, int[] declareArray) {
        int[] returnInt = new int[2];

        returnInt[0] = player1.fight(declareArray[1]);
        returnInt[1] = player2.fight(declareArray[0]);

        return returnInt;
    }

    //得点をかえす
    //得点をかえす、JankenManにも勝敗をかえす

    public static int[] judge(int[] declareHands, int[] playHands, JankenMan player1, JankenMan player2) {
        int[] returnInt = new int[2];

        if (declareHands.length != 2 || playHands.length != 2) {
            return returnInt;
        }

        for (int i = 0; i < 2; i++) {
            if (declareHands[i] > 2 || declareHands[i] > 2){
                return returnInt;
            }
            if (declareHands[i] < 0 || declareHands[i] < 0){
                return returnInt;
            }
        }

        int judgeWinner = judgeWinner(playHands[0], playHands[1]);

        switch (judgeWinner) {
            case 0://あいこ
                returnInt[0] += declareHands[0] == playHands[0] ? 1 : -1;
                returnInt[1] += declareHands[1] == playHands[1] ? 1 : -1;
                player1.result("あいこ");
                player2.result("あいこ");
                break;
            case 1://player1の勝ち
                returnInt[0] += declareHands[0] == playHands[0] ? 5 : 3;
                returnInt[1] += declareHands[1] == playHands[1] ? -3 : -5;
                player1.result("勝ち");
                player2.result("負け");
                break;
            case 2://player2の勝ち
                returnInt[0] += declareHands[0] == playHands[0] ? -3 : -5;
                returnInt[1] += declareHands[1] == playHands[1] ? 5 : 3;
                player1.result("負け");
                player2.result("勝ち");
                break;
        }

        return returnInt;

    }

    public static boolean isHandBetweenZeroToToo(int n) {
        return (n < 0 || 2 < n);
    }

    //0->あいこ 1->1つめに引数側の勝ち 2->2つめの引数側の勝ち
    public static int judgeWinner(int hand1, int hand2) {
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
