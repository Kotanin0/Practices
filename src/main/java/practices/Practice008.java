package practices;

/**
 * 2以上の数値を入力し、素因数分解した結果を表示しなさい。
 *
 * 引数：整数
 * 返却：素因数を半角スペースで区切った文字列
 *
 * 　例）引数：20100
 * 　　　返却：2 2 3 5 5 67
 */

public class Practice008 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
    }

    // 素因数分解
    public static String factorization(int n) {

        // まず必要そうな素数を持ってくる
        int primes[] = new int[n];
        int primeCount = 0;
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) {
                primes[primeCount++] = i;
            }
        }

        // その素数たちだけで割る
        int destination = n;
        String result = "";
        while (destination > 1) {
            for (int prime : primes) {
                if (destination % prime == 0) {
                    result += prime + " ";
                    destination /= prime;
                    break;
                }
            }
        }

        return result.trim();
    }

    // 素数判定
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;
        for (int i=3; i<n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
