package practices;

public class NumberExtension {
    private NumberExtension() {
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isOdd(int x) {
        return !isEven(x);
    }

    public static boolean isPositive(int x) {
        return x >= 0;
    }
}