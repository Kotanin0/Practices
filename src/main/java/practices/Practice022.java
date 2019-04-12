package practices;

import java.util.Random;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        long start = System.currentTimeMillis(); // 処理開始時間

        Random random = new Random();
        int countTotal = 0;

        for (int i = 0; i < 100000; i++) {
            countTotal += isPrime(random.nextInt(10000));
        }

        long end = System.currentTimeMillis(); // 処理終了時間
        System.out.println(countTotal + "回");
        System.out.println((end - start) + "ms");
    }

    public static int isPrime(int n) {
//        if (n < 1) {
//            throw new IllegalArgumentException("");
        if (n <= 1) return 0;

        // nを 整数：2からround(n/2)まで 割っていく
        // nの半分まで割って割り切れれば、何かの倍数（false）
        // 一度も割り切れなければ素数（true）
        int m = Math.round(n / 2);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                return i - 1;
            }
        }
        return m;
    }
}
