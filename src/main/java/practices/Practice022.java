package practices;

/**
 * 以前作成した素数判定関数を100000回実行したときの除算回数、処理時間をmsで出力しなさい
 */

public class Practice022 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int answer=0;
        long start = System.currentTimeMillis();
        //long start = System.nanoTime();
        for (int i = 1; i <= 100000; i++) {
            answer = answer + isPrime(i);
        }
        long end = System.currentTimeMillis();
        //long end = System.nanoTime();

        //System.out.println(start + "ms");
        //System.out.println(end + "ms");
        System.out.println((end - start) + "ms");
        System.out.println( answer + "回");
    }

    public static int isPrime(int n) {
        if (0 >= n) throw new IllegalArgumentException("割り切れない");
        if (n == 1) return 1;

        int count = 0;
        for (int i = 2; i < n; i++) {
            count++;
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }
}