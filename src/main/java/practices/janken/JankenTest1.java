package practices.janken;

public class JankenTest1 {
    private String name;

    public JankenTest1() {
        this.name = "ロボット2";// <- 自分の名前をいれる
    }

    public String getName() {
        return this.name;
    }

    //宣言する手を返す（中身は自由に変更してよい）
    public int declare(){
        return 2;//常にパーを返す
    }

    //相手の宣言の手を引数に、勝負する手を返す（中身は自由に変更してよい）
    public int fight(int declareHand){
        return 1;//常にチョキを返す
    }
}
