package practices.janken;

import java.util.Random;

public class JankenTest2 extends JankenMan{

    public JankenTest2() {
        super("ロボット2");//<- 自分の名前をいれる
    }

    //宣言する手を返す（中身は自由に変更してよい）
    public int declare(){
        //常に「グー」と宣言しておく
        return 0;
    }

    //相手の宣言の手を引数に、勝負する手を返す（中身は自由に変更してよい）
    public int fight(int declareHand){
        Random rand = new Random();
        //適当に手を出す
        return rand.nextInt(3);
    }

    public void result(String win){
    }
}