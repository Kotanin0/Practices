package practices;

/**
 * 5の倍数と、5の付く数字のときに "buzz" と返却する関数 buzz を作成しなさい
 *
 * 引数：整数
 * 返却："buzz" / "" (あてはまらない場合は空文字)
 *
 */

public class Practice017 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int test = 15;
        System.out.println(buzz(test));
    }

    // 5の倍数と、5の付く数字なら"buzz"
    public static String buzz(int n) {
        if(n != 0 && n % 5 == 0){ return "buzz";}
        // 5の付く整数＝5の倍数のため不要
        // if(Math.abs(n) % 10 == 5){ return "buzz";} //2つ条件書くと長い気がしたのでabs(絶対値計算)メソッド利用
        return "";

    }

}
