package practices;

import Utils.ValidateUtils;

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
        System.out.println(getBinary(18));

    }

    // 2進数の文字列を返す
    public static String getBinary(int n) {
        //正の整数チェック
        ValidateUtils validation = new ValidateUtils();
        validation.checkPositiveInteger(n);

        return Integer.toBinaryString(n);
    }

}
