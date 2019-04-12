
package practices;

import java.util.Random;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            count += isPrime(i); //100000パターンの数字を渡している。
        }
        long end = System.currentTimeMillis();

        System.out.println("除算回数：" + count + "回");
        System.out.println("処理時間：" + (end - start) + "ms");
    }

    // 素数判定
    public static int isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("引数の値が不正です");
        }
        if (n < 2) return 0;

        int count = 0;
        for (int i = 2; i < n; i++) {
            count++;  //処理をやるたびに1+される。除算をやりきるイメージ。
            if (n % i == 0) {
                return count++;
            }
        }
        return count;
    }
}