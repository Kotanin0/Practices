package practices;

/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却
 * 5の倍数と、5の付く数字のときに "buzz" と返却
 * どちらにもあてはまるときに "fizzbuzz" と返却
 * する関数 fizzbuzz を作成しなさい
 *
 * 引数：整数
 * 返却："fizz" / "buzz" / "fizzbuzz" / "" (あてはまらない場合は空文字)
 *
 */

public class Practice018 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int test = 13;
        System.out.println(fizzbuzz(test));
    }

    public static String fizzbuzz(int n) {
/*
        String str = String.valueOf(n);
        if(n ==0) return "";
        if((str.contains("5") || n % 5 == 0) && (str.contains("3") || n % 3 == 0)) return "fizzbuzz";
        if ( n % 5 == 0 ||str.contains("5")) return "buzz";
        if (n % 3 == 0 || str.contains("3")) return "fizz";
        return "";
*/
//違うやり方

        if((Practice016.fizz(n) == "fizz" ) && Practice017.buzz(n) == "buzz") return "fizzbuzz";
        if(Practice016.fizz(n) == "fizz") return "fizz";
        if(Practice017.buzz(n)=="buzz") return "buzz";
        return "";

    }

}
