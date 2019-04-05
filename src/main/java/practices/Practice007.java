package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 *
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {
    public static long count = 0;

    public static void main(String[] args) {
        // ここはご自由にお使いください
        long start = System.currentTimeMillis();

        for(int i=1; i<100; i++) {
            isPrime2(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("runtime: " + (stop - start) + "ms");
        System.out.println(count + "times");
        System.out.println();

    }

    // 素数判定
    public static boolean isPrime(int n) {

        if(n < 1){
            throw new IllegalArgumentException("引数の値が不正です");
        }

        if (n < 2) return false;
        for (int i = 2; i < n; i++)
        {
            count++;
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {

        if(n < 1){
            throw new IllegalArgumentException("引数の値が不正です");
        }

        if (n < 2) return false;
        for (int i = 2; i < n; i=i+2)
        {
            count++;
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime3(int n) {

        int ptr = 0;
        int[] prime = new int[500000];

        if (n < 2) return false;
        for (int i = 2; i < n; i+=2)
        {
            int h;
            for(h=1; h<ptr; h++) {
                count++;
                if (n % prime[h] == 0) {
                    return false;
                }
            }
            count++;
            if (ptr == h)
            {
                prime[ptr++] = i;
            }
        }
        return true;
    }

}
