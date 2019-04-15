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
        String forOutput = factorization(20100);
        System.out.println(forOutput);
    }

    // 素因数分解
    public static String factorization(int n) {
        if(n < 2){
            throw new IllegalArgumentException("不当な引数です");
        }

        String StrFactors = "";

        for(int i = 2 ; i <=n ; i++){
            while (n % i == 0){
                StrFactors +=  i;
                StrFactors +=  " ";
                n = n / i;
            }
        }

        return StrFactors.trim();
    }

}
