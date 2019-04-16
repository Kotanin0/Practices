package practices;

/**
 * 3の倍数と、3の付く数字のときに "fizz" と返却する関数 fizz を作成しなさい
 * <p>
 * 引数：整数
 * 返却："fizz" / "" (あてはまらない場合は空文字)
 */

public class Practice016 {
    public static void main(String[] args) {
        // ここはご自由にお使いください


    }

    // 3の倍数と、3の付く数字なら"fizz"
    public static String fizz(int n) {
        String moji = String.valueOf(n);

        if (n == 0) return "";
        if (n % 3 == 0 || moji.contains("3")) {
            return "fizz";
        } else return "";
    }
}
