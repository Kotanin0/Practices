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
        System.out.println(factorization(20100));
    }

    // 素因数分解
    public static String factorization(int n) {
        String result = "";
        if(n < 2)throw new IllegalArgumentException("引数の値が不正です");
        int m = n;
        for (int i = 2; n >= i; i++) {
            while ((m % i) == 0) {
                System.out.println("因数：" + i);
                result += " " + i;
                m /= i;
            }
        }
        //後からスペース削除パターン
        result = result.trim();
        return result;
    }
}
