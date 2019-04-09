package practices;

import java.util.Random;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int[] randomArray = new int[100000];
        Random rand = new Random();

        //乱数配列生成 おなじ乱数を使用したので、いったん配列にいれる
        for (int i = 0; i < 100000; i++) {
            randomArray[i] = rand.nextInt(9999) + 1;
        }

        //Practice022のisPrime実行時間
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Practice022.isPrime(randomArray[i]);
        }
        long end = System.currentTimeMillis();
        System.out.println("処理時間(Practice022)：" + (end - start) + "ms");

        //Practice023のisPrime実行時間
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            isPrime(randomArray[i]);
        }
        end = System.currentTimeMillis();
        System.out.println("処理時間(Practice023)：" + (end - start) + "ms");

    }

    // 素数判定
    public static boolean isPrime(int n) {
        if ((n > 2 && n % 2 == 0) || n == 1) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
