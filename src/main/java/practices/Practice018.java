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

        String m = String.valueOf(n);

        if(n == 0){
            return "";
        }else if ((n % 3 == 0 || m.contains("3")) && (n % 5 == 0 || m.contains("5"))) {
            return "fizzbuzz";
        } else if (n % 3 == 0 || m.contains("3")) {
            return "fizz";
        } else if (n % 5 == 0 || m.contains("5")) {
            return "buzz";
        } else {
            return "";
        }

    }
}
