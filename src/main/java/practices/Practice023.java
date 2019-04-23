package practices;

import java.util.Random;
import static java.lang.Math.sqrt;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        //ランダムな数字をisPrimeの引数に渡して実行することを、100000回実行する。
        int i = 100000; //  i = 回数　-> 10万回
        int[] randomNumber = new int[i]; //配列の宣言　randomNumberっていうm個の配列を宣言
        Random rand = new Random();      //randomNumber　にランダムな数字を入れたい
        for (int j = 0; j < randomNumber.length; j++) {
            randomNumber[j] = rand.nextInt(100000) + 1; //m個の配列にランダムな値（boundは上限の値）入れる
        }
        long startTime = System.currentTimeMillis();  // 処理前の時刻を取得
        for (int k = 0; k < i; k++) {
            Practice022.isPrime(randomNumber[k]);
        }
        long endTime = System.currentTimeMillis();   // 処理後の時刻を取得
        System.out.println("処理時間：" + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();  // 処理前の時刻を取得
        for (int k = 0; k < i; k++) {
            isPrime(randomNumber[k]);
        }
        endTime = System.currentTimeMillis();   // 処理後の時刻を取得
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }

    public static boolean isPrime(int n) {

        if (n % 2 == 0) {
            return false;
        }
        if (n == 1) {
            return false;
        }

        int square_root = (int)sqrt(n);   // nの平方根を整数で取得(5なら2, 10なら3)
        for(int i=3; i<=square_root; i+=2){   // nがnの平方根以下の、3以上の奇数(3,5,7,9,11,...)で1回でも割れたらfalse
            if( 0== n % i){
                return false;
            }
        }

        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}


//エラトステネスの篩

//        double sqrtNum = Math.Sqrt(n);
//        for (int i = 3; i <= sqrtNum; i += 2) {
//            if (n % i == 0) {
//                // 素数ではない
//                return false;
//            }
//        }

//        if (n > 2) {
//            for (int i = 3; i < n; i += 2) {
//                if (n % i <= 0) {
//                    return false;
//                }
//            }
//        }