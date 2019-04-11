package practices;

/**
 * 素数を判定する関数 isPrime を作成しなさい
 * <p>
 * 引数：任意の数値
 * 返却：true/false
 */

public class Practice007 {
    public static void main(String[] args) {
        // ここはご自由にお使いください


        isPrime(3751);
    }

    // 素数判定
    public static boolean isPrime(int n) {
                boolean k = false;

        if (n < 2) {
            k = false;

        } else {
            for (int i = 2; i <= n/2 ; i++){
              if (n / i == 0) {
               k = false;
               } else {
                   k = true;
               }
          }
      }
      return k;
        ｝
    ｝