package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {
    public static void main(String[] args) {
    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i=3; i<n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
