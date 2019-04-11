package practices;

import Utils.CommonUtils;

/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却する関数 fizz を作成しなさい
 *
 * 引数：整数
 * 返却："fizz" / "" (あてはまらない場合は空文字)
 *
 */

public class Practice016 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    // 3の倍数と、3の付く数字なら"fizz"
    public static String fizz(int n) {
        //インスタンス
        CommonUtils common = new CommonUtils();

        if(common.isMultiple(n, 3)) return "fizz";
        if(String.valueOf(n).contains("3")) return "fizz";
        return "";
    }



}
