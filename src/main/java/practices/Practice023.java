package practices;


import java.util.Random;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {


        long start = System.nanoTime();

        for (int j = 0; j <= 100000; j++) {
            Random r = new Random();
            isPrime(r.nextInt(100000));
        }
        long end = System.nanoTime();
        System.out.println("練習23の処理時間" + ((end - start) / 1000) + "ms");

//        start = System.nanoTime();
//        for (int j = 0; j <= 100000; j++) {
//            Practice022.isPrime(10);
//        }
//        end = System.nanoTime();
//        System.out.println("練習22の処理時間" + ((end - start) / 1000) + "ms");


    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        double k = Math.sqrt(n);
        for (int i = 3; i < k ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}






