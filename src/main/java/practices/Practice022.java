package practices;

import java.util.Random;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

        long startTime = System.currentTimeMillis();  // 処理前の時刻を取得

        //ランダムな数字をisPrimeの引数に渡して実行することを、10万回実行する。
        int i = 100000; //  i = 回数　-> 100000回

        int m = i;                       //m個のランダムな数字を作る
        int[] randomNumber = new int[m]; //配列の宣言　randomNumberっていうm個の配列を宣言
        Random rand = new Random();      //randomNumber　にランダムな数字を入れたい
        for (int j = 0; j < randomNumber.length; j++) {
            randomNumber[j] = rand.nextInt(10000) + 1; //m個の配列にランダムな値（boundは上限の値）入れる
        }

        for (int k = 0; k < i; k++) {
            isPrime(randomNumber[k]);
        }

        long endTime = System.currentTimeMillis();   // 処理後の時刻を取得

        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }

    public static boolean isPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return false;
        }
        if (n > 1){
            for (int i = 2; i < n; i++) {
                if (n % i <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
