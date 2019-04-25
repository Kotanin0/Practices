package practices.janken;

public class JankenTest2 {
    private String name;

    public JankenTest2() {
        this.name = "ロボット2";
    }

    public String getName() {
        return this.name;
    }

    public int declare(){
        return 2;
    }

    public int fight(int declareHand){
        return 2;
    }
}