package practices;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {


        long start = System.nanoTime();
        factorization(100000);
        long end = System.nanoTime();
        System.out.println("練習23の処理時間"+((end- start)/1000)+"ms");
        // ここはご自由にお使いください

//        start = System.nanoTime();
//        Practice022.factorization(100000);
//        end = System.nanoTime();
//        System.out.println("練習22の処理時間"+((end- start)/1000)+"ms");

    }


    public static String factorization(int n) {

        String y = "";
        String x = "";

        for (int i = 2; n >= i; i++) {
            while ((n % i) == 0) {
                n = n / i;
                if (n == 1) {
                    y = y + x;
                } else {
                    y = y + x + " ";
                }
            }
        }
        return y;
    }
}


// x = Integer.toString(i);






