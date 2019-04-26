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
        int test = 51;
        System.out.println(fizzbuzz(test));
    }

    public static String fizzbuzz(int n) {
//そもそもがブランクか文字列を返すだからreturn文は1つで良い！！
        return Practice016.fizz(n) + Practice017.buzz(n);
    }
}

/*備忘録として残す＿改善前のソース
//１６，１７のどちらからも返ってきたらfizzbuzzをreturn
        if((Practice016.fizz(n) == "fizz" ) && Practice017.buzz(n) == "buzz") return "fizzbuzz";
//
        if(Practice017.buzz(n)=="buzz") return "buzz";
//上2つのどちらでもない場合、3の倍数かチェックし、空かfizzをreturnする
        return Practice016.fizz(n);
*/
