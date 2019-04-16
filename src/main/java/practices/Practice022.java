package practices;

import static practices.Practice007.isPrime;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {

        // ここはご自由にお使いください
        long startTime = System.currentTimeMillis();

        int i =0;

        for (int k = 0; k < 100000; k++) {

            isPrime(k);

            i += 1;
        }

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();

        System.out.println("徐算回数：" + i + "回");
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }

}



