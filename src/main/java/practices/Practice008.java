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
       }

    // 素因数分解
    public static String factorization(int n) {

        String y = "";

        for (int i = 2; n >= i; i++) {
            while ((n % i) == 0) {
                String x;
                n = n / i;
                x = Integer.toString(i);
                if (n == 1){
                    y = y + x;
                }else{
                    y = y + x +" ";
                }
            }
        }
        return y;
    }
}
