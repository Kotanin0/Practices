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
            int divisor = 2; // 割り切れる値＝約数の判定
            int calc = n; // 割っている途中の値
            String strArgs = ""; // 出力用

            // calcが1になるまでループ（nが1以下なら空）
//            loop:
            while (calc > 1) {
                // calcがdivisorで割り切れる間ループ
                while (calc % divisor == 0) {
                    strArgs += divisor; // 割り切れるのでdivisorをstrArgsに追記
                    calc /= divisor; // calcにdivisorで割った値を代入

                    // calcが1になるまではスペースが必要、1になったら不要
                    strArgs = strArgs + (calc != 1 ? " " : "");
//                    if (calc == 1) {
//                        break loop;
//                    } else {
//                        strArgs += " ";
//                    }
                }
                divisor++; // divisorで割り切れなくなったので、divisorに1加算してループに戻る
            }
            return strArgs;
        }
    }
}
