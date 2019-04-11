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
        System.out.println(getBinary(18));
    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {

        String k = "";
        k = Integer.toBinaryString(n);

        return k;

    }

}
