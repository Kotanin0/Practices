package practices.janken;

import java.util.Arrays;
import java.util.Random;

public class JankenMiyamae extends JankenMan {
    Random random = new Random();

    //自分の手
    private static int myDeclareHand;
    private static int myPlayHand;
    private static WinOrLossHand winOrLossHand;

    //自分の手
    private static int yourDeclareHand;
    private static int yourPlayHand;

    //直近2回、宣言を裏切ったか？
    private static int[] myArrayLiar = new int[2];
    private static int[] yourArrayLiar = new int[2];

    //じゃんけんした回数
    private static int playCount = -1;

    public JankenMiyamae() {
        super("宮前");// <- 自分の名前をいれる
    }

    public int declare() {
        playCount++;
        myDeclareHand = random.nextInt(3);
        return myDeclareHand;
    }

    public int fight(int declareHand) {
        yourDeclareHand = declareHand;
        winOrLossHand = new WinOrLossHand();
        //なにを出すと(勝ち|負け|あいこ)？
        winOrLossHand.setWinOrLossHand(declareHand);
        myPlayHand = winOrLossHand.win;

        //自分の宣言を裏切る手か？
        myArrayLiar[playCount % 2] = myDeclareHand == myPlayHand ? 0 : 1;
        if(Arrays.stream(myArrayLiar).sum() ==2){
            myPlayHand = myDeclareHand;
        }

        return myPlayHand;
    }

    public void result(String win) {
        winOrLossHand.setWinOrLossHand(myDeclareHand);
        switch (win) {
            case "勝ち":
                //相手の手はなんだったか
                yourPlayHand = winOrLossHand.loss;
                break;
            case "負け":
                yourPlayHand = winOrLossHand.win;
                break;
            case "あいこ":
                yourPlayHand = winOrLossHand.draw;
                break;
        }
    }

    //相手の宣言に対して、なにを出すと(勝ち|負け|あいこ)？
    class WinOrLossHand {
        int win;
        int draw;
        int loss;

        public void setWinOrLossHand(int hand1) {
            switch (hand1) {
                case 0://グー
                    this.win = 2;//パーで勝つ
                    this.draw = 0;//グーであいこ
                    this.loss = 1;//チョキで負ける
                    break;
                case 1:
                    this.win = 0;
                    this.draw = 1;
                    this.loss = 2;
                    break;
                case 2:
                    this.win = 1;
                    this.draw = 2;
                    this.loss = 0;
                    break;
            }
        }
    }
}
