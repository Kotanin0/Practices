package practices;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        int time = 0;
        int i;
        // 処理前の時刻を取得
        long start = System.currentTimeMillis();
        // 時間計測をしたい処理
        for (i = 1; i < 100000; i++) {
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
        if (n <= 2) return 0;

        int count = 0;
        int i;
        for (i = 2; i < Math.sqrt(n); i++) { //平方根を得る
            count++;
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }
}

