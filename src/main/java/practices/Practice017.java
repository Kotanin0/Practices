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
        int test = 51;
        System.out.println(buzz(test));
    }

    // 5の倍数と、5の付く数字なら"buzz"
    public static String buzz(int n) {
        String str = String.valueOf(n);
        if(n != 0 && n % 5 == 0) return "buzz";
        if(str.contains("5"))  return "buzz";
        return "";
    }

}
