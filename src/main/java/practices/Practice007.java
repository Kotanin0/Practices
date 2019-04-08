package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int number = 3;
        if(isPrime(number)){
            System.out.println("素数です");
        }else{
            System.out.println("素数ではありません");
        }
    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("不正な引数です");
        }

        if (n <= 1) {
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
