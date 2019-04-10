package practices;

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
        int m = 18; //10進数の入力
        System.out.println("10進数[ " + m + " ]の2進数 ＝ " + getBinary(m));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("引数の値が不正です");
        } else if (n == 0) {
            return String.valueOf(n);
        } else {
            int bin = 2; //2進数であることの代入
            int div = n;
            int mod ;
            String binary = "";

            for(int i = 0; div >= bin-1 ;i++){
                mod = div % bin;
                div /= bin;
                binary = mod + binary;

            }
            return binary;
        }
    }
}
