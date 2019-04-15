package practices;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {

        //計測時間のsjの略

        long start = System.nanoTime();
        factorization(100000);
        long end = System.nanoTime();
        System.out.println("練習22の処理時間"+((end- start)/1000)+"ms");

        // ここはご自由にお使いください

    }


    public static String factorization(int n) {

        //計測時間を計測したい処理

        String y = "";
        for (int i = 2; n >= i; i++) {
            while ((n % i) == 0) {
                String x;
                n = n / i;
                x = Integer.toString(i);
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



