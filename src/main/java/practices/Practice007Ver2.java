package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007Ver2 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(isPrime(113));
    }

    // 素数判定
    public static boolean isPrime(int n) {
        if(n < 1) throw new IllegalArgumentException("引数の値が不正です");
        if(n == 1 || n % 2 == 0) return false; //2の倍数は先にfalseを返す
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
