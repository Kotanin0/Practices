package practices.janken;

abstract class JankenMan {
    private String name;

    public JankenMan(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //宣言する手を返す
    public abstract int declare();

    //勝負する手を返す(引数:相手の宣言)
    public abstract int fight(int declareHand);

    //勝負に勝ったか負けたか返ってくる(引数："勝ち","負け","あいこ")
    public abstract void result(String winOrLoss);
}

