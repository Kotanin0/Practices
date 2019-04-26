package practices;

import static practices.Practice007.isPrime;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        long startTime = System.currentTimeMillis();

        int i = 0;

        for (int k = 0; k < 100000; k++) {

            isPrime(k);

            i += 1;
        }

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();

        System.out.println("徐算回数：" + i + "回");
        System.out.println("開始時間：" + (startTime) + " ms");
        System.out.println("終了時間：" + (endTime) + " ms");
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }
}


