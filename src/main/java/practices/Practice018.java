package practices;

/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却
 * 5の倍数と、5の付く数字のときに "buzz" と返却
 * どちらにもあてはまるときに "fizzbuzz" と返却
 * する関数 fizzbuzz を作成しなさい
 * <p>
 * 引数：整数
 * 返却："fizz" / "buzz" / "fizzbuzz" / "" (あてはまらない場合は空文字)
 */

public class Practice018 {
    public static void main(String[] args) {
        // ここはご自由にお使いください

    }

    public static String fizzbuzz(int n) {
        if (n == 0) return "";
        String three = "3";
        String five = "5";

        String strN = String.valueOf(n);
        String result = "";

        if (strN.indexOf(three) != -1 || n % 3 == 0) {
            result += "fizz";
        }
        if (strN.indexOf(five) != -1 || n % 5 == 0) {
            result += "buzz";
        }
        return result;
    }

}
