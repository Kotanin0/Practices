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
        return Practice016.fizz(n) + Practice017.buzz(n);
    }
}

//        小谷さんのヤツみたいにかきたい。
//        正の偶数、正の奇数、負の偶数、負の奇数のいずれかを返却する
//        public static String displayText(int n) {
//            return isPositive(n) + "の" + isOdd(n);
//        }
//

//        private static String isPositive(int n) {
//            return (n >= 0)? "正" : "負";
//        }
//
//        private static String isOdd(int n) {
//            return (n % 2 == 0)? "偶数" : "奇数";
//        }