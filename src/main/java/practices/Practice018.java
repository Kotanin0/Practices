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

        fizzbuzz(35);

    }

    public static String fizzbuzz(int n) {

        // 3の倍数と、3の付く数字なら"fizz"
        String i = Practice016.fizz(n);
        // 5の倍数と、5の付く数字なら"buzz"
        String z = Practice017.buzz(n);

        String h = "";

        if (i == "fizz" && z == "buzz") {
            h = "fizzbuzz";
        } else if (i == "fizz" && z == "") {
            h = "fizz";
        } else if (i == "" && z == "buzz") {
            h = "buzz";
        } else {
            h = "";
        }
        return h;
    }

}
