package practices;

import javax.management.StringValueExp;

/**
 * 入力された整数を2進数に変換する関数 getBinary を作成しなさい
 *
 * 引数：整数
 * 返却：2進数の文字列
 *
 * 　例）引数：18
 * 　　　返却：10010
 *
 */

public class Practice010 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int m = 254; //10進数の入力
        System.out.println("10進数[ " + m + " ]の2進数 ＝ " + getBinary(m));
    }
    // 2進数の文字列を返す
    public static String getBinary(int n) {

        return Integer.toBinaryString(n);

/*        if (n < 0) throw new IllegalArgumentException("引数の値が不正です");
        if (n == 0) return "0";
        int bin = 2; //2進数であることの代入
        int div = n;
        int mod ;
        String binary = "";

        while(div >= bin-1){
            mod = div % bin; //余りを求める
            div /= bin; //次に計算する値を繰り返すために実際に進数2で割る
            binary  = mod + binary ; //余りを文字列(進数配列)に加える※今回は後ろに追加を繰り返すため+=を使わない
        }
*/

    }
}

