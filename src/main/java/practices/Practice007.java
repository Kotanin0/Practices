package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {
    public static long count = 0;

    public static void main(String[] args) {

        System.out.println(isPrime(2));

        // ここはご自由にお使いください

    }

    // 素数判定
    public static boolean isPrime(int n) {

        if(n < 1){
            throw new IllegalArgumentException("引数の値が不正です");
        }

        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int isPrimeForPractice22(int n) {

        if(n < 1){
            throw new IllegalArgumentException("引数の値が不正です");
        }

        if (n == 1) return 0;
        int count = 0;
        for (int i=2 ; i < (n/2); i++) {
            count ++;
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }

}
