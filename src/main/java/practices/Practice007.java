package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 * <p>
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {

    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(isPrime(2));

    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("例外処理だよ");
        }
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
