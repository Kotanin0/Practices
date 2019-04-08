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
        //System.out.println(factorization(2));
    }

    // 素因数分解
    public static String factorization(int n) {
        if(n < 2){
            throw new IllegalArgumentException("引数の値が不正です");
        }

        String strFactorization = "";
        int copy_n = n;

        for(int i = 2 ; i <= copy_n ; i++) {
            while (n % i == 0) {
                    strFactorization += i;
                    strFactorization += " ";
                n = n / i;
            }
        }
        return strFactorization.trim();
    }
}
