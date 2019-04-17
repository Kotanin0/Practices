package practices;

/**
 * 入力された整数を2進数に変換する関数 getBinary を作成しなさい
 * <p>
 * 引数：整数
 * 返却：2進数の文字列
 * <p>
 * 　例）引数：18
 * 　　　返却：10010
 */


public class Practice010 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(getBinary(18));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {

        String bina = "";
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n < 2) {
            bina = bina + n;
            return bina;
        }
            for (int i = 1; n >= 2; ) {
                bina = n % 2 + bina;
                n = n / 2;
                i++;
            }
            bina = n + bina ;
            return bina ;
    }
}


// 答えが2未満になるまで2で割り続ける。
//　         n = 18
//           m     l
//  n ÷ 2 = 9 ･･･ 0
//  9 ÷ 2 = 4 ･･･ 1
//  4 ÷ 2 = 2 ･･･ 0
//  2 ÷ 2 = 1 ･･･ 0
// 10010 を出力
//　数列の前（左側に）数値を追加していく必要があるの。そして、数列の長さがさだまっていない。きゃ。

// Integer.toBinaryStrong(n);

