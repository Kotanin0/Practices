package practices;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {

        //計測時間のsjの略

        long start = System.nanoTime();
        for (int j = 0; j <= 100000; j++) {
            isPrime(10);
        }
        long end = System.nanoTime();
        System.out.println("練習22の処理時間" + ((end - start) / 1000) + "ms");

        // ここはご自由にお使いください
    }

    public static boolean isPrime(int n) {

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