package practices;


import static java.lang.StrictMath.sqrt;

/**
 * おそらく素数判定関数の100000回の実行速度がとても遅いはずなので、速くしなさい
 */

public class Practice023 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int answer = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            answer = answer + isPrime(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(start + "ms");
        System.out.println(end + "ms");
        System.out.println((end - start) + "ms");
        System.out.println(answer + "回");
    }

    public static int isPrime(int n) {
        if (0 >= n) throw new IllegalArgumentException("割り切れない");
        if (n == 1) return 1;
        if (n == 2 || n == 3) return 1;
        int count = 0;
        int x =(int)sqrt(n);
        for (int i = 2; i <= x; i++) {
            count++;
            if (n % i == 0) {
                return count;
            }
        }
        return count;
    }
}