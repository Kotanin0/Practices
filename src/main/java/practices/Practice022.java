package practices;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        int time = 0;
        // 処理前の時刻を取得
        long start = System.currentTimeMillis();
        // 時間計測をしたい処理
        for (int i = 1; i < 100000; i++) {
            time += isPrime(i);
        }
        // 処理後の時間を取得
        long end = System.currentTimeMillis();
        System.out.println("処理時間" + (end - start) + "ms");
    }

    public static int isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("例外処理");
        }
        if (n < 2) return 0;

        int count = 0;
        for (int i = 2; i < n; i++) {
            count++;
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }
}