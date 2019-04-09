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
//        System.out.println(factorization(20100));

    }

    // 素因数分解
    public static String factorization(int n) {
        // nを2から小さい数で割っていく
        // 割り切れたら（あまりが0だったら）約数を出力
        // 同じ約数が何度も出てくる可能性ある
        // 割り切れなくなったら次の数に移る
        // 割った結果が1になったら終了
        if (n < 2) {
            throw new IllegalArgumentException("");
        } else {
            int i = 2;
            int j = n;
            String k = "";
            // jが1になるまでループ（nが1以下なら空）
            loop:
            while (j > 1) {
//        loop: for (int i = 2; i <= n; i++) {
                // jがiで割り切れる間ループ
                while (j % i == 0) {
                    // 割り切れるので約数iを出力kに追記
                    k += i;
                    // jに約数iで割った値を代入
                    j /= i;
                    // jが1になったら最後、ならなければ続きがある
                    if (j == 1) {
                        break loop;
                    } else {
                        k += " ";
                    }
                }
                // 割り切れなくなったので、iに1加算してループに戻る
                i++;
            }
            return k;
        }
   }
}
