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
        //ガード節使用。
        String fizz = Practice016.fizz(n);
        String buzz = Practice017.buzz(n);

        if (fizz == "fizz" && buzz == "buzz") return "fizzbuzz";
        if (fizz == "fizz") return "fizz";
        if (buzz == "buzz") return "buzz";
        return "";

    }
}


