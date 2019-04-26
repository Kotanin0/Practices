package practices;

/**
 * 2以上の数値を入力し、素因数分解した結果を表示しなさい。
 * <p>
 * 引数：整数
 * 返却：素因数を半角スペースで区切った文字列
 * <p>
 * 　例）引数：20100
 * 　　　返却：2 2 3 5 5 67
 */

public class Practice008 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        //System.out.println(factorization(12));

    }

    // 素因数分解
    public static String factorization(int n) {
        String answer = " ";
        if (2 > n) throw new IllegalArgumentException("割り切れない");
        //素数を見つける
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                //素数で割っていく
                //for (int j = 1; n / j == 0; j++) {
                while (n % i == 0) {
                    answer +=i + " ";
                    n = n / i;
                }
            }
        }
        answer = answer + n;
        return answer.trim();
    }
}

