package practices;

import java.math.BigDecimal;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 * <p>
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {

    public static void main(String[] args) {
        System.out.println(isPrime(2));

    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        // 2は素数
        if (n == 2) return true;
        // 1と偶数は素数じゃない
        if (n == 1 || n % 2 == 0) return false;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
