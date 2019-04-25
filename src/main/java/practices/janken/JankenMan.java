package practices.janken;

abstract class JankenMan {
    private String name;

    public JankenMan(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int declare();

    public abstract int fight(int declareHand);
}

