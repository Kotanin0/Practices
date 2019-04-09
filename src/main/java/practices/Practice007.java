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

    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("");
        } else if (n == 1) {
            return false;
        } else {
            // nを 整数：2からround(n/2)まで 割っていく
            // nの半分まで割って割り切れれば、何かの倍数（false）
            // 一度も割り切れなければ奇数（true）
            int m = Math.round(n / 2);
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}