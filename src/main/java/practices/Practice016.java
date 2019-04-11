package practices;
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
        int test = -13;
        System.out.println(fizz(test));
    }

    // 3の倍数と、3の付く数字なら"fizz"
    public static String fizz(int n) {

        if(n != 0 && n % 3 == 0){ return "fizz";}
        if(Math.abs(n) % 10 == 3){ return "fizz";} //2つ条件書くと長い気がしたのでabs(絶対値計算)メソッド利用
        return "";
    }

}
