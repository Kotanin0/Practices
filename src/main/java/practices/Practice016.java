package practices;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.Math;

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
        int test = 3100000;
        System.out.println(fizz(test));
    }

    // 3の倍数と、3の付く数字なら"fizz"
    public static String fizz(int n) {
//文字列変換ケース

        String str = String.valueOf(n);
        if(n != 0 && n % 3 == 0){ return "fizz";}
        if(str.contains("3")){ return "fizz";}
        return "";

//整数のままケース　for文でくくったとしても10^n桁が増えるとがきりがない
/*
        int a = Math.abs(n);
        if(a != 0 && a % 3 == 0){ return "fizz";}
        if(a % 10 == 3){ return "fizz";} //2つ条件書くと長い気がしたのでabs(絶対値計算)メソッド利用
        if(a / 10 == 3 || a /100 == 3 || a / 1000 == 3 || a / 10000 == 3){return "fizz";}
        return "";
*/
    }

}
